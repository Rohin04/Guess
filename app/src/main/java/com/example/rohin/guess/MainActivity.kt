package com.example.rohin.guess

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.util.Random
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var CHOOSEANUMBER =0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnchoose.setOnClickListener{
            CHOOSEANUMBER=Random().nextInt(100)+1
            textView.text="I've choosen a number ,Now you Guess"
        }
        btnsubmit.setOnClickListener {
            val editText_str= iptext.text.toString()
            val editText= Integer.parseInt(editText_str)

            when{
                CHOOSEANUMBER > editText-> textView.text="guess higher"
                CHOOSEANUMBER == editText -> textView.text="you guessed it"
                else -> textView.text="guess lower"
            }
        }

    }
}
