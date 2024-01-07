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
class CitizenAcceptDetailsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[CitizensViewModel::class.java]
        // Inflate the layout for this fragment
        val view = inflater.inflate(
            R.layout.fragment_citizen_accept_details,
            container,
            false
        )
        val listView = view.findViewById<View>(R.id.listviewAccept) as ListView
        viewModel.citizenAcceptDates.observe(viewLifecycleOwner) { citizenAcceptDates ->
            val adapter = CitizenAcceptAdapter(requireActivity(), citizenAcceptDates)
            listView.adapter = adapter
        }
        return view
    }
}
