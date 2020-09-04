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
            Log.i("myLog", minuteHand.toString())
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
            //setImageDrawable(getDrawable(R.drawable.shape_vector_animator_second))
            val now = Calendar.getInstance().getTime()

            //what am I trying to do
            //I want to know the minute hand
            //if its the third minute but seconds is over 30, then you are nearest to 4 minutes
            //so we need sends normalised to 0-1 and add it to minutes and round
            val secondHand = (now.seconds)
            Log.i("myLog", secondHand.toString())
            if(secondHand == 0 || secondHand == 60) {
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_0))
            }
            else if (secondHand == 1){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_1))
            }
            else if (secondHand == 2){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_2))
            }
            else if (secondHand == 3){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_3))
            }
            else if (secondHand == 4){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_4))
            }
            else if (secondHand == 5){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_5))
            }
            else if (secondHand == 6){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_6))
            }
            else if (secondHand == 7){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_7))
            }
            else if (secondHand == 8){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_8))
            }
            else if (secondHand == 9){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_9))
            }
            else if (secondHand == 10){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_10))
            }
            else if (secondHand == 11){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_11))
            }
            else if (secondHand == 12){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_12))
            }
            else if (secondHand == 13){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_13))
            }
            else if (secondHand == 14){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_14))
            }
            else if (secondHand == 15){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_15))
            }
            else if (secondHand == 16){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_16))
            }
            else if (secondHand == 17){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_17))
            }
            else if (secondHand == 18){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_18))
            }
            else if (secondHand == 19){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_19))
            }
            else if (secondHand == 20){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_20))
            }
            else if (secondHand == 21){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_21))
            }
            else if (secondHand == 22){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_22))
            }
            else if (secondHand == 23){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_23))
            }
            else if (secondHand == 24){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_24))
            }
            else if (secondHand == 25){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_25))
            }
            else if (secondHand == 26){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_26))
            }
            else if (secondHand == 27){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_27))
            }
            else if (secondHand == 28){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_28))
            }
            else if (secondHand == 29){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_29))
            }
            else if (secondHand == 30){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_30))
            }
            else if (secondHand == 31){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_31))
            }
            else if (secondHand == 32){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_32))
            }
            else if (secondHand == 33){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_33))
            }
            else if (secondHand == 34){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_34))
            }
            else if (secondHand == 35){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_35))
            }
            else if (secondHand == 36){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_36))
            }
            else if (secondHand == 37){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_37))
            }
            else if (secondHand == 38){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_38))
            }
            else if (secondHand == 39){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_39))
            }
            else if (secondHand == 40){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_40))
            }
            else if (secondHand == 41){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_41))
            }
            else if (secondHand == 42){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_42))
            }
            else if (secondHand == 43){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_43))
            }
            else if (secondHand == 44){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_44))
            }
            else if (secondHand == 45){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_45))
            }
            else if (secondHand == 46){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_46))
            }
            else if (secondHand == 47){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_47))
            }
            else if (secondHand == 48){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_48))
            }
            else if (secondHand == 49){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_49))
            }
            else if (secondHand == 50){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_50))
            }
            else if (secondHand == 51){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_51))
            }
            else if (secondHand == 52){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_52))
            }
            else if (secondHand == 53){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_53))
            }
            else if (secondHand == 54){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_54))
            }
            else if (secondHand == 55){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_55))
            }
            else if (secondHand == 56){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_56))
            }
            else if (secondHand == 57){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_57))
            }
            else if (secondHand == 58){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_s_58))
            }
            else if (secondHand == 59){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_59))
            }
            else {
                throw Exception("something went wrong")
            }

            
            mySASecond = getDrawable() as AnimatedVectorDrawable
        }

        val myAnimHour = findViewById<ImageView>(R.id.imageView4).apply {
            //setImageDrawable(getDrawable(R.drawable.shape_vector_animator_hour))

            val now = Calendar.getInstance().getTime()

            //what am I trying to do
            //I want to know the minute hand
            //if its the third minute but seconds is over 30, then you are nearest to 4 minutes
            //so we need sends normalised to 0-1 and add it to minutes and round
            val hourHand = (((now.hours+(now.minutes/60f)) / 24f)*60).roundToInt()
            Log.i("myLog", "hour"+hourHand.toString())
            if(hourHand == 0 || hourHand == 60) {
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_0))
            }
            else if (hourHand == 1){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_1))
            }
            else if (hourHand == 2){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_2))
            }
            else if (hourHand == 3){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_3))
            }
            else if (hourHand == 4){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_4))
            }
            else if (hourHand == 5){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_5))
            }
            else if (hourHand == 6){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_6))
            }
            else if (hourHand == 7){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_7))
            }
            else if (hourHand == 8){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_8))
            }
            else if (hourHand == 9){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_9))
            }
            else if (hourHand == 10){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_10))
            }
            else if (hourHand == 11){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_11))
            }
            else if (hourHand == 12){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_12))
            }
            else if (hourHand == 13){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_13))
            }
            else if (hourHand == 14){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_14))
            }
            else if (hourHand == 15){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_15))
            }
            else if (hourHand == 16){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_16))
            }
            else if (hourHand == 17){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_17))
            }
            else if (hourHand == 18){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_18))
            }
            else if (hourHand == 19){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_19))
            }
            else if (hourHand == 20){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_20))
            }
            else if (hourHand == 21){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_21))
            }
            else if (hourHand == 22){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_22))
            }
            else if (hourHand == 23){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_23))
            }
            else if (hourHand == 24){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_24))
            }
            else if (hourHand == 25){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_25))
            }
            else if (hourHand == 26){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_26))
            }
            else if (hourHand == 27){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_27))
            }
            else if (hourHand == 28){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_28))
            }
            else if (hourHand == 29){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_29))
            }
            else if (hourHand == 30){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_30))
            }
            else if (hourHand == 31){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_31))
            }
            else if (hourHand == 32){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_32))
            }
            else if (hourHand == 33){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_33))
            }
            else if (hourHand == 34){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_34))
            }
            else if (hourHand == 35){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_35))
            }
            else if (hourHand == 36){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_36))
            }
            else if (hourHand == 37){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_37))
            }
            else if (hourHand == 38){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_38))
            }
            else if (hourHand == 39){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_39))
            }
            else if (hourHand == 40){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_40))
            }
            else if (hourHand == 41){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_41))
            }
            else if (hourHand == 42){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_42))
            }
            else if (hourHand == 43){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_43))
            }
            else if (hourHand == 44){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_44))
            }
            else if (hourHand == 45){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_45))
            }
            else if (hourHand == 46){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_46))
            }
            else if (hourHand == 47){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_47))
            }
            else if (hourHand == 48){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_48))
            }
            else if (hourHand == 49){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_49))
            }
            else if (hourHand == 50){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_50))
            }
            else if (hourHand == 51){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_51))
            }
            else if (hourHand == 52){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_52))
            }
            else if (hourHand == 53){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_53))
            }
            else if (hourHand == 54){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_54))
            }
            else if (hourHand == 55){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_55))
            }
            else if (hourHand == 56){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_56))
            }
            else if (hourHand == 57){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_57))
            }
            else if (hourHand == 58){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_h_58))
            }
            else if (hourHand == 59){
                setImageDrawable(getDrawable(R.drawable.shape_vector_animator_m_59))
            }
            else {
                throw Exception("something went wrong")
            }

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

