package com.ciazhar.recipeapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class FoodDetailActivity : AppCompatActivity() {

    var foodName: TextView ?= null
    var foodImage: ImageView ?= null
    var foodRecipe: TextView ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_detail)

        foodName = findViewById(R.id.food_detail_name) as TextView
        foodImage = findViewById(R.id.food_detail_image) as ImageView
        foodRecipe= findViewById(R.id.food_detail_recipe) as TextView

        var intent : Intent = intent

        foodName!!.text = intent.getStringExtra("food.name")
        foodImage!!.setImageResource(intent.getIntExtra("food.image",0))
        foodRecipe!!.text = intent.getStringExtra("food.recipe")
    }
}

