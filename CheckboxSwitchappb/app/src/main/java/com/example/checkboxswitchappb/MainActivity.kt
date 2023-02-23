package com.example.checkboxswitchappb



import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.Switch
import androidx.appcompat.app.AppCompatActivity


class MainActivity: AppCompatActivity() {


    private lateinit var shiny: ImageView
    private lateinit var view: View


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        view = findViewById(R.id.view)
        shiny = findViewById(R.id.img_lampada_acesa)
        val dark = findViewById<ImageView>(R.id.img_lampada_apagada)
        val switch = findViewById<Switch>(R.id.switch1)
        val privacy = findViewById<CheckBox>(R.id.checkbox1)




        switch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked && !privacy.isChecked) {
                shiny.visibility = View.VISIBLE
                dark.visibility = View.INVISIBLE

            } else if (!isChecked && !privacy.isChecked) {
                dark.visibility = View.VISIBLE
                shiny.visibility = View.INVISIBLE

             } else if (isChecked && privacy.isChecked) {
                shiny.visibility = View.VISIBLE
                dark.visibility = View.INVISIBLE
                view.setBackgroundColor(resources.getColor(R.color.pastelYellow))
            } else if (!isChecked && privacy.isChecked) {
                dark.visibility = View.VISIBLE
                shiny.visibility = View.INVISIBLE
                view.setBackgroundColor(resources.getColor(R.color.darkgray))
            }
        }

        privacy.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked && switch.isChecked) {


                view.setBackgroundColor(resources.getColor(R.color.pastelYellow))
            }
            else if (isChecked && !switch.isChecked) {


                view.setBackgroundColor(resources.getColor(R.color.darkgray))
            }
            else {
                !isChecked
                view.setBackgroundColor(resources.getColor(R.color.white))
            }
        }
    }
}
