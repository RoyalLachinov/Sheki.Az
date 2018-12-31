package about;


import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.Fragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import lachinov.royal.com.main.R;

/**
 * A simple {@link Fragment} subclass.
 */
@SuppressWarnings("ConstantConditions")
public class About_Culture_Details extends Fragment {

    private FragmentTransaction fragmentTransaction;
    private About_Main_Page about_main_page;

    public About_Culture_Details() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.sheki_about__culture__details, container, false);
        ListView listView = (ListView) view.findViewById(R.id.listViewCulture);

        List<About_Education_Entity> list = new ArrayList<>();

        list.add(new About_Education_Entity("1", "Şəki uşaq incəsənət məktəbi", "Calğalıbulaq küçəsi 57", "Babayev Yaşar Abdurəşid", "4-24-54"));
        list.add(new About_Education_Entity("2", "2 sayli uşaq musiqi məktəbi", "M.Ə.Rəsulzadə küçəsi 175", "Məmmədov Tərlan Hikmət", "4-21-01"));
        list.add(new About_Education_Entity("3", "3 sayli uşaq musiqi məktəbi", "S.Rəhman küçəsi 15", "Əsgərova Şəmsiyyət Məmməd", "4-69-44"));
        list.add(new About_Education_Entity("4", "4 sayli uşaq musiqi məktəbi", "M.Ə.Rəsulzadə 72", "Rəsulov İbrahim Allahyar", "4-65-05"));
        list.add(new About_Education_Entity("5", "Turan qəsəbə uşaq musiqi məktəbi", "Şəki rayonu, Turan qəsəbəsi", "Rəcəbov Eldar Kamran", "71-3-63"));
        //MUZEY MÜƏSSİSƏLƏRİ
        list.add(new About_Education_Entity("", "", "MUZEY MÜƏSSİSƏLƏRİ", "", ""));
        list.add(new About_Education_Entity("6", "Heydər Əliyev Mərkəzi", "S.Mümtaz küçəsi 1", "Məmmədova Zeynəb Vidadi", "5-00-03"));
        list.add(new About_Education_Entity("7", "“Yuxarı baş” Dövlət Tarix Memarlıq Qoruğu", "Şəki, Narınqala divarları", "Abdullayeva Təranə Əli", "4-36-66"));
        list.add(new About_Education_Entity("8", "Kiş Dövlət Tarixi Memarlıq Qoruğu", "Şəki rayonu, Kiş kəndi", "Hüseynova İlhamə Qənirə", "98-8-33"));
        list.add(new About_Education_Entity("9", "R.Əfəndiyev adına tarix-diyarşünaslıq muzeyi", "Şəki, Narınqala divarları", "Cəlalova Yaqut Abduləli ", "4-37-02"));
        list.add(new About_Education_Entity("10", "Xalq Tətbiqi Sənəti Muzeyi", "Şəki, Narınqala divarları", "Abdullazadə İradə Fikrət ", "4-49-01"));
        list.add(new About_Education_Entity("11", "Şəki Dövlət Rəsm Qalereyası", "Şəki, Narınqala divarları", "Məmmədov Fazil Qüdrət ", "4-45-01"));
        list.add(new About_Education_Entity("12", "M.F.Axundovun ev-muzeyi", "M.F.Axundov küçəsi 1", "Xəlilova Ulduz Orxan", "4-37-08"));
        list.add(new About_Education_Entity("13", "R.Əfəndiyevin ev-muzeyi", "Ə.Bayramov küçəsi 5", "Qasımzadə Vəfa Teymur ", "4-42-58"));
        list.add(new About_Education_Entity("14", "S.Rəhmanın ev-muzeyi", "Ağvanlar küçəsi 21", "İskəndərova Pərvanə Okyaz", "4-50-89"));
        list.add(new About_Education_Entity("15", "Turizm-İnformasiya Mərkəzi", "Şəki, Narınqala divarları", "İmaməliyev Nəsif Mustafa", "--"));
        //MƏDƏNİYYƏT VƏ İSTİRAHƏT PARKLARI
        list.add(new About_Education_Entity("","","MƏDƏNİYYƏT VƏ İSTİRAHƏT PARKLARI","",""));
        list.add(new About_Education_Entity("16", "M.F.Axundov adına mədəniyyət və istirahət parkı", "S.Rəhman küçəsi 9", "İbadov Elşad Sırac ", "4-47-06"));
        list.add(new About_Education_Entity("17", "M.Füzuli adına mədəniyyət və istirahət parkı", "Calğalıbulaq küçəsi 13", "Tağıyev Rasim Məcid", "--"));
        //KLUB MÜƏSSİSƏLƏRİ
        list.add(new About_Education_Entity("","","KLUB MÜƏSSİSƏLƏRİ","",""));
        list.add(new About_Education_Entity("18", "M.F.Axundov adına mərkəzi mədəniyyət evi", "M.Həmidov küçəsi 6", "Kərimov Vfqif Əhməd", "4-44-98"));
        list.add(new About_Education_Entity("19", "S.Vurğun adına mədəniyyət evi", "M.Ə.Rəsulzadə küç. 72", "Yusifov Fəxrəddin Ağəli", "4-72-69"));
        list.add(new About_Education_Entity("20", "Ə.Abdullayev adına mədəniyyət evi", "9 saylı orta məktəb", "Məhərrəmova Şahsənəm Camal", "--"));
        list.add(new About_Education_Entity("21", "Ü.Hacıbəyov adına mədəniyyət evi", "N.Nərimanov küçəsi 30", "Məcidov Sahib Siracəddin", "--"));
        list.add(new About_Education_Entity("22", "M.K.Hacıoğlu adına mədəniyyət evi", "F.Xoyski küçəsi 10", "Qaffarova Zeynəb Mədədəli", "--"));
        list.add(new About_Education_Entity("23", "B.Axundov adına mədəniyyət evi", "8 saylı orta məktəb", "Tağıev Ülfət Rasim", "--"));
        list.add(new About_Education_Entity("24", "V.İbrahim adına mədəniyyət evi", "“Şəki-İpək” kombinatı", "Hacızəkəryzyev Rövzət Tacəddin", "--"));
        list.add(new About_Education_Entity("25", "M.İsmayılov adına mədəniyyət evi", "19 saylı orta məktəb", "Qarayeva Tahirə Abdulla", "--"));
        list.add(new About_Education_Entity("26", "N.Bədəlov adına mədəniyyət evi", "AMİ-nin Şəki filialı", "Məmmədova Mehriban Nemət", "--"));
        list.add(new About_Education_Entity("27", "L.Abdullayev adına klub", "Şəki liseyi", "Əfəndiyeva Mahirə Əlibala", "--"));
        list.add(new About_Education_Entity("28", "R.Sadıqov adına klub", "Turbaza", "Mirzəyeva Təranə Əbil", "--"));
        list.add(new About_Education_Entity("29", "M.S.Əliyev adına klub", "Şəki Pedaqoji Texnikumu", "Kovxayeva Ayşə Hüseyn", "--"));
        list.add(new About_Education_Entity("30", "Y.Məmmədov adına klub", "7 saylı orta məktəb", "Həşimova Afət Paşa", "--"));
        list.add(new About_Education_Entity("31", "M.Nəsrullayev adına klub", "1 saylı peşə məktəbi", "İlyaslı Mehman Yavər", "--"));
        list.add(new About_Education_Entity("32", "K.Kərimov adına klub", "Uşaq evi", "Əsgərov Mais Bəxtiyar", "--"));
        list.add(new About_Education_Entity("33", "İ.Salmanov adına klub", "Texniki kollec", "Çələbiyev Telman Cumay", "--"));
        list.add(new About_Education_Entity("34", "Ə.Sadıqov adına klub", "3 saylı orta mıktəb", "Abdullayev Mahir Rəcəb", "--"));
        list.add(new About_Education_Entity("35", "Ə.Şəkili adına klub", "M.Ə.Rəsulzadə küç. 183", "Abbasova Məhəbbət İmran", "--"));
        list.add(new About_Education_Entity("36", "B.Ələsgərova adına klub", "Qarışıq tipli internat məktəbi", "Yunusov Sərdar Əşrəf", "--"));
        list.add(new About_Education_Entity("37", "Oxud kənd mədəniyyət evi", "Şəki rayonu Oxud kəndi", "Abdurahmanov Baxşəli Yunus", "--"));
        list.add(new About_Education_Entity("38", "Qoxmuq kənd mədəniyyət evi", "Şəki rayonu Qoxmuq kəndi", "Məmmədov Fazil Şahid", "--"));
        list.add(new About_Education_Entity("39", "I Biləcik kənd mədəniyyət evi", "Şəki rayonu I Biləcik kəndi", "Həsənova Zərnişan Əsədullah", "--"));
        list.add(new About_Education_Entity("40", "Baltalı kənd mədəniyyət evi", "Şəki rayonu Baltalı kəndi", "Abdulxalıqova Gülxar Tahir", "--"));
        list.add(new About_Education_Entity("41", "Baş Göynük kənd mədəniyyət evi", "Şəki rayonu Baş Göynük kəndi", "Bəkirov Qərib Mahmud", "--"));
        list.add(new About_Education_Entity("42", "Aşagı Göynük kənd mədəniyyət evi", "Şəki rayonu Aşagı Göynük kəndi", "Abbasova Mafiqə Süleyman", "--"));
        list.add(new About_Education_Entity("43", "Baş Layısqı kənd mədəniyyət evi", "Şəki rayonu Baş Layısqı kəndi", "Hüseynov Rəfael Hüseyn", "--"));
        list.add(new About_Education_Entity("44", "Cumaykənd mədəniyyət evi", "Şəki rayonu Cumaykənd kəndi", "Şahmirova Nərminə Musa", "--"));
        list.add(new About_Education_Entity("45", "Baş Zəyzid kənd mədəniyyət evi", "Şəki rayonu Baş Zəyzid kəndi", "Mahmudov Xanlar Qeysəddin", "--"));
        list.add(new About_Education_Entity("46", "Oravan kənd mədəniyyət evi", "Şəki rayonu Oravan kəndi", "İbrahimov Zülkifli Paşa", "--"));
        list.add(new About_Education_Entity("47", "Baş Küngüt kənd mədəniyyət evi", "Şəki rayonu Baş Küngüt kəndi", "Nəsirov Vüqar Bəşarət", "--"));
        list.add(new About_Education_Entity("48", "Aşağı Küngüt kənd mədəniyyət evi", "Şəki rayonu Aşağı Küngüt kəndi", "Məmmədova Zenfira Abuzər", "--"));
        list.add(new About_Education_Entity("49", "Bideyiz kənd mədəniyyət evi", "Şəki rayonu Bideyiz kəndi", "İsmayılova Sara Hümmət", "--"));
        list.add(new About_Education_Entity("50", "Qayabaşı kənd mədəniyyət evi", "Şəki rayonu Qayabaşı kəndi", "Məmmədova Mehriban Nəsif", "--"));
        list.add(new About_Education_Entity("51", "Şəki kənd mədəniyyət evi", "Şəki rayonu Şəki kəndi", "Hüseynov Rəşid Nəriman", "--"));
        list.add(new About_Education_Entity("52", "Suçma kənd mədəniyyət evi", "Şəki rayonu Suçma kəndi", "Məmmədrəhimov Etibar Rəsul", "--"));
        list.add(new About_Education_Entity("53", "İ.Osmanlı adına Kiş kənd mədəniyyət evi", "Şəki rayonu Kiş kəndi", "Məmmədov Natiq Abdulla", "--"));
        list.add(new About_Education_Entity("54", "Aydınbulaq kənd mədəniyyət evi", "Şəki rayonu Aydınbulaq kəndi", "Pirimov Nəriman Emin", "--"));
        list.add(new About_Education_Entity("55", "Şorsu kənd mədəniyyət evi", "Şəki rayonu Şorsu kəndi", "Məmmədov Raqif Musa", "--"));
        list.add(new About_Education_Entity("56", "Kiçik Dəhnə kənd klubu", "Şəki rayonu Kiçik Dəhnə kəndi", "Bədəlova Əlamət Yunus", "--"));
        list.add(new About_Education_Entity("57", "İnçə-Zunud kənd klubu", "Şəki rayonu İnçə-Zunud kəndi", "İbrahimxəlilov Xurşud Cəmaləddin", "--"));
        list.add(new About_Education_Entity("58", "Qaradağlı kənd klubu", "Şəki rayonu Qaradağlı kəndi", "Məmmədova Sürəyya Şəhriyar", "--"));
        list.add(new About_Education_Entity("59", "Köbər Zəyzid kənd klubu", "Şəki rayonu Köbər Zəyzid kəndi", "Cəbrayılov Mazquy Veysəl", "--"));
        list.add(new About_Education_Entity("60", "Qaratorpaq kənd klubu", "Şəki rayonu Qaratorpaq kəndi", "Adıgözəlov Elxan Məmmədəli", "--"));
        list.add(new About_Education_Entity("61", "Sarıca kənd klubu", "Şəki rayonu Sarıca kəndi", "Hüseynova Elnarə Namizəd", "--"));
        list.add(new About_Education_Entity("62", "Cəyirli kənd klubu", "Şəki rayonu Cəyirli kəndi", "Abbasova Zəkiyyə Qulu", "--"));
        list.add(new About_Education_Entity("63", "Böyük Dəhnə kənd klubu", "Şəki rayonu Böyük Dəhnə kəndi", "Məmmədova Əsmər İsgəndər", "--"));
        list.add(new About_Education_Entity("64", "Cəfərabad kənd klubu", "Şəki rayonu Cəfərabad kəndi", "Əmrahov Həsrət Musa", "--"));
        list.add(new About_Education_Entity("65", "Fazıl kənd klubu", "Şəki rayonu Fazıl kəndi", "Abdullayev Rahim Darçın", "--"));
        list.add(new About_Education_Entity("66", "İbrahimkənd klubu", "Şəki rayonu İbrahimkənd kəndi", "Mehdiyeva Şərqiyyə Vəzir", "--"));
        list.add(new About_Education_Entity("67", "Bolludərə kənd klubu", "Şəki rayonu Bolludərə kəndi", "Əzizov Elduz Məmməd", "--"));
        list.add(new About_Education_Entity("68", "Çeşməli kənd klubu", "Şəki rayonu Çeşməli kəndi", "Əliyev Afər Yusif", "--"));
        list.add(new About_Education_Entity("69", "Daşbulaq kənd klubu", "Şəki rayonu Daşbulaq kəndi", "Mahmudova Sevil Musa", "--"));
        list.add(new About_Education_Entity("70", "Baş Şabalıd kənd klubu", "Şəki rayonu Baş Şabalıd kəndi", "Bəkirova Aytən Bəkir", "--"));
        list.add(new About_Education_Entity("71", "Aşağı Şabalıd kənd klubu", "Şəki rayonu Aşağı Şabalıd kəndi", "İbrahimxəlilov İlham Cəmaləddin", "--"));
        list.add(new About_Education_Entity("72", "Cunud kənd klubu", "Şəki rayonu Cunud kəndi", "Qocayeva Leyla Camal", "--"));
        list.add(new About_Education_Entity("73", "Qırxbulaq kənd klubu", "Şəki rayonu Qırxbulaq kəndi", "Lətifov Yusif Bayraməli", "--"));
        list.add(new About_Education_Entity("74", "Çapağan kənd klubu", "Şəki rayonu Çapağan kəndi", "Babayeva Mövlayə İsmayıl", "--"));
        list.add(new About_Education_Entity("75", "Öryət kənd klubu", "Şəki rayonu Öryət kəndi", "Əlimirzəyeva Pəri Balaş", "--"));
        list.add(new About_Education_Entity("76", "Qudula kənd klubu", "Şəki rayonu Qudula kəndi", "Musayeva Güldanə Əhəd", "--"));
        list.add(new About_Education_Entity("77", "Aşağı Daşağıl kənd klubu", "Şəki rayonu Aşağı Daşağıl kəndi", "Seyidova Sənubər Seyid", "--"));
        list.add(new About_Education_Entity("78", "Turan qəsəbə klubu", "Şəki rayonu Turan qəsəbəsi", "Həşimova Məharət Əlyar", "--"));
        list.add(new About_Education_Entity("79", "Dərəcənnət kənd klubu", "Şəki rayonu Dərəcənnət kəndi", "Abdullayeva Zeynəb Əlipaşa", "--"));
        list.add(new About_Education_Entity("80", "Çayqaraqoyunlu kənd klubu", "Şəki rayonu Çayqaraqoyunlu kəndi", "Piriyeva Əminəxatın Yaqub", "--"));
        list.add(new About_Education_Entity("81", "Şin kənd klubu", "Şəki rayonu Şin kəndi", "Məmmədov Fətəli Əsgər", "--"));
        list.add(new About_Education_Entity("82", "Təpəcənnət kənd klubu", "Şəki rayonu Təpəcənnət kəndi", "Tanrıverdiyeva Məhəbbət Camal", "--"));
        list.add(new About_Education_Entity("83", "Babaratma kənd klubu", "Şəki rayonu Babaratma kəndi", "Şirinov Tarıyel Şahid", "--"));
        list.add(new About_Education_Entity("84", "Çələbixan köçkünlər qəsəbə klubu", "Şəki rayonu Çələbixan qəsəbəsi", "Mahmudov Çingiz Kərim", "--"));
        list.add(new About_Education_Entity("85", "Qumux kənd klubu", "Şəki rayonu Qumux kəndi", "Şərifov Mehman Mustafa", "--"));
        list.add(new About_Education_Entity("86", "İkinci Biləcik kənd klubu", "Şəki rayonu Biləcik kəndi", "Nizaməddinova Zinyət Paşa", "--"));
        list.add(new About_Education_Entity("87", "Göybulaq kənd klubu", "Şəki rayonu Göybulaq kəndi", "Mürsəlli İslam Qurban", "--"));
        //MƏRKƏZLƏŞDİRİLMİŞ KİTABXANA SİSTEMİ
        list.add(new About_Education_Entity("", "", "MƏRKƏZLƏŞDİRİLMİŞ KİTABXANA SİSTEMİ", "", ""));
        list.add(new About_Education_Entity("88", "İ.S.Nakam adına MKS", "Şəki, M.F.Axundov 6", "Vahabov Seyid Hümmət", "4-20-82"));
        list.add(new About_Education_Entity("89", "MKS-nin uşaq şöbəsi", "Şəki, Narınqala divarları", "Rəsulova Mirvari Əşrəf", "4-72-70"));
        list.add(new About_Education_Entity("90", "MKS 1 saylı filialı", "Şəki, Giləhli küçəsi", "Cəmilova Sədaqət Azad", "--"));
        list.add(new About_Education_Entity("91", "MKS 2 saylı filialı", "Şəki, F.Xoyski küçəsi 51", "Yunusova Solmaz Qasım", "--"));
        list.add(new About_Education_Entity("92", "MKS 4 saylı filialı", "Şəki, Ə.Bayramov küç. 5", "İsmayılova Təranə Nadir", "--"));
        list.add(new About_Education_Entity("93", "MKS 5 saylı filialı", "Şəki, M.Ə.Rəsulzadə 174", "Məsimova Reyhanə Kamal", "--"));
        list.add(new About_Education_Entity("94", "MKS 6 saylı filialı", "Şəki, Tolstoy küçəsi 18", "Paşayeva Günel Paşa", "--"));
        list.add(new About_Education_Entity("95", "MKS 7 saylı filialı", "Şəki M.F.Axundov küç12", "Mustafayeva Lətafət Şirəli", "--"));
        list.add(new About_Education_Entity("96", "MKS 8 saylı filialı", "Şəki, 19 saylı orta məktəb", "Kərimova Maisə Əsədulla", "--"));
        list.add(new About_Education_Entity("97", "MKS 10 saylı filialı", "Şəki, F.Abdurahmanov küç. 1", "Yusibova Mətanət Əhməd", "--"));
        list.add(new About_Education_Entity("98", "MKS 12 saylı filialı", "Texniki peşə məkt. binası", "Kərimova Səhər Həbibullah", "--"));
        list.add(new About_Education_Entity("99", "MKS 13 saylı filialı", "Şəki, N.Nərimanov küç. 30", "Bəkirova Gövhər Qinyaz", "--"));
        list.add(new About_Education_Entity("100", "MKS 14 saylı filialı", "Bagbanlar küç. 4 Barama toxumu zavodu", "Abduləzimova Aminə Məmmədəli", "--"));
        list.add(new About_Education_Entity("101", "MKS 16 saylı filialı", "Şəki, M.Ə.Rəsulzadə 72", "Mustafayeva İradə Hümmət", "--"));
        list.add(new About_Education_Entity("102", "MKS 17 saylı filialı", "Şəki, 20 saylı orta məktəb", "Həsənova Rüfanə Adil", "--"));
        list.add(new About_Education_Entity("103", "MKS 18 saylı filialı", "Şəki 20 Yanvar küç.7", "Məmmədova Mətanət Qəmbər", "--"));
        list.add(new About_Education_Entity("104", "MKS 84 saylı filialı", "Şəki, M.Ə.Rəsulzadə küç. 15а", "Bayramova Fatma Qasım", "--"));
        list.add(new About_Education_Entity("105", "Kiş kənd MKS 11 saylı filial", "Şəki rayonu Kiş kəndi", "Feyzullayeva Havva Vahid", "--"));
        list.add(new About_Education_Entity("106", "Kiçik Dəhnə kənd MKS 19 saylı filial", "Şəki rayonu Kiçik Dəhnə kəndi", "Cabbarova Aybəniz Xəlis", "--"));
        list.add(new About_Education_Entity("107", "Böyük Dəhnə kənd MKS 21 saylı filial", "Şəki rayonu Böyük Dəhnə kəndi", "Seyidməmmədova Yaqut Seyidməmməd", "--"));
        list.add(new About_Education_Entity("108", "Böyük Dəhnə kənd MKS 22 saylı filial", "Şəki rayonu Böyük Dəhnə kəndi", "Bəkirova Nərgiz Rəsul", "--"));
        list.add(new About_Education_Entity("109", "Suçma kənd MKS 23 saylı filial", "Şəki rayonu Suçma kəndi", "Əliyeva Səhər İsfəndiyar", "--"));
        list.add(new About_Education_Entity("110", "Şəki kənd MKS 25 saylı filial", "Şəki rayonu Şəki kəndi", "Həsənova Fəridə Həsən", "--"));
        list.add(new About_Education_Entity("111", "Aran kənd MKS 26 saylı filial", "Şəki rayonu Aran kəndi", "Nuhova Esmira Əsabəli", "--"));
        list.add(new About_Education_Entity("112", "Çayqaraqoyunlu kənd MKS 27 saylı filial", "Şəki rayonu Çayqaraqoyunlu kəndi", "Piriyeva Mahirə Nəzir", "--"));
        list.add(new About_Education_Entity("113", "Turan qəsəbə MKS 28 saylı filial", "Şəki rayonu Turan qəs.", "Məmmədov Səxavət Məmməd", "--"));
        list.add(new About_Education_Entity("114", "Qayabaşı kənd MKS 30 saylı filial", "Şəki rayonu Qayabaşı kəndi", "Kazımov Vasif Salman", "--"));
        list.add(new About_Education_Entity("115", "Qaratorpaq kənd MKS 32 saylı filial", "Şəki rayonu Qaratorpaq kəndi", "Hüseynov Sahib Qərib", "--"));
        list.add(new About_Education_Entity("116", "Cəyirli kənd MKS 33 saylı filial", "Şəki rayonu Cəyirli kəndi", "Qarayev Aftandil Qara", "--"));
        list.add(new About_Education_Entity("117", "Cəfərabad kənd MKS 35 saylı filial", "Şəki rayonu Cəfərabad kəndi", "Səmədova İradə Fərman", "--"));
        list.add(new About_Education_Entity("118", "Göybulaq kənd MKS 36 saylı filial", "Şəki rayonu Göybulaq kəndi", "Mustafayeva Əminə Sabir", "--"));
        list.add(new About_Education_Entity("119", "Aşağı Küngüt kənd MKS 38 saylı filial", "Şəki rayonu Aşağı Küngüt kəndi", "Həşimova Sevil Təvəkkül", "--"));
        list.add(new About_Education_Entity("120", "Fazıl kənd MKS 40 saylı filial", "Şəki rayonu Fazıl kəndi", "Qəhrəmanova Gülüstan Elçin", "--"));
        list.add(new About_Education_Entity("121", "İbrahimkənd MKS 41 saylı filial", "Şəki rayonu İbrahimkənd kəndi", "Yunusova Əsli Həşim", "--"));
        list.add(new About_Education_Entity("122", "Aydınbulaq kənd MKS 42 saylı filial", "Şəki rayonu Aydınbulaq kəndi", "Allahverdiyeva Xuraman Məhərrəm", "--"));
        list.add(new About_Education_Entity("123", "Şirinbulaq kənd MKS 44 saylı filial", "Şəki rayonu Şirinbulaq kəndi", "Səlimov Cəfər Aslan", "--"));
        list.add(new About_Education_Entity("124", "Aşağı Daşağıl kənd MKS 45 saylı filial", "Şəki rayonu Aşağı Daşağıl kəndi", "Səmədova Bənövşə Səməd", "--"));
        list.add(new About_Education_Entity("125", "Orta Zəyzid kənd MKS 46 saylı filial", "Şəki rayonu Orta Zəyzid kəndi", "Yusifova Gültəkin Əhməd", "--"));
        list.add(new About_Education_Entity("126", "Qırxbulaq kənd MKS 47 saylı filial", "Şəki rayonu Qırxbulaq kəndi", "Abdullayeva Məsafət Mabud", "--"));
        list.add(new About_Education_Entity("127", "Köbər Zəyzid kənd MKS 48 saylı filial", "Şəki rayonu Köbər Zəyzid kəndi", "Həmzətova Əmanət Sabir", "--"));
        list.add(new About_Education_Entity("128", "Baş Zəyzid kənd MKS 49 saylı filial", "Şəki rayonu Baş Zəyzid kəndi", "Müzəffərova Lalandər İsmayıl", "--"));
        list.add(new About_Education_Entity("129", "Baş Küngüt kənd MKS 51 saylı filial", "Şəki rayonu Baş Küngüt kəndi", "Kərimova Həqiqət Məmməd", "--"));
        list.add(new About_Education_Entity("130", "Bideyiz kənd MKS 52 saylı filial", "Şəki rayonu Bideyiz kəndi", "Məmmədova Pərvanə İsfəndiyar", "--"));
        list.add(new About_Education_Entity("131", "Oravan kənd MKS 53 saylı filial", "Şəki rayonu Oravan kəndi", "Qədirova Dilbər Əfkər", "--"));
        list.add(new About_Education_Entity("132", "Qoxmuq kənd MKS 55 saylı filial", "Şəki rayonu Qoxmuq kəndi", "Cəlilova Rəna Mürsəl", "--"));
        list.add(new About_Education_Entity("133", "Oxud kənd MKS 56 saylı filial", "Şəki rayonu Oxud kəndi", "Eminova Səlamət Şahid", "--"));
        list.add(new About_Education_Entity("134", "Baltalı kənd MKS 57 saylı filial", "Şəki rayonu Baltalı kəndi", "Paşayeva Şəhla Ramiz", "--"));
        list.add(new About_Education_Entity("135", "İnçə kənd MKS 58 saylı filial", "Şəki rayonu İnçə kəndi", "Nəbiyeva İrayə Həsən", "--"));
        list.add(new About_Education_Entity("136", "Baş Şabalıd kənd MKS 61 saylı filial", "Şəki rayonu Baş Şabalıd kəndi", "Mütəllibova Aybəniz Əyyub", "--"));
        list.add(new About_Education_Entity("137", "Baş Göynük kənd MKS 62 saylı filial", "Şəki rayonu Baş Göynük kəndi", "İsmayılov Mustafa İsmayıl", "--"));
        list.add(new About_Education_Entity("138", "Baş Layısqı kənd MKS 64 saylı filial", "Şəki rayonu Baş Layısqı kəndi", "Həmidova Əntiqə Əşrəf", "--"));
        list.add(new About_Education_Entity("139", "Şin kənd MKS 65 saylı filial", "Şəki rayonu Şin kəndi", "Məmmədov Fərrux Hacı", "--"));
        list.add(new About_Education_Entity("140", "Cunud kənd MKS 66 saylı filial", "Şəki rayonu Cunud kəndi", "İbrahimova Xəyalə Bayram", "--"));
        list.add(new About_Education_Entity("141", "Aşagı Göynük kənd MKS 67 saylı filial", "Şəki rayonu Aşagı Göynük kəndi", "Babayeva Nəcibə Yusif", "--"));
        list.add(new About_Education_Entity("142", "Aşağı Layısqı kənd MKS 68 saylı filial", "Şəki rayonu Aşağı Layısqı kəndi", "İbrahimova Kubra Rəsul", "--"));
        list.add(new About_Education_Entity("143", "II Biləcik kənd MKS 69 saylı filial", "Şəki rayonu Biləcik kəndi", "Talıbov Fəxrəddin Siracəddin", "--"));
        list.add(new About_Education_Entity("144", "I Biləcik kənd MKS 70 saylı filial", "Şəki rayonu I Biləcik kəndi", "Məmmədova Məkkə Hacı", "--"));
        list.add(new About_Education_Entity("145", "Baqqal kənd MKS 71 saylı filial", "Şəki rayonu Baqqal kəndi", "Bayramova Gülnarə Salman", "--"));
        list.add(new About_Education_Entity("146", "Daşüz kənd MKS 72 saylı filial", "Şəki rayonu Daşüz kəndi", "Seyidova Fəridə İlyas", "--"));
        list.add(new About_Education_Entity("147", "Küdürlü kənd MKS 73 saylı filial", "Şəki rayonu Küdürlü kəndi", "Xəlilova Qərənfil İzzət", "--"));
        list.add(new About_Education_Entity("148", "Çeşməli kənd MKS 74 saylı filial", "Şəki rayonu Çeşməli kəndi", "Mahmudova Nüşabə Mübariz", "--"));
        list.add(new About_Education_Entity("149", "Daşbulaq kənd MKS 76 saylı filial", "Şəki rayonu Daşbulaq kəndi", "Həsənova Nübar Əli", "--"));
        list.add(new About_Education_Entity("150", "Qudula kənd MKS 77 saylı filial", "Şəki rayonu Qudula kəndi", "Yusibova Ruziyyz Cuma", "--"));
        list.add(new About_Education_Entity("151", "Şorsu kənd MKS 78 saylı filial", "Şəki rayonu Şorsu kəndi", "Abdullayev Səbuhi Fətəli", "--"));
        list.add(new About_Education_Entity("152", "Cumaykənd MKS 79 saylı filial", "Şəki rayonu Cumaykənd kəndi", "Mazanova Mirvari Abdulxalıq", "--"));
        list.add(new About_Education_Entity("153", "Qaradağlı kənd MKS 82 saylı filial", "Şəki rayonu Qaradağlı kəndi", "Məmmədova Zinyət Göyüş", "--"));
        list.add(new About_Education_Entity("154", "Qumux kənd MKS 83 saylı filial", "Şəki rayonu Qumux kəndi", "Əzizov Elçin Rəcəb", "--"));

        About_Education_Adapter adapter = new About_Education_Adapter(this.getActivity(), list);
        listView.setAdapter(adapter);

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        getView().setFocusableInTouchMode(true);
        getView().requestFocus();
        getView().setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                if (event.getAction() == KeyEvent.ACTION_UP && keyCode == KeyEvent.KEYCODE_BACK) {
                    about_main_page = new About_Main_Page();
                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, about_main_page);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();


                    return true;

                }

                return false;
            }
        });
    }

}
