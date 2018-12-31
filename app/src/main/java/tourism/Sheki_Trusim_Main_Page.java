package tourism;


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
public class Sheki_Trusim_Main_Page extends Fragment {

    private Trusim_Detail detail;
    private FragmentTransaction fragmentTransaction;

    public Sheki_Trusim_Main_Page() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.listview_every_where, container, false);
        ListView listView = (ListView) view.findViewById(R.id.listviewEvery);

        final List<Trusim_Entity> list = new ArrayList<>();
        list.add(new Trusim_Entity(R.drawable.marxal, "Marxal Istirahət Mərkəzi", "Şəki şəhəri,Kiş kəndi"));
        list.add(new Trusim_Entity(R.drawable.xansarayi, "Xan Sarayı", "AZ5503,Şəki,Mirzə Fətəli Axundov."));
        list.add(new Trusim_Entity(R.drawable.karvansaray, "Karvansaray", "Şəki şəhəri,M.F.Axundov pros. 185,Şəki AZ5500. (+994 177) 4 48 14"));
        list.add(new Trusim_Entity(R.drawable.shekipalace, "Şəki Palace", "Ünvan: \tAxundzadə pros, Şəki, Azərbaycan, AZ 5503"));
        list.add(new Trusim_Entity(R.drawable.shekipark, "Şəki park", "Address: ŞƏKI ŞƏHƏRI, VAHABZADƏ KÜÇ. 486,\n SOYUQBULAQ, Kiş yolu,Phone:+994 24 246 08 03"));
        list.add(new Trusim_Entity(R.drawable.shekixanovlarinevi, "Şəkixanovların evi", "Şəki şəhəri, «Yuxarı baş» Dövlət tarix-memarlıq qoruğu."));
        list.add(new Trusim_Entity(R.drawable.sekisaray, "Şəki Saray Hotel", "M.E. Resulzade 187,\nAZ 5500,+994 2424 48181"));
        list.add(new Trusim_Entity(R.drawable.olimpik, "Sheki Olimpic Hotel & Resort", "Ünvan: Salman Mümtaz küç 1,\nTel:+994 50 213 15 14\n\t\t+9942424 5 21 40"));
        list.add(new Trusim_Entity(R.drawable.issam, "İSSAM - Rest & Welness Center", "Şəhriyar küçəsi Tel: + 994 24 244 87 81,\nMob: + 994 55 244 87 81 \nE-mail: office@issam.az, admin@issam.az"));
        list.add(new Trusim_Entity(R.drawable.narinqala, "Narın Qala İstirahət Mərkəzi", "Ünvan:AZ5525,Şəki,Kiş,Məmməd Əmin Rəsulzadə küç.\nTelefon:\t(+994 2424) 4-01-64, (+994 2424) 4-53-00"));
        list.add(new Trusim_Entity(R.drawable.kishmebedi2, "Kiş alban məbədi", "Ünvan:\tAZ5525,Şəki,Kiş,Kiş kənd yolu"));
        list.add(new Trusim_Entity(R.drawable.cennetbagi, "Cənnət Bağı Istirahət Mərkəzi", " Şəki, Kiş kəndi ərazisi"));

        Trusim_Adapter adapter = new Trusim_Adapter(this.getActivity(), list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    detail = new Trusim_Detail();
                    Bundle bundle = new Bundle();
                    bundle.putString("message", "marxal");
                    detail.setArguments(bundle);

                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, detail);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                } else if (position == 1) {
                    detail = new Trusim_Detail();
                    Bundle bundle = new Bundle();
                    bundle.putString("message", "xan_sarayi");
                    detail.setArguments(bundle);

                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, detail);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                } else if (position == 2) {
                    detail = new Trusim_Detail();
                    Bundle bundle = new Bundle();
                    bundle.putString("message", "karvansaray");
                    detail.setArguments(bundle);

                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, detail);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                } else if (position == 3) {
                    detail = new Trusim_Detail();
                    Bundle bundle = new Bundle();
                    bundle.putString("message", "sheki_palace");
                    detail.setArguments(bundle);

                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, detail);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                } else if (position == 4) {
                    detail = new Trusim_Detail();
                    Bundle bundle = new Bundle();
                    bundle.putString("message", "sheki_park");
                    detail.setArguments(bundle);

                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, detail);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                } else if (position == 5) {
                    detail = new Trusim_Detail();
                    Bundle bundle = new Bundle();
                    bundle.putString("message", "shekixanovlarinevi");
                    detail.setArguments(bundle);

                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, detail);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                } else if (position == 6) {
                    detail = new Trusim_Detail();
                    Bundle bundle = new Bundle();
                    bundle.putString("message", "sheki_saray");
                    detail.setArguments(bundle);

                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, detail);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                } else if (position == 7) {
                    detail = new Trusim_Detail();
                    Bundle bundle = new Bundle();
                    bundle.putString("message", "olimpik_hotel");
                    detail.setArguments(bundle);

                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, detail);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                } else if (position == 8) {
                    detail = new Trusim_Detail();
                    Bundle bundle = new Bundle();
                    bundle.putString("message", "issam_hotel");
                    detail.setArguments(bundle);

                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, detail);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                } else if (position == 9) {
                    detail = new Trusim_Detail();
                    Bundle bundle = new Bundle();
                    bundle.putString("message", "narin_qala");
                    detail.setArguments(bundle);

                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, detail);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                } else if (position == 10) {
                    detail = new Trusim_Detail();
                    Bundle bundle = new Bundle();
                    bundle.putString("message", "alban_kilsesi");
                    detail.setArguments(bundle);

                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, detail);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                } else if (position == 11) {
                    detail = new Trusim_Detail();
                    Bundle bundle = new Bundle();
                    bundle.putString("message", "cennet_bagi");
                    detail.setArguments(bundle);

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
