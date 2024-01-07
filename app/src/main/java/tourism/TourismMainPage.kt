package tourism

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
class TourismMainPage : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[TourismViewModel::class.java]
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_listview, container, false)
        val listView = view.findViewById<View>(R.id.listviewEvery) as ListView
        viewModel.tourismCentersList.observe(viewLifecycleOwner) { tourismCentersList ->
            val adapter = TourismAdapter(requireActivity(), tourismCentersList)
            listView.adapter = adapter
        }
        listView.onItemClickListener =
            OnItemClickListener { _: AdapterView<*>?, _: View?, position: Int, _: Long ->
                when (position) {
                    0 -> {
                        handleDetailScreenBundle("marxal")
                    }
                    1 -> {
                        handleDetailScreenBundle("xan_sarayi")
                    }
                    2 -> {
                        handleDetailScreenBundle("karvansaray")
                    }
                    3 -> {
                        handleDetailScreenBundle("sheki_palace")
                    }
                    4 -> {
                        handleDetailScreenBundle("sheki_park")
                    }
                    5 -> {
                        handleDetailScreenBundle("shekixanovlarinevi")
                    }
                    6 -> {
                        handleDetailScreenBundle("sheki_saray")
                    }
                    7 -> {
                        handleDetailScreenBundle("olimpik_hotel")
                    }
                    8 -> {
                        handleDetailScreenBundle("issam_hotel")
                    }
                    9 -> {
                        handleDetailScreenBundle("narin_qala")
                    }
                    10 -> {
                        handleDetailScreenBundle("alban_kilsesi")
                    }
                    11 -> {
                        handleDetailScreenBundle("cennet_bagi")
                    }
                }
            }
        return view
    }

    private fun handleDetailScreenBundle(bundleValue: String) {
        val bundle = bundleOf("message" to bundleValue)
        findNavController().navigate(R.id.navigation_tourism, bundle)
    }
}
