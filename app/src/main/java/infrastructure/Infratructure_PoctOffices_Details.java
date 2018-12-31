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
public class Infratructure_PoctOffices_Details extends Fragment {

    private FragmentTransaction fragmentTransaction;

    public Infratructure_PoctOffices_Details() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.sheki_infratructure_postoffice_detail, container, false);
        ListView listView = (ListView) view.findViewById(R.id.listViewPostOffices);

        List<Administration_Structure_Entity> list = new ArrayList<>();
        //Şəki Regional Poçt Filiali 31 r/n M.Ə.Rəsulzadə 156A
        list.add(new Administration_Structure_Entity("", "Şəki Regional Poçt Filialı\n31 r/n M.Ə.Rəsulzadə 156A", ""));
        list.add(new Administration_Structure_Entity("Abduləlimov Seyran Ələsgər oğlu", "Rəis", "024 – 244 – 29 – 18"));
        //Müştəri Xidmətlər şöbəsi\n31 r/n M.Ə.Rəsulzadə 156A
        list.add(new Administration_Structure_Entity("", "Müştəri Xidmətlər Şöbəsi\n31 r/n M.Ə.Rəsulzadə 156A", ""));
        list.add(new Administration_Structure_Entity("Əhmədova Gülnar Yusif qızı", "Rəis", "024 – 244 – 22 – 90\n024 – 244 – 77 – 90\n024 – 244 – 84 – 61 \n024 – 244 – 29 – 58\n024 – 244 – 29 – 78"));
        //Şəhər 1 saylı poçt şöbəsi\n21 r/n M.Ə.Rəsulzadə 137
        list.add(new Administration_Structure_Entity("", "Şəhər 1 saylı poçt şöbəsi\n21 r/n M.Ə.Rəsulzadə 137", ""));
        list.add(new Administration_Structure_Entity("İsmayıllı Vasif Ələddin oğlu", "Rəis", "024 – 244 – 83 – 72"));
        //Şəhər 2 saylı poçt şöbəsi\n15 r/n Xoyski 1A
        list.add(new Administration_Structure_Entity("", "Şəhər 2 saylı poçt şöbəsi\n15 r/n Xoyski 1A", ""));
        list.add(new Administration_Structure_Entity("Mehdiyeva Məhbarə İsfəndiyar qızı", "Rəis", "024 – 246 – 12 – 18"));
        //Şəhər 3 saylı poçt şöbəsi\n7 r/n M.F.Axundov 185A
        list.add(new Administration_Structure_Entity("", "Şəhər 3 saylı poçt şöbəsi\n7 r/n M.F.Axundov 185A", ""));
        list.add(new Administration_Structure_Entity("Musayev Ehtibar Niymət oğlu", "Rəis", "024 – 244 – 74 – 23 "));
        //Şəhər 5 saylı poçt şöbəsi\n18 r/n M.Ə.Rəsulzadə 372A
        list.add(new Administration_Structure_Entity("", "Şəhər 5 saylı poçt şöbəsi\n18 r/n M.Ə.Rəsulzadə 372A", ""));
        list.add(new Administration_Structure_Entity("Şıxəliyeva Firəngiz Şirin qızı ", "Rəis", "024 – 246 – 03 – 96"));
        //Şəhər 6 saylı poçt şöbəsi\n25 r/n Oğuz şösesi 5
        list.add(new Administration_Structure_Entity("", "Şəhər 6 saylı poçt şöbəsi\n25 r/n Oğuz şösesi 5", ""));
        list.add(new Administration_Structure_Entity("Musayeva Nərgiz Abdulkərim qızı", "Rəis", "024 – 245 – 16 – 51 "));
        //Şəhər 7 saylı poçt şöbəsi\nA.Məmmədov 1A
        list.add(new Administration_Structure_Entity("", "Şəhər 7 saylı poçt şöbəsi\nA.Məmmədov 1A", ""));
        list.add(new Administration_Structure_Entity("Əhmədova Şükufə Yaqub qızı", "Rəis", "024 – 244 – 78 – 49 "));
        //Şəhər 8 saylı poçt şöbəsi\n29 r/n  N.Nərimanov 2
        list.add(new Administration_Structure_Entity("", "Şəhər 8 saylı poçt şöbəsi\n29 r/n  N.Nərimanov 2", ""));
        list.add(new Administration_Structure_Entity("Hümmətova Sevil Nadir qızı", "Rəis", "024 – 245 – 02 – 50 "));
        //Baş Göynük poçt şöbəsi\nBaş Göynük kəndi
        list.add(new Administration_Structure_Entity("", "Baş Göynük poçt şöbəsi\nBaş Göynük kəndi", ""));
        list.add(new Administration_Structure_Entity("İmamov Mahir Ağabəy oğlu", "Rəis", "024 – 249 – 21 – 60"));
        //Baş Göynük – 2 poçt şöbəsi\nBaş Göynük kəndi
        list.add(new Administration_Structure_Entity("", "Baş Göynük – 2 poçt şöbəsi\nBaş Göynük kəndi", ""));
        list.add(new Administration_Structure_Entity("Fərəcov Saleh Nəzir oğlu", "Rəis", "050 – 747 – 15 – 45 "));
        //Biləcik poçt şöbəsi\nBiləcik kəndi
        list.add(new Administration_Structure_Entity("", "Biləcik poçt şöbəsi\nBiləcik kəndi", ""));
        list.add(new Administration_Structure_Entity("Musayev İbrahim Samayıl oğlu", "Rəis", "024 – 249 – 91 – 37"));
        //İnçə poçt şöbəsi\nİnçə kəndi
        list.add(new Administration_Structure_Entity("", "İnçə poçt şöbəsi\nİnçə kəndi", ""));
        list.add(new Administration_Structure_Entity("Bayramov Fəxrəddin Əsgər oğlu", "Rəis", "024 – 243 – 41 – 41"));
        //Şorsu poçt şöbəsi\nŞorsu kəndi
        list.add(new Administration_Structure_Entity("", "Şorsu poçt şöbəsi\nŞorsu kəndi", ""));
        list.add(new Administration_Structure_Entity("Mustafayev Elçin Mustafa oğlu", "Rəis", "024 – 247 – 22 – 24"));
        //Baltalı poçt şöbəsi\nBaltalı kəndi
        list.add(new Administration_Structure_Entity("", "Baltalı poçt şöbəsi\nBaltalı kəndi", ""));
        list.add(new Administration_Structure_Entity("Alxasova Pakizə Ağamməd qızı", "Rəis", "024 – 243 – 11 – 79"));
        //Cumakənd poçt şöbəsi\nCumakənd
        list.add(new Administration_Structure_Entity("", "Cumakənd poçt şöbəsi\nCumakənd", ""));
        list.add(new Administration_Structure_Entity("İbrahimov Vilayət Şakir oğlu", "Rəis", "024 – 247 – 51 – 19"));
        //Daşüz poçt şöbəsi\nDaşüz kəndi
        list.add(new Administration_Structure_Entity("", "Daşüz poçt şöbəsi\nDaşüz kəndi", ""));
        list.add(new Administration_Structure_Entity("Ağamova Heyran Balabəy qızı ", "Rəis", "024 – 243 – 22 – 60"));
        //Oxud poçt şöbəsi\nOxud kəndi
        list.add(new Administration_Structure_Entity("", "Oxud poçt şöbəsi\nOxud kəndi", ""));
        list.add(new Administration_Structure_Entity("Məmmədova Nərgiz İdris qızı", "Rəis", "024 – 243 – 01 – 44"));
        //Kiş poçt şöbəsi\nKiş kəndi
        list.add(new Administration_Structure_Entity("", "Kiş poçt şöbəsi\nKiş kəndi", ""));
        list.add(new Administration_Structure_Entity("Musayeva Esmira Məmməd qızı", "Rəis", "024 – 249 – 81 – 18"));
        //Baş Zəyzid poçt şöbəsi\nBaş Zəyzid kəndi
        list.add(new Administration_Structure_Entity("", "Baş Zəyzid poçt şöbəsi\nBaş Zəyzid kəndi", ""));
        list.add(new Administration_Structure_Entity("Əndəlifov Elgün Vahab oğlu", "Rəis", "024 – 249 – 51 – 39"));
        //Orta Zəyzid poçt şöbəsi\nOrta Zəyzid kəndi
        list.add(new Administration_Structure_Entity("", "Orta Zəyzid poçt şöbəsi\nOrta Zəyzid kəndi", ""));
        list.add(new Administration_Structure_Entity("Əyyubov Ramis Əbdül oğlu", "Rəis", "024 – 249 – 41 – 19"));
        //Köbər Zəyzid poçt şöbəsi\nKöbər Zəyzid kəndi
        list.add(new Administration_Structure_Entity("", "Köbər Zəyzid poçt şöbəsi\nKöbər Zəyzid kəndi", ""));
        list.add(new Administration_Structure_Entity("Əyyubov Namiq Əbdül oğlu", "Rəis", "070 – 959 – 65 – 86"));
        //Baş Küngüt poçt şöbəsi\nBaş Küngüt kəndi
        list.add(new Administration_Structure_Entity("", "Baş Küngüt poçt şöbəsi\nBaş Küngüt kəndi", ""));
        list.add(new Administration_Structure_Entity("Lətifov Tərlan Feyzullah oğlu", "Rəis", "024 – 247 – 32 – 25"));
        //Aşağı Küngüt poçt şöbəsi\nAşağı Küngüt kəndi
        list.add(new Administration_Structure_Entity("", "Aşağı Küngüt poçt şöbəsi\nAşağı Küngüt kəndi", ""));
        list.add(new Administration_Structure_Entity("Musayev Rahim Nizaməddin oğlu", "Rəis", "024 – 249 – 11 – 36"));
        //Oravan poçt şöbəsi\nOravan kəndi
        list.add(new Administration_Structure_Entity("", "Oravan poçt şöbəsi\nOravan kəndi", ""));
        list.add(new Administration_Structure_Entity("Bədəlov Arzuman Vahid oğlu", "Rəis", "024 – 249 – 04 – 39"));
        //Cəfərabad poçt şöbəsi\nCəfərabad kəndi
        list.add(new Administration_Structure_Entity("", "Cəfərabad poçt şöbəsi\nCəfərabad kəndi", ""));
        list.add(new Administration_Structure_Entity("Nəbiyeva Sevda Allahyar qızı", "Rəis", "024 – 243 – 81 – 74"));
        //Böyük Dəhnə poçt şöbəsi\nBöyük Dəhnə kəndi
        list.add(new Administration_Structure_Entity("", "Böyük Dəhnə poçt şöbəsi\nBöyük Dəhnə kəndi", ""));
        list.add(new Administration_Structure_Entity("İsmayılov Umud İsmayıl oğlu", "Rəis", "024 – 243 – 61 – 38"));
        //Kiçik Dəhnə poçt şöbəsi\nKiçik Dəhnə kəndi
        list.add(new Administration_Structure_Entity("", "Kiçik Dəhnə poçt şöbəsi\nKiçik Dəhnə kəndi", ""));
        list.add(new Administration_Structure_Entity("Məmmədov Zabid Zahid oğlu", "Rəis", "024 – 243 – 51 – 49"));
        //Suçma poçt şöbəsi\nSuçma kəndi
        list.add(new Administration_Structure_Entity("", "Suçma poçt şöbəsi\nSuçma kəndi", ""));
        list.add(new Administration_Structure_Entity("Mustafayev Mais Əhməd oğlu", "Rəis", "024 – 243 – 71 – 22"));
        //Şəkikənd poçt şöbəsi\nŞəkikənd kəndi
        list.add(new Administration_Structure_Entity("", "Şəkikənd poçt şöbəsi\nŞəkikənd kəndi", ""));
        list.add(new Administration_Structure_Entity("Məmmədov Nurəddin Seyfəddin oğlu", "Rəis", "024 – 243 – 32 – 74"));
        //Turan poçt şöbəsi\nTuran qəsəbəsi
        list.add(new Administration_Structure_Entity("", "Turan poçt şöbəsi\nTuran qəsəbəsi", ""));
        list.add(new Administration_Structure_Entity("Məmmədov İnayət Hidayət oğlu", "Rəis", "024 – 247 – 13 – 31"));
        //Cəyirli poçt şöbəsi\nCəyirli kəndi
        list.add(new Administration_Structure_Entity("", "Cəyirli poçt şöbəsi\nCəyirli kəndi", ""));
        list.add(new Administration_Structure_Entity("Cabbarova Elanur Mirzə qızı", "Rəis", "024 – 247 – 71 – 80"));
        //Sarıca poçt şöbəsi\nSarıca kəndi
        list.add(new Administration_Structure_Entity("", "Sarıca poçt şöbəsi\nSarıca kəndi", ""));
        list.add(new Administration_Structure_Entity("Quliyev İlham Seyfəddin oğlu", "Rəis", "024 – 247 – 82 – 09"));
        //Aydınbulaq poçt şöbəsi\nAydınbulaq kəndi
        list.add(new Administration_Structure_Entity("", "Aydınbulaq poçt şöbəsi\nAydınbulaq kəndi", ""));
        list.add(new Administration_Structure_Entity("Səfərov Bəhram Qədir oğlu", "Rəis", "024 – 243 – 92 – 01"));
        //Çayqaraqoyunlu poçt şöbəsi\nÇayqaraqoyunlu kəndi
        list.add(new Administration_Structure_Entity("", "Çayqaraqoyunlu poçt şöbəsi\nÇayqaraqoyunlu kəndi", ""));
        list.add(new Administration_Structure_Entity("İsrafilov Rəsul Yolçu oğlu", "Rəis", "024 – 247 –12 – 33"));

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
