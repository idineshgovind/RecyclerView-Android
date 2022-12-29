package com.example.a8_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a8_recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Title>
    lateinit var imageId:Array<Int>
    lateinit var title :Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        imageId = arrayOf(
            R.drawable.durai,
            R.drawable.mahesh,
            R.drawable.roohi,
            R.drawable.prabakar,
            R.drawable.dinesh,
            R.drawable.sriram,
            R.drawable.venkat
        )

        title = arrayOf(
            "Durai - head of Zoho Schools Mobile App Development",
            "Mahesh - Faculty of Zoho Schools for Advanced Study",
            "Roohi - Faculty of Zoho Schools of Technology",
            "Prabakaran - Faculty of Zoho Schools iOS Development",
            "Dinesh - Trained by Mahesh for Android Development",
            "Sriram - Trained by Mahesh for Android Development",
            "Venkat - Trained by Prabakaran for iOS Development"
            )

        newRecyclerView = binding.recyclerView
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList= arrayListOf<Title>()
        getUserData()
    }

    private fun getUserData() {

        for (i in imageId.indices){

            val showTitle = Title(imageId[i],title[i])
            newArrayList.add(showTitle)

        }

        newRecyclerView.adapter = TitleAdapter(newArrayList)

    }
}