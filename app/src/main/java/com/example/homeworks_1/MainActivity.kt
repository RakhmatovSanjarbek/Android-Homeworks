package com.example.homeworks_1

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.card.MaterialCardView

class MainActivity : AppCompatActivity() {
    private lateinit var onClickFirstTask: MaterialCardView
    private lateinit var onClickSecondTask: MaterialCardView
    private lateinit var onClickThirdTask: MaterialCardView
    private lateinit var onClickFourthTask: MaterialCardView
    private lateinit var onClickFifthTask: MaterialCardView
    private lateinit var onClickSixthTask: MaterialCardView
    private lateinit var onClickSeventhTask: MaterialCardView
    private lateinit var onClickEighthTask: MaterialCardView
    private lateinit var onClickTenthTask: MaterialCardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        onClickFirstTask=findViewById(R.id.task_1)
        onClickFirstTask.setOnClickListener {
            startActivity(
                Intent(this,FirstTaskActivity::class.java)
            )
        }

        onClickSecondTask=findViewById(R.id.task_2)
        onClickSecondTask.setOnClickListener {
            startActivity(
                Intent(this,SecondTaskActivity::class.java)
            )
        }

        onClickThirdTask=findViewById(R.id.task_3)
        onClickThirdTask.setOnClickListener {
            startActivity(
                Intent(this,ThirdTaskActivity::class.java)
            )
        }

        onClickFourthTask=findViewById(R.id.task_4)
        onClickFourthTask.setOnClickListener {
            startActivity(
                Intent(this,FourthTaskActivity::class.java)
            )
        }

        onClickFifthTask=findViewById(R.id.task_5)
        onClickFifthTask.setOnClickListener {
            startActivity(
                Intent(this,FifthTaskActivity::class.java)
            )
        }

        onClickSixthTask=findViewById(R.id.task_6)
        onClickSixthTask.setOnClickListener {
            startActivity(
                Intent(this,SixthTaskActivity::class.java)
            )
        }

        onClickSeventhTask=findViewById(R.id.task_7)
        onClickSeventhTask.setOnClickListener {
            startActivity(
                Intent(this,SeventhTaskActivity::class.java)
            )
        }

        onClickEighthTask=findViewById(R.id.task_8)
        onClickEighthTask.setOnClickListener {
            startActivity(
                Intent(this,EighthTaskActivity::class.java)
            )
        }

        onClickTenthTask=findViewById(R.id.task_10)
        onClickTenthTask.setOnClickListener {
            startActivity(
                Intent(this,TenthTaskActivity::class.java)
            )
        }
    }
}