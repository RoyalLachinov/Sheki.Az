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
class EducationDetailFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[EducationDetailViewModel::class.java]
        val view = inflater.inflate(R.layout.fragment_about_education_detail, container, false)
        val listView = view.findViewById<View>(R.id.listViewEducation) as ListView
        //listViewKindergarten = (ListView) view.findViewById(R.id.listViewKindergarten);
        viewModel.schoolsList.observe(viewLifecycleOwner) { schoolsList ->
            val adapter = EducationAdapter(requireActivity(), schoolsList)
            listView.adapter = adapter
        }
        return view
    }
}
