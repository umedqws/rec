package com.example.rec

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.rec.databinding.ActivityMainBinding
import java.io.LineNumberReader

class MainActivity : AppCompatActivity() {
    val adapter = Adapter()
    lateinit var img:Array<Int>
    lateinit var txt:Array<String>
    lateinit var txt2:Array<String>
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        img = arrayOf(
            R.drawable.encore,
            R.drawable.evolve,
            R.drawable.hattori,
            R.drawable.mockingbird,
            R.drawable.origins,
            R.drawable.encore,
            R.drawable.evolve,
            R.drawable.hattori,
            R.drawable.mockingbird,
            R.drawable.origins,)

        txt = arrayOf(
            "Eminem",
            "Imagine Dragons",
            "Miyagi Andy Panda",
            "Eminem",
            "Imagine Dragons",
            "Eminem",
            "Imagine Dragons",
            "Miyagi Andy Panda",
            "Eminem",
            "Imagine Dragons",
        )


        txt2 = arrayOf(
            "Encore",
            "Evolve",
            "Hattori",
            "mockingbird",
            "origins",
            "Encore",
            "Evolve",
            "Hattori",
            "mockingbird",
            "origins",
        )
        init()
    }




    fun init(){
        binding.apply {
            rcView.layoutManager = LinearLayoutManager(this@MainActivity,LinearLayoutManager.HORIZONTAL,false)
            secondrcView.layoutManager = GridLayoutManager(this@MainActivity,3)
            secondrcView.adapter =adapter
            rcView.adapter = adapter
            for (i in img.indices){
                val plant = Image(img[i],txt[i],txt2[i])
                adapter.List.add(plant)
            }
        }
    }
}