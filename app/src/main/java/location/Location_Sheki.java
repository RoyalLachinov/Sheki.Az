package location;


import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.app.Fragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Toast;

import lachinov.royal.com.main.R;
import main.MainActivity;

/**
 * A simple {@link Fragment} subclass.
 */
@SuppressWarnings("ConstantConditions")
@SuppressLint("SetJavaScriptEnabled")
public class Location_Sheki extends Fragment {

    public Location_Sheki() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.sheki_location__main_page, container, false);
        WebView webView = (WebView) view.findViewById(R.id.webViewLocation);
        if(isInternetOn()){
            webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
            webView.getSettings().setJavaScriptEnabled(true);
            String url = ("https://www.google.ru/maps/@41.1904745,47.1754651,13z");
            webView.loadUrl(url);
        }else{
            Toast.makeText(this.getActivity(), "Lütfən internet əlaqənizi yoxlayın", Toast.LENGTH_LONG).show();
        }

        return view;
    }

    private boolean isInternetOn() {
        ConnectivityManager cm = (ConnectivityManager)this.getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        return activeNetwork != null && activeNetwork.isConnectedOrConnecting();
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
