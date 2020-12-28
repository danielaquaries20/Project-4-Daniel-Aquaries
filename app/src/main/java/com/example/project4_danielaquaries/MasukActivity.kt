package com.example.project4_danielaquaries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_masuk.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class MasukActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_masuk)
        textUsername.text = intent.getStringExtra("username")
        textEmail.text = intent.getStringExtra("email")
        textPassword.text = intent.getStringExtra("password")

        buttonBack.onClick { onBackPressed() }
    }
}