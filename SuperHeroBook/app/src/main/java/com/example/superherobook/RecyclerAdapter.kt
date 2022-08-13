package com.example.superherobook

import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recylcer_row.view.*

class RecyclerAdapter (val heroList: ArrayList<String>,val heroImageList : ArrayList<Int>):RecyclerView.Adapter<RecyclerAdapter.superHeroVH>() {

    class superHeroVH(itemView :View) :RecyclerView.ViewHolder(itemView) {

    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): superHeroVH {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recylcer_row,parent,false)
        return superHeroVH(itemView)  //onCreateViewHolder altında xml olan recyclerRow u bağladık
    }




    override fun onBindViewHolder(holder: superHeroVH, position: Int) {
       holder.itemView.recyclerViewTextView.text = heroList.get(position)//oluşturduğumuz superHeroList deki her elemanı position ile aldık

        //diğer aktiviteye gitme - verilieri gönderme
        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context,IntroducingActivity::class.java)
            intent.putExtra("heroName",heroList.get(position))


            //görselleri diğer aktiviteye gönderme
            intent.putExtra("heroImage",heroImageList.get(position))

            holder.itemView.context.startActivity(intent)
        }
    }



    override fun getItemCount(): Int { // kaç tane row oluşturulacağını söyledik
        return heroList.size
    }
}