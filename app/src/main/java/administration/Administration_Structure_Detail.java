package administration;


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
public class Administration_Structure_Detail extends Fragment {

    private FragmentTransaction fragmentTransaction;

    public Administration_Structure_Detail() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.sheki_administration__structure__detail, container, false);
        ListView listView = (ListView) view.findViewById(R.id.listViewStructure);
        List<Administration_Structure_Entity> list = new ArrayList<>();
        list.add(new Administration_Structure_Entity("", "RƏHBƏRLİK", ""));
        list.add(new Administration_Structure_Entity("İcra hakimiyyətinin başçısı", "Usubov Elxan Zabir", "244-33-23"));
        list.add(new Administration_Structure_Entity("Başçının birinci müavini", "Həsənov Həsən Yusub", "244-82-81"));
        list.add(new Administration_Structure_Entity("Başçının müavini – Şəhər təsərrüfatı şöbəsinin müdiri", "--", "244-37-24"));
        list.add(new Administration_Structure_Entity("Başçının müavini – Sosial-iqtisadi inkişafın təhlili və proqnozlaşdırılması şöbəsinin müdiri", "Əliyev Firon Bəxtiyar", "244-00-46"));
        list.add(new Administration_Structure_Entity("Başçının müavini – İctimai-siyasi və hümanitar məsələlər şöbəsinin müdiri", "Cavadova Zərinə Əliəkbər", "244-00-62"));
        list.add(new Administration_Structure_Entity("Sektor müdiri – baş mühasib", "Abbasov Qalib Nizami", "244-37-22"));
        list.add(new Administration_Structure_Entity("Başçının köməkçisi", "Vəliyev Ziya Nazim", "244-33-23"));
        list.add(new Administration_Structure_Entity("Böyük məsləhətçi – Yetkinlik yaşına çatmayanların işləri və hüquqlarının müdafiəsi üzrə komissiyanın məsul katibi", "Səlimov Mayis Davud", "244-37-05"));
        list.add(new Administration_Structure_Entity("Aparıcı məsləhətçi - Yetkinlik yaşına çatmayanların işləri və hüquqlarının müdafiəsi üzrə komissiyanın uşaqlarla iş üzrə - məsləhətçi psixoloqu", " Bəkirova Xəyalə Mehman", "244-37-05"));
        list.add(new Administration_Structure_Entity("Aparıcı məsləhətçi - Yetkinlik yaşına çatmayanların işləri və hüquqlarının müdafiəsi üzrə komissiyanın uşaqlarla iş üzrə - məsləhətçi psixoloqu", " Bəkirova Xəyalə Mehman", "244-37-05"));
        list.add(new Administration_Structure_Entity("Baş mütəxəssis", "Allahverdiyev Mehman Məmmədemin", "--"));
        //İnformasiya təminatı və təhlil sektoru
        list.add(new Administration_Structure_Entity("", "İNFORMASİYA TƏMİNATI və TƏHLİLİ SEKTORU", ""));
        list.add(new Administration_Structure_Entity("Sektor müdiri", "Məhərrəmli Azər İbadullah", "244-03-17"));
        list.add(new Administration_Structure_Entity("Aparıcı məsləhətçi", "Əliəkbərov Valeh Ziyad", "244-20-50"));
        //Ərazi idarəetmə və yerli özünüidarəetmə orqanları ilə iş şöbəsi
        list.add(new Administration_Structure_Entity("", "ƏRAZİ İDARƏETMƏ və YERLİ ÖZÜNÜİDARƏETMƏ ORQANLARI ilə İŞ ŞÖBƏSİ", ""));
        list.add(new Administration_Structure_Entity("Şöbə müdiri", "Mənəfov Rəfail Cəfər", "244-37-75"));
        list.add(new Administration_Structure_Entity("Baş məsləhətçi", "İsmayılov Tərlan Əbdürəhim", "244-26-54"));
        list.add(new Administration_Structure_Entity("Böyük məsləhətçi", "İlyasov Səbuhi Bəlqiyas", "244-25-10"));
        //Hüquq şöbəsi
        list.add(new Administration_Structure_Entity("", "HÜQUQ ŞÖBƏSİ", ""));
        list.add(new Administration_Structure_Entity("Şöbə müdiri", "Bəşirov Əhmədiyə İdris", "244-32-27"));
        list.add(new Administration_Structure_Entity("Məsləhətçi", "İranpur İlahə Fikirət", "244-29-80"));
        list.add(new Administration_Structure_Entity("Məsləhətçi", "Hacı-ağayev Ramil Şirəli", "244-29-80"));
        //İctimai-siyasi və hümanitar məsələlər şöbəsi
        list.add(new Administration_Structure_Entity("", "İCTİMAİ-SİYASİ və HUMANİTAR MƏSƏLƏLƏR ŞÖBƏSİ", ""));
        list.add(new Administration_Structure_Entity("Şöbə müdirinin müavini - dini qurumlarla işin təşkilatçısı", "Yusifov Sadiq Nütfəli", "244-25-44"));
        list.add(new Administration_Structure_Entity("Baş məsləhətçi", "Əzimova Günəş Qurtuluş", "244-25-94"));
        list.add(new Administration_Structure_Entity("Baş məsləhətçi", "Hüseynov Nihat Rəcəb", "244-08-79"));
        list.add(new Administration_Structure_Entity("Baş məsləhətçi", "Salamov Təbriz Əsabəli", "244-25-94"));
        //Sosial-iqtisadi inkişafın təhlili və proqnozlaşdırılması şöbəsi
        list.add(new Administration_Structure_Entity("", "SOSİAL-İQTİSADİ İNKİŞAFIN TƏHLİLİ və PROQNOZLAŞDIRILMASI ŞÖBƏSİ", ""));
        list.add(new Administration_Structure_Entity("Şöbə müdirinin müavini", "Xəlilov Xəlil Məhəmməd", "244-31-68"));
        list.add(new Administration_Structure_Entity("Baş məsləhətçi", "Məmmədov Ramil Kazım", "244-26-26"));
        list.add(new Administration_Structure_Entity("Baş məsləhətçi", "Məmmədov Rafiq Piri", "244-23-75"));
        list.add(new Administration_Structure_Entity("Baş məsləhətçi", "Rəcəbov Nazim Kazım", "244-23-75"));
        list.add(new Administration_Structure_Entity("Aparıcı məsləhətçi", "Abdurəhimov Yaşar Əhməd", "244-26-26"));
        list.add(new Administration_Structure_Entity("Aparıcı məsləhətçi", "Xalıqov Şahin Ramazan", "244-23-75"));
        //  İstehsal və xidmət sahələri sektoru
        list.add(new Administration_Structure_Entity("", "İSTEHSAL və XİDMƏT SƏHƏLƏRİ SEKTORU", ""));
        list.add(new Administration_Structure_Entity("Sektor müdiri", "Abduləzizov Rəşad Saleh", "244-28-28"));
        list.add(new Administration_Structure_Entity("Aparıcı məsləhətçi", "Məmmədov Elnur Zümrüd", "244-28-28"));
        //Memarlıq və tikinti şöbəsi
        list.add(new Administration_Structure_Entity("", "MEMARLIQ və TİKİNTİ ŞÖBƏSİ", ""));
        list.add(new Administration_Structure_Entity("Şöbə müdiri – baş memar", "Alxasov Taleh Saleh", "244-28-70"));
        list.add(new Administration_Structure_Entity("Baş məsləhətçi (mühəndis)", "Əkbərov Etibar Hüsein", "244-29-83"));
        list.add(new Administration_Structure_Entity(" Böyük məsləhətçi (mühəndis)", "İsmiyev Elxan Nuru", "244-29-83"));
        //Şəhər təsərrüfatı şöbəsi
        list.add(new Administration_Structure_Entity("", "ŞƏHƏR TƏSƏRRÜFATI ŞÖBƏSİ", ""));
        list.add(new Administration_Structure_Entity("Baş məsləhətçi", "İsmayılov Nizami Cuma", "244-65-75"));
        list.add(new Administration_Structure_Entity("Böyük məsləhətçi", "Nəsibov Tərlan Məhəmməd", "244-25-64"));
        //Sənədlərlə və vətəndaşların müraciətləri ilə iş şöbəsi
        list.add(new Administration_Structure_Entity("", "SƏNƏDƏRLƏ və VƏTƏNDAŞLARIN MÜRACİƏTLƏRİ ilə İŞ ŞÖBƏSİ", ""));
        list.add(new Administration_Structure_Entity("Şöbə müdiri", "Mikayılov Daşqın Gündüz", "244-25-25"));
        list.add(new Administration_Structure_Entity("Məsləhətçi (kadrlar üzrə işin aparıcısı)", "Məmmədov Eldar Əliyəsər", "244-37-16"));
        list.add(new Administration_Structure_Entity("Məsləhətçi (dəftərxana işinin aparıcısı)", "Abdullayev Rəvan Elşin", "244-27-27"));
        list.add(new Administration_Structure_Entity("Məsləhətçi (vətəndaşların müraciətləri üzrə işin aparıcısı)", "Rəsulova Kəmalə Namiq", "244-27-27"));
        list.add(new Administration_Structure_Entity("Məsləhətçi", "Əliəşrəfova Şahnaz Mahmud", "244-27-27"));
        list.add(new Administration_Structure_Entity("Baş mütəxəssis - sürücü", "Paşayev Mahir Qaybalı", "-"));
        list.add(new Administration_Structure_Entity("Baş mütəxəssis - sürücü", "Teymurov Teymur Şakir", "-"));
        list.add(new Administration_Structure_Entity("Baş mütəxəssis - sürücü", "Mustafayev Asim Paşa", "-"));
        list.add(new Administration_Structure_Entity("Baş mütəxəssis - sürücü", "Rəsulov Soltan Həsənpaşa", "-"));
        list.add(new Administration_Structure_Entity("Baş mütəxəssis – komendant", "Hacıyev Rəfail Muradəli", "244-25-24"));
        list.add(new Administration_Structure_Entity("Xadimə", "Həsənova Əsli Camal", "-"));
        list.add(new Administration_Structure_Entity("Xadimə", "Əhmədova Surayə Həsən", "-"));

        Administration_Structure_Adapter adapter = new Administration_Structure_Adapter(getActivity(), list);
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
                    Administration_Main_Page main_page = new Administration_Main_Page();
                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, main_page);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();

                    return true;

                }
                return false;
            }
        });
    }


}
