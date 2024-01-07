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
class AgriCultureDetailsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val aboutViewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[AboutViewModel::class.java]

        val view = inflater.inflate(R.layout.fragment_about_agriculture_detail, container, false)
        val listView = view.findViewById<View>(R.id.listViewAgriculture) as ListView

        aboutViewModel.agriCultureList.observe(viewLifecycleOwner) { agriCultureList ->
            val adapter = AgricultureAdapter(requireActivity(), agriCultureList)
            listView.adapter = adapter
        }

        return view
    }
}
