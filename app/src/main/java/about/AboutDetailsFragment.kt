package about

import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.DrawableRes
import androidx.navigation.fragment.findNavController
import az.com.sheki.R
import java.io.IOException
import java.util.Properties

/**
 * A simple [Fragment] subclass.
 */
class AboutDetailsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //  the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_about_detail, container, false)
        val about = view.findViewById<View>(R.id.lbAboutSome) as TextView
        val lbDetailImage = view.findViewById<View>(R.id.lbDetailImage) as TextView
        try {
            when (arguments?.getString("message")) {
                "history" -> {
                    about.text = getMessageDetail()
                }

                "population", "geographic", "economic", "admin", "shura", "electronic_apply", "advertisment", "elektron_xidmet", "hesabat" -> handleAboutSection(
                    about,
                    lbDetailImage,
                    null
                )

                "piti" -> handleAboutSection(about, lbDetailImage, R.drawable.piti)
                "sheki_paxlavasi" -> handleAboutSection(about, lbDetailImage, R.drawable.paxlava)
                "sheki_omasi" -> handleAboutSection(about, lbDetailImage, R.drawable.oma)
                "toy_nogulu" -> handleAboutSection(about, lbDetailImage, R.drawable.toynogulu)
                "bamiye" -> handleAboutSection(about, lbDetailImage, R.drawable.bamiye)
                "barama_shirni" -> handleAboutSection(about, lbDetailImage, R.drawable.bamiye)
                "cay_destgahi" -> handleAboutSection(about, lbDetailImage, R.drawable.bamiye)
                "mindal" -> handleAboutSection(about, lbDetailImage, R.drawable.mindal)
                "duyme_shirni" -> handleAboutSection(about, lbDetailImage, R.drawable.bamiye)
                "taxta_shirni" -> handleAboutSection(about, lbDetailImage, R.drawable.bamiye)
                "manpasi" -> handleAboutSection(about, lbDetailImage, R.drawable.bamiye)
                "tel_halva" -> handleAboutSection(about, lbDetailImage, R.drawable.bamiye)
                "peshveng_halva" -> handleAboutSection(about, lbDetailImage, R.drawable.peshveng)
                "qirmabadam" -> handleAboutSection(about, lbDetailImage, R.drawable.qirmabadam)
                "sheki_gurzesi" -> handleAboutSection(about, lbDetailImage, R.drawable.gurze)
                "sheki_kulcesi" -> handleAboutSection(about, lbDetailImage, R.drawable.kulce)
                "tutsud_plovu" -> handleAboutSection(about, lbDetailImage, R.drawable.tutplovu)
                "dosemeli_plov" -> handleAboutSection(about, lbDetailImage, R.drawable.toyuqplovu)
                "sheki_balvasi" -> handleAboutSection(about, lbDetailImage, R.drawable.balva)
                "surfullu" -> handleAboutSection(about, lbDetailImage, R.drawable.surfullu)
                "oma" -> handleAboutSection(about, lbDetailImage, R.drawable.oma)
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return view
    }

    private fun handleAboutSection(
        about: TextView,
        lbDetailImage: TextView,
        @DrawableRes imageDetail: Int?
    ) {
        try {
            about.text = getMessageDetail()
            if (imageDetail != null) {
                lbDetailImage.setBackgroundResource(imageDetail)
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    private fun getMessageDetail(): String {
        val messageKey = arguments?.getString("message")
        val inputStream = activity?.baseContext?.assets?.open("history")
        val properties = Properties()
        properties.load(inputStream)
        return String(
            properties.getProperty(messageKey).toByteArray(charset("ISO-8859-1")),
            charset("UTF-8")
        )
    }
    override fun onResume() {
        val messageKey = arguments?.getString("message")
        super.onResume()
        view?.isFocusableInTouchMode = true
        view?.requestFocus()
        view?.setOnKeyListener { _: View?, keyCode: Int, event: KeyEvent ->
            if (event.action == KeyEvent.ACTION_UP && keyCode == KeyEvent.KEYCODE_BACK) {
                when (messageKey) {
                    "history", "population", "geographic", "economic" -> {
                        handleFragmentTransaction(R.id.navigation_information)
                    }
                    "admin", "shura", "electronic_apply", "advertisment", "elektron_xidmet", "hesabat" -> {
                        handleFragmentTransaction(R.id.navigation_administration)
                    }
                    "piti", "sheki_paxlavasi", "sheki_omasi", "toy_nogulu", "bamiye", "barama_shirni", "taxta_shirni", "cay_destgahi", "mindal", "duyme_shirni", "manpasi", "tel_halva", "peshveng_halva", "qirmabadam", "sheki_gurzesi", "sheki_kulcesi", "tutsud_plovu", "dosemeli_plov", "sheki_balvasi", "surfullu", "oma" -> {
                        handleFragmentTransaction(R.id.navigation_kitchen)
                    }
                }
                return@setOnKeyListener true
            }
            false
        }
    }

    private fun handleFragmentTransaction(fragmentId: Int) {
        findNavController().navigate(fragmentId)
    }
}
