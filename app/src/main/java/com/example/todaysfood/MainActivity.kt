package com.example.todaysfood

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class MainActivity : AppCompatActivity() {

    lateinit var tv_food: TextView
    lateinit var btn_press: Button
    lateinit var imageView: ImageView


    private val foodList = listOf(
        Food(
            "Bún tôm",
            R.drawable.buntom
        ),
        Food(
            "Sầu riêng",
            R.drawable.saurieng
        ),
        Food    (
            "Sữa chua",
            R.drawable.suachua
        ),
        Food    (
            "Nho",
            R.drawable.nho
        ),
        Food    (
            "Canh rong biển",
            R.drawable.rongbien
        ),
        Food    (
            "Tàu hũ nước dừa",
            R.drawable.tauhu
        ),
        Food    (
            "Tôm hùm hấp",
            R.drawable.tomhum
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_food = findViewById(R.id.tv_food)
        btn_press = findViewById(R.id.btn_press)
        imageView = findViewById(R.id.imageView)

        btn_press.setOnClickListener{
            var random = Random()

            val randomFood = random.nextInt(foodList.count())

            tv_food.text = foodList[randomFood].name;
            imageView.setImageResource(foodList[randomFood].image)

        }
    }
}

data class Food(val name: String, val image: Int)


