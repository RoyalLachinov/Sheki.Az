package about

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.collections.immutable.PersistentList
import kotlinx.collections.immutable.persistentListOf

class CultureDetailViewModel : ViewModel() {

    private val _educationList = MutableLiveData<PersistentList<EducationModel>>().apply {
        value = persistentListOf(
            EducationModel(
                "1",
                "Şəki uşaq incəsənət məktəbi",
                "Calğalıbulaq küçəsi 57",
                "Babayev Yaşar Abdurəşid",
                "4-24-54"
            ),

            EducationModel(
                "2",
                "2 sayli uşaq musiqi məktəbi",
                "M.Ə.Rəsulzadə küçəsi 175",
                "Məmmədov Tərlan Hikmət",
                "4-21-01"
            ),

            EducationModel(
                "3",
                "3 sayli uşaq musiqi məktəbi",
                "S.Rəhman küçəsi 15",
                "Əsgərova Şəmsiyyət Məmməd",
                "4-69-44"
            ),

            EducationModel(
                "4",
                "4 sayli uşaq musiqi məktəbi",
                "M.Ə.Rəsulzadə 72",
                "Rəsulov İbrahim Allahyar",
                "4-65-05"
            ),

            EducationModel(
                "5",
                "Turan qəsəbə uşaq musiqi məktəbi",
                "Şəki rayonu, Turan qəsəbəsi",
                "Rəcəbov Eldar Kamran",
                "71-3-63"
            ),

            //MUZEY MÜƏSSİSƏLƏRİ
            EducationModel("", "", "MUZEY MÜƏSSİSƏLƏRİ", "", ""),
            EducationModel(
                "6",
                "Heydər Əliyev Mərkəzi",
                "S.Mümtaz küçəsi 1",
                "Məmmədova Zeynəb Vidadi",
                "5-00-03"
            ),

            EducationModel(
                "7",
                "“Yuxarı baş” Dövlət Tarix Memarlıq Qoruğu",
                "Şəki, Narınqala divarları",
                "Abdullayeva Təranə Əli",
                "4-36-66"
            ),

            EducationModel(
                "8",
                "Kiş Dövlət Tarixi Memarlıq Qoruğu",
                "Şəki rayonu, Kiş kəndi",
                "Hüseynova İlhamə Qənirə",
                "98-8-33"
            ),

            EducationModel(
                "9",
                "R.Əfəndiyev adına tarix-diyarşünaslıq muzeyi",
                "Şəki, Narınqala divarları",
                "Cəlalova Yaqut Abduləli ",
                "4-37-02"
            ),

            EducationModel(
                "10",
                "Xalq Tətbiqi Sənəti Muzeyi",
                "Şəki, Narınqala divarları",
                "Abdullazadə İradə Fikrət ",
                "4-49-01"
            ),

            EducationModel(
                "11",
                "Şəki Dövlət Rəsm Qalereyası",
                "Şəki, Narınqala divarları",
                "Məmmədov Fazil Qüdrət ",
                "4-45-01"
            ),

            EducationModel(
                "12",
                "M.F.Axundovun ev-muzeyi",
                "M.F.Axundov küçəsi 1",
                "Xəlilova Ulduz Orxan",
                "4-37-08"
            ),

            EducationModel(
                "13",
                "R.Əfəndiyevin ev-muzeyi",
                "Ə.Bayramov küçəsi 5",
                "Qasımzadə Vəfa Teymur ",
                "4-42-58"
            ),

            EducationModel(
                "14",
                "S.Rəhmanın ev-muzeyi",
                "Ağvanlar küçəsi 21",
                "İskəndərova Pərvanə Okyaz",
                "4-50-89"
            ),

            EducationModel(
                "15",
                "Turizm-İnformasiya Mərkəzi",
                "Şəki, Narınqala divarları",
                "İmaməliyev Nəsif Mustafa",
                "--"
            ),

            //MƏDƏNİYYƏT VƏ İSTİRAHƏT PARKLARI
            EducationModel("", "", "MƏDƏNİYYƏT VƏ İSTİRAHƏT PARKLARI", "", ""),
            EducationModel(
                "16",
                "M.F.Axundov adına mədəniyyət və istirahət parkı",
                "S.Rəhman küçəsi 9",
                "İbadov Elşad Sırac ",
                "4-47-06"
            ),

            EducationModel(
                "17",
                "M.Füzuli adına mədəniyyət və istirahət parkı",
                "Calğalıbulaq küçəsi 13",
                "Tağıyev Rasim Məcid",
                "--"
            ),

            //KLUB MÜƏSSİSƏLƏRİ
            EducationModel("", "", "KLUB MÜƏSSİSƏLƏRİ", "", ""),
            EducationModel(
                "18",
                "M.F.Axundov adına mərkəzi mədəniyyət evi",
                "M.Həmidov küçəsi 6",
                "Kərimov Vfqif Əhməd",
                "4-44-98"
            ),

            EducationModel(
                "19",
                "S.Vurğun adına mədəniyyət evi",
                "M.Ə.Rəsulzadə küç. 72",
                "Yusifov Fəxrəddin Ağəli",
                "4-72-69"
            ),

            EducationModel(
                "20",
                "Ə.Abdullayev adına mədəniyyət evi",
                "9 saylı orta məktəb",
                "Məhərrəmova Şahsənəm Camal",
                "--"
            ),

            EducationModel(
                "21",
                "Ü.Hacıbəyov adına mədəniyyət evi",
                "N.Nərimanov küçəsi 30",
                "Məcidov Sahib Siracəddin",
                "--"
            ),

            EducationModel(
                "22",
                "M.K.Hacıoğlu adına mədəniyyət evi",
                "F.Xoyski küçəsi 10",
                "Qaffarova Zeynəb Mədədəli",
                "--"
            ),

            EducationModel(
                "23",
                "B.Axundov adına mədəniyyət evi",
                "8 saylı orta məktəb",
                "Tağıev Ülfət Rasim",
                "--"
            ),

            EducationModel(
                "24",
                "V.İbrahim adına mədəniyyət evi",
                "“Şəki-İpək” kombinatı",
                "Hacızəkəryzyev Rövzət Tacəddin",
                "--"
            ),

            EducationModel(
                "25",
                "M.İsmayılov adına mədəniyyət evi",
                "19 saylı orta məktəb",
                "Qarayeva Tahirə Abdulla",
                "--"
            ),

            EducationModel(
                "26",
                "N.Bədəlov adına mədəniyyət evi",
                "AMİ-nin Şəki filialı",
                "Məmmədova Mehriban Nemət",
                "--"
            ),

            EducationModel(
                "27",
                "L.Abdullayev adına klub",
                "Şəki liseyi",
                "Əfəndiyeva Mahirə Əlibala",
                "--"
            ),

            EducationModel(
                "28",
                "R.Sadıqov adına klub",
                "Turbaza",
                "Mirzəyeva Təranə Əbil",
                "--"
            ),

            EducationModel(
                "29",
                "M.S.Əliyev adına klub",
                "Şəki Pedaqoji Texnikumu",
                "Kovxayeva Ayşə Hüseyn",
                "--"
            ),

            EducationModel(
                "30",
                "Y.Məmmədov adına klub",
                "7 saylı orta məktəb",
                "Həşimova Afət Paşa",
                "--"
            ),

            EducationModel(
                "31",
                "M.Nəsrullayev adına klub",
                "1 saylı peşə məktəbi",
                "İlyaslı Mehman Yavər",
                "--"
            ),

            EducationModel(
                "32",
                "K.Kərimov adına klub",
                "Uşaq evi",
                "Əsgərov Mais Bəxtiyar",
                "--"
            ),

            EducationModel(
                "33",
                "İ.Salmanov adına klub",
                "Texniki kollec",
                "Çələbiyev Telman Cumay",
                "--"
            ),

            EducationModel(
                "34",
                "Ə.Sadıqov adına klub",
                "3 saylı orta mıktəb",
                "Abdullayev Mahir Rəcəb",
                "--"
            ),

            EducationModel(
                "35",
                "Ə.Şəkili adına klub",
                "M.Ə.Rəsulzadə küç. 183",
                "Abbasova Məhəbbət İmran",
                "--"
            ),

            EducationModel(
                "36",
                "B.Ələsgərova adına klub",
                "Qarışıq tipli internat məktəbi",
                "Yunusov Sərdar Əşrəf",
                "--"
            ),

            EducationModel(
                "37",
                "Oxud kənd mədəniyyət evi",
                "Şəki rayonu Oxud kəndi",
                "Abdurahmanov Baxşəli Yunus",
                "--"
            ),

            EducationModel(
                "38",
                "Qoxmuq kənd mədəniyyət evi",
                "Şəki rayonu Qoxmuq kəndi",
                "Məmmədov Fazil Şahid",
                "--"
            ),

            EducationModel(
                "39",
                "I Biləcik kənd mədəniyyət evi",
                "Şəki rayonu I Biləcik kəndi",
                "Həsənova Zərnişan Əsədullah",
                "--"
            ),

            EducationModel(
                "40",
                "Baltalı kənd mədəniyyət evi",
                "Şəki rayonu Baltalı kəndi",
                "Abdulxalıqova Gülxar Tahir",
                "--"
            ),

            EducationModel(
                "41",
                "Baş Göynük kənd mədəniyyət evi",
                "Şəki rayonu Baş Göynük kəndi",
                "Bəkirov Qərib Mahmud",
                "--"
            ),

            EducationModel(
                "42",
                "Aşagı Göynük kənd mədəniyyət evi",
                "Şəki rayonu Aşagı Göynük kəndi",
                "Abbasova Mafiqə Süleyman",
                "--"
            ),

            EducationModel(
                "43",
                "Baş Layısqı kənd mədəniyyət evi",
                "Şəki rayonu Baş Layısqı kəndi",
                "Hüseynov Rəfael Hüseyn",
                "--"
            ),

            EducationModel(
                "44",
                "Cumaykənd mədəniyyət evi",
                "Şəki rayonu Cumaykənd kəndi",
                "Şahmirova Nərminə Musa",
                "--"
            ),

            EducationModel(
                "45",
                "Baş Zəyzid kənd mədəniyyət evi",
                "Şəki rayonu Baş Zəyzid kəndi",
                "Mahmudov Xanlar Qeysəddin",
                "--"
            ),

            EducationModel(
                "46",
                "Oravan kənd mədəniyyət evi",
                "Şəki rayonu Oravan kəndi",
                "İbrahimov Zülkifli Paşa",
                "--"
            ),

            EducationModel(
                "47",
                "Baş Küngüt kənd mədəniyyət evi",
                "Şəki rayonu Baş Küngüt kəndi",
                "Nəsirov Vüqar Bəşarət",
                "--"
            ),

            EducationModel(
                "48",
                "Aşağı Küngüt kənd mədəniyyət evi",
                "Şəki rayonu Aşağı Küngüt kəndi",
                "Məmmədova Zenfira Abuzər",
                "--"
            ),

            EducationModel(
                "49",
                "Bideyiz kənd mədəniyyət evi",
                "Şəki rayonu Bideyiz kəndi",
                "İsmayılova Sara Hümmət",
                "--"
            ),

            EducationModel(
                "50",
                "Qayabaşı kənd mədəniyyət evi",
                "Şəki rayonu Qayabaşı kəndi",
                "Məmmədova Mehriban Nəsif",
                "--"
            ),

            EducationModel(
                "51",
                "Şəki kənd mədəniyyət evi",
                "Şəki rayonu Şəki kəndi",
                "Hüseynov Rəşid Nəriman",
                "--"
            ),

            EducationModel(
                "52",
                "Suçma kənd mədəniyyət evi",
                "Şəki rayonu Suçma kəndi",
                "Məmmədrəhimov Etibar Rəsul",
                "--"
            ),

            EducationModel(
                "53",
                "İ.Osmanlı adına Kiş kənd mədəniyyət evi",
                "Şəki rayonu Kiş kəndi",
                "Məmmədov Natiq Abdulla",
                "--"
            ),

            EducationModel(
                "54",
                "Aydınbulaq kənd mədəniyyət evi",
                "Şəki rayonu Aydınbulaq kəndi",
                "Pirimov Nəriman Emin",
                "--"
            ),

            EducationModel(
                "55",
                "Şorsu kənd mədəniyyət evi",
                "Şəki rayonu Şorsu kəndi",
                "Məmmədov Raqif Musa",
                "--"
            ),

            EducationModel(
                "56",
                "Kiçik Dəhnə kənd klubu",
                "Şəki rayonu Kiçik Dəhnə kəndi",
                "Bədəlova Əlamət Yunus",
                "--"
            ),

            EducationModel(
                "57",
                "İnçə-Zunud kənd klubu",
                "Şəki rayonu İnçə-Zunud kəndi",
                "İbrahimxəlilov Xurşud Cəmaləddin",
                "--"
            ),

            EducationModel(
                "58",
                "Qaradağlı kənd klubu",
                "Şəki rayonu Qaradağlı kəndi",
                "Məmmədova Sürəyya Şəhriyar",
                "--"
            ),

            EducationModel(
                "59",
                "Köbər Zəyzid kənd klubu",
                "Şəki rayonu Köbər Zəyzid kəndi",
                "Cəbrayılov Mazquy Veysəl",
                "--"
            ),

            EducationModel(
                "60",
                "Qaratorpaq kənd klubu",
                "Şəki rayonu Qaratorpaq kəndi",
                "Adıgözəlov Elxan Məmmədəli",
                "--"
            ),

            EducationModel(
                "61",
                "Sarıca kənd klubu",
                "Şəki rayonu Sarıca kəndi",
                "Hüseynova Elnarə Namizəd",
                "--"
            ),

            EducationModel(
                "62",
                "Cəyirli kənd klubu",
                "Şəki rayonu Cəyirli kəndi",
                "Abbasova Zəkiyyə Qulu",
                "--"
            ),

            EducationModel(
                "63",
                "Böyük Dəhnə kənd klubu",
                "Şəki rayonu Böyük Dəhnə kəndi",
                "Məmmədova Əsmər İsgəndər",
                "--"
            ),

            EducationModel(
                "64",
                "Cəfərabad kənd klubu",
                "Şəki rayonu Cəfərabad kəndi",
                "Əmrahov Həsrət Musa",
                "--"
            ),

            EducationModel(
                "65",
                "Fazıl kənd klubu",
                "Şəki rayonu Fazıl kəndi",
                "Abdullayev Rahim Darçın",
                "--"
            ),

            EducationModel(
                "66",
                "İbrahimkənd klubu",
                "Şəki rayonu İbrahimkənd kəndi",
                "Mehdiyeva Şərqiyyə Vəzir",
                "--"
            ),

            EducationModel(
                "67",
                "Bolludərə kənd klubu",
                "Şəki rayonu Bolludərə kəndi",
                "Əzizov Elduz Məmməd",
                "--"
            ),

            EducationModel(
                "68",
                "Çeşməli kənd klubu",
                "Şəki rayonu Çeşməli kəndi",
                "Əliyev Afər Yusif",
                "--"
            ),

            EducationModel(
                "69",
                "Daşbulaq kənd klubu",
                "Şəki rayonu Daşbulaq kəndi",
                "Mahmudova Sevil Musa",
                "--"
            ),

            EducationModel(
                "70",
                "Baş Şabalıd kənd klubu",
                "Şəki rayonu Baş Şabalıd kəndi",
                "Bəkirova Aytən Bəkir",
                "--"
            ),

            EducationModel(
                "71",
                "Aşağı Şabalıd kənd klubu",
                "Şəki rayonu Aşağı Şabalıd kəndi",
                "İbrahimxəlilov İlham Cəmaləddin",
                "--"
            ),

            EducationModel(
                "72",
                "Cunud kənd klubu",
                "Şəki rayonu Cunud kəndi",
                "Qocayeva Leyla Camal",
                "--"
            ),

            EducationModel(
                "73",
                "Qırxbulaq kənd klubu",
                "Şəki rayonu Qırxbulaq kəndi",
                "Lətifov Yusif Bayraməli",
                "--"
            ),

            EducationModel(
                "74",
                "Çapağan kənd klubu",
                "Şəki rayonu Çapağan kəndi",
                "Babayeva Mövlayə İsmayıl",
                "--"
            ),

            EducationModel(
                "75",
                "Öryət kənd klubu",
                "Şəki rayonu Öryət kəndi",
                "Əlimirzəyeva Pəri Balaş",
                "--"
            ),

            EducationModel(
                "76",
                "Qudula kənd klubu",
                "Şəki rayonu Qudula kəndi",
                "Musayeva Güldanə Əhəd",
                "--"
            ),

            EducationModel(
                "77",
                "Aşağı Daşağıl kənd klubu",
                "Şəki rayonu Aşağı Daşağıl kəndi",
                "Seyidova Sənubər Seyid",
                "--"
            ),

            EducationModel(
                "78",
                "Turan qəsəbə klubu",
                "Şəki rayonu Turan qəsəbəsi",
                "Həşimova Məharət Əlyar",
                "--"
            ),

            EducationModel(
                "79",
                "Dərəcənnət kənd klubu",
                "Şəki rayonu Dərəcənnət kəndi",
                "Abdullayeva Zeynəb Əlipaşa",
                "--"
            ),

            EducationModel(
                "80",
                "Çayqaraqoyunlu kənd klubu",
                "Şəki rayonu Çayqaraqoyunlu kəndi",
                "Piriyeva Əminəxatın Yaqub",
                "--"
            ),

            EducationModel(
                "81",
                "Şin kənd klubu",
                "Şəki rayonu Şin kəndi",
                "Məmmədov Fətəli Əsgər",
                "--"
            ),

            EducationModel(
                "82",
                "Təpəcənnət kənd klubu",
                "Şəki rayonu Təpəcənnət kəndi",
                "Tanrıverdiyeva Məhəbbət Camal",
                "--"
            ),

            EducationModel(
                "83",
                "Babaratma kənd klubu",
                "Şəki rayonu Babaratma kəndi",
                "Şirinov Tarıyel Şahid",
                "--"
            ),

            EducationModel(
                "84",
                "Çələbixan köçkünlər qəsəbə klubu",
                "Şəki rayonu Çələbixan qəsəbəsi",
                "Mahmudov Çingiz Kərim",
                "--"
            ),

            EducationModel(
                "85",
                "Qumux kənd klubu",
                "Şəki rayonu Qumux kəndi",
                "Şərifov Mehman Mustafa",
                "--"
            ),

            EducationModel(
                "86",
                "İkinci Biləcik kənd klubu",
                "Şəki rayonu Biləcik kəndi",
                "Nizaməddinova Zinyət Paşa",
                "--"
            ),

            EducationModel(
                "87",
                "Göybulaq kənd klubu",
                "Şəki rayonu Göybulaq kəndi",
                "Mürsəlli İslam Qurban",
                "--"
            ),

            //MƏRKƏZLƏŞDİRİLMİŞ KİTABXANA SİSTEMİ
            EducationModel("", "", "MƏRKƏZLƏŞDİRİLMİŞ KİTABXANA SİSTEMİ", "", ""),

            EducationModel(
                "88",
                "İ.S.Nakam adına MKS",
                "Şəki, M.F.Axundov 6",
                "Vahabov Seyid Hümmət",
                "4-20-82"
            ),

            EducationModel(
                "89",
                "MKS-nin uşaq şöbəsi",
                "Şəki, Narınqala divarları",
                "Rəsulova Mirvari Əşrəf",
                "4-72-70"
            ),

            EducationModel(
                "90",
                "MKS 1 saylı filialı",
                "Şəki, Giləhli küçəsi",
                "Cəmilova Sədaqət Azad",
                "--"
            ),

            EducationModel(
                "91",
                "MKS 2 saylı filialı",
                "Şəki, F.Xoyski küçəsi 51",
                "Yunusova Solmaz Qasım",
                "--"
            ),

            EducationModel(
                "92",
                "MKS 4 saylı filialı",
                "Şəki, Ə.Bayramov küç. 5",
                "İsmayılova Təranə Nadir",
                "--"
            ),

            EducationModel(
                "93",
                "MKS 5 saylı filialı",
                "Şəki, M.Ə.Rəsulzadə 174",
                "Məsimova Reyhanə Kamal",
                "--"
            ),

            EducationModel(
                "94",
                "MKS 6 saylı filialı",
                "Şəki, Tolstoy küçəsi 18",
                "Paşayeva Günel Paşa",
                "--"
            ),

            EducationModel(
                "95",
                "MKS 7 saylı filialı",
                "Şəki M.F.Axundov küç12",
                "Mustafayeva Lətafət Şirəli",
                "--"
            ),

            EducationModel(
                "96",
                "MKS 8 saylı filialı",
                "Şəki, 19 saylı orta məktəb",
                "Kərimova Maisə Əsədulla",
                "--"
            ),

            EducationModel(
                "97",
                "MKS 10 saylı filialı",
                "Şəki, F.Abdurahmanov küç. 1",
                "Yusibova Mətanət Əhməd",
                "--"
            ),

            EducationModel(
                "98",
                "MKS 12 saylı filialı",
                "Texniki peşə məkt. binası",
                "Kərimova Səhər Həbibullah",
                "--"
            ),

            EducationModel(
                "99",
                "MKS 13 saylı filialı",
                "Şəki, N.Nərimanov küç. 30",
                "Bəkirova Gövhər Qinyaz",
                "--"
            ),

            EducationModel(
                "100",
                "MKS 14 saylı filialı",
                "Bagbanlar küç. 4 Barama toxumu zavodu",
                "Abduləzimova Aminə Məmmədəli",
                "--"
            ),

            EducationModel(
                "101",
                "MKS 16 saylı filialı",
                "Şəki, M.Ə.Rəsulzadə 72",
                "Mustafayeva İradə Hümmət",
                "--"
            ),

            EducationModel(
                "102",
                "MKS 17 saylı filialı",
                "Şəki, 20 saylı orta məktəb",
                "Həsənova Rüfanə Adil",
                "--"
            ),

            EducationModel(
                "103",
                "MKS 18 saylı filialı",
                "Şəki 20 Yanvar küç.7",
                "Məmmədova Mətanət Qəmbər",
                "--"
            ),

            EducationModel(
                "104",
                "MKS 84 saylı filialı",
                "Şəki, M.Ə.Rəsulzadə küç. 15а",
                "Bayramova Fatma Qasım",
                "--"
            ),

            EducationModel(
                "105",
                "Kiş kənd MKS 11 saylı filial",
                "Şəki rayonu Kiş kəndi",
                "Feyzullayeva Havva Vahid",
                "--"
            ),

            EducationModel(
                "106",
                "Kiçik Dəhnə kənd MKS 19 saylı filial",
                "Şəki rayonu Kiçik Dəhnə kəndi",
                "Cabbarova Aybəniz Xəlis",
                "--"
            ),

            EducationModel(
                "107",
                "Böyük Dəhnə kənd MKS 21 saylı filial",
                "Şəki rayonu Böyük Dəhnə kəndi",
                "Seyidməmmədova Yaqut Seyidməmməd",
                "--"
            ),

            EducationModel(
                "108",
                "Böyük Dəhnə kənd MKS 22 saylı filial",
                "Şəki rayonu Böyük Dəhnə kəndi",
                "Bəkirova Nərgiz Rəsul",
                "--"
            ),

            EducationModel(
                "109",
                "Suçma kənd MKS 23 saylı filial",
                "Şəki rayonu Suçma kəndi",
                "Əliyeva Səhər İsfəndiyar",
                "--"
            ),

            EducationModel(
                "110",
                "Şəki kənd MKS 25 saylı filial",
                "Şəki rayonu Şəki kəndi",
                "Həsənova Fəridə Həsən",
                "--"
            ),

            EducationModel(
                "111",
                "Aran kənd MKS 26 saylı filial",
                "Şəki rayonu Aran kəndi",
                "Nuhova Esmira Əsabəli",
                "--"
            ),

            EducationModel(
                "112",
                "Çayqaraqoyunlu kənd MKS 27 saylı filial",
                "Şəki rayonu Çayqaraqoyunlu kəndi",
                "Piriyeva Mahirə Nəzir",
                "--"
            ),

            EducationModel(
                "113",
                "Turan qəsəbə MKS 28 saylı filial",
                "Şəki rayonu Turan qəs.",
                "Məmmədov Səxavət Məmməd",
                "--"
            ),

            EducationModel(
                "114",
                "Qayabaşı kənd MKS 30 saylı filial",
                "Şəki rayonu Qayabaşı kəndi",
                "Kazımov Vasif Salman",
                "--"
            ),

            EducationModel(
                "115",
                "Qaratorpaq kənd MKS 32 saylı filial",
                "Şəki rayonu Qaratorpaq kəndi",
                "Hüseynov Sahib Qərib",
                "--"
            ),

            EducationModel(
                "116",
                "Cəyirli kənd MKS 33 saylı filial",
                "Şəki rayonu Cəyirli kəndi",
                "Qarayev Aftandil Qara",
                "--"
            ),

            EducationModel(
                "117",
                "Cəfərabad kənd MKS 35 saylı filial",
                "Şəki rayonu Cəfərabad kəndi",
                "Səmədova İradə Fərman",
                "--"
            ),

            EducationModel(
                "118",
                "Göybulaq kənd MKS 36 saylı filial",
                "Şəki rayonu Göybulaq kəndi",
                "Mustafayeva Əminə Sabir",
                "--"
            ),

            EducationModel(
                "119",
                "Aşağı Küngüt kənd MKS 38 saylı filial",
                "Şəki rayonu Aşağı Küngüt kəndi",
                "Həşimova Sevil Təvəkkül",
                "--"
            ),

            EducationModel(
                "120",
                "Fazıl kənd MKS 40 saylı filial",
                "Şəki rayonu Fazıl kəndi",
                "Qəhrəmanova Gülüstan Elçin",
                "--"
            ),

            EducationModel(
                "121",
                "İbrahimkənd MKS 41 saylı filial",
                "Şəki rayonu İbrahimkənd kəndi",
                "Yunusova Əsli Həşim",
                "--"
            ),

            EducationModel(
                "122",
                "Aydınbulaq kənd MKS 42 saylı filial",
                "Şəki rayonu Aydınbulaq kəndi",
                "Allahverdiyeva Xuraman Məhərrəm",
                "--"
            ),

            EducationModel(
                "123",
                "Şirinbulaq kənd MKS 44 saylı filial",
                "Şəki rayonu Şirinbulaq kəndi",
                "Səlimov Cəfər Aslan",
                "--"
            ),

            EducationModel(
                "124",
                "Aşağı Daşağıl kənd MKS 45 saylı filial",
                "Şəki rayonu Aşağı Daşağıl kəndi",
                "Səmədova Bənövşə Səməd",
                "--"
            ),

            EducationModel(
                "125",
                "Orta Zəyzid kənd MKS 46 saylı filial",
                "Şəki rayonu Orta Zəyzid kəndi",
                "Yusifova Gültəkin Əhməd",
                "--"
            ),

            EducationModel(
                "126",
                "Qırxbulaq kənd MKS 47 saylı filial",
                "Şəki rayonu Qırxbulaq kəndi",
                "Abdullayeva Məsafət Mabud",
                "--"
            ),

            EducationModel(
                "127",
                "Köbər Zəyzid kənd MKS 48 saylı filial",
                "Şəki rayonu Köbər Zəyzid kəndi",
                "Həmzətova Əmanət Sabir",
                "--"
            ),

            EducationModel(
                "128",
                "Baş Zəyzid kənd MKS 49 saylı filial",
                "Şəki rayonu Baş Zəyzid kəndi",
                "Müzəffərova Lalandər İsmayıl",
                "--"
            ),

            EducationModel(
                "129",
                "Baş Küngüt kənd MKS 51 saylı filial",
                "Şəki rayonu Baş Küngüt kəndi",
                "Kərimova Həqiqət Məmməd",
                "--"
            ),

            EducationModel(
                "130",
                "Bideyiz kənd MKS 52 saylı filial",
                "Şəki rayonu Bideyiz kəndi",
                "Məmmədova Pərvanə İsfəndiyar",
                "--"
            ),

            EducationModel(
                "131",
                "Oravan kənd MKS 53 saylı filial",
                "Şəki rayonu Oravan kəndi",
                "Qədirova Dilbər Əfkər",
                "--"
            ),

            EducationModel(
                "132",
                "Qoxmuq kənd MKS 55 saylı filial",
                "Şəki rayonu Qoxmuq kəndi",
                "Cəlilova Rəna Mürsəl",
                "--"
            ),

            EducationModel(
                "133",
                "Oxud kənd MKS 56 saylı filial",
                "Şəki rayonu Oxud kəndi",
                "Eminova Səlamət Şahid",
                "--"
            ),

            EducationModel(
                "134",
                "Baltalı kənd MKS 57 saylı filial",
                "Şəki rayonu Baltalı kəndi",
                "Paşayeva Şəhla Ramiz",
                "--"
            ),

            EducationModel(
                "135",
                "İnçə kənd MKS 58 saylı filial",
                "Şəki rayonu İnçə kəndi",
                "Nəbiyeva İrayə Həsən",
                "--"
            ),

            EducationModel(
                "136",
                "Baş Şabalıd kənd MKS 61 saylı filial",
                "Şəki rayonu Baş Şabalıd kəndi",
                "Mütəllibova Aybəniz Əyyub",
                "--"
            ),

            EducationModel(
                "137",
                "Baş Göynük kənd MKS 62 saylı filial",
                "Şəki rayonu Baş Göynük kəndi",
                "İsmayılov Mustafa İsmayıl",
                "--"
            ),

            EducationModel(
                "138",
                "Baş Layısqı kənd MKS 64 saylı filial",
                "Şəki rayonu Baş Layısqı kəndi",
                "Həmidova Əntiqə Əşrəf",
                "--"
            ),

            EducationModel(
                "139",
                "Şin kənd MKS 65 saylı filial",
                "Şəki rayonu Şin kəndi",
                "Məmmədov Fərrux Hacı",
                "--"
            ),

            EducationModel(
                "140",
                "Cunud kənd MKS 66 saylı filial",
                "Şəki rayonu Cunud kəndi",
                "İbrahimova Xəyalə Bayram",
                "--"
            ),

            EducationModel(
                "141",
                "Aşagı Göynük kənd MKS 67 saylı filial",
                "Şəki rayonu Aşagı Göynük kəndi",
                "Babayeva Nəcibə Yusif",
                "--"
            ),

            EducationModel(
                "142",
                "Aşağı Layısqı kənd MKS 68 saylı filial",
                "Şəki rayonu Aşağı Layısqı kəndi",
                "İbrahimova Kubra Rəsul",
                "--"
            ),

            EducationModel(
                "143",
                "II Biləcik kənd MKS 69 saylı filial",
                "Şəki rayonu Biləcik kəndi",
                "Talıbov Fəxrəddin Siracəddin",
                "--"
            ),

            EducationModel(
                "144",
                "I Biləcik kənd MKS 70 saylı filial",
                "Şəki rayonu I Biləcik kəndi",
                "Məmmədova Məkkə Hacı",
                "--"
            ),

            EducationModel(
                "145",
                "Baqqal kənd MKS 71 saylı filial",
                "Şəki rayonu Baqqal kəndi",
                "Bayramova Gülnarə Salman",
                "--"
            ),

            EducationModel(
                "146",
                "Daşüz kənd MKS 72 saylı filial",
                "Şəki rayonu Daşüz kəndi",
                "Seyidova Fəridə İlyas",
                "--"
            ),

            EducationModel(
                "147",
                "Küdürlü kənd MKS 73 saylı filial",
                "Şəki rayonu Küdürlü kəndi",
                "Xəlilova Qərənfil İzzət",
                "--"
            ),

            EducationModel(
                "148",
                "Çeşməli kənd MKS 74 saylı filial",
                "Şəki rayonu Çeşməli kəndi",
                "Mahmudova Nüşabə Mübariz",
                "--"
            ),

            EducationModel(
                "149",
                "Daşbulaq kənd MKS 76 saylı filial",
                "Şəki rayonu Daşbulaq kəndi",
                "Həsənova Nübar Əli",
                "--"
            ),

            EducationModel(
                "150",
                "Qudula kənd MKS 77 saylı filial",
                "Şəki rayonu Qudula kəndi",
                "Yusibova Ruziyyz Cuma",
                "--"
            ),

            EducationModel(
                "151",
                "Şorsu kənd MKS 78 saylı filial",
                "Şəki rayonu Şorsu kəndi",
                "Abdullayev Səbuhi Fətəli",
                "--"
            ),

            EducationModel(
                "152",
                "Cumaykənd MKS 79 saylı filial",
                "Şəki rayonu Cumaykənd kəndi",
                "Mazanova Mirvari Abdulxalıq",
                "--"
            ),

            EducationModel(
                "153",
                "Qaradağlı kənd MKS 82 saylı filial",
                "Şəki rayonu Qaradağlı kəndi",
                "Məmmədova Zinyət Göyüş",
                "--"
            ),

            EducationModel(
                "154",
                "Qumux kənd MKS 83 saylı filial",
                "Şəki rayonu Qumux kəndi",
                "Əzizov Elçin Rəcəb",
                "--"
            )
        )
    }
    internal val educationList: MutableLiveData<PersistentList<EducationModel>> = _educationList
}