package com.example.alagatkalinga

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
class MyAdapter(private val context: Context, private var dataList: List<DataClass>) : RecyclerView.Adapter<MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.recycle_item, parent, false)
        return MyViewHolder(view)
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        Glide.with(context).load(dataList[position].dataImage)
            .into(holder.recImage)
        holder.recTitle.text = dataList[position].dataTitle
        holder.recDesc.text = dataList[position].dataDesc
        holder.recPriority.text = dataList[position].dataPriority
        holder.recCard.setOnClickListener {
            val intent = Intent(context, DetailActivity::class.java)
            intent.putExtra("Date", dataList[holder.adapterPosition].dataDate) // Add the date key as an extra
            intent.putExtra("Image", dataList[holder.adapterPosition].dataImage)
            intent.putExtra("Description", dataList[holder.adapterPosition].dataDesc)
            intent.putExtra("Title", dataList[holder.adapterPosition].dataTitle)
            intent.putExtra("Priority", dataList[holder.adapterPosition].dataPriority)

            // Add the new pet info data as extras
            intent.putExtra("PetAge", dataList[holder.adapterPosition].dataPetAge)
            intent.putExtra("PetGender", dataList[holder.adapterPosition].dataPetGender)
            intent.putExtra("PetAllergies", dataList[holder.adapterPosition].dataPetAllergies)
            intent.putExtra("Vaccination", dataList[holder.adapterPosition].dataVaccination)
            intent.putExtra("Neutered", dataList[holder.adapterPosition].dataNeutered)

            // Add the new owner info data as extras
            intent.putExtra("OwnerName", dataList[holder.adapterPosition].dataOwnerName)
            intent.putExtra("OwnerAddress", dataList[holder.adapterPosition].dataOwnerAddress)
            intent.putExtra("OwnerNumber", dataList[holder.adapterPosition].dataOwnerNumber)

            // Add the new vet info data as extras
            intent.putExtra("VetName", dataList[holder.adapterPosition].dataVetName)
            intent.putExtra("VetAddress", dataList[holder.adapterPosition].dataVetAddress)
            intent.putExtra("VetNumber", dataList[holder.adapterPosition].dataVetNumber)

            context.startActivity(intent)
        }

    }
    override fun getItemCount(): Int {
        return dataList.size
    }
    fun searchDataList(searchList: List<DataClass>) {
        dataList = searchList
        notifyDataSetChanged()
    }
}
class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var recImage: ImageView
    var recTitle: TextView
    var recDesc: TextView
    var recPriority: TextView
    var recCard: CardView
    init {
        recImage = itemView.findViewById(R.id.recImage)
        recTitle = itemView.findViewById(R.id.recTitle)
        recDesc = itemView.findViewById(R.id.recDesc)
        recPriority = itemView.findViewById(R.id.recPriority)
        recCard = itemView.findViewById(R.id.recCard)
    }
}