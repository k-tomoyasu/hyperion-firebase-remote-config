package com.fusuma.hyperion.remoteconfig

import com.google.auto.service.AutoService
import com.willowtreeapps.hyperion.plugin.v1.Plugin
import com.willowtreeapps.hyperion.plugin.v1.PluginModule

@SuppressWarnings("unused")
@AutoService(Plugin::class)
class RemoteConfigPlugin : Plugin() {
    override fun createPluginModule(): PluginModule {
        return RemoteConfigModule()
    }
}