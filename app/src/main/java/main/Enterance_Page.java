package main;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

import lachinov.royal.com.main.R;

@SuppressWarnings("ConstantConditions")
public class Enterance_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enternace_page);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("");
        //actionBar.setBackgroundDrawable(new ColorDrawable(Color.BLUE));
        actionBar.show();
        // actionBar.setDisplayHomeAsUpEnabled(true);

        Thread t = new Thread() {
            @Override
            public void run() {
                super.run();
                try {
                    Thread.sleep(1500);
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    finish();
                }

            }
        };
        t.start();

    }
}
