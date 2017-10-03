package com.ciazhar.recipeapp

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.ciazhar.recipeapp.model.Food

/**
* Created by ciazhar on 10/2/17.
*
* [ Documentation Here]
*/

class FoodAdapter constructor(private var context : Context, private var foodList : ArrayList<Food>) : RecyclerView.Adapter<FoodAdapter.FoodView>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): FoodView {
        val view : View = LayoutInflater.from(parent?.context)
                .inflate(R.layout.layout_food_data,parent,false)
        return FoodView(view)
    }

    override fun onBindViewHolder(holder: FoodView?, position: Int) {
        val data : Food = foodList[position]
        holder?.foodName?.text = data.foodName
        holder?.foodImage?.setImageResource(data.foodImage)
        holder?.foodDescription?.text = data.foodDescription
    }

    override fun getItemCount(): Int = foodList.size

    class FoodView(view : View) : RecyclerView.ViewHolder(view){
        var foodName : TextView?=null
        var foodImage : ImageView?=null
        var foodDescription : TextView?=null

        init {
            foodName = view.findViewById(R.id.food_name) as TextView
            foodImage = view.findViewById(R.id.food_image) as ImageView
        }
    }
}