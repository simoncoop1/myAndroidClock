package com.example.myapplication

import android.content.res.Resources
import android.graphics.drawable.AnimatedVectorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import java.util.*
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {

    private lateinit var mySAMinute: AnimatedVectorDrawable
    private lateinit var mySASecond: AnimatedVectorDrawable
    private lateinit var mySAHour: AnimatedVectorDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myAnimMinute = findViewById<ImageView>(R.id.imageView2).apply {
            //setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m))

            val now = Calendar.getInstance().getTime()

            //what am I trying to do
            //I want to know the minute hand
            //if its the third minute but seconds is over 30, then you are nearest to 4 minutes
            //so we need sends normalised to 0-1 and add it to minutes and round
            val minuteHand = ((now.seconds/60f)+now.minutes).roundToInt()
            Log.i("fd", minuteHand.toString())
            if(minuteHand == 0 || minuteHand == 60) {
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_0))
            }
            else if (minuteHand == 1){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_1))
            }
            else if (minuteHand == 2){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_2))
            }
            else if (minuteHand == 3){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_3))
            }
            else if (minuteHand == 4){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_4))
            }
            else if (minuteHand == 5){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_5))
            }
            else if (minuteHand == 6){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_6))
            }
            else if (minuteHand == 7){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_7))
            }
            else if (minuteHand == 8){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_8))
            }
            else if (minuteHand == 9){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_9))
            }
            else if (minuteHand == 10){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_10))
            }
            else if (minuteHand == 11){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_11))
            }
            else if (minuteHand == 12){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_12))
            }
            else if (minuteHand == 13){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_13))
            }
            else if (minuteHand == 14){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_14))
            }
            else if (minuteHand == 15){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_15))
            }
            else if (minuteHand == 16){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_16))
            }
            else if (minuteHand == 17){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_17))
            }
            else if (minuteHand == 18){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_18))
            }
            else if (minuteHand == 19){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_19))
            }
            else if (minuteHand == 20){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_20))
            }
            else if (minuteHand == 21){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_21))
            }
            else if (minuteHand == 22){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_22))
            }
            else if (minuteHand == 23){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_23))
            }
            else if (minuteHand == 24){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_24))
            }
            else if (minuteHand == 25){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_25))
            }
            else if (minuteHand == 26){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_26))
            }
            else if (minuteHand == 27){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_27))
            }
            else if (minuteHand == 28){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_28))
            }
            else if (minuteHand == 29){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_29))
            }
            else if (minuteHand == 30){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_30))
            }
            else if (minuteHand == 31){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_31))
            }
            else if (minuteHand == 32){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_32))
            }
            else if (minuteHand == 33){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_33))
            }
            else if (minuteHand == 34){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_34))
            }
            else if (minuteHand == 35){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_35))
            }
            else if (minuteHand == 36){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_36))
            }
            else if (minuteHand == 37){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_37))
            }
            else if (minuteHand == 38){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_38))
            }
            else if (minuteHand == 39){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_39))
            }
            else if (minuteHand == 40){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_40))
            }
            else if (minuteHand == 41){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_41))
            }
            else if (minuteHand == 42){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_42))
            }
            else if (minuteHand == 43){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_43))
            }
            else if (minuteHand == 44){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_44))
            }
            else if (minuteHand == 45){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_45))
            }
            else if (minuteHand == 46){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_46))
            }
            else if (minuteHand == 47){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_47))
            }
            else if (minuteHand == 48){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_48))
            }
            else if (minuteHand == 49){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_49))
            }
            else if (minuteHand == 50){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_50))
            }
            else if (minuteHand == 51){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_51))
            }
            else if (minuteHand == 52){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_52))
            }
            else if (minuteHand == 53){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_53))
            }
            else if (minuteHand == 54){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_54))
            }
            else if (minuteHand == 55){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_55))
            }
            else if (minuteHand == 56){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_56))
            }
            else if (minuteHand == 57){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_57))
            }
            else if (minuteHand == 58){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_58))
            }
            else if (minuteHand == 59){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_59))
            }
            else {
                throw Exception("something went wrong")
            }

            mySAMinute = getDrawable() as AnimatedVectorDrawable


        }

        val myAnimSec = findViewById<ImageView>(R.id.imageView3).apply {
            setImageDrawable(getDrawable(R.drawable.shape_vector_animator_second))
            mySASecond = getDrawable() as AnimatedVectorDrawable
        }

        val myAnimHour = findViewById<ImageView>(R.id.imageView4).apply {
            setImageDrawable(getDrawable(R.drawable.shape_vector_animator_hour))
            mySAHour = getDrawable() as AnimatedVectorDrawable

            //getDrawable("67".toInt())
            //val drawables = listOf(R.drawable)
        }

        //val r = Resources.getSystem().getIdentifier("shape_vector_animator_hour","drawable","")
        //Log.i("fd", r.toString())




        mySAMinute.start()
        mySASecond.start()
        mySAHour.start()

        /*
        myAnimSec.setOnClickListener({
            val value = Calendar . getInstance ().getTime()
            Log.i("fd", value.toString())

            mySAMinute.start()
            mySASecond.start()
            mySAHour.start()

        })

         */
    }



}

