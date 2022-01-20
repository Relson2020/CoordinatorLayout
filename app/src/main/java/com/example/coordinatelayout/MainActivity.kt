package com.example.coordinatelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.coordinatelayout.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.floatingButton.setOnClickListener {
            Snackbar.make(binding.floatingButton, "hey its Snack bar", Snackbar.LENGTH_SHORT).show()
        }
    }
}