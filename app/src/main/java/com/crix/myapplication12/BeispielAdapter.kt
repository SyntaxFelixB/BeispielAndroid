package com.crix.myapplication12

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import androidx.transition.Visibility
import com.crix.myapplication12.databinding.ItemBeispielBinding

class BeispielAdapter(
    val dataset: List<String>
): RecyclerView.Adapter<BeispielAdapter.BeispielViewHolder>() {

    inner class BeispielViewHolder(val binding: ItemBeispielBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BeispielViewHolder {
        val binding = ItemBeispielBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BeispielViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: BeispielViewHolder, position: Int) {
        val listItem = dataset[position]

        holder.binding.tvItemTitle.text = listItem

        holder.binding.cvItem.setOnClickListener {
            holder.itemView.findNavController().navigate(R.id.action_homeFragment_to_detailFragment)
        }
    }

}