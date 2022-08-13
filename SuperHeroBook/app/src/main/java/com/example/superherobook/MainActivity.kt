package com.example.superherobook

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var superHeroList  = ArrayList<String>()

        superHeroList.add("Batman")
        superHeroList.add("Iron Man")
        superHeroList.add("Superman")
        superHeroList.add("Aquaman")
        superHeroList.add("Spiderman")

        /*
        val batmanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.batman)
        val ironmanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.ironman)
        val supermanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.superman)
        val aquamanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.aquaman)
        val spidermanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.spiderman)


        var superHeroImage = ArrayList<Bitmap>()

        superHeroImage.add(batmanBitmap)
        superHeroImage.add(ironmanBitmap)
        superHeroImage.add(supermanBitmap)
        superHeroImage.add(aquamanBitmap)
        superHeroImage.add(spidermanBitmap)


         */

        //Daha verimli Tanımlama-->Bitmap e göre

        var superHeroDrawableList =ArrayList<Int>()

        val batmanDrawable = R.drawable.batman
        val ironmanDrawable = R.drawable.ironman
        val supermanDrawable = R.drawable.superman
        val aquamanDrawable = R.drawable.aquaman
        val spidermanDrawable = R.drawable.spiderman

        superHeroDrawableList.add(batmanDrawable)
        superHeroDrawableList.add(ironmanDrawable)
        superHeroDrawableList.add(supermanDrawable)
        superHeroDrawableList.add(aquamanDrawable)
        superHeroDrawableList.add(spidermanDrawable)





        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager


        val adapter = RecyclerAdapter(superHeroList,superHeroDrawableList)

        recyclerView.adapter = adapter


    }


}