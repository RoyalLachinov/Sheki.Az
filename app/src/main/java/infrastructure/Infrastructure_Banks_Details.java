package infrastructure;


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

import administration.Administration_Structure_Adapter;
import administration.Administration_Structure_Entity;
import lachinov.royal.com.main.R;

/**
 * A simple {@link Fragment} subclass.
 */
@SuppressWarnings("ConstantConditions")
public class Infrastructure_Banks_Details extends Fragment {

    private FragmentTransaction fragmentTransaction;

    public Infrastructure_Banks_Details() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.sheki_infrastructure_banks_details, container, false);
        ListView listView = (ListView) view.findViewById(R.id.listViewBank);
        List<Administration_Structure_Entity> list = new ArrayList<>();
        //“Kapital Bank”ın Şəki filialı\nŞəki şəhəri, M.Müşfiq küç. 40\nFaks: (+994 24) 244-41-95
        list.add(new Administration_Structure_Entity("", "“Kapital Bank”ın Şəki filialı\\nŞəki şəhəri, M.Müşfiq küç. 40\\nFaks: (+994 24) 244-41-95", ""));
        list.add(new Administration_Structure_Entity("Orucov Əli Bəxtiyar oğlu ", "müdir", "(+994 24) 244-41-95"));
        //“Beynəlxalq Bank”ın Şəki filialı\nŞəki, Şəki, H.Əliyev prospekti, 61A\nFaks: (+994 24) 244-27-58
        list.add(new Administration_Structure_Entity("", "“Beynəlxalq Bank”ın Şəki filialı\\nŞəki, Şəki, H.Əliyev prospekti, 61A\\nFaks: (+994 24) 244-27-58", ""));
        list.add(new Administration_Structure_Entity("Mikayılov Mehman Kamil oğlu", "müdir", "(+994 24) 244-75-20"));
        //“NBC Bank”ın Şəki filialı\nM.Ə.Rəsulzadə pr.180
        list.add(new Administration_Structure_Entity("", "“NBC Bank”ın Şəki filialı\\nM.Ə.Rəsulzadə pr.180", ""));
        list.add(new Administration_Structure_Entity("Məmmədov Elmar Cəlil oğlu", "müdir", "(+994 24) 244-30-50"));
        //“DəmirBank”ın Şəki filialı\nS. Rəhman küç. 6a\nFaks: (+994 24) 244-88-25
        list.add(new Administration_Structure_Entity("", "“DəmirBank”ın Şəki filialı\\nS. Rəhman küç. 6a\\nFaks: (+994 24) 244-88-25", ""));
        list.add(new Administration_Structure_Entity("İsmayılov Alim Məmməd oğlu", "müdir", "(+994 24) 244-88-25"));
        //“Rabitəbank”ın Şəki filialı\nŞəki şəhəri, M. Rəsulzadə 178\nFaks: (+994 24) 244-83-00
        list.add(new Administration_Structure_Entity("", "“Rabitəbank”ın Şəki filialı\\nŞəki şəhəri, M. Rəsulzadə 178\\nFaks: (+994 24) 244-83-00", ""));
        list.add(new Administration_Structure_Entity("Hüseynov Təhsin Yaşar oğlu", "müdir", "(+994 24) 244-83-00"));
        //“Unibank”ın Şəki filialı\nM.Ə.Rəsulzadə prospekti, 160A\nFaks: (+994 24) 244 55 29
        list.add(new Administration_Structure_Entity("", "“Unibank”ın Şəki filialı\\nM.Ə.Rəsulzadə prospekti, 160A\\nFaks: (+994 24) 244 55 29", ""));
        list.add(new Administration_Structure_Entity("Əlipaşayev Xalid Əlisahib oğlu", "müdir", "(+994 24) 244-58-48"));
        //“Bank of Baku”nun Şəki filialı\nŞəki ş.M. Rəsulzadə, 183\nFaks: (+994 24) 244-56-66
        list.add(new Administration_Structure_Entity("", "“Bank of Baku”nun Şəki filialı\\nŞəki ş.M. Rəsulzadə, 183\\nFaks: (+994 24) 244-56-66", ""));
        list.add(new Administration_Structure_Entity("Miqirov Zaur İlqar oğlu", "müdir", "(+994 24) 244-24-44"));
        //“Bank Respublika”nın  Şəki filialə\nŞəki ş., M.Ə.Rəsulzadə küç. 180, 2-ci giriş\nFaks: (+994 24) 244 80 78
        list.add(new Administration_Structure_Entity("", "“Bank Respublika”nın  Şəki filialə\\nŞəki ş., M.Ə.Rəsulzadə küç. 180, 2-ci giriş\\nFaks: (+994 24) 244 80 78", ""));
        list.add(new Administration_Structure_Entity("Şəfaətli Anar Nüsrət oğlu", "müdir", "(+994 24) 244-80-78"));
        //“Access Bank”ın Şəki filialı\nM. Ə. Rəsulzadə küç., 17, Şəki,\nFaks: (+994 24) 244-72-33
        list.add(new Administration_Structure_Entity("", "“Access Bank”ın Şəki filialı\\nM. Ə. Rəsulzadə küç., 17, Şəki,\\nFaks: (+994 24) 244-72-33", ""));
        list.add(new Administration_Structure_Entity("Nəsibov Hikmət İlqar oğlu", "müdir", "(+994 24) 244 60 80"));
        //“Günay Bank”ın Şəki filialı\nŞəki şəhəri, A.Məmmədov küç., 48\nFaks: (+994 24) 244-50-76
        list.add(new Administration_Structure_Entity("", "“Günay Bank”ın Şəki filialı\\nŞəki şəhəri, A.Məmmədov küç., 48\\nFaks: (+994 24) 244-50-76", ""));
        list.add(new Administration_Structure_Entity("Rəsulov Rəsul İlməddin oğlu", "müdir", "(+994 24) 244-50-76"));
        //“FİNCA Azərbaycan” bank olmayan kredit təşkilatının Şəki filialı\nŞəki şəhəri, H.Əliyev pr. 44
        list.add(new Administration_Structure_Entity("", "“FİNCA Azərbaycan” bank olmayan kredit təşkilatının Şəki filialı\\nŞəki şəhəri, H.Əliyev pr. 44", ""));
        list.add(new Administration_Structure_Entity("Pirimov Tofiq Sadiq oğlu", "müdir", "(+994 24) 244-28-62"));
        //“Aqrarkredit” QSC bank olmayan kredit təşkilatının Şəki filialı\nŞəki şəhəri, 20 yanvar küç, 6\nFaks: (+994 24) 244-01-74
        list.add(new Administration_Structure_Entity("", "“Aqrarkredit” QSC bank olmayan kredit təşkilatının Şəki filialı\\nŞəki şəhəri, 20 yanvar küç, 6\\nFaks: (+994 24) 244-01-74", ""));
        list.add(new Administration_Structure_Entity("Abdulkərimov Yunus Abdulkərim oğlu", "müdir", "(+994 24) 244-01-74"));
        //“Kred Aqro” bank olmayan kredit təşkilatının Şəki filialı\nŞəki şəhəri, Mikayıl Müşviq küç., 1 A\nFaks: (+994 24) 244-11-65
        list.add(new Administration_Structure_Entity("", "“Kred Aqro” bank olmayan kredit təşkilatının Şəki filialı\\nŞəki şəhəri, Mikayıl Müşviq küç., 1 A\\nFaks: (+994 24) 244-11-65", ""));
        list.add(new Administration_Structure_Entity("Əhmədov Ramal Məmməd oğlu", "müdir", "(+994 24) 244-11-65 (101)"));
        //BOKT “Viator” mikrokredit Azərbaycan MMC-nin Şəki filialı\nŞəki şəhəri, İ.Həmidov küçəsi, dalan 1 ev 2\nFaks: (+994 24) 244-73-06
        list.add(new Administration_Structure_Entity("", "BOKT “Viator” mikrokredit Azərbaycan MMC-nin Şəki filialı\\nŞəki şəhəri, İ.Həmidov küçəsi, dalan 1 ev 2\\nFaks: (+994 24) 244-73-06", ""));
        list.add(new Administration_Structure_Entity("Nəbiyev Vəkil Tapdıq oğlu", "müdir", "(+994 24) 244-73-06"));


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
                    Infrastrucutre_Main_Page main_page = new Infrastrucutre_Main_Page();
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
