package administration

import about.AboutModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import az.com.sheki.R
import kotlinx.collections.immutable.PersistentList
import kotlinx.collections.immutable.persistentListOf

class AdminViewModel: ViewModel() {
    private val _adminList = MutableLiveData<PersistentList<AboutModel>>().apply {
        value = persistentListOf(
            AboutModel(R.drawable.managment, "İH-nın Başçısı"),
            AboutModel(R.drawable.managment_structure, "Aparatın Strukturu"),
            AboutModel(R.drawable.managment_shura, "Şura"),
            AboutModel(R.drawable.managment_represent, "Nümayəndəliklər"),
            AboutModel(R.drawable.managment_munc, "Bələdiyyələr"),
            AboutModel(R.drawable.vetendash_qebulu, "Vətəndaşların qəbulu"),
            AboutModel(R.drawable.elektron_muraciet, "Elektron müraciət"),
            AboutModel(R.drawable.elektron_xidmet, "Elektron xidmətlər"),
            AboutModel(R.drawable.report, "Başçının hesabat məruzələri"),
            AboutModel(R.drawable.advertisiment, "Elanlar")
        )
    }
    internal val adminList: MutableLiveData<PersistentList<AboutModel>> = _adminList
}