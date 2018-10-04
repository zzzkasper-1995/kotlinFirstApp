package com.example.kotlinfirstapp

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.EditText
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_menu.*

class menuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

    fun goToBack (view: View){
        // Get the text view
        val myToast = Toast.makeText(this, "goToBack", Toast.LENGTH_SHORT)
        myToast.show()

        val returnBtn = Intent(applicationContext,
                MainActivity::class.java)

        startActivity(returnBtn)
    }

}
