package tourism

import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import az.com.sheki.R
import java.util.Properties

/**
 * A simple [Fragment] subclass.
 */
class TourismDetailFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_tourism_detail, container, false)
        val lbAboutTrusimDetail = view.findViewById<View>(R.id.lbAboutTrusimDetail) as TextView
        val lbDetailImageOne = view.findViewById<View>(R.id.lbDetailImageOne) as TextView
        val lbDetailImageTwo = view.findViewById<View>(R.id.lbDetailImageTwo) as TextView
        val lbDetailImageThree = view.findViewById<View>(R.id.lbDetailImageThree) as TextView
        val lbDetailImageFour = view.findViewById<View>(R.id.lbDetailImageFour) as TextView
        val lbDetailImageFive = view.findViewById<View>(R.id.lbDetailImageFive) as TextView
        when (val message = arguments?.getString("message")) {
            "marxal" -> {
                lbAboutTrusimDetail.text = getMessageDetail(message)
                lbDetailImageOne.setBackgroundResource(R.drawable.marxal1)
                lbDetailImageTwo.setBackgroundResource(R.drawable.marxal2)
                lbDetailImageThree.setBackgroundResource(R.drawable.marxal3)
                lbDetailImageFour.setBackgroundResource(R.drawable.marxal4)
                lbDetailImageFive.setBackgroundResource(R.drawable.marxal5)
            }

            "xan_sarayi" -> {
                lbAboutTrusimDetail.text = getMessageDetail(message)
                lbDetailImageOne.setBackgroundResource(R.drawable.xansarayi1)
                lbDetailImageTwo.setBackgroundResource(R.drawable.xansarayi2)
                lbDetailImageThree.setBackgroundResource(R.drawable.xansaray3)
                lbDetailImageFour.setBackgroundResource(R.drawable.xansaray4)
                lbDetailImageFive.setBackgroundResource(R.drawable.xansaray5)
            }

            "karvansaray" -> {
                lbAboutTrusimDetail.text = getMessageDetail(message)
                lbDetailImageOne.setBackgroundResource(R.drawable.karvansaray1)
                lbDetailImageTwo.setBackgroundResource(R.drawable.karvansaray2)
                lbDetailImageThree.setBackgroundResource(R.drawable.karvansaray3)
                lbDetailImageFour.setBackgroundResource(R.drawable.karvansaray4)
                lbDetailImageFive.setBackgroundResource(R.drawable.karvansaray5)
            }

            "sheki_palace" -> {
                lbAboutTrusimDetail.text = getMessageDetail(message)
                lbDetailImageOne.setBackgroundResource(R.drawable.shekipalace1)
                lbDetailImageTwo.setBackgroundResource(R.drawable.shekipalace2)
                lbDetailImageThree.setBackgroundResource(R.drawable.shekipalace3)
                lbDetailImageFour.setBackgroundResource(R.drawable.shekipalace4)
                lbDetailImageFive.setBackgroundResource(R.drawable.shekipalace5)
            }

            "sheki_park" -> {
                lbDetailImageOne.setBackgroundResource(R.drawable.shekipark1)
                lbDetailImageTwo.setBackgroundResource(R.drawable.shekipark2)
                lbDetailImageThree.setBackgroundResource(R.drawable.shekipark3)
                lbDetailImageFour.setBackgroundResource(R.drawable.shekipark4)
                lbDetailImageFive.setBackgroundResource(R.drawable.shekipark5)
            }

            "shekixanovlarinevi" -> {
                lbAboutTrusimDetail.text = getMessageDetail(message)
                lbDetailImageOne.setBackgroundResource(R.drawable.shekixanovlarinevi)
                lbDetailImageTwo.setBackgroundResource(R.drawable.xanevi2)
                lbDetailImageThree.setBackgroundResource(R.drawable.xansaray3)
                lbDetailImageFour.setBackgroundResource(R.drawable.shekipalace4)
                lbDetailImageFive.setBackgroundResource(R.drawable.shekipalace5)
            }

            "sheki_saray" -> {
                lbAboutTrusimDetail.text = getMessageDetail(message)
                lbDetailImageOne.setBackgroundResource(R.drawable.sekisaray)
                lbDetailImageTwo.setBackgroundResource(R.drawable.shekisaray2)
                lbDetailImageThree.setBackgroundResource(R.drawable.shekisaray5)
                lbDetailImageFour.setBackgroundResource(R.drawable.shekisaray4)
                lbDetailImageFive.setBackgroundResource(R.drawable.shekisaray5)
            }

            "olimpik_hotel" -> {
                lbAboutTrusimDetail.text = getMessageDetail(message)
                lbDetailImageOne.setBackgroundResource(R.drawable.olimpik1)
                lbDetailImageTwo.setBackgroundResource(R.drawable.olimpik2)
                lbDetailImageThree.setBackgroundResource(R.drawable.olimpik3)
                lbDetailImageFour.setBackgroundResource(R.drawable.olimpik4)
                lbDetailImageFive.setBackgroundResource(R.drawable.olimpik5)
            }

            "issam_hotel" -> {
                lbAboutTrusimDetail.text = getMessageDetail(message)
                lbDetailImageOne.setBackgroundResource(R.drawable.issam1)
                lbDetailImageTwo.setBackgroundResource(R.drawable.issam2)
                lbDetailImageThree.setBackgroundResource(R.drawable.issam3)
                lbDetailImageFour.setBackgroundResource(R.drawable.issam4)
                lbDetailImageFive.setBackgroundResource(R.drawable.issam5)
            }

            "narin_qala" -> {
                lbAboutTrusimDetail.text = getMessageDetail(message)
                lbDetailImageOne.setBackgroundResource(R.drawable.narinqala1)
                lbDetailImageTwo.setBackgroundResource(R.drawable.narinqala2)
                lbDetailImageThree.setBackgroundResource(R.drawable.narinqala3)
                lbDetailImageFour.setBackgroundResource(R.drawable.narinqala4)
                lbDetailImageFive.setBackgroundResource(R.drawable.narinqala5)
            }

            "alban_kilsesi" -> {
                lbAboutTrusimDetail.text = getMessageDetail(message)
                lbDetailImageOne.setBackgroundResource(R.drawable.kismebedi)
                lbDetailImageTwo.setBackgroundResource(R.drawable.kishmebedi2)
                lbDetailImageThree.setBackgroundResource(R.drawable.kishmebedi3)
                lbDetailImageFour.setBackgroundResource(R.drawable.kishmebedi4)
                lbDetailImageFive.setBackgroundResource(R.drawable.kishmebedi5)
            }

            "cennet_bagi" -> {
                lbAboutTrusimDetail.text = getMessageDetail(message)
                lbDetailImageOne.setBackgroundResource(R.drawable.kishmebedi3)
                lbDetailImageTwo.setBackgroundResource(R.drawable.c)
                lbDetailImageThree.setBackgroundResource(R.drawable.cc)
                lbDetailImageFour.setBackgroundResource(R.drawable.ccc)
                lbDetailImageFive.setBackgroundResource(R.drawable.cccc)
            }
        }
        return view
    }

    private fun getMessageDetail(message: String): String {
        val properties = Properties()
        val inputStream = activity?.baseContext?.assets?.open("history")
        properties.load(inputStream)
        return String(
            properties.getProperty(message).toByteArray(charset("ISO-8859-1")),
            charset("UTF-8")
        )
    }
}
