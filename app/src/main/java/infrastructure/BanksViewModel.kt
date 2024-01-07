package infrastructure

import administration.StructureModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.collections.immutable.PersistentList
import kotlinx.collections.immutable.persistentListOf

class BanksViewModel: ViewModel() {

    private val _bankFilialList = MutableLiveData<PersistentList<StructureModel>>().apply {
        value = persistentListOf(
            StructureModel(
                "",
                "“Kapital Bank”ın Şəki filialı\\nŞəki şəhəri, M.Müşfiq küç. 40\\nFaks: (+994 24) 244-41-95",
                ""
            ),
            StructureModel("Orucov Əli Bəxtiyar oğlu ", "müdir", "(+994 24) 244-41-95"),
            StructureModel(
                "",
                "“Beynəlxalq Bank”ın Şəki filialı\\nŞəki, Şəki, H.Əliyev prospekti, 61A\\nFaks: (+994 24) 244-27-58",
                ""
            ),
            StructureModel("Mikayılov Mehman Kamil oğlu", "müdir", "(+994 24) 244-75-20"),
            StructureModel("", "“NBC Bank”ın Şəki filialı\\nM.Ə.Rəsulzadə pr.180", ""),
            StructureModel("Məmmədov Elmar Cəlil oğlu", "müdir", "(+994 24) 244-30-50"),
            StructureModel(
                "",
                "“DəmirBank”ın Şəki filialı\\nS. Rəhman küç. 6a\\nFaks: (+994 24) 244-88-25",
                ""
            ),
            StructureModel("İsmayılov Alim Məmməd oğlu", "müdir", "(+994 24) 244-88-25"),
            StructureModel(
                "",
                "“Rabitəbank”ın Şəki filialı\\nŞəki şəhəri, M. Rəsulzadə 178\\nFaks: (+994 24) 244-83-00",
                ""
            ),
            StructureModel("Hüseynov Təhsin Yaşar oğlu", "müdir", "(+994 24) 244-83-00"),
            StructureModel(
                "",
                "“Unibank”ın Şəki filialı\\nM.Ə.Rəsulzadə prospekti, 160A\\nFaks: (+994 24) 244 55 29",
                ""
            ),
            StructureModel("Əlipaşayev Xalid Əlisahib oğlu", "müdir", "(+994 24) 244-58-48"),
            StructureModel(
                "",
                "“Bank of Baku”nun Şəki filialı\\nŞəki ş.M. Rəsulzadə, 183\\nFaks: (+994 24) 244-56-66",
                ""
            ),
            StructureModel("Miqirov Zaur İlqar oğlu", "müdir", "(+994 24) 244-24-44"),
            StructureModel(
                "",
                "“Bank Respublika”nın  Şəki filialə\\nŞəki ş., M.Ə.Rəsulzadə küç. 180, 2-ci giriş\\nFaks: (+994 24) 244 80 78",
                ""
            ),
            StructureModel(
                "",
                "“Access Bank”ın Şəki filialı\\nM. Ə. Rəsulzadə küç., 17, Şəki,\\nFaks: (+994 24) 244-72-33",
                ""
            ),
            StructureModel("Şəfaətli Anar Nüsrət oğlu", "müdir", "(+994 24) 244-80-78"),
            StructureModel("Nəsibov Hikmət İlqar oğlu", "müdir", "(+994 24) 244 60 80"),
            StructureModel(
                "",
                "“Günay Bank”ın Şəki filialı\\nŞəki şəhəri, A.Məmmədov küç., 48\\nFaks: (+994 24) 244-50-76",
                ""
            ),
            StructureModel("Rəsulov Rəsul İlməddin oğlu", "müdir", "(+994 24) 244-50-76"),
            StructureModel(
                "",
                "“FİNCA Azərbaycan” bank olmayan kredit təşkilatının Şəki filialı\\nŞəki şəhəri, H.Əliyev pr. 44",
                ""
            ),
            StructureModel("Pirimov Tofiq Sadiq oğlu", "müdir", "(+994 24) 244-28-62"),
            StructureModel(
                "",
                "“Aqrarkredit” QSC bank olmayan kredit təşkilatının Şəki filialı\\nŞəki şəhəri, 20 yanvar küç, 6\\nFaks: (+994 24) 244-01-74",
                ""
            ),
            StructureModel(
                "Abdulkərimov Yunus Abdulkərim oğlu",
                "müdir",
                "(+994 24) 244-01-74"
            ),
            StructureModel(
                "",
                "“Kred Aqro” bank olmayan kredit təşkilatının Şəki filialı\\nŞəki şəhəri, Mikayıl Müşviq küç., 1 A\\nFaks: (+994 24) 244-11-65",
                ""
            ),
            StructureModel("Əhmədov Ramal Məmməd oğlu", "müdir", "(+994 24) 244-11-65 (101)"),
            StructureModel(
                "",
                "BOKT “Viator” mikrokredit Azərbaycan MMC-nin Şəki filialı\\nŞəki şəhəri, İ.Həmidov küçəsi, dalan 1 ev 2\\nFaks: (+994 24) 244-73-06",
                ""
            ),
            StructureModel("Nəbiyev Vəkil Tapdıq oğlu", "müdir", "(+994 24) 244-73-06")
        )
    }
    internal val bankFilialList: MutableLiveData<PersistentList<StructureModel>> = _bankFilialList

}