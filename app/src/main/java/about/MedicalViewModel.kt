package about

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.collections.immutable.PersistentList
import kotlinx.collections.immutable.persistentListOf

class MedicalViewModel : ViewModel() {
    private val _hospitalsList = MutableLiveData<PersistentList<EducationModel>>().apply {
        value = persistentListOf(
            EducationModel("", "", "XƏSTƏXANALAR", "", ""),
            EducationModel(
                "1",
                "MRX-nın yeni korpusu",
                "S.Mümtaz 2",
                "Əliyev Məcid Abduləli oğlu",
                "5 11 73"
            ),
            EducationModel(
                "2",
                "Şəki MRX-sının əsas korpusu",
                "M.Rəsulzadə 164",
                "Əliyev Məcid Abduləli oğlu",
                "4 32 01"
            ),
            EducationModel(
                "3",
                "Doğum evi",
                "20yanvar küç 1",
                "Xəlilov Fərman Calal oğlu",
                "4 38 73"
            ),
            EducationModel(
                "4",
                "Birləşmiş uşaq x/x",
                "Şəki fəhləsi 4",
                "Əliyev İmran Abdul oğlu",
                "4 21 38"
            ),
            EducationModel(
                "5",
                "Psixatriya x/x",
                "M.Hacıyev 14",
                "Əsədullayev Akif Fəxrəddin oğlu",
                "5 16 88"
            ),
            EducationModel(
                "6",
                "Ağ ciyər xəstəlikləri x/x",
                "Bağbanlar 4/1",
                "İbrahimxəlilov Laçın Şahid oğlu",
                "4 18 36"
            ),
            EducationModel("", "", "POLİKLİNİKALAR", "", ""),
            EducationModel(
                "1",
                "MRX-nın poliklinika şöbəsi",
                "M.Rəsulzadə 164",
                "Əliyev Nazim Əli oğlu",
                "4 56 05"
            ),
            EducationModel(
                "2",
                "M.Poliklinikanın 2 saylı terapiya şöbəsi",
                "M.Rəsulzadə 3",
                "Şöbə müdiri vəzifəsi boşdur",
                "5 14 21"
            ),
            EducationModel(
                "3",
                "Uşaq poliklinikasının 1saylı pediatriya şöbəsi",
                "M.F.Axundov 3",
                "Hüseynova Ziyafət Pirməmməd qızı",
                "4 24 58"
            ),
            EducationModel(
                "4",
                "Uşaq xəstəxanasının konsultativ poliklinikası",
                "20 yanvar küç 54",
                "Qədimov Qabil Yusif oğlu",
                "4 25 48"
            ),
            EducationModel(
                "5",
                "Uşaq poliklinikasının 2saylı pediatriya şöbəsi",
                "M.Rəsulzadə 136",
                "Xəlilova İradə Xeybər qızı",
                "4 76 51"
            ),
            EducationModel(
                "6",
                "Təcili tibbi yardım stansiyası",
                "M.Rəsulzadə 169",
                "Qədimov Faiq Rasim oğlu",
                "4 28 80"
            ),
            EducationModel(
                "7",
                "Təcili təxirəsalınmaz tibbi yardım regional məntəqəsi",
                "M.Rəsulzadə 164",
                "İlyaslı Arzu Fərman qızı",
                "4 52 15"
            ),
            EducationModel("", "", "KƏND SAHƏ XƏSTƏXANALARI", "", ""),
            EducationModel(
                "1",
                "Turan qəsəbə x/x",
                "Turan qəsəbəsi",
                "Piriyeva Fatma Yusif qızı",
                "71 2 67"
            ),
            EducationModel(
                "2",
                "Aşağı Göynük KSX",
                "Aşağı Göynük k.",
                "Məmişov Mustafa Yaqub oğlu",
                "96 1 38"
            ),
            EducationModel(
                "3",
                "Kiçik Dəhnə KSX",
                "Kiçik Dəhnə k.",
                "Hacıyev Ramiz Məmməd oğlu",
                "35 1 16"
            ),

            //Kənd həkim məntəqələri
            EducationModel("", "", "KƏND HƏKİM MƏNTƏQƏLƏRİ", "", ""),
            EducationModel(
                "1",
                "Baş Zəyzid KHM",
                "Baş Zəyzid k.",
                "Hüseynov Ələsgər Bədəl oğlu",
                "95 3 01"
            ),
            EducationModel(
                "2",
                "Baş Layısqı KHM",
                "Baş Layısqı k.",
                "Mikayılova Bilqeyis Musa qızı",
                "93 1 35"
            ),
            EducationModel(
                "3",
                "Cəfəravabad KHM",
                "Cəfəravabad k.",
                "Musayev Namizəd Mövlan oğlu",
                "38 1 71"
            ),
            EducationModel(
                "4",
                "Bideyiz KHM",
                "Bideyiz k.",
                "İslamov Nərbala Firiddun oğlu",
                "74 2 15"
            ),
            EducationModel(
                "5",
                "Baş Göynük KHM",
                "Baş Göynük k.",
                "Məmmədova Göyərçin İsfəndiyar qızı",
                "92 1 98"
            ),
            EducationModel(
                "6",
                "Böyük Dəhnə KHM",
                "Böyük Dəhnə k.",
                "Abdullayev Azad Əzzəl oğlu",
                "36 1 44"
            ),
            EducationModel(
                "7",
                "Kiş KHM",
                "Kiş k.",
                "İslamova Mehriban Biyakir qızı",
                "98 1 46"
            ),
            EducationModel(
                "8",
                "Şəki kənd KHM",
                "Şəki kənd k.",
                "İbrahimxəlilov Elçin Səfəralı oğlu",
                "--"
            ),
            EducationModel(
                "9",
                "Qoxmuq KHM",
                "Qoxmuq k.",
                "Soltanov Sahil Soltan oğlu",
                "4 78 97"
            ),
            EducationModel("10", "Oxud KHM", "Oxud k.", "Musayev Sərxan Əsəd oğlu", "30 1 17"),
            EducationModel(
                "11",
                "Aşağı Küngüt KHM",
                "Aşağı Küngüt k.",
                "Babayev Hazər Mövlud oğlu",
                "91 1 03"
            ),
            EducationModel(
                "12",
                "İnçə-Zunud KHM",
                "İnçə k.",
                "Camalov Nadir Hümmət oğlu",
                "34 1 16"
            ),
            EducationModel(
                "13",
                "Orta Zəyzid KHM",
                "Orta Zəyzid k.",
                "Xaliyeva Sitarə Hacı qızı",
                "94 1 18"
            ),
            EducationModel(
                "14",
                "Cuma KHM",
                "Cuma k.",
                "Məmmədli Valeh Nəriman oğlu",
                "75 2 03"
            ),
            EducationModel(
                "15",
                "Cəyirli KHM",
                "Cəyirli k.",
                "Məmmədova Hüsniyyə Rahim qızı",
                "77 2 27"
            )
        )
    }
    internal val hospitalsList: MutableLiveData<PersistentList<EducationModel>> = _hospitalsList
}