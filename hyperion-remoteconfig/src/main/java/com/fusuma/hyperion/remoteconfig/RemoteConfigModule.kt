package com.fusuma.hyperion.remoteconfig

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fusuma.hyperion.remoteconfig.list.RemoteConfigActivity
import com.willowtreeapps.hyperion.plugin.v1.PluginModule

class RemoteConfigModule: PluginModule() {
    override fun createPluginView(layoutInflater: LayoutInflater, parent: ViewGroup): View? {
        return layoutInflater.inflate(R.layout.hype_remote_config_plugin, parent, false).also {
            it.setOnClickListener { context.startActivity(RemoteConfigActivity.createIntent(context)) }
        }
    }
}