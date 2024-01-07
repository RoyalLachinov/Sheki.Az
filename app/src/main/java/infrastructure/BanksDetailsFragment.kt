package infrastructure

import administration.StructureAdapter
import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import androidx.lifecycle.ViewModelProvider
import az.com.sheki.R

/**
 * A simple [Fragment] subclass.
 */
class BanksDetailsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[BanksViewModel::class.java]
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_banks_details, container, false)
        val listView = view.findViewById<View>(R.id.listViewBank) as ListView
        viewModel.bankFilialList.observe(viewLifecycleOwner) { bankFilialList ->
            val adapter = StructureAdapter(requireActivity(), bankFilialList)
            listView.adapter = adapter
        }
        return view
    }
}
