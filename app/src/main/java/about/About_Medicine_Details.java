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
public class About_Medicine_Details extends Fragment {

    private FragmentTransaction fragmentTransaction;
    private About_Main_Page about_main_page;

    public About_Medicine_Details() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.sheki_about_medicine_detail, container, false);
        ListView listView = (ListView) view.findViewById(R.id.listViewMedicine);
        List<About_Education_Entity> list = new ArrayList<>();
        //Xəstəxanalar
        list.add(new About_Education_Entity("","","XƏSTƏXANALAR","",""));
        list.add(new About_Education_Entity("1","MRX-nın yeni korpusu","S.Mümtaz 2","Əliyev Məcid Abduləli oğlu","5 11 73"));
        list.add(new About_Education_Entity("2","Şəki MRX-sının əsas korpusu","M.Rəsulzadə 164","Əliyev Məcid Abduləli oğlu","4 32 01"));
        list.add(new About_Education_Entity("3","Doğum evi","20yanvar küç 1","Xəlilov Fərman Calal oğlu","4 38 73"));
        list.add(new About_Education_Entity("4","Birləşmiş uşaq x/x","Şəki fəhləsi 4","Əliyev İmran Abdul oğlu","4 21 38"));
        list.add(new About_Education_Entity("5","Psixatriya x/x","M.Hacıyev 14","Əsədullayev Akif Fəxrəddin oğlu","5 16 88"));
        list.add(new About_Education_Entity("6","Ağ ciyər xəstəlikləri x/x","Bağbanlar 4/1","İbrahimxəlilov Laçın Şahid oğlu","4 18 36"));
        //Poliklinikalar
        list.add(new About_Education_Entity("","","POLİKLİNİKALAR","",""));
        list.add(new About_Education_Entity("1","MRX-nın poliklinika şöbəsi","M.Rəsulzadə 164","Əliyev Nazim Əli oğlu","4 56 05"));
        list.add(new About_Education_Entity("2","M.Poliklinikanın 2 saylı terapiya şöbəsi","M.Rəsulzadə 3","Şöbə müdiri vəzifəsi boşdur","5 14 21"));
        list.add(new About_Education_Entity("3","Uşaq poliklinikasının 1saylı pediatriya şöbəsi","M.F.Axundov 3","Hüseynova Ziyafət Pirməmməd qızı","4 24 58"));
        list.add(new About_Education_Entity("4","Uşaq xəstəxanasının konsultativ poliklinikası","20 yanvar küç 54","Qədimov Qabil Yusif oğlu","4 25 48"));
        list.add(new About_Education_Entity("5","Uşaq poliklinikasının 2saylı pediatriya şöbəsi","M.Rəsulzadə 136","Xəlilova İradə Xeybər qızı","4 76 51"));
        list.add(new About_Education_Entity("6","Təcili tibbi yardım stansiyası","M.Rəsulzadə 169","Qədimov Faiq Rasim oğlu","4 28 80"));
        list.add(new About_Education_Entity("7","Təcili təxirəsalınmaz tibbi yardım regional məntəqəsi","M.Rəsulzadə 164","İlyaslı Arzu Fərman qızı","4 52 15"));
        //Kənd sahə xəstəxanaları
        list.add(new About_Education_Entity("","","KƏND SAHƏ XƏSTƏXANALARI","",""));
        list.add(new About_Education_Entity("1","Turan qəsəbə x/x","Turan qəsəbəsi","Piriyeva Fatma Yusif qızı","71 2 67"));
        list.add(new About_Education_Entity("2","Aşağı Göynük KSX","Aşağı Göynük k.","Məmişov Mustafa Yaqub oğlu","96 1 38"));
        list.add(new About_Education_Entity("3","Kiçik Dəhnə KSX","Kiçik Dəhnə k.","Hacıyev Ramiz Məmməd oğlu","35 1 16"));
        //Kənd həkim məntəqələri
        list.add(new About_Education_Entity("","","KƏND HƏKİM MƏNTƏQƏLƏRİ","",""));
        list.add(new About_Education_Entity("1","Baş Zəyzid KHM","Baş Zəyzid k.","Hüseynov Ələsgər Bədəl oğlu","95 3 01"));
        list.add(new About_Education_Entity("2","Baş Layısqı KHM","Baş Layısqı k.","Mikayılova Bilqeyis Musa qızı","93 1 35"));
        list.add(new About_Education_Entity("3","Cəfəravabad KHM","Cəfəravabad k.","Musayev Namizəd Mövlan oğlu","38 1 71"));
        list.add(new About_Education_Entity("4","Bideyiz KHM","Bideyiz k.","İslamov Nərbala Firiddun oğlu","74 2 15"));
        list.add(new About_Education_Entity("5","Baş Göynük KHM","Baş Göynük k.","Məmmədova Göyərçin İsfəndiyar qızı","92 1 98"));
        list.add(new About_Education_Entity("6","Böyük Dəhnə KHM","Böyük Dəhnə k.","Abdullayev Azad Əzzəl oğlu","36 1 44"));
        list.add(new About_Education_Entity("7","Kiş KHM","Kiş k.","İslamova Mehriban Biyakir qızı","98 1 46"));
        list.add(new About_Education_Entity("8","Şəki kənd KHM","Şəki kənd k.","İbrahimxəlilov Elçin Səfəralı oğlu","--"));
        list.add(new About_Education_Entity("9","Qoxmuq KHM","Qoxmuq k.","Soltanov Sahil Soltan oğlu","4 78 97"));
        list.add(new About_Education_Entity("10","Oxud KHM","Oxud k.","Musayev Sərxan Əsəd oğlu","30 1 17"));
        list.add(new About_Education_Entity("11","Aşağı Küngüt KHM","Aşağı Küngüt k.","Babayev Hazər Mövlud oğlu","91 1 03"));
        list.add(new About_Education_Entity("12","İnçə-Zunud KHM","İnçə k.","Camalov Nadir Hümmət oğlu","34 1 16"));
        list.add(new About_Education_Entity("13","Orta Zəyzid KHM","Orta Zəyzid k.","Xaliyeva Sitarə Hacı qızı","94 1 18"));
        list.add(new About_Education_Entity("14","Cuma KHM","Cuma k.","Məmmədli Valeh Nəriman oğlu","75 2 03"));
        list.add(new About_Education_Entity("15","Cəyirli KHM","Cəyirli k.","Məmmədova Hüsniyyə Rahim qızı","77 2 27"));

        About_Education_Adapter adapter = new About_Education_Adapter(getActivity(),list);
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
