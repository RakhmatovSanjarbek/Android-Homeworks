package com.example.homeworks_1

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TenthTaskActivity : AppCompatActivity() {
    private lateinit var navigationSingUpGape:CardView
    private lateinit var navigationSingInGape:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tenth_task)

        navigationSingUpGape=findViewById(R.id.sign_up)
        navigationSingUpGape.setOnClickListener {
            startActivity(
                Intent(this,TenthTaskSingUpPageActivity::class.java)
            )
        }

        navigationSingInGape=findViewById(R.id.sign_in)
        navigationSingInGape.setOnClickListener {
            startActivity(
                Intent(this,TenthTaskSignInPageActivity::class.java)
            )
        }
    }
}