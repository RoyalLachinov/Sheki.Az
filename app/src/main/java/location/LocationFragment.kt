package location

import android.annotation.SuppressLint
import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.Toast
import az.com.sheki.R
import utils.AppUtils

/**
 * A simple [Fragment] subclass.
 */
@SuppressLint("SetJavaScriptEnabled")
class LocationFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_location, container, false)
        val webView = view.findViewById<View>(R.id.webViewLocation) as WebView
        if (AppUtils.isInternetOn(requireActivity())) {
            webView.settings.javaScriptCanOpenWindowsAutomatically = true
            webView.settings.javaScriptEnabled = true
            val url = "https://www.google.ru/maps/@41.1904745,47.1754651,13z"
            webView.loadUrl(url)
        } else {
            Toast.makeText(this.activity, "Lütfən internet əlaqənizi yoxlayın", Toast.LENGTH_LONG)
                .show()
        }
        return view
    }
}
