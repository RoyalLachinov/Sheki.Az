package tourism;


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

import lachinov.royal.com.main.R;

/**
 * A simple {@link Fragment} subclass.
 */
@SuppressWarnings("ConstantConditions")
public class Trusim_Detail extends Fragment {

    private FragmentTransaction fragmentTransaction;

    public Trusim_Detail() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.sheki_trusim_detail, container, false);

        TextView lbAboutTrusimDetail = (TextView) view.findViewById(R.id.lbAboutTrusimDetail);
        TextView lbDetailImageOne = (TextView) view.findViewById(R.id.lbDetailImageOne);
        TextView lbDetailImageTwo = (TextView) view.findViewById(R.id.lbDetailImageTwo);
        TextView lbDetailImageThree = (TextView) view.findViewById(R.id.lbDetailImageThree);
        TextView lbDetailImageFour = (TextView) view.findViewById(R.id.lbDetailImageFour);
        TextView lbDetailImageFive = (TextView) view.findViewById(R.id.lbDetailImageFive);

        Properties properties = new Properties();
        String message1 = getArguments().getString("message");

        switch (message1) {
            case "marxal":
                String message2;
                InputStream inputStream;
                try {
                    inputStream = getActivity().getBaseContext().getAssets().open("history");
                    properties.load(inputStream);
                    message2 = new String(properties.getProperty(message1).getBytes("ISO-8859-1"), "UTF-8");
                    lbAboutTrusimDetail.setText(message2);

                    lbDetailImageOne.setBackgroundResource(R.drawable.marxal1);
                    lbDetailImageTwo.setBackgroundResource(R.drawable.marxal2);
                    lbDetailImageThree.setBackgroundResource(R.drawable.marxal3);
                    lbDetailImageFour.setBackgroundResource(R.drawable.marxal4);
                    lbDetailImageFive.setBackgroundResource(R.drawable.marxal5);

                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case "xan_sarayi":
                try {
                    inputStream = getActivity().getBaseContext().getAssets().open("history");
                    properties.load(inputStream);
                    message2 = new String(properties.getProperty(message1).getBytes("ISO-8859-1"), "UTF-8");
                    lbAboutTrusimDetail.setText(message2);

                    lbDetailImageOne.setBackgroundResource(R.drawable.xansarayi1);
                    lbDetailImageTwo.setBackgroundResource(R.drawable.xansarayi2);
                    lbDetailImageThree.setBackgroundResource(R.drawable.xansaray3);
                    lbDetailImageFour.setBackgroundResource(R.drawable.xansaray4);
                    lbDetailImageFive.setBackgroundResource(R.drawable.xansaray5);

                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case "karvansaray":
                try {
                    inputStream = getActivity().getBaseContext().getAssets().open("history");
                    properties.load(inputStream);
                    message2 = new String(properties.getProperty(message1).getBytes("ISO-8859-1"), "UTF-8");
                    lbAboutTrusimDetail.setText(message2);

                    lbDetailImageOne.setBackgroundResource(R.drawable.karvansaray1);
                    lbDetailImageTwo.setBackgroundResource(R.drawable.karvansaray2);
                    lbDetailImageThree.setBackgroundResource(R.drawable.karvansaray3);
                    lbDetailImageFour.setBackgroundResource(R.drawable.karvansaray4);
                    lbDetailImageFive.setBackgroundResource(R.drawable.karvansaray5);

                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case "sheki_palace":
                try {
                    inputStream = getActivity().getBaseContext().getAssets().open("history");
                    properties.load(inputStream);
                    message2 = new String(properties.getProperty(message1).getBytes("ISO-8859-1"), "UTF-8");
                    lbAboutTrusimDetail.setText(message2);

                    lbDetailImageOne.setBackgroundResource(R.drawable.shekipalace1);
                    lbDetailImageTwo.setBackgroundResource(R.drawable.shekipalace2);
                    lbDetailImageThree.setBackgroundResource(R.drawable.shekipalace3);
                    lbDetailImageFour.setBackgroundResource(R.drawable.shekipalace4);
                    lbDetailImageFive.setBackgroundResource(R.drawable.shekipalace5);

                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case "sheki_park":
                //         try {
//                inputStream = getActivity().getBaseContext().getAssets().open("history");
//                properties.load(inputStream);
//                message2 = new String(properties.getProperty(message1).getBytes("ISO-8859-1"), "UTF-8");
//                lbAboutTrusimDetail.setText(message2);

                lbDetailImageOne.setBackgroundResource(R.drawable.shekipark1);
                lbDetailImageTwo.setBackgroundResource(R.drawable.shekipark2);
                lbDetailImageThree.setBackgroundResource(R.drawable.shekipark3);
                lbDetailImageFour.setBackgroundResource(R.drawable.shekipark4);
                lbDetailImageFive.setBackgroundResource(R.drawable.shekipark5);
//
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
                break;
            case "shekixanovlarinevi":
                try {
                    inputStream = getActivity().getBaseContext().getAssets().open("history");
                    properties.load(inputStream);
                    message2 = new String(properties.getProperty(message1).getBytes("ISO-8859-1"), "UTF-8");
                    lbAboutTrusimDetail.setText(message2);

                    lbDetailImageOne.setBackgroundResource(R.drawable.shekixanovlarinevi);
                    lbDetailImageTwo.setBackgroundResource(R.drawable.xanevi2);
                    lbDetailImageThree.setBackgroundResource(R.drawable.xansaray3);
                    lbDetailImageFour.setBackgroundResource(R.drawable.shekipalace4);
                    lbDetailImageFive.setBackgroundResource(R.drawable.shekipalace5);

                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case "sheki_saray":
                try {
                    inputStream = getActivity().getBaseContext().getAssets().open("history");
                    properties.load(inputStream);
                    message2 = new String(properties.getProperty(message1).getBytes("ISO-8859-1"), "UTF-8");
                    lbAboutTrusimDetail.setText(message2);

                    lbDetailImageOne.setBackgroundResource(R.drawable.sekisaray);
                    lbDetailImageTwo.setBackgroundResource(R.drawable.shekisaray2);
                    lbDetailImageThree.setBackgroundResource(R.drawable.shekisaray5);
                    lbDetailImageFour.setBackgroundResource(R.drawable.shekisaray4);
                    lbDetailImageFive.setBackgroundResource(R.drawable.shekisaray5);

                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case "olimpik_hotel":
                try {
                    inputStream = getActivity().getBaseContext().getAssets().open("history");
                    properties.load(inputStream);
                    message2 = new String(properties.getProperty(message1).getBytes("ISO-8859-1"), "UTF-8");
                    lbAboutTrusimDetail.setText(message2);

                    lbDetailImageOne.setBackgroundResource(R.drawable.olimpik1);
                    lbDetailImageTwo.setBackgroundResource(R.drawable.olimpik2);
                    lbDetailImageThree.setBackgroundResource(R.drawable.olimpik3);
                    lbDetailImageFour.setBackgroundResource(R.drawable.olimpik4);
                    lbDetailImageFive.setBackgroundResource(R.drawable.olimpik5);

                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case "issam_hotel":
                try {
                    inputStream = getActivity().getBaseContext().getAssets().open("history");
                    properties.load(inputStream);
                    message2 = new String(properties.getProperty(message1).getBytes("ISO-8859-1"), "UTF-8");
                    lbAboutTrusimDetail.setText(message2);

                    lbDetailImageOne.setBackgroundResource(R.drawable.issam1);
                    lbDetailImageTwo.setBackgroundResource(R.drawable.issam2);
                    lbDetailImageThree.setBackgroundResource(R.drawable.issam3);
                    lbDetailImageFour.setBackgroundResource(R.drawable.issam4);
                    lbDetailImageFive.setBackgroundResource(R.drawable.issam5);

                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case "narin_qala":
                try {
                    inputStream = getActivity().getBaseContext().getAssets().open("history");
                    properties.load(inputStream);
                    message2 = new String(properties.getProperty(message1).getBytes("ISO-8859-1"), "UTF-8");
                    lbAboutTrusimDetail.setText(message2);

                    lbDetailImageOne.setBackgroundResource(R.drawable.narinqala1);
                    lbDetailImageTwo.setBackgroundResource(R.drawable.narinqala2);
                    lbDetailImageThree.setBackgroundResource(R.drawable.narinqala3);
                    lbDetailImageFour.setBackgroundResource(R.drawable.narinqala4);
                    lbDetailImageFive.setBackgroundResource(R.drawable.narinqala5);

                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case "alban_kilsesi":
                try {
                    inputStream = getActivity().getBaseContext().getAssets().open("history");
                    properties.load(inputStream);
                    message2 = new String(properties.getProperty(message1).getBytes("ISO-8859-1"), "UTF-8");
                    lbAboutTrusimDetail.setText(message2);

                    lbDetailImageOne.setBackgroundResource(R.drawable.kismebedi);
                    lbDetailImageTwo.setBackgroundResource(R.drawable.kishmebedi2);
                    lbDetailImageThree.setBackgroundResource(R.drawable.kishmebedi3);
                    lbDetailImageFour.setBackgroundResource(R.drawable.kishmebedi4);
                    lbDetailImageFive.setBackgroundResource(R.drawable.kishmebedi5);

                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case "cennet_bagi":
                try {
                    inputStream = getActivity().getBaseContext().getAssets().open("history");
                    properties.load(inputStream);
                    message2 = new String(properties.getProperty(message1).getBytes("ISO-8859-1"), "UTF-8");
                    lbAboutTrusimDetail.setText(message2);

                    lbDetailImageOne.setBackgroundResource(R.drawable.kishmebedi3);
                    lbDetailImageTwo.setBackgroundResource(R.drawable.c);
                    lbDetailImageThree.setBackgroundResource(R.drawable.cc);
                    lbDetailImageFour.setBackgroundResource(R.drawable.ccc);
                    lbDetailImageFive.setBackgroundResource(R.drawable.cccc);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
        }
        return view;
    }

    @Override
    public void onResume() {
     //   final String message1 = getArguments().getString("message");
        super.onResume();
        getView().setFocusableInTouchMode(true);
        getView().requestFocus();
        getView().setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                if (event.getAction() == KeyEvent.ACTION_UP && keyCode == KeyEvent.KEYCODE_BACK) {

                        Sheki_Trusim_Main_Page sheki_trusim_main_page = new Sheki_Trusim_Main_Page();
                        fragmentTransaction = getFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.fragment_container, sheki_trusim_main_page);
                        fragmentTransaction.addToBackStack(null);
                        fragmentTransaction.commit();



                    return true;

                }

                return false;
            }
        });
    }

}
