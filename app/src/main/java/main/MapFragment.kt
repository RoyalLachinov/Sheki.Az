package main

import android.app.AlertDialog
import androidx.fragment.app.Fragment
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import az.com.sheki.R

/**
 * A simple [Fragment] subclass.
 */
class MapFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu, container, false)
    }

    override fun onResume() {
        super.onResume()
        view?.isFocusableInTouchMode = true
        view?.requestFocus()
        view?.setOnKeyListener { _: View?, keyCode: Int, event: KeyEvent ->
            if (event.action == KeyEvent.ACTION_UP && keyCode == KeyEvent.KEYCODE_BACK) {
                val alertDialogBuilder = AlertDialog.Builder(activity)
                alertDialogBuilder.setTitle("Diqqət!")
                alertDialogBuilder
                    .setMessage("Tətbiqdən çıxmağa əminsinizmi?")
                    .setCancelable(false)
                    .setPositiveButton("Bəli") { _: DialogInterface?, _: Int ->
                        val intent = Intent(Intent.ACTION_MAIN)
                        intent.addCategory(Intent.CATEGORY_HOME)
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                        startActivity(intent)
                    }
                    .setNegativeButton("Xeyr") { dialog: DialogInterface, _: Int -> dialog.cancel() }
                val alertDialog = alertDialogBuilder.create()
                alertDialog.show()
                return@setOnKeyListener true
            }
            false
        }
    }
}
