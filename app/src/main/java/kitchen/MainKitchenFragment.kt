package kitchen

import about.AboutAdapter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener
import android.widget.ListView
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import az.com.sheki.R
import main.AppRater

/**
 * A simple [Fragment] subclass.
 */
class MainKitchenFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[KitchenViewModel::class.java]
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_listview, container, false)
        val listView = view.findViewById<View>(R.id.listviewEvery) as ListView
        viewModel.foodList.observe(viewLifecycleOwner) { foodList ->
            val adapter = AboutAdapter(requireActivity(), foodList)
            listView.adapter = adapter
        }
        AppRater.launchTheApp(requireActivity())
        listView.onItemClickListener =
            OnItemClickListener { _: AdapterView<*>?, _: View?, position: Int, _: Long ->
                when (position) {
                    0 -> {
                        goToDetail("piti")
                    }
                    1 -> {
                        goToDetail("sheki_gurzesi")
                    }
                    2 -> {
                        goToDetail("sheki_kulcesi")
                    }
                    3 -> {
                        goToDetail("tutsud_plovu")
                    }
                    4 -> {
                        goToDetail("dosemeli_plov")
                    }
                    5 -> {
                        goToDetail("sheki_balvasi")
                    }
                    6 -> {
                        goToDetail("surfullu")
                    }
                    7 -> {
                        goToDetail("oma")
                    }
                    8 -> {
                        goToDetail("sheki_paxlavasi")
                    }
                    9 -> {
                        goToDetail("toy_nogulu")
                    }
                    10 -> {
                        goToDetail("bamiye")
                    }
                    11 -> {
                        goToDetail("mindal")
                    }
                    12 -> {
                        goToDetail("barama_shirni")
                    }
                    13 -> {
                        goToDetail("cay_destgahi")
                    }
                    14 -> {
                        goToDetail("duyme_shirni")
                    }
                    15 -> {
                        goToDetail("taxta_shirni")
                    }
                    16 -> {
                        goToDetail("manpasi")
                    }
                    17 -> {
                        goToDetail("tel_halva")
                    }
                    18 -> {
                        goToDetail("peshveng_halva")
                    }
                    19 -> {
                        goToDetail("qirmabadam")
                    }
                }
            }
        return view
    }

    private fun goToDetail(value: String) {
        val bundle = bundleOf("message" to value)
        findNavController().navigate(R.id.navigation_about_detail, bundle)
    }
}
