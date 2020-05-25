package com.fusuma.hyperion.remoteconfig.list

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.fusuma.hyperion.remoteconfig.R
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
import kotlinx.android.synthetic.main.hype_remote_configf_item.view.*

typealias RemoteConfigItem = Map.Entry<String, FirebaseRemoteConfigValue>

class RemoteConfigRecyclerViewAdapter(
    private val configValues: List<RemoteConfigItem>
) : RecyclerView.Adapter<RemoteConfigRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return LayoutInflater.from(parent.context).inflate(R.layout.hype_remote_configf_item, parent, false).let {
            ViewHolder(it)
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = configValues[position]
        holder.keyView.text = item.key
        holder.valueView.text = item.value.asString()
    }

    override fun getItemCount(): Int = configValues.size

    inner class ViewHolder(mView: View) : RecyclerView.ViewHolder(mView) {
        val keyView: TextView = mView.item_key
        val valueView: TextView = mView.item_value
    }
}
