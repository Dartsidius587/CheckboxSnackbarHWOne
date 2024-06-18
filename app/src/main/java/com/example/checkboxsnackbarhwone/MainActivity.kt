package com.example.checkboxsnackbarhwone

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var inputTextET: EditText
    private lateinit var resultTV: TextView

    private lateinit var buttonSaveBTN: Button
    private lateinit var buttonDeleteBTN: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        init()

    }

    private fun init() {
        setContentView(R.layout.activity_main)
        inputTextET = findViewById(R.id.inputTextET)
        resultTV = findViewById(R.id.resultTV)

    }

    override fun onClick(view: View) {

        when (view.id) {
            R.id.buttonSaveBTN -> resultTV.text = inputTextET.text

            R.id.buttonDeleteBTN -> {
                Snackbar.make(view, "Подтвердите удаление", Snackbar.LENGTH_LONG)
                    .setAction("Удалить") {
                        resultTV.text = ""
                        inputTextET.text.clear()
                        Snackbar.make(view, "Данные удалены", Snackbar.LENGTH_LONG).show()
                    }.show()
            }
        }
    }
}