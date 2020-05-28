package com.example.labsheet_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val email = findViewById<EditText>(R.id.txt1)
        val pass = findViewById<EditText>(R.id.txt2)

        val loginClick = findViewById<Button>(R.id.btnLogin)
        loginClick.setOnClickListener {
            //read value from EditText to a String variable

            val ema: String = email.text.toString()
            val pwd: String = pass.text.toString()
            //check if the EditText have values or not
            if (ema.trim().isEmpty()) {
                Toast.makeText(
                    applicationContext, "Email field cannot be empty",
                    Toast.LENGTH_SHORT
                ).show()
            }
            if (pwd.trim().isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "Password field cannot be empty",
                    Toast.LENGTH_SHORT
                ).show()
            }
            if (ema == "nithya@gmail.com" && (pwd == "123456")) {
                val intent = Intent(this, Home::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(
                    applicationContext, "Wrong Email or Password!!",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}
