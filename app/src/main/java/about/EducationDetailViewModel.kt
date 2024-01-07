package about

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.collections.immutable.PersistentList
import kotlinx.collections.immutable.persistentListOf

class EducationDetailViewModel : ViewModel() {
    private val _schoolsList = MutableLiveData<PersistentList<EducationModel>>().apply {
        value = persistentListOf(

            EducationModel(
                "1",
                "Şəhər 1 №-li tam o/m",
                "Şəki şəhəri, Vidadi küç № 65",
                "Cabbarova Tahirə Mustafa",
                "4-23-16"
            ),

            EducationModel(
                "2",
                "Şəhər 2 №-li tam o/m",
                "Şəki şəhəri F.Xoyski küç 4",
                "Mustafayeva Tamella  Yusif",
                "4-23-26"
            ),

            EducationModel(
                "3",
                "Şəhər 3 №-li tam o/m",
                "Şəki şəhəri M.F.Axundov №132",
                "Baxışov Bünyamin Təmraz",
                "4-23-36"
            ),

            EducationModel(
                "4",
                "Şəhər 4 №-li tam o/m",
                "Şəki şəhəri 6-cı rn.Pişnamazzadə küç № 1",
                "Məmmədova İradə Fikrət",
                "4-24-46"
            ),

            EducationModel(
                "5",
                "Şəhər 5 №-li tam o/m",
                "Şəki şəhər Füzuli küç № 4",
                "İbrahimova Filyar Oruc",
                "4-23-86"
            ),

            EducationModel(
                "6",
                "Şəhər 6 №-li tam o/m",
                "Şəki ş.Qurdlar mə-si. 27-ci rn.h.Sarabski küç №1",
                "Mustafayev Rafik Qaffar",
                "0442770185"
            ),

            EducationModel(
                "7",
                "Şəhər 7 №-li tam o/m",
                "Şəki şəhəri M.Rəsulzadə № 283",
                "Xəlilov Bəkir Xəlil",
                "6-05-13"
            ),

            EducationModel(
                "8",
                "Şəhər 8 №-li tam o/m",
                "Şəki şəhəri S.Rəhman küç. № 7",
                "Ələsgərli Səttar Sabir",
                "4-44-89"
            ),

            EducationModel(
                "9",
                "Şəhər 9 №-li tam o/m",
                "Şəki şəhər M.P.Vaqif küç, № 4",
                "Abdullayeva İntizar Oktay",
                "6-09-62"
            ),

            EducationModel(
                "10",
                "Şəhər 10 №-li tam o/m",
                "Şəki şəhər H.Əliyev pr № 83",
                "Yusifov Abid Abdulla",
                "4-23-68\n044-277-10-55"
            ),

            EducationModel(
                "11",
                "Şəhər 11 №-li tam o/m",
                "Şəki şəhəri B.Məmmədov № 1",
                "Sədiyeva Ədalət Malik",
                "4-74-42"
            ),

            EducationModel(
                "12",
                "Şəhər 12 №-li tam o/m",
                "Şəki şəhər N.Nərimanov küç № 156",
                "Hümmətova Türabə Musa",
                "4-75-63"
            ),

            EducationModel(
                "13",
                "Şəhər 14 №-li tam o/m",
                "Şəki şəhəri M.Ə.Rəsulzadə küç № 295 a",
                "Abdullayeva İradə Məmməd",
                "6-01-47"
            ),

            EducationModel(
                "14",
                "Şəhər 17 №-li tam o/m",
                "Şəki şəhəri A.Əfəndiyev  № 20",
                "Mustafayev Elman  Abduləli",
                "5-04-98"
            ),

            EducationModel(
                "15",
                "Şəhər 18 №-li tam o/m",
                "Şəki şəhəri M.Ə.Rəsulzadə küç. № 154",
                "Mahmudov Məmməd Məmmədiyə",
                "4-23-76"
            ),

            EducationModel(
                "16",
                "Şəhər 19 №-li tam o/m",
                "Şəki şəhəri M.Cəbrayılov № 10",
                "Hüseynova Ulduz Fərrux",
                "4-22-66"
            ),

            EducationModel(
                "17",
                "Şəhər 20 №-li tam o/m",
                "Şəki şəhəri 25-ci rayon D.Bünyadzadə, №7",
                "Qurbanov Səbuhi Yusif",
                "4-74-76"
            ),

            EducationModel(
                "18",
                "Şəhər 21 №-li tam o/m",
                "Şəki şəhəri Oğuz şossesi Şəki MMC-binasına bitişik",
                "Sadıqov Eldəniz  Mövlüd",
                "5-13-76"
            ),

            EducationModel(
                "19",
                "Şəki Şəhər liseyi",
                "Şəki şəhəri 20 yanvar küç № 127",
                "Məmmədov Firqət Siracəddin",
                "4-59-97\n4-56-63"
            ),

            EducationModel(
                "20",
                "Şəki Şəhər internat məktəbi",
                "Şəki şəhəri M.F.Axundov pr № 164",
                "İbadullayeva Nurlana Rizvan",
                "4-24-14"
            ),

            EducationModel(
                "21",
                "Turan qəsəbə tam o/m",
                "Şəki rayonu Turan qəsəbəsi",
                "Yusifov Baba Abdulla",
                "71-3-81"
            ),

            EducationModel(
                "22",
                "Aşağı Layısqı kənd tam o/m",
                "Şəki rayonu Aşağı Layısqı kəndi",
                "Məmmədli Fərrux Əhməd",
                "96-1-17"
            ),

            EducationModel(
                "23",
                "Aşağı Göynük kənd tam o/m",
                "Şəki rayonu Aşağı Göynük kəndi",
                "Mahmudov Cahangir Əli",
                "96-1-85\n96-2-18"
            ),

            EducationModel(
                "24",
                "Aşağı Küngüt kənd tam o/m",
                "Şəki rayonu Aşağı Küngüt kəndi",
                "Yunusov Oktay Qinyaz",
                "91-1-46"
            ),

            EducationModel(
                "25",
                "Aydınbulaq kənd tam o/m",
                "Şəki rayonu Aydınbulaq kəndi",
                "Vəliyev Elçin Nazim",
                "39-2-36"
            ),

            EducationModel(
                "26",
                "I Biləcik kənd tam o/m",
                "Şəki rayonu I Biləcik kəndi",
                "Həsənova Tahirə M.Əli",
                "99-1-50"
            ),

            EducationModel(
                "27",
                "II Biləcik kənd tam o/m",
                "Şəki rayonu II Biləcik kəndi",
                "Aslanov Etibar Müslüm",
                "99-1-33"
            ),

            EducationModel(
                "28",
                "Baş Küngüt kənd tam o/m",
                "Şəki rayonu Baş Küngüt kəndi",
                "Bayramov Kamal Sərkər",
                "73-1-34"
            ),

            EducationModel(
                "29",
                "Baş Şabalıd kənd tam o/m",
                "Şəki rayonu Baş Şabalıd kəndi",
                "Səlimov Səlim Yaqub",
                "92-1-84"
            ),

            EducationModel(
                "30",
                "Baş Zəyzid kənd tam o/m",
                "Şəki rayonu Baş Zəyzid kəndi",
                "Salamov Söhbət Məmməd",
                "95-1-40"
            ),

            EducationModel(
                "31",
                "Baş Layısqı kənd tam o/m",
                "Şəki rayonu Baş Layısqı kəndi",
                "Mikayılov İmran Musa",
                "93-1-43"
            ),

            EducationModel(
                "32",
                "Baş Göynük kənd  1 №-li tam o/m",
                "Şəki rayonu Baş Göynük kəndi",
                "İbrahimov Sadəddin Salam",
                "92-1-83"
            ),

            EducationModel(
                "33",
                "Baş Göynük kənd 2 №-li tam o/m",
                "Şəki rayon Baş Göynük kəndi",
                "Hüseynəliyev  Möhlüd Kərim",
                "92-1-38"
            ),

            EducationModel(
                "34",
                "Böyük Dəhnə kənd 1 №-li tam o/m",
                "Şəki rayonu Böyük Dəhnə kəndi",
                "Sofiyev Natiq Qoşqar",
                "36-1-86"
            ),

            EducationModel(
                "35",
                "Böyük Dəhnə kənd 2 №-li tam o/m",
                "Şəki rayonu Böyük Dəhnə kəndi",
                "Ağabəyov Xanlar Həsrət",
                "37-00-8"
            ),

            EducationModel(
                "36",
                "Baltalı kənd tam o/m",
                "Şəki rayonu Baltalı kəndi",
                "İbrahimov Namiq Seydi",
                "31-1-90"
            ),

            EducationModel(
                "37",
                "Bolludərə tam o/m",
                "Şəki rayonu Bolludərə kəndi",
                "İbrahimov Ədalət  Həsən",
                "--"
            ),

            EducationModel(
                "38",
                "Bideyiz kənd tam o/m",
                "Şəki rayonu Bideyiz kəndi",
                "Alxasov Pənah Tağı",
                "74-2-20"
            ),

            EducationModel(
                "39",
                "Cəyirli kənd tam o/m",
                "Şəki rayonu Cəyirli kəndi ",
                "Rzayev Altay Oktay",
                "77-3-31"
            ),

            EducationModel(
                "40",
                "Cəfərabad kənd tam o/m",
                "Şəki rayonu Cəfərabad kəndi",
                "Gülalıyev Gülalı Nuralı",
                "38-1-22"
            ),

            EducationModel(
                "41",
                "Cumakənd tam o/m",
                "Şəki rayonu Cumakənd kəndi",
                "Süleymanov Vaqif Həsən",
                "75-1-35"
            ),

            EducationModel(
                "42",
                "Cunud  kənd tam o/m",
                "Şəki rayonu Cunud  kəndi",
                "Salmanov Ziyədxan Murtuz",
                "93-1-62"
            ),

            EducationModel(
                "43",
                "Çayqaraqoyunlu kənd tam o/m",
                "Şəki rayonu Çayqaraqoyunlu kəndi",
                "Məmmədov Ramiz Ənvər",
                "71-2-41"
            ),

            EducationModel(
                "44",
                "Çələbixan qəsəbə tam o/m",
                "Şəki rayonu Çələbixan qəsəbəsi",
                "Əzizov Rəşid Ənvər",
                "38-3-04"
            ),

            EducationModel(
                "45",
                "Çeşməli kənd tam o/m",
                "Şəki rayonu Çeşməli kəndi",
                "Xasiyeva Ziyafət Mustafa",
                "--"
            ),

            EducationModel(
                "46",
                "Daşüz kənd tam o/m",
                "Şəki rayonu Daşüz kəndi",
                "Hüseynova Anjelixa Abbas",
                "32-2-58"
            ),

            EducationModel(
                "47",
                "Dərəcənnət kənd tam o/m ",
                "Şə49ki rayonu Dərəcənnət kəndi",
                "Musazadə Daşdəmir Hacı",
                "26-1-30"
            ),

            EducationModel(
                "48",
                "İnçə Zunud kənd tam o/m",
                "Şəki rayonu İnçə Zunud kəndi",
                "Məhərrəmov Məhərrəm Əsabəli",
                "34-1-37"
            ),

            EducationModel(
                "49",
                "İbrahimkənd tam o/m",
                "Şəki rayonu İbrahimkənd kəndi ",
                "Yunusov Ramiz Tapdıq",
                "91-1-12"
            ),

            EducationModel(
                "50",
                "Kiş kənd 1 №-li tam o/m",
                "Şəki rayonu Kiş kəndi ",
                "Qarayev Elçin Müzəkkir",
                "98-8-44"
            ),

            EducationModel(
                "51",
                "Kiş kənd 2 №-li tam o/ m",
                "Şəki rayonu Kiş kəndi",
                "Mahmudova  Lalə Sabir",
                "98-5-77"
            ),

            EducationModel(
                "52",
                "Kiş kənd 4 №- li tam o/m",
                "Şəki rayonu Kiş kəndi",
                "İlyasov Vüsal Xan",
                "98-1-45"
            ),

            EducationModel(
                "53",
                "Kiçik Dəhnə kənd 1№ li tam o/m",
                "Şəki rayonu Kiçik Dəhnə kəndi",
                "İbadullayev Fazil İsmayıl",
                "35-1-21"
            ),

            EducationModel(
                "54",
                "Kiçik Dəhnə kənd 2№ li tam o/m",
                "Şəki rayonu Kiçik Dəhnə kəndi",
                "Qədirov Qurban M.Rəsul",
                "35-1-47"
            ),

            EducationModel(
                "55",
                "Köbər Zəyzid kənd tam o/m",
                "Şəki rayonu Köbər Zəyzid kəndi",
                "İsmayılova Sovqat Abdulla",
                "442771053"
            ),

            EducationModel(
                "56",
                " Oxud kənd tam o/m",
                "Şəki rayon Oxud kəndi",
                "Abdullayerv Ülfət Qəni",
                "30.01.1935"
            ),

            EducationModel(
                "57",
                "Köndələn kənd tam o/m",
                "Şəki rayonu Aşağı Göynük kənd",
                "Mahmudov Abdulla Paşa",
                "96-2-61"
            ),

            EducationModel(
                "58",
                "Qayabaşı kənd tam o/m",
                "Şəki rayonu Qayabaşı kəndi",
                "Hümmətov Qasım Ramiz",
                "78-2-79"
            ),

            EducationModel(
                "59",
                "Qayabaşı kənd tam o/m",
                "Şəki rayonu Qayabaşı kəndi",
                "Hümmətov Qasım Ramiz",
                "78-2-79"
            ),

            EducationModel(
                "60",
                "Qaratorpaq kənd tam o/m",
                "Şəki rayonu Qaratorpaq kəndi",
                "Həsənov  Həsən Yəhya",
                "--"
            ),

            EducationModel(
                "61",
                "Qozlubulaq kənd tam o/m",
                "Şəki rayonu Qozlubulaq kəndi",
                "Abbasov Novruzəli Xudaverdi",
                "77-1-01"
            ),

            EducationModel(
                "62",
                "Qoxmuq kənd tam o/m",
                "Şəki rayonu Qoxmuq kəndi",
                "Daşdəmirov Umudvar  Mürsıl",
                "4-53-07"
            ),

            EducationModel(
                "63",
                "Qudula kənd tam o/m",
                "Şəki rayonu Qudula kəndi",
                "Məmədov Şahid Zahid",
                "97-1-17"
            ),

            EducationModel(
                "64",
                "Qumux kənd tam o/m",
                "Şəki rayonu Qumux kəndi",
                "Cumayev Vüqar Zaməddin",
                "93-1-27"
            ),

            EducationModel(
                "65",
                "Orta Zəyzid kənd 1№ - li tam o/m",
                "Şəki rayonu Orta Zəyzid kəndi",
                "Rəsulov Əli Allahverdi",
                "94-1-25"
            ),

            EducationModel(
                "66",
                "Orta Zəyzid kənd 2№ - li tam o/m",
                "Şəki rayonu Orta Zəyzid kəndi",
                "Əhmədov Ələddin Nizaməddin",
                "94-3-91"
            ),

            EducationModel(
                "67",
                "Sarıca kənd tam o/m",
                "Şəki rayonu Sarıca kəndi",
                "İsmayılov Emin Abbasəli",
                "78-2-76"
            ),

            EducationModel(
                "68",
                "Suçma kənd tam o/m",
                "Şəki rayonu Suçma kənd",
                "Abdurahmanov Alxas  Nizaməddin",
                "37-1-31"
            ),

            EducationModel(
                "69",
                "Şəki kənd tam o/m",
                "Şəki rayonu Şəki kəndi",
                "Şadmanov Dağbəyi  Şadman",
                "33-2-46"
            ),

            EducationModel(
                "70",
                "Şorsu kənd tam o/m",
                "Şəki rayonu Şorsu kəndi",
                "Ağaniyev Cəfər  Quzu",
                "72-1-40"
            ),

            EducationModel(
                "71",
                "Şin kənd tam o/m",
                "Şəki rayonu Şin kəndi",
                "İsmayılov Əfəndi  Mehdi",
                "93-1-64"
            ),

            EducationModel(
                "72",
                "Vərəzət kənd tam o/m",
                "Şəki rayonu Vərəzət kəndi",
                "Məmmədov Ələkrəm Məmmədiyə",
                "95-1-90"
            ),

            EducationModel(
                "73",
                "Aşağı Şabalıd kənd üm.o/m",
                "Şəki rayon Aşağı Şabalıd kəndi",
                "Mustafayev Mahir Mustafa",
                "34-1-11"
            ),

            EducationModel(
                "74",
                "Aşağı Daşağıl kənd üm.o/m",
                "Şəki rayonu Aşağı Daşağıl kəndi",
                "Məmmədov Arif  Təmraz",
                "--"
            ),

            EducationModel(
                "75",
                "Aran kənd üm. o/m",
                "Şəki rayonu Aran kəndi",
                "Məmmədov Şahin Nurəddin",
                "33-2-71"
            ),

            EducationModel(
                "76",
                "Baş Kəldək kənd üm. o/m",
                "Şəki rayonu Baş Kəldək kəndi",
                "Musayev Nurəli Məcid",
                "90-4-87"
            ),

            EducationModel(
                "77",
                "Babaratma kənd üm. o/m",
                "Şəki rayonu  Babaratma kəndi",
                "Səfərov İmran Səfər",
                "--"
            ),

            EducationModel(
                "78",
                "Baqqal kənd üm. o/m",
                "Şəki rayonu Baqqal kəndi ",
                "Səmədov Niymət Əyyub",
                "99-1-35"
            ),

            EducationModel(
                "79",
                "Çapağan kənd üm. o/m",
                "Şəki rayonu Çapağan kəndi",
                "Hacıağayeva Gülarə Şiraslan",
                "91-1-17"
            ),

            EducationModel(
                "80",
                "Daşbulaq kənd üm. o/m",
                "Şəki rayonu Daşbulaq kəndi",
                "Yusifov Bəşir Məhyəddin",
                "76-2-27"
            ),

            EducationModel(
                "81",
                "Dəryaçay kənd üm. o/m",
                "Şəki rayonu Dəryaçay  kəndi",
                "İsmayılov Miçurin Məmməd",
                "92-5-37"
            ),

            EducationModel(
                "82",
                "Əliyar kənd  üm. o/m",
                "Şəki rayonu Əliyar kəndi",
                "Vəliyev Samir Yusif",
                "39-2-78"
            ),

            EducationModel(
                "83",
                "Fazıl kənd üm. o/m",
                "Şəki rayonu Fazıl kəndi",
                " Məmmədov Fikrət Müslüm",
                "91-1-29"
            ),

            EducationModel(
                "84",
                "Göybulaq kənd üm. o/m",
                "Şəki rayonu Göybulaq kəndi",
                "Əyyubov Məhəmməd İslam",
                "38-1-70"
            ),

            EducationModel(
                "85",
                "Küdürlü kənd üm. o/m",
                "Şəki rayonu Küdürlü kəndi",
                " Çələbiyev Mehrabi  Nuralı",
                "442770554"
            ),

            EducationModel(
                "86",
                "Qaradağlı kənd üm. o/m",
                "Şəki rayonu  Qaradağlı kəndi",
                "Xudiyev Əlyar Köçəri",
                "97-2-20"
            ),

            EducationModel(
                "87",
                "Qırxbulaq kənd ü m.o/m",
                "Şəki rayonu Qırxbulaq kəndi",
                "Həsənov Əsabəli İbrahim",
                "86-6-32"
            ),

            EducationModel(
                "88",
                "Oxud kənd üm. o/m",
                "Şəki rayonu Oxud kəndi",
                "Məsimov Mahir Tahir",
                "--"
            ),

            EducationModel(
                "89",
                "Vərəzət kənd köçkünlər üm. o/m",
                "Şəki rayonu Vərəzət kəndi ",
                "Səfərov Tariyel Cəfərqulu",
                "--"
            ),

            EducationModel(
                "90",
                "Yeni Göynük üm. o/m",
                "Şəki rayonu Baş Göynük kəndi",
                "Vəliyeva Aysel Kamil",
                "92-5-92"
            ),

            EducationModel(
                "91",
                "Öryət kənd üm. o/m",
                "Şəki rayonu Öryət kəndi",
                "Əhmədov Fikrət  Hacı",
                "--"
            ),

            EducationModel(
                "92",
                "Təpəcənnət kənd üm. o/m",
                "Şəki rayonu Təpəcənnət kəndi",
                "Mustafayev Musa İslam",
                "--"
            ),

            EducationModel(
                "93",
                "Şirinbulaq kənd üm. o/m",
                "Şəki rayonu Şirinbulaq kəndi",
                "Səlimov Yolçu Hasil",
                "5-84-27"
            ),

            EducationModel(
                "94",
                "Selbasan kənd üm. o/m",
                "Şəki rayonu Aşağı Göynük kəndi ",
                "İbrahimova Sevil İbrahim",
                "96-4-71"
            ),

            EducationModel(
                "95",
                "Aşağı Göynük kənd ib/m",
                "Şəki rayonu Aşağı Göynük kənd",
                "İlyasova Hicran Musa",
                "--"
            ),

            EducationModel(
                "96",
                "Baş Küngüt  kənd köç ib/m",
                "Şəki rayonu Baş Küngüt  kənd",
                "Zeynalova Vəfa Səməd",
                "--"
            ),

            EducationModel(
                "97",
                "Kiş kənd 3 №- li ib/m",
                "Şəki rayonu Kiş kəndi ",
                "Feyzullayeva Şəlalə Çingiz",
                "--"
            ),

            EducationModel(
                "98",
                "Salmandərə kənd ib/m",
                "Şəki rayonu Cumakənd\n, Salmandərə kəndləri",
                "Məsimov Tapdıq Qədir",
                "98-1-19"
            ),

            EducationModel(
                "", "", """ Şəki rayonu məktəbəqədər təhsil müəssisələri haqqında
MƏLUMAT""", "", ""
            ),
            //  new EducationModel("Şəki rayonu məktəbəqədər təhsil müəssisələri haqqında\n" +"MƏLUMAT"),),;

            EducationModel(
                "1",
                "Uşaq evi",
                "Şəki ş-ri Gənclər 21",
                "Məmmədova İlhamə Tofiq",
                "4-24-48"
            ),

            EducationModel(
                "2",
                "1 saylı u/b",
                "Dəmirçi bulağı məh.F.Xoyiski pr.",
                "Məmmədova Şərafət Əlyəsər",
                "4-39-52"
            ),

            EducationModel(
                "3",
                "2 saylı u/b",
                "Vidadi 25",
                "Şirinzadə Səadət  Hikmət",
                "4-22-88"
            ),

            EducationModel(
                "4",
                "3 saylı u/b",
                "Ə.Haqverdiyev",
                "Qaflanova Nübar Elçin",
                "4-47-48"
            ),

            EducationModel(
                "5",
                "4saylı u/b",
                "Duluzlar məh.  M.Ə.Rəsulzadə 266",
                "Nemətova Rəna Məmmədəli",
                "6-05-34"
            ),

            EducationModel(
                "6",
                "5 saylı u/b",
                "Fətəli  məh. 32-ci r n.. №16 ",
                "Mahmudova Aygün Məmməd",
                "4-24-76"
            ),

            EducationModel(
                "7",
                "6 saylı u/b",
                "Qullar məh.Vidadi 45",
                "Rəhimova Mətanət Nizami",
                "4-47-76"
            ),

            EducationModel(
                "8",
                "7 saylı u/b",
                "Dodu məh.Tolostoy küç.4",
                "Əsgərova Rəna Əliağa",
                "6-11-98"
            ),

            EducationModel(
                "9",
                "8 saylı u/b",
                "Yuxarıbaş məhəlləsi, M.Hüseynzadə 6",
                "Ələkbərova Rəna Rza",
                "4-48-70"
            ),

            EducationModel(
                "10",
                "9 saylı u/b",
                "Dağdibi məh. Ruhulla Axundov 5",
                "Əhmədova Səmayə Abdulla",
                "4-74-43"
            ),

            EducationModel(
                "11",
                "14 saylı u/b k/evi",
                "Toqqarağac məhəlləsi M.Rəsulzadə",
                "Mənəfova Güllər Rauf",
                "4-74-41"
            ),

            EducationModel(
                "12",
                "10 saylı u/b k/evi",
                "Əsirlər məhələsi S.Rəhman 10",
                "Məmmədova Həqiqət Murad",
                "4-28-11"
            ),

            EducationModel(
                "13",
                "11 saylı u/b",
                "20-cirn.V.Səlimov 40,Sarıtorpaq məh.",
                "Haqverdiyeva Elmira Məmməd",
                "4-22-18"
            ),

            EducationModel(
                "14",
                "15 saylı u/b",
                " Gəncəli məhəlləsi M.Maqamayev 61",
                "Qaffarova Bilqeyis Məmmədiyə",
                "4-17-22"
            ),

            EducationModel(
                "15",
                "16 saylı u/b",
                "Bağbanlar küç.47",
                "Məhərrəmova Mətanət Ab.cəlil",
                "4-82-11"
            ),

            EducationModel(
                "16",
                "17 saylı u/b",
                "Dəyirmanarxı məhəlləsi .20 Yanvar 50",
                "Məmmədova Həqiqət Məmmədrəsul",
                "4-25-38"
            ),

            EducationModel(
                "17",
                "18 saylı u/b",
                " F.Xoyiski Dolmabağçalar 4/3",
                "Nəbiyeva Məhəbbət Məmməd",
                "6-04-54"
            ),

            EducationModel(
                "18",
                "19 saylı u/b-k/e",
                "Şərbablar məh.Calğalıbulaq küç.",
                "Xəlilova Yeganə İzzət",
                "4-90-71"
            ),

            EducationModel(
                "19",
                "20 saylı u/b",
                "19-cu rayon M.Rəsulzadə",
                "Sərkərova Naimə Ağabala",
                "6-01-76"
            ),

            EducationModel(
                "20",
                "21 saylı u/b",
                "M.Rəsulzadə 145 blok 3, 1 mərtəbə",
                "Hüseynova Təranə Nuru",
                "4-21-31"
            ),

            EducationModel(
                "21",
                "22 saylı u/b-k/e",
                " Calğalıbulaq, M.Şərif Həmidov 1",
                "Mahmudova Ruziyə Şaban",
                "4-24-78"
            ),

            EducationModel(
                "22",
                "23 saylı u/b",
                "Dağdibi məh.Muxtar Hacıyev 5",
                "Qəniyeva Vüsalə Məmiş",
                "5-07-03"
            ),

            EducationModel(
                "23",
                "24 saylı u/b",
                "Şəhriyar 49, Şərbablar küç.",
                "İbrahimova Bəsdə Hacı",
                "4-27-78"
            ),

            EducationModel(
                "24",
                "25 saylı u/b",
                "M.Rəsulzadə 80, Cələbixan məhəlləsi",
                "Bahəddinova Gülnaz Sadəddin",
                "4-65-80"
            ),

            EducationModel(
                "25",
                "26 saylı u/b",
                "Qurdlar məhəlləsi M.Rəsulzadə dal 1",
                "Əkbərova Sevda Cəmaləddin",
                "5-14-22"
            ),

            EducationModel(
                "26",
                "27 saylı u/b",
                "Nakam küç ev 6",
                "Əmiraslanova Arzu Damət",
                "4-22-14"
            ),

            EducationModel(
                "27",
                "28 saylı u/b-k/e",
                "31 rayon M.Cəbrayılov 6",
                "Süleymanova Mətanət Əliabbas",
                "4-25-16"
            ),

            EducationModel(
                "28",
                "29 saylı u/b",
                "Calğalıbulaq məhəlləsi 44",
                "Hümmətova Xuraman Baxtı",
                "4-36-23"
            ),

            EducationModel(
                "29",
                "30 saylı u/b",
                "Oğuz şossesi Olimpiya məhəlləsi",
                "İsmayuılova Hicran Hüseynbala",
                "--"
            ),

            EducationModel(
                "30",
                "Oxud kənd u/b",
                "Oxud kəndi",
                "Hümmətova  Rüxsarə  Şövkət",
                "--"
            ),

            EducationModel(
                "31",
                "Qoxmuq kənd u/b",
                "Qoxmuq kəndi",
                "Hacıosmanova Könül Əliosman",
                "4-71-23"
            ),

            EducationModel(
                "32",
                "İnçə kənd u/b",
                "İnçə kəndi",
                "Əliyeva Mətanət Niyazı",
                "34-1-93"
            ),

            EducationModel(
                "33",
                "Baltalı kənd u/b",
                "Baltalı kəndi",
                "Məmmədova Nargilə Seydi",
                "31-1-98"
            ),

            EducationModel(
                "34",
                "A.Göynük kənd u/b-k/e",
                "A.Göynük kəndi",
                "Hümmətova Əminə Mürsəl",
                "--"
            ),

            EducationModel(
                "35",
                "Selbasan kənd u/b",
                "Selbasan kəndi",
                "Qasımova Günel Nəriman",
                "--"
            ),

            EducationModel(
                "36",
                "B.Layısqı kənd u/b-kör.evi",
                "B.Layısqı kəndi",
                "XəlilovaTelli Bəxtiyar",
                "--"
            ),
            EducationModel("37", "Şin kənd u/b", "Şin kəndi", "Hümmətova Sümayə Əsgər", "--"),

            EducationModel(
                "38",
                "B.Göynük kənd u/b-k/e",
                "B.Göynük kəndi",
                "Səlimova Şərqiyə Yaqub",
                "--"
            ),

            EducationModel(
                "39",
                "Cumakənd kənd u/b kör.evi",
                "Cumakənd kəndi",
                "Mirzəyeva Məryəm Baxtı",
                "--"
            ),

            EducationModel(
                "40",
                "Şorsu kənd u/b",
                "Şorsu kəndi",
                "Hacıəliyeva Şahnaz İsgəndər",
                "--"
            ),

            EducationModel(
                "41",
                "Daşbulaq kənd u/b",
                "Daşbulaq kəndi",
                "Əliyeva Bənövşə Ramiz",
                "76-2-13"
            ),

            EducationModel(
                "42",
                "Daşüz kənd u/b",
                "Daşüz kəndi",
                "Abdullayeva Afaq Həsən",
                "--"
            ),

            EducationModel(
                "43",
                "Çələbixan qəsəbə u/b",
                "Çələbixan qəsəbəsi",
                "Cabbarova Leyla Sahib",
                "--"
            ),

            EducationModel(
                "44",
                "Göybulaq kənd u/b",
                "Göybulaq kəndi",
                "Məmmədova Firuzə  Ələkbər",
                "--"
            ),

            EducationModel(
                "45",
                "Cəfərabad kənd u/b-k/e",
                "Cəfərabad kəndi",
                "Nəbiyeva Firəngiz Abduləli",
                "38-1-61"
            ),

            EducationModel(
                "46",
                "K.Dəhnə kənd u/b",
                "K.Dəhnə kəndi",
                "Mustafayeva Səqiyə Paşa",
                "--"
            ),

            EducationModel(
                "47",
                "B.Dəhnə kənd u/b- kör.evi",
                "B.Dəhnə kəndi",
                "Qarayeva Gülbəniz Nurqələm",
                "--"
            ),
            EducationModel("48", "Aran kənd u/b", "Aran kəndi", "Yusifova Yeganə Murad", "--"),

            EducationModel(
                "49",
                "Şəki kənd u/b- kör.evi",
                "Şəki kəndi",
                "Bağırova Sevda Bəhmən",
                "--"
            ),

            EducationModel(
                "50",
                "Turan qəsəbə u/b",
                "Turan qəsəbəsi",
                "Mövlamova Xalidə İsmayıl",
                "--"
            ),

            EducationModel(
                "51",
                "Cəyirli kənd u/b-k/e",
                "Cəyirli kəndi",
                "Əliyeva Gülyaz Əliquzu",
                "--"
            ),

            EducationModel(
                "52",
                "Qayabaşı kənd u/b",
                "Qayabaşı kəndi",
                "Səfərova Raifə Həmid",
                "--"
            ),

            EducationModel(
                "53",
                "Sarıca kənd u/b",
                "Sarıca kəndi",
                "Hüseynova Gülcöhrə Oruc",
                "--"
            ),

            EducationModel(
                "54",
                "Bolludərə kənd u/b",
                "Bolludərə kəndi",
                "Məmmədova Qənimət Əziz",
                "--"
            ),

            EducationModel(
                "55",
                "Qaratorpaq kənd u/b- kör.evi",
                "Qaratorpaq kəndi",
                "Hüseynova Bənövşə İbrahim",
                "--"
            ),

            EducationModel(
                "56",
                "Aydınbulaq kənd u/b- kör.evi",
                "Aydınbulaq kəndi",
                "Bağırova Şərqiyyə Cavanşir",
                "--"
            ),

            EducationModel(
                "57",
                "Öryət kənd u/b",
                "Öryət kəndi",
                "İmamverdiyeva  Şəfəq Söhrab",
                "--"
            ),

            EducationModel(
                "58",
                "B.Zəyzid kənd u/b",
                "B.Zəyzid kəndi",
                "İsmayılova  Hicran Nurəddin",
                "--"
            ),

            EducationModel(
                "59",
                "Çeşməli kənd u/b",
                "Çeşməli kəndi",
                "Abdulkərimova Afət Abdulkərim",
                "--"
            ),

            EducationModel(
                "60",
                "A.Küngüt kənd u/b",
                "A.Küngüt kəndi",
                "İsayeva Aygün Ramiz ",
                "91-1-81"
            ),

            EducationModel(
                "61",
                "O.Zəyzid. kənd u/b",
                "O.Zəyzid. kəndi",
                "Yusifova Heyran Əhməd",
                "94-5-60"
            ),

            EducationModel(
                "62",
                "Kiş kənd u/b-k/e",
                "Kiş kəndi",
                "Paşayeva Təranə Xalid qızı",
                "98-2-57"
            )
        )
    }
    internal val schoolsList: MutableLiveData<PersistentList<EducationModel>> = _schoolsList
}