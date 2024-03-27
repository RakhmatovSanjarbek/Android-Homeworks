package com.example.homeworks_1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat

class TwelfthTaskPinScreenActivity : AppCompatActivity() {
    private var count: Int = 0

    private var pinCode:Array<Int> =arrayOf()


    private lateinit var firstButton: TextView
    private lateinit var secondButton: TextView
    private lateinit var thirdButton: TextView
    private lateinit var fourthButton: TextView
    private lateinit var fifthButton: TextView
    private lateinit var sixthButton: TextView
    private lateinit var seventhButton: TextView
    private lateinit var eighthButton: TextView
    private lateinit var ninthButton: TextView
    private lateinit var zeroButton: TextView
    private lateinit var refButton: ImageView
    private lateinit var remoxButton: ImageView

    private lateinit var firstCardView: CardView
    private lateinit var secondCardView: CardView
    private lateinit var thirdCardView: CardView
    private lateinit var fourthCardView: CardView
    private lateinit var fifthCardView: CardView
    private lateinit var sixthCardView: CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_twelfth_task_pin_screen)

        if (count == 5) {

            startActivity(
                Intent(this,TwelfthTaskMainScreenActivity::class.java)
            )
        }

        firstCardView = findViewById(R.id.pin_1)
        secondCardView = findViewById(R.id.pin_2)
        thirdCardView = findViewById(R.id.pin_3)
        fourthCardView = findViewById(R.id.pin_4)
        fifthCardView = findViewById(R.id.pin_5)
        sixthCardView = findViewById(R.id.pin_6)



        firstButton = findViewById(R.id.button_1)

        firstButton.setOnClickListener {
            if (count < 6) {
                count++
                onChangeCardColor(count)
                pinCode=pinCode.plus(1)
                if(isFull(count)){
                    if (isNext(pinCode)){
                        nextPage()
                    }else{
                        Toast.makeText(this,"Pin kod xato",Toast.LENGTH_LONG).show()
                    }
                }
            }
        }

        secondButton = findViewById(R.id.button_2)

        secondButton.setOnClickListener {
            if (count < 6) {
                count++
                onChangeCardColor(count)
                pinCode=pinCode.plus(2)
                if(isFull(count)){
                    if (isNext(pinCode)){
                        nextPage()
                    }else{
                        Toast.makeText(this,"Pin kod xato",Toast.LENGTH_LONG).show()
                    }
                }
            }
        }

        thirdButton = findViewById(R.id.button_3)

        thirdButton.setOnClickListener {
            if (count < 6) {
                count++
                onChangeCardColor(count)
                pinCode=pinCode.plus(3)
                if(isFull(count)){
                    if (isNext(pinCode)){
                        nextPage()
                    }else{
                        Toast.makeText(this,"Pin kod xato",Toast.LENGTH_LONG).show()
                    }
                }
            }
        }

        fourthButton = findViewById(R.id.button_4)

        fourthButton.setOnClickListener {
            if (count < 6) {
                count++
                onChangeCardColor(count)
                pinCode=pinCode.plus(4)
                if(isFull(count)){
                    if (isNext(pinCode)){
                        nextPage()
                    }else{
                        Toast.makeText(this,"Pin kod xato",Toast.LENGTH_LONG).show()
                    }
                }
            }
        }

        fifthButton = findViewById(R.id.button_5)

        fifthButton.setOnClickListener {
            if (count < 6) {
                count++
                onChangeCardColor(count)
                pinCode=pinCode.plus(5)
                if(isFull(count)){
                    if (isNext(pinCode)){
                        nextPage()
                    }else{
                        Toast.makeText(this,"Pin kod xato",Toast.LENGTH_LONG).show()
                    }
                }
            }
        }

        sixthButton = findViewById(R.id.button_6)

        sixthButton.setOnClickListener {
            if (count < 6) {
                count++
                onChangeCardColor(count)
                pinCode=pinCode.plus(6)
                if(isFull(count)){
                    if (isNext(pinCode)){
                        nextPage()
                    }else{
                        Toast.makeText(this,"Pin kod xato",Toast.LENGTH_LONG).show()
                    }
                }
            }
        }

        seventhButton = findViewById(R.id.button_7)

        seventhButton.setOnClickListener {
            if (count < 6) {
                count++
                onChangeCardColor(count)
                pinCode=pinCode.plus(7)
                if(isFull(count)){
                    if (isNext(pinCode)){
                        nextPage()
                    }else{
                        Toast.makeText(this,"Pin kod xato",Toast.LENGTH_LONG).show()
                    }
                }
            }
        }

        eighthButton = findViewById(R.id.button_8)

        eighthButton.setOnClickListener {
            if (count < 6) {
                count++
                onChangeCardColor(count)
                pinCode=pinCode.plus(8)
                if(isFull(count)){
                    if (isNext(pinCode)){
                        nextPage()
                    }else{
                        Toast.makeText(this,"Pin kod xato",Toast.LENGTH_LONG).show()
                    }
                }
            }
        }

        ninthButton = findViewById(R.id.button_9)

        ninthButton.setOnClickListener {
            if (count < 6) {
                count++
                onChangeCardColor(count)
                pinCode=pinCode.plus(9)
                if(isFull(count)){
                    if (isNext(pinCode)){
                        nextPage()
                    }else{
                        Toast.makeText(this,"Pin kod xato",Toast.LENGTH_LONG).show()
                    }
                }
            }
        }

        refButton = findViewById(R.id.button_ref)

        refButton.setOnClickListener {
            count = 0
            onChangeCardColor(count)
            pinCode= arrayOf()
        }

        zeroButton = findViewById(R.id.button_0)

        zeroButton.setOnClickListener {
                if (count < 6) {
                    count++
                    onChangeCardColor(count)
                    pinCode=pinCode.plus(0)
                    if(isFull(count)){
                        if (isNext(pinCode)){
                            nextPage()
                        }else{
                            Toast.makeText(this,"Pin kod xato",Toast.LENGTH_LONG).show()
                        }
                    }
                }
        }

        remoxButton = findViewById(R.id.button_remov)

        remoxButton.setOnClickListener {
            if (count > 0) {
                count--
                onChangeCardColor(count)
                if (pinCode.isNotEmpty()) {
                    pinCode = pinCode.dropLast(1).toTypedArray()
                }
            }
        }
        for (i in pinCode) {
            println(i)
        }


    }


    private fun onChangeCardColor(count: Int) {
        if (count == 1) {
            firstCardView.setCardBackgroundColor(ContextCompat.getColor(this, getCardTrue()))
        }
        if (count == 0) {
            firstCardView.setCardBackgroundColor(ContextCompat.getColor(this, getCardTFalse()))
        }
        if (count == 2) {
            secondCardView.setCardBackgroundColor(ContextCompat.getColor(this, getCardTrue()))
        }
        if (count < 2) {
            secondCardView.setCardBackgroundColor(ContextCompat.getColor(this, getCardTFalse()))
        }
        if (count == 3) {
            thirdCardView.setCardBackgroundColor(ContextCompat.getColor(this, getCardTrue()))
        }
        if (count < 3) {
            thirdCardView.setCardBackgroundColor(ContextCompat.getColor(this, getCardTFalse()))
        }
        if (count == 4) {
            fourthCardView.setCardBackgroundColor(ContextCompat.getColor(this, getCardTrue()))
        }
        if (count < 4) {
            fourthCardView.setCardBackgroundColor(ContextCompat.getColor(this, getCardTFalse()))
        }
        if (count == 5) {
            fifthCardView.setCardBackgroundColor(ContextCompat.getColor(this, getCardTrue()))
        }
        if (count < 5) {
            fifthCardView.setCardBackgroundColor(ContextCompat.getColor(this, getCardTFalse()))
        }
        if (count == 6) {
            sixthCardView.setCardBackgroundColor(ContextCompat.getColor(this, getCardTrue()))
        }
        if (count < 6) {
            sixthCardView.setCardBackgroundColor(ContextCompat.getColor(this, getCardTFalse()))
        }
    }

    private fun getCardTrue() = R.color.white
    private fun getCardTFalse() = R.color.cardFalse
    private fun isFull(count: Int):Boolean{
        return count==6
    }
    private fun isNext(pinCode: Array<Int>):Boolean{
        return ((pinCode[0]==1)
                &&(pinCode[1]==2)
                &&(pinCode[2]==3)
                &&(pinCode[3]==4)
                &&(pinCode[4]==5)
                &&(pinCode[5]==6))
    }
    private fun nextPage(){
        startActivity(
            Intent(this,TwelfthTaskMainScreenActivity::class.java)
        )
    }
}