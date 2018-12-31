package kitchen;


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
import main.AppRater;
import main.MainActivity;

/**
 * A simple {@link Fragment} subclass.
 */
@SuppressWarnings("ConstantConditions")
public class Sheki_Kitchen_Main_Page extends Fragment {

    private About_Details about_details;
    private FragmentTransaction fragmentTransaction;

    public Sheki_Kitchen_Main_Page() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.listview_every_where, container, false);
        ListView listView = (ListView) view.findViewById(R.id.listviewEvery);

        final List<About_Main_Entity> list = new ArrayList<>();

        list.add(new About_Main_Entity(R.drawable.piti,"Şəki pitisi"));
        list.add(new About_Main_Entity(R.drawable.gurze,"Şəki gürzəsi "));
        list.add(new About_Main_Entity(R.drawable.kulce,"Şəki külçəsi "));
        list.add(new About_Main_Entity(R.drawable.tutplovu,"Şəki tutlu-südlü plovu "));
        list.add(new About_Main_Entity(R.drawable.toyuqplovu, "Şəki parça-döşəmə plovu "));
        list.add(new About_Main_Entity(R.drawable.balva,"Şəki balvası "));
        list.add(new About_Main_Entity(R.drawable.surfullu,"Şəki sürfüllüsü "));
        list.add(new About_Main_Entity(R.drawable.oma,"Şəki fətiri (Oma)"));
        list.add(new About_Main_Entity(R.drawable.paxlava,"ŞƏKİ HALVASI"));
        list.add(new About_Main_Entity(R.drawable.toynogulu,"TOY NOĞULU"));
        list.add(new About_Main_Entity(R.drawable.bamiye,"BAMİYƏ"));
        list.add(new About_Main_Entity(R.drawable.mindal,"MİNDAL "));
        list.add(new About_Main_Entity(R.drawable.barama_shirni,"BARAMA ŞİRNİ"));
        list.add(new About_Main_Entity(R.drawable.cay_destgahi,"ÇAY DƏSTGAHI"));
        list.add(new About_Main_Entity(R.drawable.duyme_shirni,"DÜYMƏ ŞİRNİ"));
        list.add(new About_Main_Entity(R.drawable.taxta_shirni,"TAXTA ŞİRNİ"));
        list.add(new About_Main_Entity(R.drawable.manpasi,"MANPASI"));
        list.add(new About_Main_Entity(R.drawable.tel_halva,"TEL HALVA "));
        list.add(new About_Main_Entity(R.drawable.peshveng,"PEŞVƏNG HALVA"));
        list.add(new About_Main_Entity(R.drawable.qirmabadam,"QIRMABADAM"));


        About_Main_Adapter adapter = new About_Main_Adapter(this.getActivity(), list);
        listView.setAdapter(adapter);

        AppRater.app_launched(getActivity());

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    about_details = new About_Details();
                    Bundle bundle = new Bundle();
                    bundle.putString("message", "piti");
                    about_details.setArguments(bundle);

                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, about_details);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }else if (position == 1) {
                    about_details = new About_Details();
                    Bundle bundle = new Bundle();
                    bundle.putString("message", "sheki_gurzesi");
                    about_details.setArguments(bundle);

                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, about_details);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }else if (position == 2) {
                    about_details = new About_Details();
                    Bundle bundle = new Bundle();
                    bundle.putString("message", "sheki_kulcesi");
                    about_details.setArguments(bundle);

                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, about_details);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }else if (position == 3) {
                    about_details = new About_Details();
                    Bundle bundle = new Bundle();
                    bundle.putString("message", "tutsud_plovu");
                    about_details.setArguments(bundle);

                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, about_details);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }else if (position == 4) {
                    about_details = new About_Details();
                    Bundle bundle = new Bundle();
                    bundle.putString("message", "dosemeli_plov");
                    about_details.setArguments(bundle);

                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, about_details);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }else if (position == 5) {
                    about_details = new About_Details();
                    Bundle bundle = new Bundle();
                    bundle.putString("message", "sheki_balvasi");
                    about_details.setArguments(bundle);

                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, about_details);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }else if (position == 6) {
                    about_details = new About_Details();
                    Bundle bundle = new Bundle();
                    bundle.putString("message", "surfullu");
                    about_details.setArguments(bundle);

                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, about_details);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }else if (position == 7) {
                    about_details = new About_Details();
                    Bundle bundle = new Bundle();
                    bundle.putString("message", "oma");
                    about_details.setArguments(bundle);

                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, about_details);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }else if (position == 8) {
                    about_details = new About_Details();
                    Bundle bundle = new Bundle();
                    bundle.putString("message", "sheki_paxlavasi");
                    about_details.setArguments(bundle);

                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, about_details);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }else if (position == 9) {
                    about_details = new About_Details();
                    Bundle bundle = new Bundle();
                    bundle.putString("message", "toy_nogulu");
                    about_details.setArguments(bundle);

                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, about_details);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }else if (position == 10) {
                    about_details = new About_Details();
                    Bundle bundle = new Bundle();
                    bundle.putString("message", "bamiye");
                    about_details.setArguments(bundle);

                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, about_details);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }else if (position == 11) {
                    about_details = new About_Details();
                    Bundle bundle = new Bundle();
                    bundle.putString("message", "mindal");
                    about_details.setArguments(bundle);

                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, about_details);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }else if (position == 12) {
                    about_details = new About_Details();
                    Bundle bundle = new Bundle();
                    bundle.putString("message", "barama_shirni");
                    about_details.setArguments(bundle);

                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, about_details);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }else if (position == 13) {
                    about_details = new About_Details();
                    Bundle bundle = new Bundle();
                    bundle.putString("message", "cay_destgahi");
                    about_details.setArguments(bundle);

                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, about_details);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }else if (position == 14) {
                    about_details = new About_Details();
                    Bundle bundle = new Bundle();
                    bundle.putString("message", "duyme_shirni");
                    about_details.setArguments(bundle);

                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, about_details);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }else if (position == 15) {
                    about_details = new About_Details();
                    Bundle bundle = new Bundle();
                    bundle.putString("message", "taxta_shirni");
                    about_details.setArguments(bundle);

                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, about_details);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }else if (position == 16) {
                    about_details = new About_Details();
                    Bundle bundle = new Bundle();
                    bundle.putString("message", "manpasi");
                    about_details.setArguments(bundle);

                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, about_details);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }else if (position == 17) {
                    about_details = new About_Details();
                    Bundle bundle = new Bundle();
                    bundle.putString("message", "tel_halva");
                    about_details.setArguments(bundle);

                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, about_details);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }else if (position == 18) {
                    about_details = new About_Details();
                    Bundle bundle = new Bundle();
                    bundle.putString("message", "peshveng_halva");
                    about_details.setArguments(bundle);

                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, about_details);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }else if (position == 19) {
                    about_details = new About_Details();
                    Bundle bundle = new Bundle();
                    bundle.putString("message", "qirmabadam");
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
