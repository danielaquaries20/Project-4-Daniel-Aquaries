package com.example.project4_danielaquaries

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.sdk27.coroutines.onClick


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonLogin.onClick {
            val intent = Intent(this@MainActivity, MasukActivity::class.java)
            intent.putExtra("username", editTextUsername.text.toString())
            intent.putExtra("email", editTextEmail.text.toString())
            intent.putExtra("password", editTextPassword.text.toString())
            startActivity(intent)
        }


    }
}