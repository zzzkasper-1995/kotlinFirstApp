package com.example.kotlinfirstapp

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

    fun toastMe(view: View) {
        // Get the text view
        val contentText = findViewById<EditText>(R.id.contentText)

        val myToast = Toast.makeText(this, contentText.text, Toast.LENGTH_SHORT)
        myToast.show()
    }
}
