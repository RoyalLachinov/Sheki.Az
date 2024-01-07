package administration

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.collections.immutable.PersistentList
import kotlinx.collections.immutable.persistentListOf

class DelegationViewModel : ViewModel() {

    private val _delegationList = MutableLiveData<PersistentList<StructureModel>>().apply {
        value = persistentListOf(
            //1 nömrəli Sahə İnzibati Ərazi Dairəsi üzrə nümayəndəlik
            StructureModel("", "1 nömrəli SAHƏ İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""),
            StructureModel("Nümayəndə", "Həsənov Rasim", "244-90-34"),
            StructureModel("Nümayəndənin müavini", "Əliyev Mehman", "244-90-14"),
            StructureModel("Baş məsləhətçi - baş mühasib", "Xəlilov Nizami", "244-90-14"),
            StructureModel("Məsləhətçi (mühəndis)", "Qaffarov Elçin", "--"),
            StructureModel("Aparıcı mütəxəssis", "Səlimova Samirə", "--"),
            //Baş Zəyzid kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
            StructureModel("", "BAŞ ZƏYZİD kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""),
            StructureModel("Nümayəndə", "Müslimov Ələşrəf", "24 95-1-54"),
            StructureModel("Nümayəndənin müavini", "Novruzov Elşad", "--"),
            StructureModel("Baş məsləhətçi mühasib", "Həbibullayev Elşad", "--"),
            //Orta  Zəyzid kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik

            StructureModel(
                "",
                "ORTA ZƏYZİD kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK",
                ""
            ),
            StructureModel("Nümayəndə", "Mustafayeva Xuraman", "24 94-1-48"),
            StructureModel("Nümayəndənin müavini", "Hüseynov Fikrət ", "--"),
            StructureModel("Baş məsləhətçi mühasib", "Məmmədova Könül", "--"),
            //Aşağı Küngüt kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik

            StructureModel(
                "",
                "AŞAĞI KÜNGÜT kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK",
                ""
            ),
            StructureModel("Nümayəndə", "Səfərov Ehsan ", "24 91-1-19"),
            StructureModel("Nümayəndənin müavini", "Məmmədov Ərəstun", "--"),
            StructureModel("Baş məsləhətçi mühasib", "Əsgərova Məlahət", "--"),
            //İbrahimkənd kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik

            StructureModel(
                "",
                "İBRAHİMKƏND kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK",
                ""
            ),
            StructureModel("Nümayəndə", "Məmmədov İlqar", "24 91-2-06"),
            StructureModel("Nümayəndənin müavini", "Abdulkərimov Abdulla", "--"),
            StructureModel("Baş məsləhətçi mühasib", "Qocayev Yaşar", "--"),
            //Baş Kəldək kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
            StructureModel("", "BAŞ KƏLDƏK kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""),
            StructureModel("Nümayəndə", "Məsimov Cavanşir", "24 90-4-72"),
            StructureModel("Nümayəndənin müavini", "Abdurahmanov Emin", "--"),
            StructureModel("Baş məsləhətçi mühasib", "--", "--"),
            //Aydınbulaq kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
            StructureModel("", "AYDINBULAQ kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""),
            StructureModel("Nümayəndə", "Vəliyev Elçin", "24 39-2-52"),
            StructureModel("Nümayəndənin müavini", "Tağıyev Yadigar", "24 39-1-43"),
            StructureModel("Baş məsləhətçi mühasib", "Səlimli Azər", "--"),
            //Şirinbulaq kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
            StructureModel("", "ŞİRİNBULAQ kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""),
            StructureModel("Nümayəndə", "Dostuyev Tapdıq", "24 58-4-29"),
            StructureModel("Nümayəndənin müavini", "Qurbanov Kərim", "--"),
            StructureModel("Baş məsləhətçi mühasib", "Səlimov Şəmşir", "--"),
            //Baş Küngüt kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
            StructureModel("", "BAŞ KÜNGÜT kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""),
            StructureModel("Nümayəndə", "Məmmədov Kazım", "24 73-1-45"),
            StructureModel("Nümayəndənin müavini", "Babayev Araz", "24 73-1-37"),
            StructureModel(" Baş məsləhətçi mühasib", "Paşayeva Pərvanə", "--"),
            //Turan qəsəbə İnzibati Ərazi Dairəsi üzrə nümayəndəlik
            StructureModel("", "TURAN qəsəbə İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""),
            StructureModel("Nümayəndə", "Tağıyev Nağı", "24 71-3-34"),
            StructureModel("Nümayəndənin müavini", "Piriyev Elşən", "24 71-3-35"),
            StructureModel("Baş məsləhətçi mühasib", "Mövlamov Rövşən", "--"),
            //Bolludərə kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
            StructureModel("", "BOLLUDƏRƏ kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""),
            StructureModel("Nümayəndə", "Həsənov Sahib", "24 78-4-46"),
            StructureModel("Nümayəndənin müavini", "Məmmədov Rizvan", "--"),
            StructureModel("Baş məsləhətçi mühasib", "--", "--"),
            //Qayabaşı kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
            StructureModel("", "QAYABAŞI kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""),
            StructureModel("Nümayəndə", "Məsimov Əmir", "24 78-2-40"),
            StructureModel("Nümayəndənin müavini", "Ramazanov Ramiz", "24 78-2-88"),
            StructureModel("Baş məsləhətçi mühasib", "Salahov Mirzə", "--"),
            //Cəfərabad kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
            StructureModel("", "CƏFƏRƏBAD kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""),
            StructureModel("Nümayəndə", "Mustafayev Sübhan", "24 38-1-72"),
            StructureModel("Nümayəndənin müavini", "Qədimov Xəyyam", "--"),
            StructureModel("Baş məsləhətçi mühasib", "Mustafayev Tariyel", "--"),
            //Suçma kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
            StructureModel("", "SUÇMA kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""),
            StructureModel("Nümayəndə", "Abdullayev Həsən", "24 37-1-10"),
            StructureModel("Nümayəndənin müavini", "Əlipaşayev Şahin", "--"),
            StructureModel("Baş məsləhətçi mühasib", "Şamilov Azər", "--"),
            //Çeşməli kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
            StructureModel("", "ÇEŞMƏLİ kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""),
            StructureModel("Nümayəndə", "İbrahimxəlilov Zabir", "044-277-01-35"),
            StructureModel("Nümayəndənin müavini", "Rəhimov Vüqar", "--"),
            StructureModel("Baş məsləhətçi mühasib", "Sədiyev Əhməd-Muxtar", "--"),
            //Şəki kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
            StructureModel("", "ŞƏKİ kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""),
            StructureModel("Nümayəndə", "Məmmədova Zərifə", "24 33-2-68"),
            StructureModel("Nümayəndənin müavini", "Tağıyeva Mehriban", "--"),
            StructureModel(" Baş məsləhətçi mühasib", "Kazımov Fikrət", "--"),
            //Cəyirli kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
            StructureModel("", "CƏYİRLİ kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""),
            StructureModel("Nümayəndə", "Həsənov Vaqif", "24 77-1-99"),
            StructureModel("Nümayəndənin müavini", "Ismayilov Farzali", "--"),
            StructureModel(" Baş məsləhətçi mühasib", "Ramazanov Zaman", "--"),
            //Oxud kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
            StructureModel("", "OXUD kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""),
            StructureModel("Nümayəndə", "Əhmədov Oruc", "24 30-1-54"),
            StructureModel("Nümayəndənin müavini", "Yusifov Elmar", "--"),
            StructureModel(" Baş məsləhətçi mühasib", "Məhyəddinov Zaur", "--"),
            //Baltalı kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
            StructureModel("", "BALTALI kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""),
            StructureModel("Nümayəndə", "Manafov Etibar", "24 31-1-18"),
            StructureModel("Nümayəndənin müavini", "Eyvazova Könül", "--"),
            StructureModel(" Baş məsləhətçi mühasib", "Rəsulov Turqut", "--"),
            //İnçə kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
            StructureModel("", "İNÇƏ kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""),
            StructureModel("Nümayəndə", "Əhmədov Vahid", "24 34-1-42"),
            StructureModel("Nümayəndənin müavini", "Umudov Nəriman", "--"),
            StructureModel(" Baş məsləhətçi mühasib", "Xəlilli Elnur", "--"),
            //Baş Göynük kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
            StructureModel("", "BAŞ GÖYNÜK kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""),
            StructureModel("Nümayəndə", "Calalov Rza", "24 92-1-17"),
            StructureModel("Nümayəndənin müavini", "Rəsulov Məmməd", "24 92-1-72"),
            StructureModel(" Baş məsləhətçi mühasib", "İsmayılov Əhəd", "--"),
            //Aşağı Göynük kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik

            StructureModel(
                "",
                "AŞAĞI GÖYNÜK kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK",
                ""
            ),
            StructureModel("Nümayəndə", "Əliyev Əfqan", "24 96-1-15"),
            StructureModel("Nümayəndənin müavini", "Hümbətov Yusif", "24 96-1-33"),
            StructureModel(" Baş məsləhətçi mühasib", "Həsənova Şəfəq", "--"),
            //Baş Layısqı kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik

            StructureModel(
                "",
                "BAŞ LAYISQI kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK",
                ""
            ),
            StructureModel("Nümayəndə", "Nəbiyev Asif", "24 93-1-36"),
            StructureModel("Nümayəndənin müavini", "Yusibov Nizami", "--"),
            StructureModel(" Baş məsləhətçi mühasib", "İsmayılov Cuma", "--"),
            //Biləcik kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
            StructureModel("", "BİLƏCİK kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""),
            StructureModel("Nümayəndə", "Xasıyev Xalis", "24 99-2-10"),
            StructureModel("Nümayəndənin müavini", "Məmmədov Tariyel", "--"),
            StructureModel(" Baş məsləhətçi mühasib", "Məmmədov Azər", "--"),
            //Qoxmuq kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
            StructureModel("", "QOXMUQ kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""),
            StructureModel("Nümayəndə", "Həsənov İlqar", "24 4-16-38"),
            StructureModel("Nümayəndənin müavini", "Əliyev Zeynal", "--"),
            StructureModel(" Baş məsləhətçi mühasib", "Mustafayev Vüsal", "--"),
            //Kiş kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
            StructureModel("", "KİŞ kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""),
            StructureModel("Nümayəndə", "Yusifov Mürvət", "24 98-4-98"),
            StructureModel("Nümayəndənin müavini", "Həbibullayev Maqsud", "--"),
            StructureModel(" Baş məsləhətçi mühasib", "Həşimov Azad", "--"),
            //Daşüz kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
            StructureModel("", "DAŞÜZ kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""),
            StructureModel("Nümayəndə", "Əliyev İlqar", "24 32-2-30"),
            StructureModel("Nümayəndənin müavini", "Məmmədov Rövşən", "--"),
            StructureModel(" Baş məsləhətçi mühasib", "Mustafayev Elçin", "--"),
            //Küdürlü kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
            StructureModel("", "KÜDRLÜ kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""),
            StructureModel("Nümayəndə", "Əmraslanova Təranə", "044-277-10-38"),
            StructureModel("Nümayəndənin müavini", "İbrahimov Xəyyam", "--"),
            StructureModel(" Baş məsləhətçi mühasib", "Məmmədov Məmməd", "--"),
            //Qudula kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
            StructureModel("", "QUDULA kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""),
            StructureModel("Nümayəndə", "Cumayev Rəşad", "24 97-2-27"),
            StructureModel("Nümayəndənin müavini", "Həsrətov Ramin", "--"),
            StructureModel(" Baş məsləhətçi mühasib", "--", "--"),
            //Cumakənd kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
            StructureModel("", "CUMAKƏND kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""),
            StructureModel("Nümayəndə", "Mahmuov Oruc", "24 75-1-37"),
            StructureModel("Nümayəndənin müavini", "Səmədov Söhrab", "--"),
            StructureModel(" Baş məsləhətçi mühasib", "--", "--"),
            //Şorsu kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
            StructureModel("", "ŞORSU kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""),
            StructureModel("Nümayəndə", "Əliyev Mustafa", "24 72-1-10"),
            StructureModel("Nümayəndənin müavini", "İsmayılov Qurban", "--"),
            StructureModel(" Baş məsləhətçi mühasib", "--", "--"),
            //Böyük Dəhnə kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik

            StructureModel(
                "",
                "BÖYÜK DƏHNƏ kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK",
                ""
            ),
            StructureModel("Nümayəndə", "Yusifov Asif", "24 36-1-67"),
            StructureModel("Nümayəndənin müavini", "--", "24 36-1-50"),
            StructureModel(" Baş məsləhətçi mühasib", "Xəlilov Tehran", "--"),
            //Kiçik Dəhnə kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik

            StructureModel(
                "",
                "KİÇİI DƏHNƏ kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK",
                ""
            ),
            StructureModel("Nümayəndə", "Mirhəsənov Aslan", "24 35-1-35"),
            StructureModel("Nümayəndənin müavini", "Manafov Seyran", "--"),
            StructureModel(" Baş məsləhətçi mühasib", "Axundov Səməd", "--"),
            //Çələbixan qəsəbə icra nümayəndəliyi
            StructureModel("", "ÇƏLƏBİXAN qəsəbə İCRA NÜMAYƏNDƏLİYİ", ""),
            StructureModel("Nümayəndə", "Ağabalayev İlqar", "24 38-1-68"),
            StructureModel("Nümayəndənin müavini", "Yusifov Rasim", "--"),
            StructureModel(" Baş məsləhətçi mühasib", "Qarayev Etibar", "--")
        )
    }
    internal val delegationList: MutableLiveData<PersistentList<StructureModel>> = _delegationList

}