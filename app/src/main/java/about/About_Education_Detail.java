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
public class About_Education_Detail extends Fragment {

    //ListView listViewKindergarten;
    private FragmentTransaction fragmentTransaction;
    private About_Main_Page about_main_page;

    public About_Education_Detail() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.sheki_about__education__detail, container, false);
        ListView listView = (ListView) view.findViewById(R.id.listViewEducation);
        //listViewKindergarten = (ListView) view.findViewById(R.id.listViewKindergarten);

        List<About_Education_Entity> list = new ArrayList<>();

        list.add(new About_Education_Entity("1", "Şəhər 1 №-li tam o/m", "Şəki şəhəri, Vidadi küç № 65", "Cabbarova Tahirə Mustafa", "4-23-16"));
        list.add(new About_Education_Entity("2", "Şəhər 2 №-li tam o/m", "Şəki şəhəri F.Xoyski küç 4", "Mustafayeva Tamella  Yusif", "4-23-26"));
        list.add(new About_Education_Entity("3", "Şəhər 3 №-li tam o/m", "Şəki şəhəri M.F.Axundov №132", "Baxışov Bünyamin Təmraz", "4-23-36"));
        list.add(new About_Education_Entity("4", "Şəhər 4 №-li tam o/m", "Şəki şəhəri 6-cı rn.Pişnamazzadə küç № 1", "Məmmədova İradə Fikrət", "4-24-46"));
        list.add(new About_Education_Entity("5", "Şəhər 5 №-li tam o/m", "Şəki şəhər Füzuli küç № 4", "İbrahimova Filyar Oruc", "4-23-86"));
        list.add(new About_Education_Entity("6", "Şəhər 6 №-li tam o/m", "Şəki ş.Qurdlar mə-si. 27-ci rn.h.Sarabski küç №1", "Mustafayev Rafik Qaffar", "0442770185"));
        list.add(new About_Education_Entity("7", "Şəhər 7 №-li tam o/m", "Şəki şəhəri M.Rəsulzadə № 283", "Xəlilov Bəkir Xəlil", "6-05-13"));
        list.add(new About_Education_Entity("8", "Şəhər 8 №-li tam o/m", "Şəki şəhəri S.Rəhman küç. № 7", "Ələsgərli Səttar Sabir", "4-44-89"));
        list.add(new About_Education_Entity("9", "Şəhər 9 №-li tam o/m", "Şəki şəhər M.P.Vaqif küç, № 4", "Abdullayeva İntizar Oktay", "6-09-62"));
        list.add(new About_Education_Entity("10", "Şəhər 10 №-li tam o/m", "Şəki şəhər H.Əliyev pr № 83", "Yusifov Abid Abdulla", "4-23-68\n044-277-10-55"));
        list.add(new About_Education_Entity("11", "Şəhər 11 №-li tam o/m", "Şəki şəhəri B.Məmmədov № 1", "Sədiyeva Ədalət Malik", "4-74-42"));
        list.add(new About_Education_Entity("12", "Şəhər 12 №-li tam o/m", "Şəki şəhər N.Nərimanov küç № 156", "Hümmətova Türabə Musa", "4-75-63"));
        list.add(new About_Education_Entity("13", "Şəhər 14 №-li tam o/m", "Şəki şəhəri M.Ə.Rəsulzadə küç № 295 a", "Abdullayeva İradə Məmməd", "6-01-47"));
        list.add(new About_Education_Entity("14", "Şəhər 17 №-li tam o/m", "Şəki şəhəri A.Əfəndiyev  № 20", "Mustafayev Elman  Abduləli", "5-04-98"));
        list.add(new About_Education_Entity("15", "Şəhər 18 №-li tam o/m", "Şəki şəhəri M.Ə.Rəsulzadə küç. № 154", "Mahmudov Məmməd Məmmədiyə", "4-23-76"));
        list.add(new About_Education_Entity("16", "Şəhər 19 №-li tam o/m", "Şəki şəhəri M.Cəbrayılov № 10", "Hüseynova Ulduz Fərrux", "4-22-66"));
        list.add(new About_Education_Entity("17", "Şəhər 20 №-li tam o/m", "Şəki şəhəri 25-ci rayon D.Bünyadzadə, №7", "Qurbanov Səbuhi Yusif", "4-74-76"));
        list.add(new About_Education_Entity("18", "Şəhər 21 №-li tam o/m", "Şəki şəhəri Oğuz şossesi Şəki MMC-binasına bitişik", "Sadıqov Eldəniz  Mövlüd", "5-13-76"));
        list.add(new About_Education_Entity("19", "Şəki Şəhər liseyi", "Şəki şəhəri 20 yanvar küç № 127", "Məmmədov Firqət Siracəddin", "4-59-97\n4-56-63"));
        list.add(new About_Education_Entity("20", "Şəki Şəhər internat məktəbi", "Şəki şəhəri M.F.Axundov pr № 164", "İbadullayeva Nurlana Rizvan", "4-24-14"));
        list.add(new About_Education_Entity("21", "Turan qəsəbə tam o/m", "Şəki rayonu Turan qəsəbəsi", "Yusifov Baba Abdulla", "71-3-81"));
        list.add(new About_Education_Entity("22", "Aşağı Layısqı kənd tam o/m", "Şəki rayonu Aşağı Layısqı kəndi", "Məmmədli Fərrux Əhməd", "96-1-17"));
        list.add(new About_Education_Entity("23", "Aşağı Göynük kənd tam o/m", "Şəki rayonu Aşağı Göynük kəndi", "Mahmudov Cahangir Əli", "96-1-85\n96-2-18"));
        list.add(new About_Education_Entity("24", "Aşağı Küngüt kənd tam o/m", "Şəki rayonu Aşağı Küngüt kəndi", "Yunusov Oktay Qinyaz", "91-1-46"));
        list.add(new About_Education_Entity("25", "Aydınbulaq kənd tam o/m", "Şəki rayonu Aydınbulaq kəndi", "Vəliyev Elçin Nazim", "39-2-36"));
        list.add(new About_Education_Entity("26", "I Biləcik kənd tam o/m", "Şəki rayonu I Biləcik kəndi", "Həsənova Tahirə M.Əli", "99-1-50"));
        list.add(new About_Education_Entity("27", "II Biləcik kənd tam o/m", "Şəki rayonu II Biləcik kəndi", "Aslanov Etibar Müslüm", "99-1-33"));
        list.add(new About_Education_Entity("28", "Baş Küngüt kənd tam o/m", "Şəki rayonu Baş Küngüt kəndi", "Bayramov Kamal Sərkər", "73-1-34"));
        list.add(new About_Education_Entity("29", "Baş Şabalıd kənd tam o/m", "Şəki rayonu Baş Şabalıd kəndi", "Səlimov Səlim Yaqub", "92-1-84"));
        list.add(new About_Education_Entity("30", "Baş Zəyzid kənd tam o/m", "Şəki rayonu Baş Zəyzid kəndi", "Salamov Söhbət Məmməd", "95-1-40"));
        list.add(new About_Education_Entity("31", "Baş Layısqı kənd tam o/m", "Şəki rayonu Baş Layısqı kəndi", "Mikayılov İmran Musa", "93-1-43"));
        list.add(new About_Education_Entity("32", "Baş Göynük kənd  1 №-li tam o/m", "Şəki rayonu Baş Göynük kəndi", "İbrahimov Sadəddin Salam", "92-1-83"));
        list.add(new About_Education_Entity("33", "Baş Göynük kənd 2 №-li tam o/m", "Şəki rayon Baş Göynük kəndi", "Hüseynəliyev  Möhlüd Kərim", "92-1-38"));
        list.add(new About_Education_Entity("34", "Böyük Dəhnə kənd 1 №-li tam o/m", "Şəki rayonu Böyük Dəhnə kəndi", "Sofiyev Natiq Qoşqar", "36-1-86"));
        list.add(new About_Education_Entity("35", "Böyük Dəhnə kənd 2 №-li tam o/m", "Şəki rayonu Böyük Dəhnə kəndi", "Ağabəyov Xanlar Həsrət", "37-00-8"));
        list.add(new About_Education_Entity("36", "Baltalı kənd tam o/m", "Şəki rayonu Baltalı kəndi", "İbrahimov Namiq Seydi", "31-1-90"));
        list.add(new About_Education_Entity("37", "Bolludərə tam o/m", "Şəki rayonu Bolludərə kəndi", "İbrahimov Ədalət  Həsən", "--"));
        list.add(new About_Education_Entity("38", "Bideyiz kənd tam o/m", "Şəki rayonu Bideyiz kəndi", "Alxasov Pənah Tağı", "74-2-20"));
        list.add(new About_Education_Entity("39", "Cəyirli kənd tam o/m", "Şəki rayonu Cəyirli kəndi ", "Rzayev Altay Oktay", "77-3-31"));
        list.add(new About_Education_Entity("40", "Cəfərabad kənd tam o/m", "Şəki rayonu Cəfərabad kəndi", "Gülalıyev Gülalı Nuralı", "38-1-22"));
        list.add(new About_Education_Entity("41", "Cumakənd tam o/m", "Şəki rayonu Cumakənd kəndi", "Süleymanov Vaqif Həsən", "75-1-35"));
        list.add(new About_Education_Entity("42", "Cunud  kənd tam o/m", "Şəki rayonu Cunud  kəndi", "Salmanov Ziyədxan Murtuz", "93-1-62"));
        list.add(new About_Education_Entity("43", "Çayqaraqoyunlu kənd tam o/m", "Şəki rayonu Çayqaraqoyunlu kəndi", "Məmmədov Ramiz Ənvər", "71-2-41"));
        list.add(new About_Education_Entity("44", "Çələbixan qəsəbə tam o/m", "Şəki rayonu Çələbixan qəsəbəsi", "Əzizov Rəşid Ənvər", "38-3-04"));
        list.add(new About_Education_Entity("45", "Çeşməli kənd tam o/m", "Şəki rayonu Çeşməli kəndi", "Xasiyeva Ziyafət Mustafa", "--"));
        list.add(new About_Education_Entity("46", "Daşüz kənd tam o/m", "Şəki rayonu Daşüz kəndi", "Hüseynova Anjelixa Abbas", "32-2-58"));
        list.add(new About_Education_Entity("47", "Dərəcənnət kənd tam o/m ", "Şə49ki rayonu Dərəcənnət kəndi", "Musazadə Daşdəmir Hacı", "26-1-30"));
        list.add(new About_Education_Entity("48", "İnçə Zunud kənd tam o/m", "Şəki rayonu İnçə Zunud kəndi", "Məhərrəmov Məhərrəm Əsabəli", "34-1-37"));
        list.add(new About_Education_Entity("49", "İbrahimkənd tam o/m", "Şəki rayonu İbrahimkənd kəndi ", "Yunusov Ramiz Tapdıq", "91-1-12"));
        list.add(new About_Education_Entity("50", "Kiş kənd 1 №-li tam o/m", "Şəki rayonu Kiş kəndi ", "Qarayev Elçin Müzəkkir", "98-8-44"));
        list.add(new About_Education_Entity("51", "Kiş kənd 2 №-li tam o/ m", "Şəki rayonu Kiş kəndi", "Mahmudova  Lalə Sabir", "98-5-77"));
        list.add(new About_Education_Entity("52", "Kiş kənd 4 №- li tam o/m", "Şəki rayonu Kiş kəndi", "İlyasov Vüsal Xan", "98-1-45"));
        list.add(new About_Education_Entity("53", "Kiçik Dəhnə kənd 1№ li tam o/m", "Şəki rayonu Kiçik Dəhnə kəndi", "İbadullayev Fazil İsmayıl", "35-1-21"));
        list.add(new About_Education_Entity("54", "Kiçik Dəhnə kənd 2№ li tam o/m", "Şəki rayonu Kiçik Dəhnə kəndi", "Qədirov Qurban M.Rəsul", "35-1-47"));
        list.add(new About_Education_Entity("55", "Köbər Zəyzid kənd tam o/m", "Şəki rayonu Köbər Zəyzid kəndi", "İsmayılova Sovqat Abdulla", "442771053"));
        list.add(new About_Education_Entity("56", " Oxud kənd tam o/m", "Şəki rayon Oxud kəndi", "Abdullayerv Ülfət Qəni", "30.01.1935"));
        list.add(new About_Education_Entity("57", "Köndələn kənd tam o/m", "Şəki rayonu Aşağı Göynük kənd", "Mahmudov Abdulla Paşa", "96-2-61"));
        list.add(new About_Education_Entity("58", "Qayabaşı kənd tam o/m", "Şəki rayonu Qayabaşı kəndi", "Hümmətov Qasım Ramiz", "78-2-79"));
        list.add(new About_Education_Entity("59", "Qayabaşı kənd tam o/m", "Şəki rayonu Qayabaşı kəndi", "Hümmətov Qasım Ramiz", "78-2-79"));
        list.add(new About_Education_Entity("60", "Qaratorpaq kənd tam o/m", "Şəki rayonu Qaratorpaq kəndi", "Həsənov  Həsən Yəhya", "--"));
        list.add(new About_Education_Entity("61", "Qozlubulaq kənd tam o/m", "Şəki rayonu Qozlubulaq kəndi", "Abbasov Novruzəli Xudaverdi", "77-1-01"));
        list.add(new About_Education_Entity("62", "Qoxmuq kənd tam o/m", "Şəki rayonu Qoxmuq kəndi", "Daşdəmirov Umudvar  Mürsıl", "4-53-07"));
        list.add(new About_Education_Entity("63", "Qudula kənd tam o/m", "Şəki rayonu Qudula kəndi", "Məmədov Şahid Zahid", "97-1-17"));
        list.add(new About_Education_Entity("64", "Qumux kənd tam o/m", "Şəki rayonu Qumux kəndi", "Cumayev Vüqar Zaməddin", "93-1-27"));
        list.add(new About_Education_Entity("65", "Orta Zəyzid kənd 1№ - li tam o/m", "Şəki rayonu Orta Zəyzid kəndi", "Rəsulov Əli Allahverdi", "94-1-25"));
        list.add(new About_Education_Entity("66", "Orta Zəyzid kənd 2№ - li tam o/m", "Şəki rayonu Orta Zəyzid kəndi", "Əhmədov Ələddin Nizaməddin", "94-3-91"));
        list.add(new About_Education_Entity("67", "Sarıca kənd tam o/m", "Şəki rayonu Sarıca kəndi", "İsmayılov Emin Abbasəli", "78-2-76"));
        list.add(new About_Education_Entity("68", "Suçma kənd tam o/m", "Şəki rayonu Suçma kənd", "Abdurahmanov Alxas  Nizaməddin", "37-1-31"));
        list.add(new About_Education_Entity("69", "Şəki kənd tam o/m", "Şəki rayonu Şəki kəndi", "Şadmanov Dağbəyi  Şadman", "33-2-46"));
        list.add(new About_Education_Entity("70", "Şorsu kənd tam o/m", "Şəki rayonu Şorsu kəndi", "Ağaniyev Cəfər  Quzu", "72-1-40"));
        list.add(new About_Education_Entity("71", "Şin kənd tam o/m", "Şəki rayonu Şin kəndi", "İsmayılov Əfəndi  Mehdi", "93-1-64"));
        list.add(new About_Education_Entity("72", "Vərəzət kənd tam o/m", "Şəki rayonu Vərəzət kəndi", "Məmmədov Ələkrəm Məmmədiyə", "95-1-90"));
        list.add(new About_Education_Entity("73", "Aşağı Şabalıd kənd üm.o/m", "Şəki rayon Aşağı Şabalıd kəndi", "Mustafayev Mahir Mustafa", "34-1-11"));
        list.add(new About_Education_Entity("74", "Aşağı Daşağıl kənd üm.o/m", "Şəki rayonu Aşağı Daşağıl kəndi", "Məmmədov Arif  Təmraz", "--"));
        list.add(new About_Education_Entity("75", "Aran kənd üm. o/m", "Şəki rayonu Aran kəndi", "Məmmədov Şahin Nurəddin", "33-2-71"));
        list.add(new About_Education_Entity("76", "Baş Kəldək kənd üm. o/m", "Şəki rayonu Baş Kəldək kəndi", "Musayev Nurəli Məcid", "90-4-87"));
        list.add(new About_Education_Entity("77", "Babaratma kənd üm. o/m", "Şəki rayonu  Babaratma kəndi", "Səfərov İmran Səfər", "--"));
        list.add(new About_Education_Entity("78", "Baqqal kənd üm. o/m", "Şəki rayonu Baqqal kəndi ", "Səmədov Niymət Əyyub", "99-1-35"));
        list.add(new About_Education_Entity("79", "Çapağan kənd üm. o/m", "Şəki rayonu Çapağan kəndi", "Hacıağayeva Gülarə Şiraslan", "91-1-17"));
        list.add(new About_Education_Entity("80", "Daşbulaq kənd üm. o/m", "Şəki rayonu Daşbulaq kəndi", "Yusifov Bəşir Məhyəddin", "76-2-27"));
        list.add(new About_Education_Entity("81", "Dəryaçay kənd üm. o/m", "Şəki rayonu Dəryaçay  kəndi", "İsmayılov Miçurin Məmməd", "92-5-37"));
        list.add(new About_Education_Entity("82", "Əliyar kənd  üm. o/m", "Şəki rayonu Əliyar kəndi", "Vəliyev Samir Yusif", "39-2-78"));
        list.add(new About_Education_Entity("83", "Fazıl kənd üm. o/m", "Şəki rayonu Fazıl kəndi", " Məmmədov Fikrət Müslüm", "91-1-29"));
        list.add(new About_Education_Entity("84", "Göybulaq kənd üm. o/m", "Şəki rayonu Göybulaq kəndi", "Əyyubov Məhəmməd İslam", "38-1-70"));
        list.add(new About_Education_Entity("85", "Küdürlü kənd üm. o/m", "Şəki rayonu Küdürlü kəndi", " Çələbiyev Mehrabi  Nuralı", "442770554"));
        list.add(new About_Education_Entity("86", "Qaradağlı kənd üm. o/m", "Şəki rayonu  Qaradağlı kəndi", "Xudiyev Əlyar Köçəri", "97-2-20"));
        list.add(new About_Education_Entity("87", "Qırxbulaq kənd ü m.o/m", "Şəki rayonu Qırxbulaq kəndi", "Həsənov Əsabəli İbrahim", "86-6-32"));
        list.add(new About_Education_Entity("88", "Oxud kənd üm. o/m", "Şəki rayonu Oxud kəndi", "Məsimov Mahir Tahir", "--"));
        list.add(new About_Education_Entity("89", "Vərəzət kənd köçkünlər üm. o/m", "Şəki rayonu Vərəzət kəndi ", "Səfərov Tariyel Cəfərqulu", "--"));
        list.add(new About_Education_Entity("90", "Yeni Göynük üm. o/m", "Şəki rayonu Baş Göynük kəndi", "Vəliyeva Aysel Kamil", "92-5-92"));
        list.add(new About_Education_Entity("91", "Öryət kənd üm. o/m", "Şəki rayonu Öryət kəndi", "Əhmədov Fikrət  Hacı", "--"));
        list.add(new About_Education_Entity("92", "Təpəcənnət kənd üm. o/m", "Şəki rayonu Təpəcənnət kəndi", "Mustafayev Musa İslam", "--"));
        list.add(new About_Education_Entity("93", "Şirinbulaq kənd üm. o/m", "Şəki rayonu Şirinbulaq kəndi", "Səlimov Yolçu Hasil", "5-84-27"));
        list.add(new About_Education_Entity("94", "Selbasan kənd üm. o/m", "Şəki rayonu Aşağı Göynük kəndi ", "İbrahimova Sevil İbrahim", "96-4-71"));
        list.add(new About_Education_Entity("95", "Aşağı Göynük kənd ib/m", "Şəki rayonu Aşağı Göynük kənd", "İlyasova Hicran Musa", "--"));
        list.add(new About_Education_Entity("96", "Baş Küngüt  kənd köç ib/m", "Şəki rayonu Baş Küngüt  kənd", "Zeynalova Vəfa Səməd", "--"));
        list.add(new About_Education_Entity("97", "Kiş kənd 3 №- li ib/m", "Şəki rayonu Kiş kəndi ", "Feyzullayeva Şəlalə Çingiz", "--"));
        list.add(new About_Education_Entity("98", "Salmandərə kənd ib/m", "Şəki rayonu Cumakənd\n, Salmandərə kəndləri", "Məsimov Tapdıq Qədir", "98-1-19"));

        list.add(new About_Education_Entity("", "", " Şəki rayonu məktəbəqədər təhsil müəssisələri haqqında\n" + "MƏLUMAT", "", ""));
      //  list.add(new About_Education_Entity("Şəki rayonu məktəbəqədər təhsil müəssisələri haqqında\n" +"MƏLUMAT"));
        list.add(new About_Education_Entity("1", "Uşaq evi", "Şəki ş-ri Gənclər 21", "Məmmədova İlhamə Tofiq", "4-24-48"));
        list.add(new About_Education_Entity("2","1 saylı u/b","Dəmirçi bulağı məh.F.Xoyiski pr.","Məmmədova Şərafət Əlyəsər","4-39-52"));
        list.add(new About_Education_Entity("3","2 saylı u/b","Vidadi 25","Şirinzadə Səadət  Hikmət","4-22-88"));
        list.add(new About_Education_Entity("4","3 saylı u/b","Ə.Haqverdiyev","Qaflanova Nübar Elçin","4-47-48"));
        list.add(new About_Education_Entity("5","4saylı u/b","Duluzlar məh.  M.Ə.Rəsulzadə 266","Nemətova Rəna Məmmədəli","6-05-34"));
        list.add(new About_Education_Entity("6","5 saylı u/b","Fətəli  məh. 32-ci r n.. №16 ","Mahmudova Aygün Məmməd","4-24-76"));
        list.add(new About_Education_Entity("7","6 saylı u/b","Qullar məh.Vidadi 45","Rəhimova Mətanət Nizami","4-47-76"));
        list.add(new About_Education_Entity("8","7 saylı u/b","Dodu məh.Tolostoy küç.4","Əsgərova Rəna Əliağa","6-11-98"));
        list.add(new About_Education_Entity("9","8 saylı u/b","Yuxarıbaş məhəlləsi, M.Hüseynzadə 6","Ələkbərova Rəna Rza","4-48-70"));
        list.add(new About_Education_Entity("10", "9 saylı u/b", "Dağdibi məh. Ruhulla Axundov 5", "Əhmədova Səmayə Abdulla", "4-74-43"));
        list.add(new About_Education_Entity("11","14 saylı u/b k/evi","Toqqarağac məhəlləsi M.Rəsulzadə","Mənəfova Güllər Rauf","4-74-41"));
        list.add(new About_Education_Entity("12","10 saylı u/b k/evi","Əsirlər məhələsi S.Rəhman 10","Məmmədova Həqiqət Murad","4-28-11"));
        list.add(new About_Education_Entity("13","11 saylı u/b","20-cirn.V.Səlimov 40,Sarıtorpaq məh.","Haqverdiyeva Elmira Məmməd","4-22-18"));
        list.add(new About_Education_Entity("14","15 saylı u/b"," Gəncəli məhəlləsi M.Maqamayev 61","Qaffarova Bilqeyis Məmmədiyə","4-17-22"));
        list.add(new About_Education_Entity("15","16 saylı u/b","Bağbanlar küç.47","Məhərrəmova Mətanət Ab.cəlil","4-82-11"));
        list.add(new About_Education_Entity("16","17 saylı u/b","Dəyirmanarxı məhəlləsi .20 Yanvar 50","Məmmədova Həqiqət Məmmədrəsul","4-25-38"));
        list.add(new About_Education_Entity("17","18 saylı u/b"," F.Xoyiski Dolmabağçalar 4/3","Nəbiyeva Məhəbbət Məmməd","6-04-54"));
        list.add(new About_Education_Entity("18","19 saylı u/b-k/e","Şərbablar məh.Calğalıbulaq küç.","Xəlilova Yeganə İzzət","4-90-71"));
        list.add(new About_Education_Entity("19","20 saylı u/b","19-cu rayon M.Rəsulzadə","Sərkərova Naimə Ağabala","6-01-76"));
        list.add(new About_Education_Entity("20","21 saylı u/b","M.Rəsulzadə 145 blok 3, 1 mərtəbə","Hüseynova Təranə Nuru","4-21-31"));
        list.add(new About_Education_Entity("21","22 saylı u/b-k/e"," Calğalıbulaq, M.Şərif Həmidov 1","Mahmudova Ruziyə Şaban","4-24-78"));
        list.add(new About_Education_Entity("22","23 saylı u/b","Dağdibi məh.Muxtar Hacıyev 5","Qəniyeva Vüsalə Məmiş","5-07-03"));
        list.add(new About_Education_Entity("23","24 saylı u/b","Şəhriyar 49, Şərbablar küç.","İbrahimova Bəsdə Hacı","4-27-78"));
        list.add(new About_Education_Entity("24","25 saylı u/b","M.Rəsulzadə 80, Cələbixan məhəlləsi","Bahəddinova Gülnaz Sadəddin","4-65-80"));
        list.add(new About_Education_Entity("25","26 saylı u/b","Qurdlar məhəlləsi M.Rəsulzadə dal 1","Əkbərova Sevda Cəmaləddin","5-14-22"));
        list.add(new About_Education_Entity("26","27 saylı u/b","Nakam küç ev 6","Əmiraslanova Arzu Damət","4-22-14"));
        list.add(new About_Education_Entity("27","28 saylı u/b-k/e","31 rayon M.Cəbrayılov 6","Süleymanova Mətanət Əliabbas","4-25-16"));
        list.add(new About_Education_Entity("28","29 saylı u/b","Calğalıbulaq məhəlləsi 44","Hümmətova Xuraman Baxtı","4-36-23"));
        list.add(new About_Education_Entity("29","30 saylı u/b","Oğuz şossesi Olimpiya məhəlləsi","İsmayuılova Hicran Hüseynbala","--"));
        list.add(new About_Education_Entity("30","Oxud kənd u/b","Oxud kəndi","Hümmətova  Rüxsarə  Şövkət","--"));
        list.add(new About_Education_Entity("31","Qoxmuq kənd u/b","Qoxmuq kəndi","Hacıosmanova Könül Əliosman","4-71-23"));
        list.add(new About_Education_Entity("32","İnçə kənd u/b","İnçə kəndi","Əliyeva Mətanət Niyazı","34-1-93"));
        list.add(new About_Education_Entity("33","Baltalı kənd u/b","Baltalı kəndi","Məmmədova Nargilə Seydi","31-1-98"));
        list.add(new About_Education_Entity("34","A.Göynük kənd u/b-k/e","A.Göynük kəndi","Hümmətova Əminə Mürsəl","--"));
        list.add(new About_Education_Entity("35","Selbasan kənd u/b","Selbasan kəndi","Qasımova Günel Nəriman","--"));
        list.add(new About_Education_Entity("36","B.Layısqı kənd u/b-kör.evi","B.Layısqı kəndi","XəlilovaTelli Bəxtiyar","--"));
        list.add(new About_Education_Entity("37","Şin kənd u/b","Şin kəndi","Hümmətova Sümayə Əsgər","--"));
        list.add(new About_Education_Entity("38","B.Göynük kənd u/b-k/e","B.Göynük kəndi","Səlimova Şərqiyə Yaqub","--"));
        list.add(new About_Education_Entity("39","Cumakənd kənd u/b kör.evi","Cumakənd kəndi","Mirzəyeva Məryəm Baxtı","--"));
        list.add(new About_Education_Entity("40","Şorsu kənd u/b","Şorsu kəndi","Hacıəliyeva Şahnaz İsgəndər","--"));
        list.add(new About_Education_Entity("41","Daşbulaq kənd u/b","Daşbulaq kəndi","Əliyeva Bənövşə Ramiz","76-2-13"));
        list.add(new About_Education_Entity("42","Daşüz kənd u/b","Daşüz kəndi","Abdullayeva Afaq Həsən","--"));
        list.add(new About_Education_Entity("43","Çələbixan qəsəbə u/b","Çələbixan qəsəbəsi","Cabbarova Leyla Sahib","--"));
        list.add(new About_Education_Entity("44","Göybulaq kənd u/b","Göybulaq kəndi","Məmmədova Firuzə  Ələkbər","--"));
        list.add(new About_Education_Entity("45","Cəfərabad kənd u/b-k/e","Cəfərabad kəndi","Nəbiyeva Firəngiz Abduləli","38-1-61"));
        list.add(new About_Education_Entity("46","K.Dəhnə kənd u/b","K.Dəhnə kəndi","Mustafayeva Səqiyə Paşa","--"));
        list.add(new About_Education_Entity("47","B.Dəhnə kənd u/b- kör.evi","B.Dəhnə kəndi","Qarayeva Gülbəniz Nurqələm","--"));
        list.add(new About_Education_Entity("48","Aran kənd u/b","Aran kəndi","Yusifova Yeganə Murad","--"));
        list.add(new About_Education_Entity("49","Şəki kənd u/b- kör.evi","Şəki kəndi","Bağırova Sevda Bəhmən","--"));
        list.add(new About_Education_Entity("50","Turan qəsəbə u/b","Turan qəsəbəsi","Mövlamova Xalidə İsmayıl","--"));
        list.add(new About_Education_Entity("51","Cəyirli kənd u/b-k/e","Cəyirli kəndi","Əliyeva Gülyaz Əliquzu","--"));
        list.add(new About_Education_Entity("52","Qayabaşı kənd u/b","Qayabaşı kəndi","Səfərova Raifə Həmid","--"));
        list.add(new About_Education_Entity("53","Sarıca kənd u/b","Sarıca kəndi","Hüseynova Gülcöhrə Oruc","--"));
        list.add(new About_Education_Entity("54","Bolludərə kənd u/b","Bolludərə kəndi","Məmmədova Qənimət Əziz","--"));
        list.add(new About_Education_Entity("55","Qaratorpaq kənd u/b- kör.evi","Qaratorpaq kəndi","Hüseynova Bənövşə İbrahim","--"));
        list.add(new About_Education_Entity("56","Aydınbulaq kənd u/b- kör.evi","Aydınbulaq kəndi","Bağırova Şərqiyyə Cavanşir","--"));
        list.add(new About_Education_Entity("57","Öryət kənd u/b","Öryət kəndi","İmamverdiyeva  Şəfəq Söhrab","--"));
        list.add(new About_Education_Entity("58","B.Zəyzid kənd u/b","B.Zəyzid kəndi","İsmayılova  Hicran Nurəddin","--"));
        list.add(new About_Education_Entity("59","Çeşməli kənd u/b","Çeşməli kəndi","Abdulkərimova Afət Abdulkərim","--"));
        list.add(new About_Education_Entity("60","A.Küngüt kənd u/b","A.Küngüt kəndi","İsayeva Aygün Ramiz ","91-1-81"));
        list.add(new About_Education_Entity("61","O.Zəyzid. kənd u/b","O.Zəyzid. kəndi","Yusifova Heyran Əhməd","94-5-60"));
        list.add(new About_Education_Entity("62","Kiş kənd u/b-k/e","Kiş kəndi","Paşayeva Təranə Xalid qızı","98-2-57"));

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
