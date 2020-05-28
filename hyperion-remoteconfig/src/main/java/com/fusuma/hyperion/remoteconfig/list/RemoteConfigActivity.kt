package com.fusuma.hyperion.remoteconfig.list

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fusuma.hyperion.remoteconfig.R
import com.willowtreeapps.hyperion.plugin.v1.HyperionIgnore
import kotlinx.android.synthetic.main.hype_activity_remote_config.*

@HyperionIgnore
class RemoteConfigActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hype_activity_remote_config)

        setSupportActionBar(hype_toolbar)
        requireNotNull(supportActionBar).run {
            setDisplayHomeAsUpEnabled(true)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    companion object {
        fun createIntent(context: Context) = Intent(context, RemoteConfigActivity::class.java)
    }
}
