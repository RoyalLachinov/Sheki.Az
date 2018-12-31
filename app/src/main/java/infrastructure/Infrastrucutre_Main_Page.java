package infrastructure;


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

import about.About_Main_Adapter;
import about.About_Main_Entity;
import lachinov.royal.com.main.R;
import main.MainActivity;

/**
 * A simple {@link Fragment} subclass.
 */
@SuppressWarnings("ConstantConditions")
public class Infrastrucutre_Main_Page extends Fragment {

    private FragmentTransaction fragmentTransaction;

    public Infrastrucutre_Main_Page() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.listview_every_where, container, false);
        ListView listView = (ListView) view.findViewById(R.id.listviewEvery);

        final List<About_Main_Entity> list = new ArrayList<>();

        list.add(new About_Main_Entity(R.drawable.postofice,"Poçt və Rabitə"));
        list.add(new About_Main_Entity(R.drawable.banks, "Banklar"));


        About_Main_Adapter adapter = new About_Main_Adapter(this.getActivity(), list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Infratructure_PoctOffices_Details detail = new Infratructure_PoctOffices_Details();
                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, detail);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();

                } else if (position == 1) {
                    Infrastructure_Banks_Details detail = new Infrastructure_Banks_Details();
                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, detail);
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
