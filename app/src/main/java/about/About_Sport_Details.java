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
@SuppressWarnings("ALL")
public class About_Sport_Details extends Fragment {


    ListView listView;
    FragmentTransaction fragmentTransaction;
    About_Main_Page about_main_page;

    public About_Sport_Details() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.sheki_about__sport__details, container, false);
        listView = (ListView) view.findViewById(R.id.listViewSport);

        List<About_Education_Entity>list = new ArrayList<>();
        list.add(new About_Education_Entity("1","Şəki Olimpiya İdman Kompleksi","S.Mümtaz küç 1","Əsgərov İlham Telman oğlu","(0177) 5-11-55\n(0177) 5-17-63"));
        list.add(new About_Education_Entity("2","Şəki İdman Sağlamlıq Mərkəzi","M.F.Axundov 3","Əhmədov Nəriman Məmmədhənifə oğlu","(0177) 4-01-16"));
        list.add(new About_Education_Entity("3","Şəki şəhər Stadionu","M.F.Axundov 31","--","--"));
        list.add(new About_Education_Entity("4","Uşaq Gənclər İdman Məktəbi (Gİİ)","M.F.Axundov 3","Sadıqov İlqar Vülqar oğlu","(0177) 4-26-11"));
        list.add(new About_Education_Entity("5","Təhsil Uşaq Gənclər İdman Məktəbi","Mikayıl Cəbrayılov 10","Vəliyev Hətəm Həmid oğlu","(0177) 4-61-93"));
        list.add(new About_Education_Entity("6","Şəki Uşaq Şahmat Məktəbi","M.F.Axundov 75","Salamov Vüqar Bayram oğlu","(0177) 4-37-12"));

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
