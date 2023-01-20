package com.example.pmdmej6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import com.example.pmdmej6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var respuesta = ""
        binding.editText.isVisible = false
        binding.imageView2.isVisible = false

        binding.button.setOnClickListener(){
            if(!binding.editText.isVisible){
                binding.editText.isVisible = true
                binding.button.text = "Finalizar"
                binding.imageView2.isVisible = false
            }
            else{
                respuesta = binding.editText.text.toString()
                binding.editText.isVisible = false
                binding.button.text = "comenzar"
                if(respuesta.contains("wayne",true)){
                    binding.imageView2.isVisible = true
                }
                if(respuesta.contains("joker",true)){
                    binding.button.setBackgroundColor(0xFFFF0000.toInt())
                    binding.button.setTextColor(0xff00ff00.toInt())
                    binding.root.setBackgroundColor(0xFF0000FF.toInt())
                }
            }
        }
        binding.editText.setOnFocusChangeListener { _, hasFocus ->
            if(hasFocus){
                binding.editText.setText("")
            }
            else{
                binding.editText.setText("introduce tu nombre")
            }
        }
    }
}