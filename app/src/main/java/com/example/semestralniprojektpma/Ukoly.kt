package com.example.semestralniprojektpma

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.firebase.ui.database.FirebaseRecyclerOptions


public class Ukoly : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        // Propojení layoutu s aktivitou
        setContentView(R.layout.ukoly)


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
