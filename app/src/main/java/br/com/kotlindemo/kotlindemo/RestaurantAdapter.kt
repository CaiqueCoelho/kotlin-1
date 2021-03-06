package br.com.kotlindemo.kotlindemo

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import br.com.kotlindemo.kotlindemo.model.Restaurant

class RestaurantAdapter(var lista: MutableList<Restaurant>) : RecyclerView.Adapter<RestaurantAdapter.PlaceViewHolder>() {

    override fun getItemCount(): Int {
        return lista.size
    }

    override fun onBindViewHolder(holder: PlaceViewHolder, position: Int) {
        holder.bindPlace(lista.get(position))
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaceViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_restaurant_item, parent, false)
        return PlaceViewHolder(view)
    }

    inner class PlaceViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        fun bindPlace(place: Restaurant) {
            val name = itemView.findViewById<TextView>(R.id.name)
            val description = itemView.findViewById<TextView>(R.id.description)

            name.text = place.name
            description.text = place.description
        }

    }


}
