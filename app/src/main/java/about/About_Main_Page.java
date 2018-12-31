package about;


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

import lachinov.royal.com.main.R;
import main.MainActivity;

/**
 * A simple {@link Fragment} subclass.
 */
@SuppressWarnings("ConstantConditions")
public class About_Main_Page extends Fragment {

    private About_Details aboutDetails;
    private FragmentTransaction fragmentTransaction;

    public About_Main_Page() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.listview_every_where, container, false);
        ListView listView = (ListView) view.findViewById(R.id.listviewEvery);

        final List<About_Main_Entity> list = new ArrayList<>();
        list.add(new About_Main_Entity(R.drawable.history, "Tarixi"));
        list.add(new About_Main_Entity(R.drawable.population, "Əhalisi"));
        list.add(new About_Main_Entity(R.drawable.geo_position, "Coğrafi mövqeyi"));
        list.add(new About_Main_Entity(R.drawable.economic, "İqtisadiyyat"));
        list.add(new About_Main_Entity(R.drawable.agriculture, "Kənd təsərrüfatı"));
        list.add(new About_Main_Entity(R.drawable.education, "Təhsil"));
        list.add(new About_Main_Entity(R.drawable.culture, "Mədəniyyət"));
        list.add(new About_Main_Entity(R.drawable.medicine, "Səhiyyə"));
        list.add(new About_Main_Entity(R.drawable.sport, "İdman"));

//        AdView mAdView = (AdView) view.findViewById(R.id.adViewListViewEveryWhere);
//        AdRequest adRequest = new AdRequest.Builder().addTestDevice("0A43FD0B11EF0A03FD17EE02C8DE5894").build();
//        mAdView.loadAd(adRequest);

        About_Main_Adapter adapter = new About_Main_Adapter(this.getActivity(), list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    aboutDetails = new About_Details();
                    Bundle bundle = new Bundle();
                    bundle.putString("message", "history");
                    aboutDetails.setArguments(bundle);

                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, aboutDetails);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();

                } else if (position == 1) {
                    aboutDetails = new About_Details();
                    Bundle bundle = new Bundle();
                    bundle.putString("message", "population");
                    aboutDetails.setArguments(bundle);

                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, aboutDetails);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                } else if (position == 2) {
                    aboutDetails = new About_Details();
                    Bundle bundle = new Bundle();
                    bundle.putString("message", "geographic");
                    aboutDetails.setArguments(bundle);

                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, aboutDetails);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                } else if (position == 3) {
                    aboutDetails = new About_Details();
                    Bundle bundle = new Bundle();
                    bundle.putString("message", "economic");
                    aboutDetails.setArguments(bundle);

                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, aboutDetails);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();

                } else if (position == 4) {
                    About_AgriCulture_Details aboutDetails = new About_AgriCulture_Details();
                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, aboutDetails);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();

                } else if (position == 5) {
                    About_Education_Detail about_education_detail = new About_Education_Detail();
                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, about_education_detail);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();

                } else if (position == 6) {
                    About_Culture_Details about_culture_details = new About_Culture_Details();
                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, about_culture_details);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();

                } else if (position == 7) {
                    About_Medicine_Details about_medicine_details = new About_Medicine_Details();

                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, about_medicine_details);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();

                } else if (position == 8) {
                    About_Sport_Details about_sport_details = new About_Sport_Details();

                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, about_sport_details);
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
