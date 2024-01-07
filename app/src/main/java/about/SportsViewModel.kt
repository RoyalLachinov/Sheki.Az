package about

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.collections.immutable.PersistentList
import kotlinx.collections.immutable.persistentListOf

class SportsViewModel : ViewModel() {
    private val _sportSchoolList = MutableLiveData<PersistentList<EducationModel>>().apply {
        value = persistentListOf(
            EducationModel(
                "1",
                "Şəki Olimpiya İdman Kompleksi",
                "S.Mümtaz küç 1",
                "Əsgərov İlham Telman oğlu",
                "(0177) 5-11-55\n(0177) 5-17-63"
            ),
            EducationModel(
                "2",
                "Şəki İdman Sağlamlıq Mərkəzi",
                "M.F.Axundov 3",
                "Əhmədov Nəriman Məmmədhənifə oğlu",
                "(0177) 4-01-16"
            ),
            EducationModel("3", "Şəki şəhər Stadionu", "M.F.Axundov 31", "--", "--"),

            EducationModel(
                "4",
                "Uşaq Gənclər İdman Məktəbi (Gİİ)",
                "M.F.Axundov 3",
                "Sadıqov İlqar Vülqar oğlu",
                "(0177) 4-26-11"
            ),

            EducationModel(
                "5",
                "Təhsil Uşaq Gənclər İdman Məktəbi",
                "Mikayıl Cəbrayılov 10",
                "Vəliyev Hətəm Həmid oğlu",
                "(0177) 4-61-93"
            ),
            EducationModel(
                "6",
                "Şəki Uşaq Şahmat Məktəbi",
                "M.F.Axundov 75",
                "Salamov Vüqar Bayram oğlu",
                "(0177) 4-37-12"
            )
        )
    }
    internal val sportSchoolList: MutableLiveData<PersistentList<EducationModel>> = _sportSchoolList
}