package com.fusuma.hyperion.remoteconfig.list

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fusuma.hyperion.remoteconfig.R

class RemoteConfigActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hype_activity_remote_config)
    }

    companion object {
        fun createIntent(context: Context) = Intent(context, RemoteConfigActivity::class.java)
    }
}
