package main

import android.accounts.AccountManager
import android.app.AlertDialog
import android.bluetooth.BluetoothAdapter
import android.content.ActivityNotFoundException
import android.content.DialogInterface
import android.content.Intent
import android.net.wifi.WifiManager
import android.os.Bundle
import android.util.Patterns
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import az.com.sheki.R
import az.com.sheki.databinding.ActivityLandingBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import utils.AppUtils

private const val DISCOVER_DURATION = 300
private const val REQUEST_BLU = 1

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLandingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLandingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_landing)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home,
                R.id.navigation_information,
                R.id.navigation_administration,
                R.id.navigation_infrustructure,
                R.id.navigation_more
            )
        )
        //setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_share, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val li = layoutInflater
        val view = li.inflate(R.layout.item_share_adapter, null)
        val lbWhatsApp = view.findViewById<TextView>(R.id.lbwhatsApp)
        val lbSms = view.findViewById<TextView>(R.id.lbMessage)
        val lbEmail = view.findViewById<TextView>(R.id.lbEmail)
        val lbBluetooth = view.findViewById<TextView>(R.id.lbBleutooth)
        val lbOthers = view.findViewById<TextView>(R.id.lbOthers)

        var wifiManager: WifiManager?
        var builder: AlertDialog.Builder?
        val alert = AlertDialog.Builder(this@MainActivity)
        alert.setTitle("'Sheki city' tətbiqini paylaşın")
        alert.setNegativeButton(
            "İmtina et"
        ) { _: DialogInterface?, _: Int ->
            alert.setCancelable(
                true
            )
        }
        alert.setView(view)

        if (item.itemId == R.id.sharewhite) {
            lbWhatsApp.setOnClickListener { _: View? ->
                if (AppUtils.isInternetOn(this)) {
                    intent = Intent(Intent.ACTION_SEND)
                    intent.setType("text/plain")
                    intent.setPackage("com.whatsapp")
                    intent.putExtra(
                        Intent.EXTRA_TEXT,
                        """
                    Salam.'Sheki city' tətbiqini yükləyin və Şəkimizi təbliğ etmək üçün dostlarımız arasında paylaşaq
                    https://play.google.com/store/apps/details?id=az.com.sheki
                    """.trimIndent()
                    )
                    intent.putExtra(
                        Intent.EXTRA_SUBJECT,
                        """
                    Salam.'Sheki city' tətbiqini yükləyin və Şəkimizi təbliğ etmək üçün dostlarımız arasında paylaşaq
                    hhttps://play.google.com/store/apps/details?id=az.com.sheki
                    """.trimIndent()
                    )
                    try {
                        startActivity(intent)
                    } catch (ex: ActivityNotFoundException) {
                        Toast.makeText(
                            this@MainActivity,
                            "Əvvəlcə WhatsApp tətbiqini yükəməlisiniz.",
                            Toast.LENGTH_LONG
                        ).show()
                    }
                } else {
                    builder = AlertDialog.Builder(this@MainActivity)
                    builder
                        ?.setTitle("Diqqət!")
                        ?.setMessage("Sizin internet əlaqəniz yoxdur.\nİnternet əlaqəsini akivləşdirin.")
                        ?.setCancelable(true)
                        ?.setPositiveButton("Bəli") { dialog: DialogInterface, _: Int ->
                            wifiManager = applicationContext.getSystemService(WIFI_SERVICE) as WifiManager
                            wifiManager?.setWifiEnabled(true)
                            dialog.cancel()
                            intent = Intent(Intent.ACTION_SEND)
                            intent.setType("text/plain")
                            intent.setPackage("com.whatsapp")
                            intent.putExtra(
                                Intent.EXTRA_TEXT,
                                """
                                Salam.'Sheki city' tətbiqini yükləyin və Şəkimizi təbliğ etmək üçün dostlarımız arasında paylaşaq
                                https://play.google.com/store/apps/details?id=az.com.sheki
                                """.trimIndent()
                            )
                            intent.putExtra(
                                Intent.EXTRA_SUBJECT,
                                """
                                Salam.'Sheki city' tətbiqini yükləyin və Şəkimizi təbliğ etmək üçün dostlarımız arasında paylaşaq
                                hhttps://play.google.com/store/apps/details?id=az.com.sheki
                                """.trimIndent()
                            )
                            try {
                                startActivity(intent)
                            } catch (ex: ActivityNotFoundException) {
                                Toast.makeText(
                                    this@MainActivity,
                                    "Əvvəlcə WhatsApp tətbiqini yükəməlisiniz.",
                                    Toast.LENGTH_LONG
                                ).show()
                            }
                        }?.setNegativeButton("Xeyir") { dialog: DialogInterface, _: Int -> dialog.cancel() }
                    val alertDialog = builder?.create()
                    alertDialog?.show()
                }
            }
            lbSms.setOnClickListener { _: View? ->
                intent = Intent(Intent.ACTION_SEND)
                intent.setType("text/plain")
                intent.putExtra(
                    Intent.EXTRA_SUBJECT,
                    """Salam.'Sheki city' tətbiqini yükləyin və Şəkimizi təbliğ etmək üçün dostlarımız arasında paylaşaq
 https://play.google.com/store/apps/details?id=az.com.sheki"""
                )
                intent.putExtra(
                    Intent.EXTRA_TEXT,
                    """
                        Salam.'Sheki city' tətbiqini yükləyin və Şəkimizi təbliğ etmək üçün dostlarımız arasında paylaşaq
                        https://play.google.com/store/apps/details?id=az.com.sheki
                        """.trimIndent()
                )
                startActivity(intent)
            }
            lbEmail.setOnClickListener { _: View? ->
                if (AppUtils.isInternetOn(this)) {
                    val emailPattern =
                        Patterns.EMAIL_ADDRESS // API level 8+
                    val accounts =
                        AccountManager.get(applicationContext).accounts
                    for (account in accounts) {
                        if (emailPattern.matcher(account.name).matches()) {
                            val possibleEmail = account.name
                            intent = Intent(Intent.ACTION_SEND)
                            intent.putExtra(Intent.EXTRA_EMAIL, possibleEmail)
                            intent.putExtra(
                                Intent.EXTRA_SUBJECT,
                                """
                                    Salam.'Sheki city' tətbiqini yükləyin və Şəkimizi təbliğ etmək üçün dostlarımız arasında paylaşaq
                                    https://play.google.com/store/apps/details?id=az.com.sheki
                                    """.trimIndent()
                            )
                            intent.putExtra(
                                Intent.EXTRA_TEXT,
                                """
                                    Salam.'Sheki city' tətbiqini yükləyin və Şəkimizi təbliğ etmək üçün dostlarımız arasında paylaşaq
                                    https://play.google.com/store/apps/details?id=az.com.sheki
                                    """.trimIndent()
                            )
                            intent.setType("message/rfc822")
                            startActivity(Intent.createChooser(intent, "Choose an Email client :"))
                        }
                    }
                } else {
                    builder = AlertDialog.Builder(this@MainActivity)
                    builder
                        ?.setTitle("Diqqət!")
                        ?.setMessage("Sizin internet əlaqəniz yoxdur.\nİnternet əlaqəsini akivləşdirin.")
                        ?.setCancelable(true)
                        ?.setPositiveButton("Bəli"
                        ) { dialog, _ ->
                            wifiManager = applicationContext.getSystemService(WIFI_SERVICE) as WifiManager
                            wifiManager?.setWifiEnabled(true)
                            dialog.cancel()
                            val emailPattern =
                                Patterns.EMAIL_ADDRESS // API level 8+
                            val accounts =
                                AccountManager.get(applicationContext).accounts
                            for (account in accounts) {
                                if (emailPattern.matcher(account.name).matches()) {
                                    val possibleEmail = account.name
                                    intent = Intent(Intent.ACTION_SEND)
                                    intent.putExtra(Intent.EXTRA_EMAIL, possibleEmail)
                                    intent.putExtra(
                                        Intent.EXTRA_SUBJECT,
                                        """
                                                Salam.'Sheki city' tətbiqini yükləyin və Şəkimizi təbliğ etmək üçün dostlarımız arasında paylaşaq
                                                https://play.google.com/store/apps/details?id=az.com.sheki
                                                """.trimIndent()
                                    )
                                    intent.putExtra(
                                        Intent.EXTRA_TEXT,
                                        """
                                                Salam.'Sheki city' tətbiqini yükləyin və Şəkimizi təbliğ etmək üçün dostlarımız arasında paylaşaq
                                                https://play.google.com/store/apps/details?id=az.com.sheki
                                                """.trimIndent()
                                    )
                                    intent.setType("message/rfc822")
                                    startActivity(
                                        Intent.createChooser(
                                            intent,
                                            "Choose an Email client :"
                                        )
                                    )
                                }
                            }
                        }?.setNegativeButton("Xeyir") { dialog: DialogInterface, _: Int ->
                            dialog.cancel()
                        }
                    val alertDialog = builder?.create()
                    alertDialog?.show()
                }
            }
            lbBluetooth.setOnClickListener { _: View? ->
                val btAdapter = BluetoothAdapter.getDefaultAdapter()
                if (btAdapter == null) {
                    Toast.makeText(
                        this@MainActivity,
                        "Lütfən bluetoothu aktivləşdirin!",
                        Toast.LENGTH_LONG
                    )
                        .show()
                } else {
                    intent = Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE)
                    intent.putExtra(BluetoothAdapter.EXTRA_DISCOVERABLE_DURATION, DISCOVER_DURATION)
                    startActivityForResult(intent, REQUEST_BLU)
                }
            }
            lbOthers.setOnClickListener { _: View? ->
                alert.setCancelable(true)
                intent = Intent(Intent.ACTION_SEND)
                intent.setType("text/plain")
                val path =
                    """
                    Salam.'Sheki city' tətbiqini yükləyin və Şəkimizi təbliğ etmək üçün dostlarımız arasında paylaşaq
                    https://play.google.com/store/apps/details?id=az.com.sheki
                    """.trimIndent()
                intent.putExtra(Intent.EXTRA_STREAM, path)
                startActivity(Intent.createChooser(intent, "'Sheki.az'ı paylaşın"))
            }
            alert.show()
        }
        return super.onOptionsItemSelected(item)
    }

}