package main;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import java.util.regex.Pattern;

import about.About_Main_Page;
import administration.Administration_Main_Page;
import infrastructure.Infrastrucutre_Main_Page;
import kitchen.Sheki_Kitchen_Main_Page;
import lachinov.royal.com.main.R;
import location.Location_Sheki;
import tourism.Sheki_Trusim_Main_Page;

@SuppressWarnings("ConstantConditions")
public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private Intent intent;
    private WifiManager wifiManager;
    private AlertDialog.Builder builder;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button menu1 = (Button) findViewById(R.id.menu1);
        menu1.setBackgroundResource(R.drawable.home1);
        Button menu2 = (Button) findViewById(R.id.menu2);
        menu2.setBackgroundResource(R.drawable.information);
        Button menu3 = (Button) findViewById(R.id.menu3);
        menu3.setBackgroundResource(R.drawable.administration);
        Button menu4 = (Button) findViewById(R.id.menu4);
        menu4.setBackgroundResource(R.drawable.infrastructur);
        Button menu5 = (Button) findViewById(R.id.menu5);
        menu5.setBackgroundResource(R.drawable.tourism1);
        Button menu6 = (Button) findViewById(R.id.menu6);
        menu6.setBackgroundResource(R.drawable.metbex);
        Button menu7 = (Button) findViewById(R.id.menu7);
        menu7.setBackgroundResource(R.drawable.location1);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Ana səhifə");
        //actionBar.setBackgroundDrawable(new ColorDrawable(Color.BLUE));
        actionBar.show();
        // actionBar.setDisplayHomeAsUpEnabled(true);

        fragmentManager = getFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.animator.fragment_slide_up, R.animator.fragment_slide_down);
        Menu_Fragment_Main fragment_main = new Menu_Fragment_Main();
        fragmentTransaction.replace(R.id.fragment_container, fragment_main);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

        menu1.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.HONEYCOMB_MR2)
            @Override
            public void onClick(View v) {

                //   Thread t = new Thread() {
                //      public void run() {

                fragmentManager = getFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.setCustomAnimations(R.animator.fragment_slide_up, R.animator.fragment_slide_down);

                Menu_Fragment_Main fragment_main = new Menu_Fragment_Main();

                fragmentTransaction.replace(R.id.fragment_container, fragment_main);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();


                ActionBar actionBar = getSupportActionBar();
                actionBar.setTitle("Ana səhifə");
                actionBar.setBackgroundDrawable(new ColorDrawable(Color.BLUE));
                actionBar.show();
                actionBar.setDisplayHomeAsUpEnabled(true);
                //   }
                //  };
                //  t.start();
            }
        });
        menu2.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.HONEYCOMB_MR2)
            @Override
            public void onClick(View v) {

                fragmentManager = getFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.setCustomAnimations(R.animator.fragment_slide_right_enter, R.animator.fragment_slide_left_exit);

                About_Main_Page about_main_page = new About_Main_Page();

                fragmentTransaction.replace(R.id.fragment_container, about_main_page);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

                ActionBar actionBar = getSupportActionBar();
                actionBar.setTitle("Rayon haqqında");
                actionBar.setBackgroundDrawable(new ColorDrawable(Color.BLUE));
                actionBar.show();
                actionBar.setDisplayHomeAsUpEnabled(true);

            }
        });


        menu3.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.HONEYCOMB_MR2)
            @Override
            public void onClick(View v) {

                fragmentManager = getFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.setCustomAnimations(R.animator.fragment_slide_right_enter, R.animator.fragment_slide_left_exit);

                Administration_Main_Page administration_main_page = new Administration_Main_Page();

                fragmentTransaction.replace(R.id.fragment_container, administration_main_page);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

                ActionBar actionBar = getSupportActionBar();
                actionBar.setTitle("İcra Hakimiyyəti");
                actionBar.setBackgroundDrawable(new ColorDrawable(Color.BLUE));
                actionBar.show();
                actionBar.setDisplayHomeAsUpEnabled(true);

            }
        });

        menu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                fragmentManager = getFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.setCustomAnimations(R.animator.fragment_slide_right_enter, R.animator.fragment_slide_left_exit);

                Infrastrucutre_Main_Page infrastrucutre_main_page = new Infrastrucutre_Main_Page();

                fragmentTransaction.replace(R.id.fragment_container, infrastrucutre_main_page);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

                ActionBar actionBar = getSupportActionBar();
                actionBar.setTitle("İnfrastrukturu");
                actionBar.setBackgroundDrawable(new ColorDrawable(Color.BLUE));
                actionBar.show();
                actionBar.setDisplayHomeAsUpEnabled(true);

            }
        });

        menu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fragmentManager = getFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.setCustomAnimations(R.animator.fragment_slide_right_enter, R.animator.fragment_slide_left_exit);

                Sheki_Trusim_Main_Page sheki_trusim_main_page = new Sheki_Trusim_Main_Page();

                fragmentTransaction.replace(R.id.fragment_container, sheki_trusim_main_page);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

                ActionBar actionBar = getSupportActionBar();
                actionBar.setTitle("Turizm mərkəzləri");
                actionBar.setBackgroundDrawable(new ColorDrawable(Color.BLUE));
                actionBar.show();
                actionBar.setDisplayHomeAsUpEnabled(true);

            }
        });

        menu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fragmentManager = getFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.setCustomAnimations(R.animator.fragment_slide_right_enter, R.animator.fragment_slide_left_exit);

                Sheki_Kitchen_Main_Page sheki_kitchen_main_page = new Sheki_Kitchen_Main_Page();

                fragmentTransaction.replace(R.id.fragment_container, sheki_kitchen_main_page);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

                ActionBar actionBar = getSupportActionBar();
                actionBar.setTitle("Şəki mətbəxi");
                actionBar.setBackgroundDrawable(new ColorDrawable(Color.BLUE));
                actionBar.show();
                actionBar.setDisplayHomeAsUpEnabled(true);


            }
        });

        menu7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fragmentManager = getFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.setCustomAnimations(R.animator.fragment_slide_right_enter, R.animator.fragment_slide_left_exit);

                Location_Sheki location_sheki = new Location_Sheki();

                fragmentTransaction.replace(R.id.fragment_container, location_sheki);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

                ActionBar actionBar = getSupportActionBar();
                actionBar.setTitle("Xəritədə yeri");
                actionBar.setBackgroundDrawable(new ColorDrawable(Color.BLUE));
                actionBar.show();
                actionBar.setDisplayHomeAsUpEnabled(true);


            }
        });

        //App ID: ca-app-pub-3223347938013277~7651170342
        MobileAds.initialize(MainActivity.this, "ca-app-pub-3223347938013277~7651170342");

        loadBannerAd();
        AdRequest adRequestInters = new AdRequest.Builder().build();
        mInterstitialAd = new InterstitialAd(MainActivity.this);
        mInterstitialAd.setAdUnitId(getString(R.string.interstitial_ads_unit_id));
        mInterstitialAd.loadAd(adRequestInters);
        mInterstitialAd.setAdListener(new AdListener() {
            public void onAdLoaded() {
                showInterstitial();
            }

            @Override
            public void onAdFailedToLoad(int errorCode) {
                // Code to be executed when an ad request fails.
                Log.i("Ads", "onAdFailedToLoad");
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when the ad is displayed.
                Log.i("Ads", "onAdOpened");
            }

            @Override
            public void onAdLeftApplication() {
                // Code to be executed when the user has left the app.
                Log.i("Ads", "onAdLeftApplication");
            }

            @Override
            public void onAdClosed() {
                // Code to be executed when when the interstitial ad is closed.
                Log.i("Ads", "onAdClosed");
            }
        });
    }

    private void showInterstitial() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }
    }

    private void loadBannerAd() {
        AdView mAdView = (AdView) findViewById(R.id.adViewMain);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // return super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu_share, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        LayoutInflater li = getLayoutInflater();
        View view = li.inflate(R.layout.share_adapter, null);
        final TextView lbWhatsApp = (TextView) view.findViewById(R.id.lbwhatsApp);
        final TextView lbSms = (TextView) view.findViewById(R.id.lbMessage);
        final TextView lbEmail = (TextView) view.findViewById(R.id.lbEmail);
        final TextView lbBluetooth = (TextView) view.findViewById(R.id.lbBleutooth);
        final TextView lbOthers = (TextView) view.findViewById(R.id.lbOthers);

        final AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
        alert.setTitle("'Sheki city' tətbiqini paylaşın");
        alert.setNegativeButton("İmtina et", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                alert.setCancelable(true);
            }
        });
        alert.setView(view);

        int id = item.getItemId();
        switch (id) {
            case R.id.sharewhite:
                lbWhatsApp.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (isInternetOn()) {
                            intent = new Intent(Intent.ACTION_SEND);
                            intent.setType("text/plain");
                            intent.setPackage("com.whatsapp");
                            intent.putExtra(Intent.EXTRA_TEXT, "Salam.'Sheki city' tətbiqini yükləyin və Şəkimizi təbliğ etmək üçün dostlarımız arasında paylaşaq\n" + "https://play.google.com/store/apps/details?id=az.com.sheki");
                            intent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Salam.'Sheki city' tətbiqini yükləyin və Şəkimizi təbliğ etmək üçün dostlarımız arasında paylaşaq\n" + "hhttps://play.google.com/store/apps/details?id=az.com.sheki");
                            try {
                                startActivity(intent);
                                overridePendingTransition(R.anim.right_in, R.anim.left_out);
                            } catch (android.content.ActivityNotFoundException ex) {
                                Toast.makeText(MainActivity.this, "Əvvəlcə WhatsApp tətbiqini yükəməlisiniz.", Toast.LENGTH_LONG).show();
                            }

                        } else {
                            builder = new AlertDialog.Builder(MainActivity.this);
                            builder.setTitle("Diqqət!");
                            builder.setMessage("Sizin internet əlaqəniz yoxdur.\nİnternet əlaqəsini akivləşdirin.").setCancelable(true).setPositiveButton("Bəli", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    wifiManager = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                                    wifiManager.setWifiEnabled(true);
                                    dialog.cancel();

                                    intent = new Intent(Intent.ACTION_SEND);
                                    intent.setType("text/plain");
                                    intent.setPackage("com.whatsapp");
                                    intent.putExtra(Intent.EXTRA_TEXT, "Salam.'Sheki city' tətbiqini yükləyin və Şəkimizi təbliğ etmək üçün dostlarımız arasında paylaşaq\n" + "https://play.google.com/store/apps/details?id=az.com.sheki");
                                    intent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Salam.'Sheki city' tətbiqini yükləyin və Şəkimizi təbliğ etmək üçün dostlarımız arasında paylaşaq\n" + "hhttps://play.google.com/store/apps/details?id=az.com.sheki");
                                    try {
                                        startActivity(intent);
                                        overridePendingTransition(R.anim.right_in, R.anim.left_out);
                                    } catch (android.content.ActivityNotFoundException ex) {
                                        Toast.makeText(MainActivity.this, "Əvvəlcə WhatsApp tətbiqini yükəməlisiniz.", Toast.LENGTH_LONG).show();
                                    }
                                }
                            }).setNegativeButton("Xeyir", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                            AlertDialog alertDialog = builder.create();
                            alertDialog.show();
                        }
                    }
                });

                lbSms.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent = new Intent(Intent.ACTION_SEND);
                        intent.setType("text/plain");
                        intent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Salam.'Sheki city' tətbiqini yükləyin və Şəkimizi təbliğ etmək üçün dostlarımız arasında paylaşaq\n" + " https://play.google.com/store/apps/details?id=az.com.sheki");
                        intent.putExtra(android.content.Intent.EXTRA_TEXT, "Salam.'Sheki city' tətbiqini yükləyin və Şəkimizi təbliğ etmək üçün dostlarımız arasında paylaşaq\n" + "https://play.google.com/store/apps/details?id=az.com.sheki");
                        startActivity(intent);
                        overridePendingTransition(R.anim.right_in, R.anim.left_out);

                    }
                });

                lbEmail.setOnClickListener(new View.OnClickListener() {
                    @TargetApi(Build.VERSION_CODES.FROYO)
                    @Override
                    public void onClick(View v) {
                        if (isInternetOn()) {
                            Pattern emailPattern = Patterns.EMAIL_ADDRESS; // API level 8+
                            Account[] accounts = AccountManager.get(getApplicationContext()).getAccounts();
                            for (Account account : accounts) {
                                if (emailPattern.matcher(account.name).matches()) {
                                    String possibleEmail = account.name;
                                    intent = new Intent(Intent.ACTION_SEND);
                                    intent.putExtra(Intent.EXTRA_EMAIL, possibleEmail);
                                    intent.putExtra(Intent.EXTRA_SUBJECT, "Salam.'Sheki city' tətbiqini yükləyin və Şəkimizi təbliğ etmək üçün dostlarımız arasında paylaşaq\n" + "https://play.google.com/store/apps/details?id=az.com.sheki");
                                    intent.putExtra(Intent.EXTRA_TEXT, "Salam.'Sheki city' tətbiqini yükləyin və Şəkimizi təbliğ etmək üçün dostlarımız arasında paylaşaq\n" + "https://play.google.com/store/apps/details?id=az.com.sheki");
                                    intent.setType("message/rfc822");
                                    startActivity(Intent.createChooser(intent, "Choose an Email client :"));
                                    overridePendingTransition(R.anim.right_in, R.anim.left_out);
                                }
                            }
                        } else {
                            builder = new AlertDialog.Builder(MainActivity.this);
                            builder.setTitle("Diqqət!");
                            builder.setMessage("Sizin internet əlaqəniz yoxdur.\nİnternet əlaqəsini akivləşdirin.").setCancelable(true).setPositiveButton("Bəli", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    wifiManager = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                                    wifiManager.setWifiEnabled(true);
                                    dialog.cancel();

                                    Pattern emailPattern = Patterns.EMAIL_ADDRESS; // API level 8+
                                    Account[] accounts = AccountManager.get(getApplicationContext()).getAccounts();
                                    for (Account account : accounts) {
                                        if (emailPattern.matcher(account.name).matches()) {
                                            String possibleEmail = account.name;
                                            intent = new Intent(Intent.ACTION_SEND);
                                            intent.putExtra(Intent.EXTRA_EMAIL, possibleEmail);
                                            intent.putExtra(Intent.EXTRA_SUBJECT, "Salam.'Sheki city' tətbiqini yükləyin və Şəkimizi təbliğ etmək üçün dostlarımız arasında paylaşaq\n" + "https://play.google.com/store/apps/details?id=az.com.sheki");
                                            intent.putExtra(Intent.EXTRA_TEXT, "Salam.'Sheki city' tətbiqini yükləyin və Şəkimizi təbliğ etmək üçün dostlarımız arasında paylaşaq\n" + "https://play.google.com/store/apps/details?id=az.com.sheki");
                                            intent.setType("message/rfc822");
                                            startActivity(Intent.createChooser(intent, "Choose an Email client :"));
                                            overridePendingTransition(R.anim.right_in, R.anim.left_out);
                                        }
                                    }
                                }
                            }).setNegativeButton("Xeyir", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                            AlertDialog alertDialog = builder.create();
                            alertDialog.show();
                        }
                    }
                });

                lbBluetooth.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        BluetoothAdapter btAdapter = BluetoothAdapter.getDefaultAdapter();
                        if (btAdapter == null) {
                            Toast.makeText(MainActivity.this, "Lütfən bluetoothu aktivləşdirin!", Toast.LENGTH_LONG).show();
                        } else {
                            final int DISCOVER_DURATION = 300;
                            final int REQUEST_BLU = 1;
                            intent = new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
                            intent.putExtra(BluetoothAdapter.EXTRA_DISCOVERABLE_DURATION, DISCOVER_DURATION);
                            startActivityForResult(intent, REQUEST_BLU);
                            overridePendingTransition(R.anim.right_in, R.anim.left_out);
                        }

                    }
                });

                lbOthers.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alert.setCancelable(true);
                        intent = new Intent(Intent.ACTION_SEND);
                        intent.setType("text/plain");
                        String path = "Salam.'Sheki city' tətbiqini yükləyin və Şəkimizi təbliğ etmək üçün dostlarımız arasında paylaşaq\n" + "https://play.google.com/store/apps/details?id=az.com.sheki";
                        intent.putExtra(Intent.EXTRA_STREAM, path);
                        startActivity(Intent.createChooser(intent, "'Sheki.az'ı paylaşın"));
                        overridePendingTransition(R.anim.right_in, R.anim.left_out);
                    }
                });

                alert.show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private boolean isInternetOn() {
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        return activeNetwork != null && activeNetwork.isConnectedOrConnecting();
    }
}
