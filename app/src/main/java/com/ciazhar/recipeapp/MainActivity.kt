package com.ciazhar.recipeapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.ciazhar.recipeapp.model.Food

/**
* Created by ciazhar on 9/21/17.
*
* [ Documentation Here]
*/

class MainActivity : AppCompatActivity() {
    private var foodList = ArrayList<Food>()
    private var recyclerView : RecyclerView?=null
    private var foodAdapter : FoodAdapter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.main_recycler_view) as RecyclerView
        foodAdapter = FoodAdapter(this, foodList)
        recyclerView?.layoutManager = LinearLayoutManager(this)
        recyclerView?.adapter = foodAdapter

        foodList()
    }

    private fun foodList(){
        foodList.add(
            Food(
                foodName = "Lorem Ipsum",
                foodImage = R.drawable.food,
                foodDescription = "Lorem Ipsum Description"
            )
        )
        foodList.add(
            Food(
                foodName = "Lorem Ipsum2",
                foodImage = R.drawable.food,
                foodDescription = "Lorem Ipsum2 Description"
            )
        )
        foodList.add(
            Food(
                foodName = "Lorem Ipsum3",
                foodImage = R.drawable.food,
                foodDescription = "Lorem Ipsum3 Description"
            )
        )
        foodList.add(
            Food(
                foodName = "Lorem Ipsum4",
                foodImage = R.drawable.food,
                foodDescription = "Lorem Ipsum4 Description"
            )
        )
        foodList.add(
            Food(
                foodName = "Lorem Ipsum5",
                foodImage = R.drawable.food,
                foodDescription = "Lorem Ipsum5 Description"
            )
        )
        foodList.add(
            Food(
                foodName = "Lorem Ipsum6",
                foodImage = R.drawable.food,
                foodDescription = "Lorem Ipsum6 Description"
            )
        )
        foodList.add(
            Food(
                foodName = "Lorem Ipsum7",
                foodImage = R.drawable.food,
                foodDescription = "Lorem Ipsum7 Description"
            )
        )
        foodList.add(
            Food(
                foodName = "Lorem Ipsum8",
                foodImage = R.drawable.food,
                foodDescription = "Lorem Ipsum8 Description"
            )
        )
        foodAdapter?.notifyDataSetChanged()
    }
}
