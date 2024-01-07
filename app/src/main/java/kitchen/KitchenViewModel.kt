package kitchen

import about.AboutModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import az.com.sheki.R
import kotlinx.collections.immutable.PersistentList
import kotlinx.collections.immutable.persistentListOf

class KitchenViewModel: ViewModel() {
    private val _foodList = MutableLiveData<PersistentList<AboutModel>>().apply {
        value = persistentListOf(
            AboutModel(R.drawable.piti, "Şəki pitisi"),
            AboutModel(R.drawable.gurze, "Şəki gürzəsi "),
            AboutModel(R.drawable.kulce, "Şəki külçəsi "),
            AboutModel(R.drawable.tutplovu, "Şəki tutlu-südlü plovu "),
            AboutModel(R.drawable.toyuqplovu, "Şəki parça-döşəmə plovu "),
            AboutModel(R.drawable.balva, "Şəki balvası "),
            AboutModel(R.drawable.surfullu, "Şəki sürfüllüsü "),
            AboutModel(R.drawable.oma, "Şəki fətiri (Oma)"),
            AboutModel(R.drawable.paxlava, "ŞƏKİ HALVASI"),
            AboutModel(R.drawable.toynogulu, "TOY NOĞULU"),
            AboutModel(R.drawable.bamiye, "BAMİYƏ"),
            AboutModel(R.drawable.mindal, "MİNDAL "),
            AboutModel(R.drawable.barama_shirni, "BARAMA ŞİRNİ"),
            AboutModel(R.drawable.cay_destgahi, "ÇAY DƏSTGAHI"),
            AboutModel(R.drawable.duyme_shirni, "DÜYMƏ ŞİRNİ"),
            AboutModel(R.drawable.taxta_shirni, "TAXTA ŞİRNİ"),
            AboutModel(R.drawable.manpasi, "MANPASI"),
            AboutModel(R.drawable.tel_halva, "TEL HALVA "),
            AboutModel(R.drawable.peshveng, "PEŞVƏNG HALVA"),
            AboutModel(R.drawable.qirmabadam, "QIRMABADAM")
        )
    }

    internal val foodList: MutableLiveData<PersistentList<AboutModel>> = _foodList
}