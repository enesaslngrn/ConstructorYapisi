package com.enesas.constructoryapisi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.enesas.constructoryapisi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        var view = binding.root
        setContentView(view)

        var araba1 = Araba("Opel","Corsa",2005,true)

        var araba2 = Araba("Toyota","Corona",2010,false)

        println(araba1.marka)
        println("${araba1.marka} Kaza durumu:${araba1.kazaCheck}")

        println(araba2.marka)
        println("${araba2.marka} Kaza durumu:${araba2.kazaCheck}")

        println(araba1.icerdenBirseyAlabiliyormuyum)

        var x: Int? = 5

        println(x!!*10)
    }
}