package administration

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
class StructureDetailFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[StructureDetailViewModel::class.java]
        val view = inflater.inflate(R.layout.fragment_structure_detail, container, false)
        val listView = view.findViewById<View>(R.id.listViewStructure) as ListView
        viewModel.administrationList.observe(viewLifecycleOwner) { administrationList ->
            val adapter = StructureAdapter(requireActivity(), administrationList)
            listView.adapter = adapter
        }
        return view
    }
}
