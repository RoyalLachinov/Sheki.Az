package administration

import about.AboutAdapter
import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener
import android.widget.ListView
import androidx.core.os.bundleOf
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import az.com.sheki.R

/**
 * A simple [Fragment] subclass.
 */
class AdministrationMainFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[AdminViewModel::class.java]
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_listview, container, false)
        val listView = view.findViewById<View>(R.id.listviewEvery) as ListView
        viewModel.adminList.observe(viewLifecycleOwner) { adminList ->
            val adapter = AboutAdapter(requireActivity(), adminList)
            listView.adapter = adapter
        }
        listView.onItemClickListener =
            OnItemClickListener { _: AdapterView<*>?, _: View?, position: Int, _: Long ->
                when (position) {
                    0 -> {
                        handleDetailsBundle("admin")
                    }
                    1 -> {
                        goToDetailsPage(R.id.navigation_structure_detail)
                    }
                    2 -> {
                        handleDetailsBundle("shura")
                    }
                    3 -> {
                        goToDetailsPage(R.id.navigation_delegation_detail)
                    }
                    4 -> {
                        goToDetailsPage(R.id.navigation_municipality_detail)
                    }
                    5 -> {
                        goToDetailsPage(R.id.navigation_citizen_accept_detail)
                    }
                    6 -> {
                        handleDetailsBundle("electronic_apply")
                    }
                    7 -> {
                        handleDetailsBundle("elektron_xidmet")
                    }
                    8 -> {
                        handleDetailsBundle("hesabat")
                    }
                    9 -> {
                        handleDetailsBundle("advertisment")
                    }
                }
            }
        return view
    }

    private fun handleDetailsBundle(value: String) {
        val bundle = bundleOf("message" to value)
        goToDetailsPage(R.id.navigation_about_detail, bundle)
    }

    private fun goToDetailsPage(fragmentId: Int, bundle: Bundle? = null) {
        findNavController().navigate(fragmentId, bundle)
    }
}
