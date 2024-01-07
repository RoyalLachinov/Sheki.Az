package administration

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.collections.immutable.PersistentList
import kotlinx.collections.immutable.persistentListOf

class MunicipalityViewModel : ViewModel() {
    private val _municipalityList = MutableLiveData<PersistentList<StructureModel>>().apply {
        value = persistentListOf(
            StructureModel("", "Şəki ŞƏHƏR BƏLƏDİYYƏSİ", ""),
            StructureModel("sədr", "İbadov Elşad Sırac oğlu", "244-00-51"),
            StructureModel("müavin", "Nuriyev Ehtibar Məsim oğlu", "244-89-37"),
            StructureModel("müavin", "Salamova Gülnaz Mustafa qızı", "244-58-90"),
            StructureModel("müavin", "Həbibullayev Şirin Mövsüm oğlu", "244-46-83"),
            //Aşağı Göynük bələdiyyəsi
            StructureModel("", "AŞAĞI GÖYNÜK BƏLƏDİYYƏSİ", ""),
            StructureModel("sədr", "Hüseynəliyev Asif Şamil oğlu", "24- 96-4-02"),
            StructureModel("müavin", "İsmayılov Elsevər Mahmud oğlu", ""),
            //Aşağı Layısqı bələdiyyəsi
            StructureModel("", "AŞAĞI LAYISQI BƏLƏDİYYƏSİ", ""),
            StructureModel("sədr", "Məmmədova Ləman Tofiq qızı", "24-96-5-99"),
            StructureModel("müavin", "Səmədov Rakif Əliəhməd", "--"),
            //Baş Göynük bələdiyyəsi
            StructureModel("", "BAŞ GÖYNÜK BƏLƏDİYYƏSİ", ""),
            StructureModel("sədr", "Məmmədov Vüqar Fərman  oğlu", "24-92-1-41"),
            StructureModel("müavin", "Bəkirov İslam Şükür  oğlu", ""),
            //Baş Layısqı bələdiyyəsi
            StructureModel("", "BAŞ LAYISQI BƏLƏDİYYƏSİ", ""),
            StructureModel("sədr", "Sərkərova Türkay Şöhrət  qızı", "24-93-0-76"),
            StructureModel("müavin", "İsmayılova Zenfira Məmməd qızı", "--"),
            //Birinci Biləcik bələdiyyəsi
            StructureModel("", "BİRİNCİ BİLƏCİK BƏLƏDİYYƏSİ", ""),
            StructureModel("sədr", "Həsənov Müşfiq Şamil oğlu", "24-99-3-10"),
            StructureModel("müavin", "Xəlilov Samir Qüdrət oğlu", "--"),
            //
            StructureModel("", "BÖYÜK DƏHNƏ BƏLƏDİYYƏSİ", ""),
            StructureModel("sədr", "Mürsəlov Kərəm Mürsəl  oğlu", "24-36-1-84"),
            StructureModel("müavin", "Xəlilov İbrahimxəlil Məmət oğlu", "--"),
            //Cumakənd bələdiyyəsi
            StructureModel("", "CUMAKƏND BƏLƏDİYYƏSİ", ""),
            StructureModel("sədr", "Kərimov Asif Məmməd oğlu", "24-75-1-42"),
            StructureModel("müavin", "İsmayılov Məmməd Bayram oğlu", "--"),
            //Daşüz bələdiyyəsi
            StructureModel("", "DAŞÜZ BƏLƏDİYYƏSİ", ""),
            StructureModel("sədr", "Yusubov İsmət Bəşir oğlu", "24-32-2-14"),
            StructureModel("müavin", "Əsgərov Ramiz Osman   oğlu", "--"),
            //İkinci Biləcik bələdiyyəsi
            StructureModel("", "İKİNCİ BİLƏCİK BƏLƏDİYYƏSİ", ""),
            StructureModel("sədr", "Məmmədova Sara Əhmədiyyə qızı", "24-99-1-19"),
            StructureModel("müavin", "Abbasov Cavid Yaşar oğlu", "--"),
            //İnçə bələdiyyəsi
            StructureModel("", "İNÇƏ BƏLƏDİYYƏSİ", ""),
            StructureModel("sədr", "Mustafayev Qafqaz Hüseyn oğlu", "24-34-2-12"),
            StructureModel("müavin", "Abduləlimov İftixar Məmməd oğlu", "--"),
            //Kiçik Dəhnə bələdiyyəsi
            StructureModel("", "KİÇİK DƏHNƏ BƏLƏDİYYƏSİ", ""),
            StructureModel("sədr", "Calalov Əlvida Baba oğlu", "24-35-2-73"),
            StructureModel("müavin", "Səlimov   Yusif  Vaqif", "--"),
            //Qudula bələdiyyəsi
            StructureModel("", "QUDULA BƏLƏDİYYƏSİ", ""),
            StructureModel("sədr", "Əliyeva Lalə Abdulləli qızı", "24-97-2-11"),
            StructureModel("müavin", "Salamov Nəcəf Rəcəb oğlu", "--"),
            //Oxud bələdiyyəsi
            StructureModel("", "OXUD BƏLƏDİYYƏSİ", ""),
            StructureModel("sədr", "Abdullayeva Brilyant Seyidəzim qızı", "24-30-1-23"),
            StructureModel("müavin", "Salamov Cumay Vaqif   oğlu", "--"),
            //Şin bələdiyyəsi
            StructureModel("", "ŞİN BƏLƏDİYYƏSİ", ""),
            StructureModel("sədr", "Həsənova Nəzakət Qüdrət qızı", "--"),
            StructureModel("müavin", "Həsənov Namiq Qüdrət oğlu", "--"),
            //Şorsu bələdiyyəsi
            StructureModel("", "ŞORSU BƏLƏDİYYƏSİ", ""),
            StructureModel("sədr", "Hacəliyev Samir Ramiz  oğlu", "24-72-2-25"),
            StructureModel("müavin", "Aslanov Novruz Həbillah  oğlu", "--"),
            //Zunud bələdiyyəsi
            StructureModel("", "ZUNUD BƏLƏDİYYƏSİ", ""),
            StructureModel("sədr", "Səfərəliyeva Nərgiz İsmayıl qızı", "24-34-1-30"),
            StructureModel("müavin", "Baxışova Həbibə Mübariz qızı", "--"),
            //Baltalı bələdiyyəsi
            StructureModel("", "BALTALI BƏLƏDİYYƏSİ", ""),
            StructureModel("sədr", "Tağızadə İmral  Şahid oğlu", "24-31-1-22"),
            StructureModel("müavin", "Tağıyev Şahid Tağı  oğlu", "--"),
            //Kiş bələdiyyəsi
            StructureModel("", "KİŞ BƏLƏDİYYƏSİ", ""),
            StructureModel("sədr", "Nurməmmədov Tərlan Niyazi oğlu", "24-98-6-08"),
            StructureModel("müavin", "Həşimova Dinar Kamil  qızı", ""),
            //Küdürlü bələdiyyəsi
            StructureModel("", "KÜDÜRLÜ BƏLƏDİYYƏSİ", ""),
            StructureModel("sədr", "İmamov Elsəvər Elçin oğlu", "--"),
            StructureModel("müavin", "Şirinov Əlim Zahid   oğlu", "--"),
            //Qoxmuq bələdiyyəsi
            StructureModel("", "QOXMUQ BƏLƏDİYYƏSİ", ""),
            StructureModel("sədr", "Rüstəmova Sevinc İmran qızı", "24-4-08-16"),
            StructureModel("müavin", "Rüstəmov Fətəli Nütvəli oğlu", "--"),
            //Suçma bələdiyyəsi
            StructureModel("", "SUÇMA BƏLƏDİYYƏSİ", ""),
            StructureModel("sədr", "Süleymanov Sahil Hafiz oğlu", "24-37-1-17"),
            StructureModel("müavin", "Həsrətov Həsən Bəhərçin oğlu", "--"),
            //Şəki kənd bələdiyyəsi
            StructureModel("", "ŞƏKİ KƏND BƏLƏDİYYƏSİ", ""),
            StructureModel("sədr", "Bağırova İzarə Əli qızı", "24-33-1-84"),
            StructureModel("müavin", "Əliyev Müslüm Bayram oğlu", "--"),
            //Aşağı Küngüt bələdiyyəsi
            StructureModel("", "AŞAĞI KÜNGÜT BƏLƏDİYYƏSİ", ""),
            StructureModel("sədr", "Cəlilova Kəmalə Məmməd qızı", "24-91-1-19"),
            StructureModel("müavin", "Lətifova Zümrüd Cuma qızı", "--"),
            //Aydınbulaq bələdiyyəsi
            StructureModel("", "AYDINBULAQ BƏLƏDİYYƏSİ", ""),
            StructureModel("sədr", "Əliyeva Çinarə Məmməd qızı", "24-39-1-90"),
            StructureModel("müavin", "Dostuyev Bahadur Oruc oğlu", "--"),
            //Baş Kəldək bələdiyyəsi
            StructureModel("", "BAŞ KƏLDƏK BƏLƏDİYYƏSİ", ""),
            StructureModel("sədr", "Məsimov Elçin Yusif oglu", "24-90-4-18"),
            StructureModel("müavin", "Məmmədov Sadiq Sabir oğlu", "--"),
            //Baş Küngüt bələdiyyəsi
            StructureModel("", "BAŞ KÜNGÜT BƏLƏDİYYƏSİ", ""),
            StructureModel("sədr", "Əhmədova Tutu Abdulla qızı", "24-73-1-22"),
            StructureModel("müavin", "Bayramov Əlibala Nəsir oğlu", "--"),
            //Baş Zəyzid bələdiyyəsi
            StructureModel("", "BAŞ ZƏYZİD BƏLƏDİYYƏSİ", ""),
            StructureModel("sədr", "Abduləzizov Rəşad Umar oğlu", "24-95-1-44"),
            StructureModel("müavin", "Məcidov Kamil Məmmədiyə oğlu", "--"),
            //Bideyiz bələdiyyəsi
            StructureModel("", "BİDEYİZ BƏLƏDİYYƏSİ", ""),
            StructureModel("sədr", "İsmayılov Müseyif  Şöyüb oğlu", "24-74-2-03"),
            StructureModel("müavin", "İsmayılova Aygün Ramiz qızı", "--"),
            //Bolludərə bələdiyyəsi
            StructureModel("", "BOLLUDƏRƏ BƏLƏDİYYƏSİ", ""),
            StructureModel("sədr", "Rəcəbov Mehman Elməddin oğlu", "24-78-4-46"),
            StructureModel("müavin", "Qədirov Yasər Fəxrəddin oğlu", "--"),
            //Cəfərabad bələdiyyəsi
            StructureModel("", "CƏFƏRABAD BƏLƏDİYYƏSİ", ""),
            StructureModel("sədr", "Tanrıverdiyev Yaqub Köçəri oğlu", "24-38-1-84"),
            StructureModel("müavin", "Məmmədov Turan Xanlar  oğlu", "--"),
            //Cəyirli bələdiyyəsi
            StructureModel("", "CƏYİRLİ BƏLƏDİYYƏSİ", ""),
            StructureModel("sədr", "Qarayeva Mirvari Qara qızı", "24-77-1-55"),
            StructureModel("müavin", "Əliyev Etibar Qardaşbəy oğlu", "--"),
            //Çayqaraqoyunlu bələdiyyəsi
            StructureModel("", "ÇAYQARAQOYUNLU BƏLƏDİYYƏSİ", ""),
            StructureModel("sədr", "Namazov Sərkar Qədər oğlu", "24-71-2-33"),
            StructureModel("müavin", "Səfərov Mansur Səfər oğlu", "--"),
            //Çeşməli bələdiyyəsi
            StructureModel("", "ÇEŞMƏLİ BƏLƏDİYYƏSİ", ""),
            StructureModel("sədr", "Məmmədov Məmmədəli Qədir oğlu", "--"),
            StructureModel("müavin", "Bəkirova Aygün Kərəm qızı", "--"),
            //İbrahimkənd bələdiyyəsi
            StructureModel("", "İBRAHİMKƏND BƏLƏDİYYƏSİ", ""),
            StructureModel("sədr", "Rəhimova Nərminə Əbülfəz qızı", "24-91-2-06"),
            StructureModel("müavin", "Əyyubov İsmayıl Şaban oğlu", "--"),
            //Qayabaşı bələdiyyəsi
            StructureModel("", "QAYABAŞI BƏLƏDİYYƏSİ", ""),
            StructureModel("sədr", "Əliyev Sahib Əli  oğlu", "24-78-3-59"),
            StructureModel("müavin", "Rəhimov Qurban Abdurahman oğlu", "--"),
            //Orta Zəyzid bələdiyyəsi
            StructureModel("", "ORTA ZƏYZİD BƏLƏDİYYƏSİ", ""),
            StructureModel("sədr", "Musayev Novruz Oruc oğlu", "24-94-1-16"),
            StructureModel("müavin", "Əbdürəhimov Yusif Lıətif oğlu", "--"),
            //Şirinbulaq bələdiyyəsi
            StructureModel("", "ŞİRİNBULAQ BƏLƏDİYYƏSİ", ""),
            StructureModel("sədr", "Vəliyev Şubay  Baxşəli oğlu", "--"),
            StructureModel("müavin", "Qurbanov Vakif Qərib oğlu", "--"),
            //Turan bələdiyyəsi
            StructureModel("", "TURAN BƏLƏDİYYƏSİ", ""),
            StructureModel("sədr", "Heydərova Narıngül Elağa qızı", "24-71-2-45"),
            StructureModel("müavin", "Səmədov Ramiz Baba oğlu", "--"),
            //Vərəzət bələdiyyəsi
            StructureModel("", "VƏRƏZƏT BƏLƏDİYYƏSİ", ""),
            StructureModel("sədr", "Nəsirova Mənsurə Nurməmməd qızı", "24-95-1-99"),
            StructureModel("müavin", "Mustafayev Ramin Ələsgər oğlu", "--")
        )
    }

    internal val municipalityList: MutableLiveData<PersistentList<StructureModel>> = _municipalityList
}