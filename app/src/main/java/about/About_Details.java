package about;


import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.Fragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import administration.Administration_Main_Page;
import kitchen.Sheki_Kitchen_Main_Page;
import lachinov.royal.com.main.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class About_Details extends Fragment {

    private FragmentTransaction fragmentTransaction;
    private About_Main_Page about_main_page;
    private Administration_Main_Page administration_main_page;
    private Sheki_Kitchen_Main_Page sheki_kitchen_main_page;

    public About_Details() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //  the layout for this fragment
        View view = inflater.inflate(R.layout.sheki_about_detail, container, false);
        TextView about = (TextView) view.findViewById(R.id.lbAboutSome);
        TextView lbDetailImage = (TextView) view.findViewById(R.id.lbDetailImage);

        Properties properties = new Properties();
        String message1 = getArguments().getString("message");

        try {

            switch (message1) {
                case "history":
                    InputStream inputStream = getActivity().getBaseContext().getAssets().open("history");
                    properties.load(inputStream);
                    String message2 = new String(properties.getProperty(message1).getBytes("ISO-8859-1"), "UTF-8");
                    about.setText(message2);
                    break;
                case "population":
                    inputStream = getActivity().getBaseContext().getAssets().open("history");
                    properties.load(inputStream);
                    message2 = new String(properties.getProperty(message1).getBytes("ISO-8859-1"), "UTF-8");
                    about.setText(message2);
                    break;
                case "geographic":
                    // new MainActivity().setActionBarTitle("Cografiya");
                    inputStream = getActivity().getBaseContext().getAssets().open("history");
                    properties.load(inputStream);
                    message2 = new String(properties.getProperty(message1).getBytes("ISO-8859-1"), "UTF-8");
                    about.setText(message2);
                    break;
                case "economic":
                    inputStream = getActivity().getBaseContext().getAssets().open("history");
                    properties.load(inputStream);
                    message2 = new String(properties.getProperty(message1).getBytes("ISO-8859-1"), "UTF-8");
                    about.setText(message2);
                    break;
                case "admin":
                    inputStream = getActivity().getBaseContext().getAssets().open("history");
                    properties.load(inputStream);
                    message2 = new String(properties.getProperty(message1).getBytes("ISO-8859-1"), "UTF-8");
                    about.setText(message2);
                    break;
                case "shura":
                    inputStream = getActivity().getBaseContext().getAssets().open("history");
                    properties.load(inputStream);
                    message2 = new String(properties.getProperty(message1).getBytes("ISO-8859-1"), "UTF-8");
                    about.setText(message2);
                    break;
                case "electronic_apply":
                    inputStream = getActivity().getBaseContext().getAssets().open("history");
                    properties.load(inputStream);
                    message2 = new String(properties.getProperty(message1).getBytes("ISO-8859-1"), "UTF-8");
                    about.setText(message2);
                    break;
                case "advertisment":
                    inputStream = getActivity().getBaseContext().getAssets().open("history");
                    properties.load(inputStream);
                    message2 = new String(properties.getProperty(message1).getBytes("ISO-8859-1"), "UTF-8");
                    about.setText(message2);
                    break;
                case "hesabat":
                    inputStream = getActivity().getBaseContext().getAssets().open("history");
                    properties.load(inputStream);
                    message2 = new String(properties.getProperty(message1).getBytes("ISO-8859-1"), "UTF-8");
                    about.setText(message2);
                    break;
                case "elektron_xidmet":
                    inputStream = getActivity().getBaseContext().getAssets().open("history");
                    properties.load(inputStream);
                    message2 = new String(properties.getProperty(message1).getBytes("ISO-8859-1"), "UTF-8");
                    about.setText(message2);
                    break;
                case "piti":
                    inputStream = getActivity().getBaseContext().getAssets().open("history");
                    properties.load(inputStream);
                    message2 = new String(properties.getProperty(message1).getBytes("ISO-8859-1"), "UTF-8");
                    about.setText(message2);
                    lbDetailImage.setBackgroundResource(R.drawable.piti);
                    break;
                case "sheki_paxlavasi":
                    inputStream = getActivity().getBaseContext().getAssets().open("history");
                    properties.load(inputStream);
                    message2 = new String(properties.getProperty(message1).getBytes("ISO-8859-1"), "UTF-8");
                    about.setText(message2);
                    lbDetailImage.setBackgroundResource(R.drawable.paxlava);
                    break;
                case "sheki_omasi":
                    inputStream = getActivity().getBaseContext().getAssets().open("history");
                    properties.load(inputStream);
                    message2 = new String(properties.getProperty(message1).getBytes("ISO-8859-1"), "UTF-8");
                    about.setText(message2);
                    lbDetailImage.setBackgroundResource(R.drawable.oma);
                    break;
                case "toy_nogulu":
                    inputStream = getActivity().getBaseContext().getAssets().open("history");
                    properties.load(inputStream);
                    message2 = new String(properties.getProperty(message1).getBytes("ISO-8859-1"), "UTF-8");
                    about.setText(message2);
                    lbDetailImage.setBackgroundResource(R.drawable.toynogulu);
                    break;
                case "bamiye":
                    inputStream = getActivity().getBaseContext().getAssets().open("history");
                    properties.load(inputStream);
                    message2 = new String(properties.getProperty(message1).getBytes("ISO-8859-1"), "UTF-8");
                    about.setText(message2);
                    lbDetailImage.setBackgroundResource(R.drawable.bamiye);
                    break;
                case "barama_shirni":
                    inputStream = getActivity().getBaseContext().getAssets().open("history");
                    properties.load(inputStream);
                    message2 = new String(properties.getProperty(message1).getBytes("ISO-8859-1"), "UTF-8");
                    about.setText(message2);
                    lbDetailImage.setBackgroundResource(R.drawable.bamiye);
                    break;
                case "cay_destgahi":
                    inputStream = getActivity().getBaseContext().getAssets().open("history");
                    properties.load(inputStream);
                    message2 = new String(properties.getProperty(message1).getBytes("ISO-8859-1"), "UTF-8");
                    about.setText(message2);
                    lbDetailImage.setBackgroundResource(R.drawable.bamiye);
                    break;
                case "mindal":
                    inputStream = getActivity().getBaseContext().getAssets().open("history");
                    properties.load(inputStream);
                    message2 = new String(properties.getProperty(message1).getBytes("ISO-8859-1"), "UTF-8");
                    about.setText(message2);
                    lbDetailImage.setBackgroundResource(R.drawable.mindal);
                    break;
                case "duyme_shirni":
                    inputStream = getActivity().getBaseContext().getAssets().open("history");
                    properties.load(inputStream);
                    message2 = new String(properties.getProperty(message1).getBytes("ISO-8859-1"), "UTF-8");
                    about.setText(message2);
                    lbDetailImage.setBackgroundResource(R.drawable.bamiye);
                    break;
                case "taxta_shirni":
                    inputStream = getActivity().getBaseContext().getAssets().open("history");
                    properties.load(inputStream);
                    message2 = new String(properties.getProperty(message1).getBytes("ISO-8859-1"), "UTF-8");
                    about.setText(message2);
                    lbDetailImage.setBackgroundResource(R.drawable.bamiye);
                    break;
                case "manpasi":
                    inputStream = getActivity().getBaseContext().getAssets().open("history");
                    properties.load(inputStream);
                    message2 = new String(properties.getProperty(message1).getBytes("ISO-8859-1"), "UTF-8");
                    about.setText(message2);
                    lbDetailImage.setBackgroundResource(R.drawable.bamiye);
                    break;
                case "tel_halva":
                    inputStream = getActivity().getBaseContext().getAssets().open("history");
                    properties.load(inputStream);
                    message2 = new String(properties.getProperty(message1).getBytes("ISO-8859-1"), "UTF-8");
                    about.setText(message2);
                    lbDetailImage.setBackgroundResource(R.drawable.tel_halva);
                    break;
                case "peshveng_halva":
                    inputStream = getActivity().getBaseContext().getAssets().open("history");
                    properties.load(inputStream);
                    message2 = new String(properties.getProperty(message1).getBytes("ISO-8859-1"), "UTF-8");
                    about.setText(message2);
                    lbDetailImage.setBackgroundResource(R.drawable.peshveng);
                    break;
                case "qirmabadam":
                    inputStream = getActivity().getBaseContext().getAssets().open("history");
                    properties.load(inputStream);
                    message2 = new String(properties.getProperty(message1).getBytes("ISO-8859-1"), "UTF-8");
                    about.setText(message2);
                    lbDetailImage.setBackgroundResource(R.drawable.qirmabadam);
                    break;
                case "sheki_gurzesi":
                    inputStream = getActivity().getBaseContext().getAssets().open("history");
                    properties.load(inputStream);
                    message2 = new String(properties.getProperty(message1).getBytes("ISO-8859-1"), "UTF-8");
                    about.setText(message2);
                    lbDetailImage.setBackgroundResource(R.drawable.gurze);
                    break;
                case "sheki_kulcesi":
                    inputStream = getActivity().getBaseContext().getAssets().open("history");
                    properties.load(inputStream);
                    message2 = new String(properties.getProperty(message1).getBytes("ISO-8859-1"), "UTF-8");
                    about.setText(message2);
                    lbDetailImage.setBackgroundResource(R.drawable.kulce);
                    break;
                case "tutsud_plovu":
                    inputStream = getActivity().getBaseContext().getAssets().open("history");
                    properties.load(inputStream);
                    message2 = new String(properties.getProperty(message1).getBytes("ISO-8859-1"), "UTF-8");
                    about.setText(message2);
                    lbDetailImage.setBackgroundResource(R.drawable.tutplovu);
                    break;
                case "dosemeli_plov":
                    inputStream = getActivity().getBaseContext().getAssets().open("history");
                    properties.load(inputStream);
                    message2 = new String(properties.getProperty(message1).getBytes("ISO-8859-1"), "UTF-8");
                    about.setText(message2);
                    lbDetailImage.setBackgroundResource(R.drawable.toyuqplovu);
                    break;
                case "sheki_balvasi":
                    inputStream = getActivity().getBaseContext().getAssets().open("history");
                    properties.load(inputStream);
                    message2 = new String(properties.getProperty(message1).getBytes("ISO-8859-1"), "UTF-8");
                    about.setText(message2);
                    lbDetailImage.setBackgroundResource(R.drawable.balva);
                    break;
                case "surfullu":
                    inputStream = getActivity().getBaseContext().getAssets().open("history");
                    properties.load(inputStream);
                    message2 = new String(properties.getProperty(message1).getBytes("ISO-8859-1"), "UTF-8");
                    about.setText(message2);
                    lbDetailImage.setBackgroundResource(R.drawable.surfullu);
                    break;
                case "oma":
                    inputStream = getActivity().getBaseContext().getAssets().open("history");
                    properties.load(inputStream);
                    message2 = new String(properties.getProperty(message1).getBytes("ISO-8859-1"), "UTF-8");
                    about.setText(message2);
                    lbDetailImage.setBackgroundResource(R.drawable.oma);
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return view;
    }

    @Override
    public void onResume() {
        final String message1 = getArguments().getString("message");
        super.onResume();
        getView().setFocusableInTouchMode(true);
        getView().requestFocus();
        getView().setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                if (event.getAction() == KeyEvent.ACTION_UP && keyCode == KeyEvent.KEYCODE_BACK) {
                    switch (message1) {
                        case "history":
                            about_main_page = new About_Main_Page();
                            fragmentTransaction = getFragmentManager().beginTransaction();
                            fragmentTransaction.replace(R.id.fragment_container, about_main_page);
                            fragmentTransaction.addToBackStack(null);
                            fragmentTransaction.commit();
                            break;
                        case "population":
                            about_main_page = new About_Main_Page();
                            fragmentTransaction = getFragmentManager().beginTransaction();
                            fragmentTransaction.replace(R.id.fragment_container, about_main_page);
                            fragmentTransaction.addToBackStack(null);
                            fragmentTransaction.commit();
                            break;
                        case "geographic":
                            about_main_page = new About_Main_Page();
                            fragmentTransaction = getFragmentManager().beginTransaction();
                            fragmentTransaction.replace(R.id.fragment_container, about_main_page);
                            fragmentTransaction.addToBackStack(null);
                            fragmentTransaction.commit();
                            break;
                        case "economic":
                            about_main_page = new About_Main_Page();
                            fragmentTransaction = getFragmentManager().beginTransaction();
                            fragmentTransaction.replace(R.id.fragment_container, about_main_page);
                            fragmentTransaction.addToBackStack(null);
                            fragmentTransaction.commit();
                            break;
                        case "admin":
                            administration_main_page = new Administration_Main_Page();
                            fragmentTransaction = getFragmentManager().beginTransaction();
                            fragmentTransaction.replace(R.id.fragment_container, administration_main_page);
                            fragmentTransaction.addToBackStack(null);
                            fragmentTransaction.commit();
                            break;
                        case "shura":
                            administration_main_page = new Administration_Main_Page();
                            fragmentTransaction = getFragmentManager().beginTransaction();
                            fragmentTransaction.replace(R.id.fragment_container, administration_main_page);
                            fragmentTransaction.addToBackStack(null);
                            fragmentTransaction.commit();
                            break;
                        case "electronic_apply":
                            administration_main_page = new Administration_Main_Page();
                            fragmentTransaction = getFragmentManager().beginTransaction();
                            fragmentTransaction.replace(R.id.fragment_container, administration_main_page);
                            fragmentTransaction.addToBackStack(null);
                            fragmentTransaction.commit();
                            break;
                        case "advertisment":
                            administration_main_page = new Administration_Main_Page();
                            fragmentTransaction = getFragmentManager().beginTransaction();
                            fragmentTransaction.replace(R.id.fragment_container, administration_main_page);
                            fragmentTransaction.addToBackStack(null);
                            fragmentTransaction.commit();
                            break;
                        case "hesabat":
                            administration_main_page = new Administration_Main_Page();
                            fragmentTransaction = getFragmentManager().beginTransaction();
                            fragmentTransaction.replace(R.id.fragment_container, administration_main_page);
                            fragmentTransaction.addToBackStack(null);
                            fragmentTransaction.commit();
                            break;
                        case "elektron_xidmet":
                            administration_main_page = new Administration_Main_Page();
                            fragmentTransaction = getFragmentManager().beginTransaction();
                            fragmentTransaction.replace(R.id.fragment_container, administration_main_page);
                            fragmentTransaction.addToBackStack(null);
                            fragmentTransaction.commit();
                            break;
                        case "piti":
                            sheki_kitchen_main_page = new Sheki_Kitchen_Main_Page();
                            fragmentTransaction = getFragmentManager().beginTransaction();
                            fragmentTransaction.replace(R.id.fragment_container, sheki_kitchen_main_page);
                            fragmentTransaction.addToBackStack(null);
                            fragmentTransaction.commit();
                            break;
                        case "sheki_paxlavasi":
                            sheki_kitchen_main_page = new Sheki_Kitchen_Main_Page();
                            fragmentTransaction = getFragmentManager().beginTransaction();
                            fragmentTransaction.replace(R.id.fragment_container, sheki_kitchen_main_page);
                            fragmentTransaction.addToBackStack(null);
                            fragmentTransaction.commit();
                            break;
                        case "sheki_omasi":
                            sheki_kitchen_main_page = new Sheki_Kitchen_Main_Page();
                            fragmentTransaction = getFragmentManager().beginTransaction();
                            fragmentTransaction.replace(R.id.fragment_container, sheki_kitchen_main_page);
                            fragmentTransaction.addToBackStack(null);
                            fragmentTransaction.commit();
                            break;
                        case "toy_nogulu":
                            sheki_kitchen_main_page = new Sheki_Kitchen_Main_Page();
                            fragmentTransaction = getFragmentManager().beginTransaction();
                            fragmentTransaction.replace(R.id.fragment_container, sheki_kitchen_main_page);
                            fragmentTransaction.addToBackStack(null);
                            fragmentTransaction.commit();
                            break;
                        case "bamiye":
                            sheki_kitchen_main_page = new Sheki_Kitchen_Main_Page();
                            fragmentTransaction = getFragmentManager().beginTransaction();
                            fragmentTransaction.replace(R.id.fragment_container, sheki_kitchen_main_page);
                            fragmentTransaction.addToBackStack(null);
                            fragmentTransaction.commit();
                            break;
                        case "barama_shirni":
                            sheki_kitchen_main_page = new Sheki_Kitchen_Main_Page();
                            fragmentTransaction = getFragmentManager().beginTransaction();
                            fragmentTransaction.replace(R.id.fragment_container, sheki_kitchen_main_page);
                            fragmentTransaction.addToBackStack(null);
                            fragmentTransaction.commit();
                            break;
                        case "taxta_shirni":
                            sheki_kitchen_main_page = new Sheki_Kitchen_Main_Page();
                            fragmentTransaction = getFragmentManager().beginTransaction();
                            fragmentTransaction.replace(R.id.fragment_container, sheki_kitchen_main_page);
                            fragmentTransaction.addToBackStack(null);
                            fragmentTransaction.commit();
                            break;
                        case "cay_destgahi":
                            sheki_kitchen_main_page = new Sheki_Kitchen_Main_Page();
                            fragmentTransaction = getFragmentManager().beginTransaction();
                            fragmentTransaction.replace(R.id.fragment_container, sheki_kitchen_main_page);
                            fragmentTransaction.addToBackStack(null);
                            fragmentTransaction.commit();
                            break;
                        case "mindal":
                            sheki_kitchen_main_page = new Sheki_Kitchen_Main_Page();
                            fragmentTransaction = getFragmentManager().beginTransaction();
                            fragmentTransaction.replace(R.id.fragment_container, sheki_kitchen_main_page);
                            fragmentTransaction.addToBackStack(null);
                            fragmentTransaction.commit();
                            break;
                        case "duyme_shirni":
                            sheki_kitchen_main_page = new Sheki_Kitchen_Main_Page();
                            fragmentTransaction = getFragmentManager().beginTransaction();
                            fragmentTransaction.replace(R.id.fragment_container, sheki_kitchen_main_page);
                            fragmentTransaction.addToBackStack(null);
                            fragmentTransaction.commit();
                            break;
                        case "manpasi":
                            sheki_kitchen_main_page = new Sheki_Kitchen_Main_Page();
                            fragmentTransaction = getFragmentManager().beginTransaction();
                            fragmentTransaction.replace(R.id.fragment_container, sheki_kitchen_main_page);
                            fragmentTransaction.addToBackStack(null);
                            fragmentTransaction.commit();
                            break;
                        case "tel_halva":
                            sheki_kitchen_main_page = new Sheki_Kitchen_Main_Page();
                            fragmentTransaction = getFragmentManager().beginTransaction();
                            fragmentTransaction.replace(R.id.fragment_container, sheki_kitchen_main_page);
                            fragmentTransaction.addToBackStack(null);
                            fragmentTransaction.commit();
                            break;
                        case "peshveng_halva":
                            sheki_kitchen_main_page = new Sheki_Kitchen_Main_Page();
                            fragmentTransaction = getFragmentManager().beginTransaction();
                            fragmentTransaction.replace(R.id.fragment_container, sheki_kitchen_main_page);
                            fragmentTransaction.addToBackStack(null);
                            fragmentTransaction.commit();
                            break;
                        case "qirmabadam":
                            sheki_kitchen_main_page = new Sheki_Kitchen_Main_Page();
                            fragmentTransaction = getFragmentManager().beginTransaction();
                            fragmentTransaction.replace(R.id.fragment_container, sheki_kitchen_main_page);
                            fragmentTransaction.addToBackStack(null);
                            fragmentTransaction.commit();
                            break;
                        case "sheki_gurzesi":
                            sheki_kitchen_main_page = new Sheki_Kitchen_Main_Page();
                            fragmentTransaction = getFragmentManager().beginTransaction();
                            fragmentTransaction.replace(R.id.fragment_container, sheki_kitchen_main_page);
                            fragmentTransaction.addToBackStack(null);
                            fragmentTransaction.commit();
                            break;
                        case "sheki_kulcesi":
                            sheki_kitchen_main_page = new Sheki_Kitchen_Main_Page();
                            fragmentTransaction = getFragmentManager().beginTransaction();
                            fragmentTransaction.replace(R.id.fragment_container, sheki_kitchen_main_page);
                            fragmentTransaction.addToBackStack(null);
                            fragmentTransaction.commit();
                            break;
                        case "tutsud_plovu":
                            sheki_kitchen_main_page = new Sheki_Kitchen_Main_Page();
                            fragmentTransaction = getFragmentManager().beginTransaction();
                            fragmentTransaction.replace(R.id.fragment_container, sheki_kitchen_main_page);
                            fragmentTransaction.addToBackStack(null);
                            fragmentTransaction.commit();
                            break;
                        case "dosemeli_plov":
                            sheki_kitchen_main_page = new Sheki_Kitchen_Main_Page();
                            fragmentTransaction = getFragmentManager().beginTransaction();
                            fragmentTransaction.replace(R.id.fragment_container, sheki_kitchen_main_page);
                            fragmentTransaction.addToBackStack(null);
                            fragmentTransaction.commit();
                            break;
                        case "sheki_balvasi":
                            sheki_kitchen_main_page = new Sheki_Kitchen_Main_Page();
                            fragmentTransaction = getFragmentManager().beginTransaction();
                            fragmentTransaction.replace(R.id.fragment_container, sheki_kitchen_main_page);
                            fragmentTransaction.addToBackStack(null);
                            fragmentTransaction.commit();
                            break;
                        case "surfullu":
                            sheki_kitchen_main_page = new Sheki_Kitchen_Main_Page();
                            fragmentTransaction = getFragmentManager().beginTransaction();
                            fragmentTransaction.replace(R.id.fragment_container, sheki_kitchen_main_page);
                            fragmentTransaction.addToBackStack(null);
                            fragmentTransaction.commit();
                            break;
                        case "oma":
                            sheki_kitchen_main_page = new Sheki_Kitchen_Main_Page();
                            fragmentTransaction = getFragmentManager().beginTransaction();
                            fragmentTransaction.replace(R.id.fragment_container, sheki_kitchen_main_page);
                            fragmentTransaction.addToBackStack(null);
                            fragmentTransaction.commit();
                            break;
                    }


                    return true;

                }

                return false;
            }
        });
    }
}
