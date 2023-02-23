package com.example.appedittext


import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isGone
import com.example.appedittext.databinding.ActivityMainBinding

class MainActivity: AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding






    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)


        val editTxt_1 = findViewById<EditText>(R.id.editTxt_1)
        val editTxt_2 = findViewById<EditText>(R.id.editTxt_2)
        val editTxt_3 = findViewById<EditText>(R.id.editTxt_3)
        val editTxt_4 = findViewById<EditText>(R.id.editTxt_4)
        val txt1 = findViewById<TextView>(R.id.txtView_4)
        val txt2 = findViewById<TextView>(R.id.txtView_5)
        val txt3 = findViewById<TextView>(R.id.txtView_6)
        val txt4 = findViewById<TextView>(R.id.txtView_7)



        editTxt_1.setOnClickListener(){
            txt1.text = editTxt_1.text
            editTxt_2.requestFocus()
        }

        editTxt_2.setOnClickListener(){
            txt2.text = editTxt_2.text
            editTxt_3.requestFocus()
        }

        editTxt_3.setOnClickListener(){
            txt3.text = editTxt_3.text
            editTxt_4.requestFocus()
        }

        editTxt_4.setOnClickListener(){
            txt4.text = editTxt_4.text

        }
    }
}