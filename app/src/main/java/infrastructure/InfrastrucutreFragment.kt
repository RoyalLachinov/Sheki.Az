package infrastructure

import about.AboutAdapter
import about.AboutModel
import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener
import android.widget.ListView
import androidx.navigation.fragment.findNavController
import az.com.sheki.R
import kotlinx.collections.immutable.PersistentList
import kotlinx.collections.immutable.persistentListOf

/**
 * A simple [Fragment] subclass.
 */
class InfrastrucutreFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_listview, container, false)
        val listView = view.findViewById<View>(R.id.listviewEvery) as ListView
        val list: PersistentList<AboutModel> = persistentListOf(
            AboutModel(R.drawable.postofice, "Poçt və Rabitə"),
            AboutModel(R.drawable.banks, "Banklar")
        )
        val adapter = AboutAdapter(requireActivity(), list)
        listView.adapter = adapter
        listView.onItemClickListener =
            OnItemClickListener { _: AdapterView<*>?, _: View?, position: Int, _: Long ->
                if (position == 0) {
                    handleFragmentTransaction(R.id.navigation_post_office_detail)
                } else if (position == 1) {
                    handleFragmentTransaction(R.id.navigation_bank_detail)
                }
            }
        return view
    }

    private fun handleFragmentTransaction(fragmentId: Int) {
        findNavController().navigate(fragmentId)
    }
}
