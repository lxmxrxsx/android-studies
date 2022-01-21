package br.com.cwi.navigatonproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import br.com.cwi.navigatonproject.databinding.ItemStringBinding

class RVAdapter(val list: List<String>) : RecyclerView.Adapter<ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_string, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = list.get(position)
        holder.tvString.text = item
    }

    override fun getItemCount(): Int = list.size

}

class ItemViewHolder(item: View) : ViewHolder(item) {
    val tvString = ItemStringBinding.bind(item).itemString

}