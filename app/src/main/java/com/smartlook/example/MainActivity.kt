package com.smartlook.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.smartlook.sdk.smartlook.Smartlook

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Smartlook.setup("")
    }
}