package com.example.semestralniprojektpma

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MujUcet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        // Propojení layoutu s aktivitou
        setContentView(R.layout.muj_ucet)


        // Přechod na Můj účet
        val profileIcon: ImageView = findViewById(R.id.profileIcon)
        profileIcon.setOnClickListener {
            val intent = Intent(this, MujUcet::class.java)
            startActivity(intent)
        }

        // Přechod na Hlavní stránku
        val logoIconka: ImageView = findViewById(R.id.logo)
        logoIconka.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        // Přechod na Hlavní stránku
        val backToHomeText: TextView = findViewById(R.id.domuText)
        backToHomeText.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }

        // Přechod na stránku přihlášení
        val button7: Button = findViewById(R.id.btnPrihlaseni)
        button7.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        // Přechod na stránku registrace
        val button1: Button = findViewById(R.id.btnRegistrace)
        button1.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }

    }

}
