package com.example.semestralniprojektpma


import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.semestralniprojektpma.Dukazy
import com.example.semestralniprojektpma.MujUcet
import com.example.semestralniprojektpma.R
import com.example.semestralniprojektpma.Ukoly
import com.example.semestralniprojektpma.VytvoritUkol


class MainActivity : AppCompatActivity() {




    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        // Přechod na stránku úkoly
        val button1: Button = findViewById(R.id.btnUkoly)
        button1.setOnClickListener {
            val intent = Intent(this, Ukoly::class.java)
            startActivity(intent)
        }


        // Přechod na stránku s důkazy
        val button3: Button = findViewById(R.id.btnProofs)
        button3.setOnClickListener {
            val intent = Intent(this, Dukazy::class.java)
            startActivity(intent)
        }


        // Přechod na stránku můj účet
        val button4: Button = findViewById(R.id.btnProfile)
        button4.setOnClickListener {
            val intent = Intent(this, MujUcet::class.java)
            startActivity(intent)
        }


        // Vytvořit úkoly
        val button5: Button = findViewById(R.id.btnCreateTask)
        button5.setOnClickListener {
            val intent = Intent(this, VytvoritUkol::class.java)
            startActivity(intent)
        }


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
    }
}




