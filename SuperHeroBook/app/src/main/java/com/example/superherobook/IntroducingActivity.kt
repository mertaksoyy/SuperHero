package com.example.superherobook

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_introducing.*

class IntroducingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_introducing)


        val heroName = intent.getStringExtra("heroName")
        textView.text = heroName

        val heroImage = intent.getIntExtra("heroImage",0)
        val bitmap = BitmapFactory.decodeResource(applicationContext.resources,heroImage)
        imageView4.setImageBitmap(bitmap)




    }
}