package com.fusuma.hyperion.remoteconfig.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fusuma.hyperion.remoteconfig.R
import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import kotlinx.android.synthetic.main.hype_fragment_remote_config_list.view.*

class RemoteConfigFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.hype_fragment_remote_config_list, container, false)
        with(view) {
            val configValues = FirebaseRemoteConfig.getInstance().all.entries.toList()
            empty_message.visibleOrGone(visible = configValues.isEmpty())
            list.adapter =
                RemoteConfigRecyclerViewAdapter(configValues)
            (configValues.isEmpty())
        }
        return view
    }
}

private fun View.visibleOrGone(visible: Boolean) {
    this.visibility = if (visible) View.VISIBLE else View.GONE
}
