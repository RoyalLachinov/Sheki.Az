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
class PostOfficesDetailsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[PostOfficesViewModel::class.java]
        val view =
            inflater.inflate(R.layout.fragment_post_office_detail, container, false)
        val listView = view.findViewById<View>(R.id.listViewPostOffices) as ListView
        viewModel.postOfficesList.observe(viewLifecycleOwner) { postOfficesList ->
            val adapter = StructureAdapter(requireActivity(), postOfficesList)
            listView.adapter = adapter
        }
        return view
    }
}
