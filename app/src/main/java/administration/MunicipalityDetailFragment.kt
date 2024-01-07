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
class MunicipalityDetailFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[MunicipalityViewModel::class.java]

        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_municipality, container, false)
        val listView = view.findViewById<View>(R.id.listViewManicipality) as ListView
        viewModel.municipalityList.observe(viewLifecycleOwner) { municipalityList ->
            val adapter = StructureAdapter(requireActivity(), municipalityList)
            listView.adapter = adapter
        }
        return view
    }
}
