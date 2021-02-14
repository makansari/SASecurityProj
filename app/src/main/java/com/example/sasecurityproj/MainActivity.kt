package com.example.sasecurityproj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sp = getSharedPreferences("MyFile", MODE_PRIVATE)
        var editor = sp.edit()
        editor.putString("un","ansari")
        editor.putString("pwd","mypass")
        editor.commit()
    }
}