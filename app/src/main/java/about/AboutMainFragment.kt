package about

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
class AboutMainFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val aboutViewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[AboutViewModel::class.java]

        val view = inflater.inflate(R.layout.fragment_listview, container, false)
        val listView = view.findViewById<View>(R.id.listviewEvery) as ListView
        aboutViewModel.aboutList.observe(viewLifecycleOwner) { aboutList ->
            val adapter = AboutAdapter(requireActivity(), aboutList)
            listView.adapter = adapter
        }

        listView.onItemClickListener =
            OnItemClickListener { _: AdapterView<*>?, _: View?, position: Int, _: Long ->
                when (position) {
                    0 -> {
                        handleDetailBundle("history")
                    }
                    1 -> {
                        handleDetailBundle("population")
                    }
                    2 -> {
                        handleDetailBundle("geographic")
                    }
                    3 -> {
                        handleDetailBundle("economic")
                    }
                    4 -> {
                        goToDetailsPage(R.id.navigation_agriculture_detail)
                    }
                    5 -> {
                        goToDetailsPage(R.id.navigation_education_detail)
                    }
                    6 -> {
                        goToDetailsPage(R.id.navigation_culture_detail)
                    }
                    7 -> {
                        goToDetailsPage(R.id.navigation_medical_detail)
                    }
                    8 -> {
                        goToDetailsPage(R.id.navigation_sport_detail)
                    }
                }
            }
        return view
    }

    private fun handleDetailBundle(value: String) {
        val bundle = bundleOf("message" to value)
        goToDetailsPage(R.id.navigation_about_detail, bundle)
    }

    private fun goToDetailsPage(fragmentId: Int, bundle: Bundle?=  null) {
        findNavController().navigate(fragmentId, bundle)
    }
}
