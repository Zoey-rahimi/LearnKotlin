package com.zoey.learnkotlin.view.adapters

import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ForecastListAdapter(private val forecastList: List<String>) :
    RecyclerView.Adapter<ForecastListAdapter.ForecastViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ForecastViewHolder =
        ForecastViewHolder(TextView(parent.context))

    override fun getItemCount(): Int = forecastList.size

    override fun onBindViewHolder(holder: ForecastViewHolder, position: Int) {
        holder.textView.text = forecastList[position]
    }

    class ForecastViewHolder(var textView: TextView) : RecyclerView.ViewHolder(textView)
}