package main

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.content.SharedPreferences
import android.net.Uri

/**
 * Created by Royal_L on 20-Nov-17.
 */
object AppRater {
    private const val APP_TITLE = "'Şəki şəhəri'" // App Name
    private const val APP_PNAME = "az.com.sheki" // Gradle app id
    private const val DAYS_UNTIL_PROMPT = 0 //Min number of days
    private const val LAUNCHES_UNTIL_PROMPT = 0 //Min number of launches
    fun launchTheApp(mContext: Context) {
        val prefs = mContext.getSharedPreferences("apprater", 0)
        if (prefs.getBoolean("dontshowagain", false)) {
            return
        }
        val editor = prefs.edit()

        // Increment launch counter
        val launchCount = prefs.getLong("launch_count", 0) + 1
        editor.putLong("launch_count", launchCount)

        // Get date of first launch
        var dateFirstLaunch = prefs.getLong("date_firstlaunch", 0)
        if (dateFirstLaunch == 0L) {
            dateFirstLaunch = System.currentTimeMillis()
            editor.putLong("date_firstlaunch", dateFirstLaunch)
        }

        // Wait at least n days before opening
        if (launchCount >= LAUNCHES_UNTIL_PROMPT) {
            if (System.currentTimeMillis() >= dateFirstLaunch + DAYS_UNTIL_PROMPT * 24 * 60 * 60 * 1000) {
                showRateDialog(mContext, editor)
            }
        }
        editor.commit()
    }

    private fun showRateDialog(mContext: Context, editor: SharedPreferences.Editor?) {
        val alertDialog = AlertDialog.Builder(mContext).create()
        alertDialog.setTitle("$APP_TITLE qiymətləndir ")
        alertDialog.setMessage("Əgər $APP_TITLE app-i bəyəndinizsə qiymətləndirin. Dəstəyiniz üçün çox sağolun!")
        alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "Qiymətləndir") { _: DialogInterface?, _: Int ->
            alertDialog.dismiss()
            mContext.startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("market://details?id=$APP_PNAME")
                )
            )
        }
        alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "İmtina et") { _: DialogInterface?, id: Int ->
            if (editor != null) {
                editor.putBoolean("dontshowagain", true)
                editor.commit()
            }
            alertDialog.dismiss()
        }
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Sonra") { _: DialogInterface?, _: Int -> alertDialog.dismiss() }
        alertDialog.show()
    }
}
