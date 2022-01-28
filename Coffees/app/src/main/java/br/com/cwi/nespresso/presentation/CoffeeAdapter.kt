package br.com.cwi.nespresso

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.cwi.nespresso.databinding.ItemCoffeeBinding
import br.com.cwi.nespresso.data.entity.CoffeeResponse
import com.bumptech.glide.Glide

class CoffeeAdapter(val context: Context, val list: List<CoffeeResponse>) : RecyclerView.Adapter<ItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_coffee, parent, false)
        return ItemViewHolder(context, view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = list[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int = list.size
}

class ItemViewHolder(val context: Context, item: View) : RecyclerView.ViewHolder(item) {
    val name = ItemCoffeeBinding.bind(item).itemCoffeeName
    val image = ItemCoffeeBinding.bind(item).itemCoffeeImage

    fun bind(item: CoffeeResponse){
        name.text = item.name
        Glide.with(context).load(item.image).into(image)
    }

}