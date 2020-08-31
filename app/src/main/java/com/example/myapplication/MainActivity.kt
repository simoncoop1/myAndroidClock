package com.example.myapplication

import android.graphics.drawable.AnimatedVectorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private lateinit var myShapeAnimation: AnimatedVectorDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myAnim = findViewById<ImageView>(R.id.imageView2).apply {
            setImageDrawable(getDrawable(R.drawable.shape_vector_animator))
            myShapeAnimation = getDrawable() as AnimatedVectorDrawable
        }
        myAnim.setOnClickListener({ myShapeAnimation.start() })
    }



}

