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
class CultureDetailsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[CultureDetailViewModel::class.java]

        val view = inflater.inflate(R.layout.fragment_about_culture_details, container, false)
        val listView = view.findViewById<View>(R.id.listViewCulture) as ListView
        viewModel.educationList.observe(viewLifecycleOwner) { educationList ->
            val adapter = EducationAdapter(requireActivity(), educationList)
            listView.adapter = adapter
        }
        return view
    }
}
