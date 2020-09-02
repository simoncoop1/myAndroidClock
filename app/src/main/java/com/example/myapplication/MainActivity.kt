package com.example.myapplication

import android.graphics.drawable.AnimatedVectorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private lateinit var mySAMinute: AnimatedVectorDrawable
    private lateinit var mySASecond: AnimatedVectorDrawable
    private lateinit var mySAHour: AnimatedVectorDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myAnimMinute = findViewById<ImageView>(R.id.imageView2).apply {
            setImageDrawable(getDrawable(R.drawable.shape_vector_animator))
            mySAMinute = getDrawable() as AnimatedVectorDrawable
        }

        val myAnimSec = findViewById<ImageView>(R.id.imageView3).apply {
            setImageDrawable(getDrawable(R.drawable.shape_vector_animator))
            mySAMinute = getDrawable() as AnimatedVectorDrawable
        }

        val myAnimHour = findViewById<ImageView>(R.id.imageView4).apply {
            setImageDrawable(getDrawable(R.drawable.shape_vector_animator))
            mySAHour = getDrawable() as AnimatedVectorDrawable
        }



        myAnimHour.setOnClickListener({
            mySAMinute.start()
            mySASecond.start()
            mySAHour.start()})
    }



}

