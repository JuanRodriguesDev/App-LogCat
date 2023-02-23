package com.example.somaactivity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.example.somaactivity.databinding.ActivityMainBinding

class MainActivity: AppCompatActivity() {



    private val TAG = SecondActivity::class.java.simpleName
    private lateinit var startForResult: ActivityResultLauncher<Intent>
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


       binding.btnNextView.setOnClickListener {
            val newIntent = Intent(this, SecondActivity::class.java)
        //      startActivity(newIntent)
           startForResult.launch(newIntent)

        }

        startForResult =
            registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
                Log.d(TAG, "funfa")
                if (result.resultCode == RESULT_OK) {
                    result.data?.extras?.getString("value")?.let { response(it) }
                }
            }
    //   resultSum()
    }
    private fun response(name: String) {
        val showSucess = binding.txtTitle

        if (name.equals("10")){
            showSucess.visibility = View.VISIBLE
        } else {
            showSucess.visibility = View.INVISIBLE
                Log.d(TAG, "Soma falhou")
        }
    }
//
//    private fun resultSum() {
//        val showSucess = binding.txtTitle
//
//        val data = intent.extras
//        var name = data?.getString("name")
//
//
//
//    }
}