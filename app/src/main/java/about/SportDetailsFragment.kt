package about

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
class SportDetailsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[SportsViewModel::class.java]
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_about_sport_details, container, false)
        val listView = view.findViewById<View>(R.id.listViewSport) as ListView
        viewModel.sportSchoolList.observe(viewLifecycleOwner) { sportSchoolList ->
            val adapter = EducationAdapter(requireActivity(), sportSchoolList)
            listView.adapter = adapter
        }
        return view
    }
}
