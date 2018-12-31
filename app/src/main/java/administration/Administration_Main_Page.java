package administration;


import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import about.About_Details;
import about.About_Main_Adapter;
import about.About_Main_Entity;
import lachinov.royal.com.main.R;
import main.MainActivity;

/**
 * A simple {@link Fragment} subclass.
 */
@SuppressWarnings("ConstantConditions")
public class Administration_Main_Page extends Fragment {

    private FragmentTransaction fragmentTransaction;

    public Administration_Main_Page() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.listview_every_where, container, false);
        ListView listView = (ListView) view.findViewById(R.id.listviewEvery);

        final List<About_Main_Entity> list = new ArrayList<>();
        list.add(new About_Main_Entity(R.drawable.managment, "İH-nın Başçısı"));
        list.add(new About_Main_Entity(R.drawable.managment_structure, "Aparatın Strukturu"));
        list.add(new About_Main_Entity(R.drawable.managment_shura, "Şura"));
        list.add(new About_Main_Entity(R.drawable.managment_represent, "Nümayəndəliklər"));
        list.add(new About_Main_Entity(R.drawable.managment_munc, "Bələdiyyələr"));
        list.add(new About_Main_Entity(R.drawable.vetendash_qebulu, "Vətəndaşların qəbulu"));
        list.add(new About_Main_Entity(R.drawable.elektron_muraciet, "Elektron müraciət"));
        list.add(new About_Main_Entity(R.drawable.elektron_xidmet, "Elektron xidmətlər"));
        list.add(new About_Main_Entity(R.drawable.report, "Başçının hesabat məruzələri"));
        list.add(new About_Main_Entity(R.drawable.advertisiment, "Elanlar"));

        About_Main_Adapter adapter = new About_Main_Adapter(this.getActivity(), list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    About_Details about_details = new About_Details();
                    Bundle bundle = new Bundle();
                    bundle.putString("message", "admin");
                    about_details.setArguments(bundle);

                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, about_details);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                } else if (position == 1) {
                    Administration_Structure_Detail detail = new Administration_Structure_Detail();
                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, detail);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                } else if (position == 2) {
                    About_Details about_details = new About_Details();
                    Bundle bundle = new Bundle();
                    bundle.putString("message", "shura");
                    about_details.setArguments(bundle);

                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, about_details);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                } else if (position == 3) {
                    Administration_Deligation_Detail detail = new Administration_Deligation_Detail();
                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, detail);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                } else if (position == 4) {
                    Administration_Municipality_Detail detail = new Administration_Municipality_Detail();
                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, detail);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();

                } else if (position == 5) {
                    Administration_Citizen_Accept_Details detail = new Administration_Citizen_Accept_Details();
                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, detail);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();

                } else if (position == 6) {
                    About_Details about_details = new About_Details();
                    Bundle bundle = new Bundle();
                    bundle.putString("message", "electronic_apply");
                    about_details.setArguments(bundle);

                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, about_details);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();

                } else if (position == 7) {
                    About_Details about_details = new About_Details();
                    Bundle bundle = new Bundle();
                    bundle.putString("message", "elektron_xidmet");
                    about_details.setArguments(bundle);

                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, about_details);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();

                } else if (position == 8) {
                    About_Details about_details = new About_Details();
                    Bundle bundle = new Bundle();
                    bundle.putString("message", "hesabat");
                    about_details.setArguments(bundle);

                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, about_details);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                } else if (position == 9) {
                    About_Details about_details = new About_Details();
                    Bundle bundle = new Bundle();
                    bundle.putString("message", "advertisment");
                    about_details.setArguments(bundle);

                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, about_details);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }
            }
        });
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
                    Intent intent = new Intent(getActivity(), MainActivity.class);
                    startActivity(intent);
                    return true;

                }
                return false;
            }
        });
    }
}
