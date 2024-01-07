package infrastructure

import administration.StructureModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.collections.immutable.PersistentList
import kotlinx.collections.immutable.persistentListOf

class PostOfficesViewModel: ViewModel() {

    private val _postOfficesList = MutableLiveData<PersistentList<StructureModel>>().apply {
        value = persistentListOf(
            StructureModel("", "Şəki Regional Poçt Filialı\n31 r/n M.Ə.Rəsulzadə 156A", ""),
            StructureModel("Abduləlimov Seyran Ələsgər oğlu", "Rəis", "024 – 244 – 29 – 18"),
            StructureModel("", "Müştəri Xidmətlər Şöbəsi\n31 r/n M.Ə.Rəsulzadə 156A", ""),
            StructureModel(
                "Əhmədova Gülnar Yusif qızı",
                "Rəis",
                "024 – 244 – 22 – 90\n024 – 244 – 77 – 90\n024 – 244 – 84 – 61 \n024 – 244 – 29 – 58\n024 – 244 – 29 – 78"
            ),
            StructureModel("", "Şəhər 1 saylı poçt şöbəsi\n21 r/n M.Ə.Rəsulzadə 137", ""),
            StructureModel("İsmayıllı Vasif Ələddin oğlu", "Rəis", "024 – 244 – 83 – 72"),
            StructureModel("", "Şəhər 2 saylı poçt şöbəsi\n15 r/n Xoyski 1A", ""),
            StructureModel("Mehdiyeva Məhbarə İsfəndiyar qızı", "Rəis", "024 – 246 – 12 – 18"),
            StructureModel("", "Şəhər 3 saylı poçt şöbəsi\n7 r/n M.F.Axundov 185A", ""),
            StructureModel("Musayev Ehtibar Niymət oğlu", "Rəis", "024 – 244 – 74 – 23 "),
            StructureModel("", "Şəhər 5 saylı poçt şöbəsi\n18 r/n M.Ə.Rəsulzadə 372A", ""),
            StructureModel("Şıxəliyeva Firəngiz Şirin qızı ", "Rəis", "024 – 246 – 03 – 96"),
            StructureModel("", "Şəhər 6 saylı poçt şöbəsi\n25 r/n Oğuz şösesi 5", ""),
            StructureModel("Musayeva Nərgiz Abdulkərim qızı", "Rəis", "024 – 245 – 16 – 51 "),
            StructureModel("", "Şəhər 7 saylı poçt şöbəsi\nA.Məmmədov 1A", ""),
            StructureModel("Əhmədova Şükufə Yaqub qızı", "Rəis", "024 – 244 – 78 – 49 "),
            StructureModel("", "Şəhər 8 saylı poçt şöbəsi\n29 r/n  N.Nərimanov 2", ""),
            StructureModel("Hümmətova Sevil Nadir qızı", "Rəis", "024 – 245 – 02 – 50 "),
            StructureModel("", "Baş Göynük poçt şöbəsi\nBaş Göynük kəndi", ""),
            StructureModel("İmamov Mahir Ağabəy oğlu", "Rəis", "024 – 249 – 21 – 60"),
            StructureModel("", "Baş Göynük – 2 poçt şöbəsi\nBaş Göynük kəndi", ""),
            StructureModel("Fərəcov Saleh Nəzir oğlu", "Rəis", "050 – 747 – 15 – 45 "),
            StructureModel("", "Biləcik poçt şöbəsi\nBiləcik kəndi", ""),
            StructureModel("Musayev İbrahim Samayıl oğlu", "Rəis", "024 – 249 – 91 – 37"),
            StructureModel("", "İnçə poçt şöbəsi\nİnçə kəndi", ""),
            StructureModel("Bayramov Fəxrəddin Əsgər oğlu", "Rəis", "024 – 243 – 41 – 41"),
            StructureModel("", "Şorsu poçt şöbəsi\nŞorsu kəndi", ""),
            StructureModel("Mustafayev Elçin Mustafa oğlu", "Rəis", "024 – 247 – 22 – 24"),
            StructureModel("", "Baltalı poçt şöbəsi\nBaltalı kəndi", ""),
            StructureModel("Alxasova Pakizə Ağamməd qızı", "Rəis", "024 – 243 – 11 – 79"),
            StructureModel("", "Cumakənd poçt şöbəsi\nCumakənd", ""),
            StructureModel("İbrahimov Vilayət Şakir oğlu", "Rəis", "024 – 247 – 51 – 19"),
            StructureModel("", "Daşüz poçt şöbəsi\nDaşüz kəndi", ""),
            StructureModel("Ağamova Heyran Balabəy qızı ", "Rəis", "024 – 243 – 22 – 60"),
            StructureModel("", "Oxud poçt şöbəsi\nOxud kəndi", ""),
            StructureModel("Məmmədova Nərgiz İdris qızı", "Rəis", "024 – 243 – 01 – 44"),
            StructureModel("", "Kiş poçt şöbəsi\nKiş kəndi", ""),
            StructureModel("Musayeva Esmira Məmməd qızı", "Rəis", "024 – 249 – 81 – 18"),
            StructureModel("", "Baş Zəyzid poçt şöbəsi\nBaş Zəyzid kəndi", ""),
            StructureModel("Əndəlifov Elgün Vahab oğlu", "Rəis", "024 – 249 – 51 – 39"),
            StructureModel("", "Orta Zəyzid poçt şöbəsi\nOrta Zəyzid kəndi", ""),
            StructureModel("Əyyubov Ramis Əbdül oğlu", "Rəis", "024 – 249 – 41 – 19"),
            StructureModel("", "Köbər Zəyzid poçt şöbəsi\nKöbər Zəyzid kəndi", ""),
            StructureModel("Əyyubov Namiq Əbdül oğlu", "Rəis", "070 – 959 – 65 – 86"),
            StructureModel("", "Baş Küngüt poçt şöbəsi\nBaş Küngüt kəndi", ""),
            StructureModel("Lətifov Tərlan Feyzullah oğlu", "Rəis", "024 – 247 – 32 – 25"),
            StructureModel("", "Aşağı Küngüt poçt şöbəsi\nAşağı Küngüt kəndi", ""),
            StructureModel("Musayev Rahim Nizaməddin oğlu", "Rəis", "024 – 249 – 11 – 36"),
            StructureModel("", "Oravan poçt şöbəsi\nOravan kəndi", ""),
            StructureModel("Bədəlov Arzuman Vahid oğlu", "Rəis", "024 – 249 – 04 – 39"),
            StructureModel("", "Cəfərabad poçt şöbəsi\nCəfərabad kəndi", ""),
            StructureModel("Nəbiyeva Sevda Allahyar qızı", "Rəis", "024 – 243 – 81 – 74"),
            StructureModel("", "Böyük Dəhnə poçt şöbəsi\nBöyük Dəhnə kəndi", ""),
            StructureModel("İsmayılov Umud İsmayıl oğlu", "Rəis", "024 – 243 – 61 – 38"),
            StructureModel("", "Kiçik Dəhnə poçt şöbəsi\nKiçik Dəhnə kəndi", ""),
            StructureModel("Məmmədov Zabid Zahid oğlu", "Rəis", "024 – 243 – 51 – 49"),
            StructureModel("", "Suçma poçt şöbəsi\nSuçma kəndi", ""),
            StructureModel("Mustafayev Mais Əhməd oğlu", "Rəis", "024 – 243 – 71 – 22"),
            StructureModel("", "Şəkikənd poçt şöbəsi\nŞəkikənd kəndi", ""),
            StructureModel("Məmmədov Nurəddin Seyfəddin oğlu", "Rəis", "024 – 243 – 32 – 74"),
            StructureModel("", "Turan poçt şöbəsi\nTuran qəsəbəsi", ""),
            StructureModel("Məmmədov İnayət Hidayət oğlu", "Rəis", "024 – 247 – 13 – 31"),
            StructureModel("", "Cəyirli poçt şöbəsi\nCəyirli kəndi", ""),
            StructureModel("Cabbarova Elanur Mirzə qızı", "Rəis", "024 – 247 – 71 – 80"),
            StructureModel("", "Sarıca poçt şöbəsi\nSarıca kəndi", ""),
            StructureModel("Quliyev İlham Seyfəddin oğlu", "Rəis", "024 – 247 – 82 – 09"),
            StructureModel("", "Aydınbulaq poçt şöbəsi\nAydınbulaq kəndi", ""),
            StructureModel("Səfərov Bəhram Qədir oğlu", "Rəis", "024 – 243 – 92 – 01"),
            StructureModel("", "Çayqaraqoyunlu poçt şöbəsi\nÇayqaraqoyunlu kəndi", ""),
            StructureModel("İsrafilov Rəsul Yolçu oğlu", "Rəis", "024 – 247 –12 – 33")
        )
    }
    internal val postOfficesList: MutableLiveData<PersistentList<StructureModel>> = _postOfficesList

}