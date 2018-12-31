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
public class Administration_Citizen_Accept_Details extends Fragment {

    private FragmentTransaction fragmentTransaction;

    public Administration_Citizen_Accept_Details() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.sheki_administration__citizen__accept__details, container, false);
        ListView listView = (ListView) view.findViewById(R.id.listviewAccept);

        List<Administration_Citizen_Accept_Entity>list = new ArrayList<>();
        list.add(new Administration_Citizen_Accept_Entity("Bazar ertəsi günü","İsmayılov Nizami Cuma","İHB-nın müavini - Şəhər təsərrüfatı şöbəsinin müdiri vəzifəsini icra edən"));
        list.add(new Administration_Citizen_Accept_Entity("Çərşənbə günü","Əliyev Firon Bəxtiyar","İHB-nın müavini - Sosial-iqtisadi inkişafın təhlili və proqnozlaşdırılması şöbəsinin müdiri"));
        list.add(new Administration_Citizen_Accept_Entity("Çərşənbə günü","Cavadova Zərinə Əliəkbər","İHB-nın müavini – İctimai-siyasi və humanitar məsələlər şöbəsinin müdiri"));
        list.add(new Administration_Citizen_Accept_Entity("Cümə axşamı günü","Həsənov Həsən Yusub","İHB-nın  birinci müavini"));
        list.add(new Administration_Citizen_Accept_Entity("Cümə günü","Usubov Elxan Zabir","Şəki Şəhər İcra Hakimiyyətinin başçısı"));
        Administration_Citizen_Accept_Adapter adapter = new Administration_Citizen_Accept_Adapter(getActivity(),list);
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
