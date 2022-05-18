package com.example.mvc

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.mvc.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity(), Observer, View.OnClickListener {
    lateinit var binding: ActivityMainBinding
    lateinit var model: Model

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        model = Model()
        model.addObserver(this)

        binding.apply {
            button.setOnClickListener(this@MainActivity)
            button2.setOnClickListener(this@MainActivity)
            button3.setOnClickListener(this@MainActivity)
        }
    }

    @SuppressLint("SetTextI18n")
    override fun update(o: Observable?, arg: Any?) {
        binding.button.text = "Count: " + model.getValueAtIndex(0)
        binding.button2.text = "Count: " + model.getValueAtIndex(1)
        binding.button3.text = "Count: " + model.getValueAtIndex(2)
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.button -> model.setValueAtIndex(0)
            R.id.button2 -> model.setValueAtIndex(1)
            R.id.button3 -> model.setValueAtIndex(2)
        }
    }
}