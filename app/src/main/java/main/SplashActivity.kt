package main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import az.com.sheki.R

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.enternace_page)
        val actionBar = supportActionBar
        actionBar?.title = ""
        //actionBar.setBackgroundDrawable(new ColorDrawable(Color.BLUE));
        actionBar?.show()
        // actionBar.setDisplayHomeAsUpEnabled(true);
        val thread: Thread = object : Thread() {
            override fun run() {
                super.run()
                try {
                    sleep(1500)
                    val intent = Intent(applicationContext, MainActivity::class.java)
                    startActivity(intent)
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                } finally {
                    finish()
                }
            }
        }
        thread.start()
    }
}
