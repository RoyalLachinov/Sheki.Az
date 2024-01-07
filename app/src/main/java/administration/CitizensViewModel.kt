package administration

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.collections.immutable.PersistentList
import kotlinx.collections.immutable.persistentListOf

class CitizensViewModel: ViewModel() {
    private val _citizenAcceptDates = MutableLiveData<PersistentList<CitizenAcceptModel>>().apply {
        value = persistentListOf(
            CitizenAcceptModel(
                "Bazar ertəsi günü",
                "İsmayılov Nizami Cuma",
                "İHB-nın müavini - Şəhər təsərrüfatı şöbəsinin müdiri vəzifəsini icra edən"
            ),
            CitizenAcceptModel(
                "Çərşənbə günü",
                "Əliyev Firon Bəxtiyar",
                "İHB-nın müavini - Sosial-iqtisadi inkişafın təhlili və proqnozlaşdırılması şöbəsinin müdiri"
            ),
            CitizenAcceptModel(
                "Çərşənbə günü",
                "Cavadova Zərinə Əliəkbər",
                "İHB-nın müavini – İctimai-siyasi və humanitar məsələlər şöbəsinin müdiri"
            ),
            CitizenAcceptModel(
                "Cümə axşamı günü",
                "Həsənov Həsən Yusub",
                "İHB-nın  birinci müavini"
            ),
            CitizenAcceptModel(
                "Cümə günü",
                "Usubov Elxan Zabir",
                "Şəki Şəhər İcra Hakimiyyətinin başçısı"
            )
        )
    }

    internal val citizenAcceptDates: MutableLiveData<PersistentList<CitizenAcceptModel>> = _citizenAcceptDates
}