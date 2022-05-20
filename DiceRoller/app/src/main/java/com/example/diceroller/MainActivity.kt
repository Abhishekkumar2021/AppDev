package com.example.diceroller

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

//import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("ShowToast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Here we are getting a reference to the button view present on the screen
        val rollButton: Button = findViewById(R.id.button)
        //defining a range variable
        val click = 1..100
        //Here we are adding setOnClickListener on the button
        rollButton.setOnClickListener {
//            //Here we are defining a new toast to show when user clicks the button
//            Toast.makeText(
//                //'this' is a context for the rollButton variable
//                this,
//                //showing the text on click
//                "Dice Rolled! ${click.random()}",
//                Toast.LENGTH_SHORT
//            ).show()
            val resultTextView: TextView = findViewById(R.id.textView)
            val dice = Dice(6)
            resultTextView.text = dice.roll().toString()
            resultTextView.textSize = 120.toFloat()
        }
    }
}

class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}