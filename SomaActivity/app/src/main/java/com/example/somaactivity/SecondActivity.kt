package com.example.somaactivity

import android.content.Intent
import android.os.Bundle
import androidx.activity.result.ActivityResultLauncher
import androidx.appcompat.app.AppCompatActivity
import com.example.somaactivity.databinding.ActivityMainBinding
import com.example.somaactivity.databinding.SecondActivityBinding

class SecondActivity: AppCompatActivity() {

    private val TAG = SecondActivity::class.java.simpleName
    private lateinit var binding: SecondActivityBinding
    private lateinit var startForResult: ActivityResultLauncher<Intent>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SecondActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btn = binding.btnSumValue
        val editSum = binding.editTxt2
        val txtValue1 = binding.txtDataValue1
        val txtValue2 = binding.txtDataValue2


         btn.setOnClickListener {
//             val goBackIntent = Intent(this, ActivityMainBinding::class.java)
//                goBackIntent.putExtra("data", editSum.text.toString())
//              startActivity(goBackIntent)

             val intent = Intent()
             intent.putExtra("value",editSum.text.toString())
       //      intent.putExtra("value",)
             setResult(RESULT_OK,
                 intent
             )

            finish()
         }
    }
}