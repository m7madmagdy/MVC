package com.example.mvc

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.mvc.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity(), Observer, View.OnClickListener {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Model.addObserver(this)

        binding.apply {
            count1.setOnClickListener(this@MainActivity)
            count2.setOnClickListener(this@MainActivity)
            count3.setOnClickListener(this@MainActivity)
        }
    }

    @SuppressLint("SetTextI18n")
    override fun update(o: Observable?, arg: Any?) {
        binding.count1.text = "Count:" + Model.getValueAtIndex(0)
        binding.count2.text = "Count:" + Model.getValueAtIndex(1)
        binding.count3.text = "Count:" + Model.getValueAtIndex(2)
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.count1 -> Model.setValueAtIndex(0)
            R.id.count2 -> Model.setValueAtIndex(1)
            R.id.count3 -> Model.setValueAtIndex(2)
        }
    }
}