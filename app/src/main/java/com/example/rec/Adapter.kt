package com.example.rec

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.result.contract.ActivityResultContracts
import androidx.recyclerview.widget.RecyclerView
import com.example.rec.databinding.AsdBinding

class Adapter: RecyclerView.Adapter<Adapter.MyHolder>() {
    val List = ArrayList<Image>()
    class MyHolder(item:View):RecyclerView.ViewHolder(item) {
            val binding = AsdBinding.bind(item)

        fun binds(image: Image) {
            binding.apply {
                binding.img.setImageResource(image.Image)
                binding.txt.text = image.text
                txt2.text = image.text
                itemView.setOnClickListener {
                    val intent = Intent(binding.root.context, Image_activity::class.java)
                    intent.putExtra("url", image.Image)
                    binding.root.context.startActivity(intent)
                }
            }
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.asd,parent,false)
        return MyHolder(view)
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.binds(List[position])

    }

    override fun getItemCount(): Int {
        return List.size
    }
}