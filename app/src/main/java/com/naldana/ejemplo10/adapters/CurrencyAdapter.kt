package com.naldana.ejemplo10.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.naldana.ejemplo10.R
import com.naldana.ejemplo10.pojos.Currency
import kotlinx.android.synthetic.main.currency_list.view.*

class CurrencyAdapter(val items: List<Currency>, val clickListener: (Currency) -> Unit) : RecyclerView.Adapter<CurrencyAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.currency_list, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        return holder.bind(items[position],clickListener)

    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        fun bind(item: Currency, clickListener: (Currency) -> Unit) = with(itemView) {
            tv_currency_name.text = item.name
            tv_currency_country.text = item.country

            this.setOnClickListener { clickListener(item) }
        }

    }
}