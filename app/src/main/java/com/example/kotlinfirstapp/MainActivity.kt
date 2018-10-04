package com.example.kotlinfirstapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*


class MainActivity : AppCompatActivity() {

    var names = arrayOf("Иван", "Марья", "Петр", "Антон", "Даша", "Борис", "Костя", "Игорь", "Анна", "Денис", "Андрей")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // находим список
        val lvMain = findViewById<ListView>(R.id.lvMain)

        // создаем адаптер
        val adapter = ArrayAdapter(this,
                android.R.layout.simple_list_item_1, names)

        // присваиваем адаптер списку
        lvMain.setAdapter(adapter)
    }

    fun goToMenu(view: View) {
        val myToast = Toast.makeText(this, "goToMenu", Toast.LENGTH_SHORT)

        // Create an Intent to start the second activity
        val menuIntent = Intent(this, menuActivity::class.java)

        // Start the new activity.
        startActivity(menuIntent)
    }
}
