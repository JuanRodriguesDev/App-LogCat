package com.example.myapplication

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
            Log.d("MainActivity", "Acitivity em primeiro plano")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity", "Activity em segundo plano")
    }

}