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

public class About_AgriCulture_Details extends Fragment {

    private FragmentTransaction fragmentTransaction;
    private About_Main_Page about_main_page;

    public About_AgriCulture_Details() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.sheki_about_agri_culture_detail, container, false);
        ListView listView = (ListView) view.findViewById(R.id.listViewAgriculture);
        final List<About_Agriculture_Entity> list = new ArrayList<>();
        list.add(new About_Agriculture_Entity("1", "Oxud", "795", "1040,44", "518,02", "70,00", "35,00", "52,00", "--", "365,42", "52022,00"));
        list.add(new About_Agriculture_Entity("2", "Böyük Dəhnə", "601", "1864,17", "1784,17", "--", "--", "--", "--", "80,00", "93208,50"));
        list.add(new About_Agriculture_Entity("3", "Baş Kəldək", "299", "916,94", "819,01", "--", "--", "--", "--", "97,93", "45847,00"));
        list.add(new About_Agriculture_Entity("4", "Qoxmuq", "754", "998,97", "443,67", "63,36", "41,43", "70,73", "--", "379,78", "49948,50"));
        list.add(new About_Agriculture_Entity("5", "Baş Layısqı", "179", "1498,21", "1282,01", "70,14", "--", "--", "--", "146,06", "74910,50"));
        list.add(new About_Agriculture_Entity("6", "Biləcik", "281", "1173,04", "353,80", "286,42", "32,52", "37,12", "--", "463,18", "58652,00"));
        list.add(new About_Agriculture_Entity("7", "Cəyirli", "431", "2430,43", "2172,47", "--", "--", "--", "132,47", "125,49", "121521,50"));
        list.add(new About_Agriculture_Entity("8", "Orta Zəyzid", "656", "1455,49", "751,95", "--", "3,07", "1,00", "--", "699,47", "72774,50"));
        list.add(new About_Agriculture_Entity("9", "Cumakənd", "402", "759,36", "696,18", "--", "0,10", "0,20", "0,10", "62,78", "37968,00"));
        list.add(new About_Agriculture_Entity("10", "İbrahimkənd", "178", "761,36", "644,90", "8,00", "10,00", "19,02", "--", "79,44", "38068,00"));
        list.add(new About_Agriculture_Entity("11", "Daşüz", "237", "2287,59", "2187,48", "50,00", "--", "--", "--", "50,11", "114379,50"));
        list.add(new About_Agriculture_Entity("12", "Baltalı", "283", "918,15", "402,04", "2,68", "9,12", "29,09", "2,00", "473,22", "45907,50"));
        list.add(new About_Agriculture_Entity("13", "Suçma", "255", "1584,38", "1554,38", "--", "--", "--", "--", "30,00", "79219,00"));
        list.add(new About_Agriculture_Entity("14", "Şorsu", "265", "2499,59", "2316,47", "--", "--", "2,30", "--", "180,82", "124979,50"));
        list.add(new About_Agriculture_Entity("15", "Kiş", "38", "830,55", "697,91", "--", "--", "2,50", "2,00", "128,14", "41527,50"));
        list.add(new About_Agriculture_Entity("16", "Şirinbulaq", "122", "588,41", "588,41", "--", "--", "--", "--", "--", "29420,50"));
        list.add(new About_Agriculture_Entity("17", "Aşağı Küngüt", "293", "908,55", "788,19", "1,00", "--", "7,47", "--", "111,89", "45427,50"));
        list.add(new About_Agriculture_Entity("18", "Baş Göynük", "646", "4116,39", "3247,56", "105,50", "35,01", "35,87", "--", "692,45", "205819,50"));
        list.add(new About_Agriculture_Entity("19", "Qudula", "262", "950,50", "649,00", "40,00", "--", "42,50", "--", "219,00", "47525,00"));
        list.add(new About_Agriculture_Entity("20", "Baş Zəyzid", "1009", "1686,66", "1096,17", "13,85", "2,94", "5,40", "--", "568,30", "84333,00"));
        list.add(new About_Agriculture_Entity("21", "Baş Küngüt", "473", "958,10", "821,28", "--", "3,21", "9,47", "--", "124,14", "47905,00"));
        list.add(new About_Agriculture_Entity("22", "Kiçik Dəhnə", "848", "1992,27", "1989,90", "--", "--", "--", "--", "2,37", "99613,50"));
        list.add(new About_Agriculture_Entity("23", "İnçə-Zunud", "241", "1119,96", "677,00", "43,65", "13,90", "22,75", "--", "362,66", "55998,00"));
        list.add(new About_Agriculture_Entity("24", "Turan", "415", "7107,11", "6928,66", "--", "--", "--", "--", "178,45", "355355,50"));
        list.add(new About_Agriculture_Entity("25", "Şəki kəndi", "347", "1769,19", "1551,99", "--", "--", "--", "69,53", "147,67", "88459,50"));
        list.add(new About_Agriculture_Entity("26", "Aşağı Göynük", "538", "1903,26", "1624,87", "18,00", "9,03", "38,55", "--", "212,81", "95163,00"));
        list.add(new About_Agriculture_Entity("27", "Aydınbulaq", "336", "2019,26", "1996,16", "--", "--", "--", "2,00", "21,10", "100963,00"));
        list.add(new About_Agriculture_Entity("28", "Küdürlü", "55", "268,55", "194,49", "--", "--", "25,32", "--", "48,74", "13427,50"));
        list.add(new About_Agriculture_Entity("29", "Qayabaşı", "434", "7828,02", "7606,30", "--", "--", "--", "23,74", "197,98", "391401,00"));
        list.add(new About_Agriculture_Entity("30", "Ceşməli", "383", "2109,05", "1566,92", "113,04", "--", "12,63", "2,00", "414,46", "105452,50"));
        list.add(new About_Agriculture_Entity("31", "Bolludərə", "287", "9472,00", "9339,00", "--", "--", "--", "--", "133,00", "473600,00"));
        list.add(new About_Agriculture_Entity("32", "Cəfərabad", "332", "797,02", "782,43", "--", "--", "--", "--", "14,59", "39851,00"));
        list.add(new About_Agriculture_Entity("--", "Cəmi", "12675", "66612,97,02", "58072,79", "885,64", "195,33", "413,92", "233,84", "6811,45", "3330648,50"));

        About_Agriculture_Adapter adapter = new About_Agriculture_Adapter(this.getActivity(), list);
        listView.setAdapter(adapter);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        //noinspection ConstantConditions
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
