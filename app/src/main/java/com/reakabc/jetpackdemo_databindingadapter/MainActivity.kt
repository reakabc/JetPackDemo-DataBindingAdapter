package com.reakabc.jetpackdemo_databindingadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.reakabc.jetpackdemo_databindingadapter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val post1 = Post("First Post", "https://upload.wikimedia.org/wikipedia/en/9/95/Test_image.jpg")
        binding.post = post1

    }
}