package com.example.assigment_n10

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class NotificationActionReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent?.action == "STOP_SERVICE") {
            val stopServiceIntent = Intent(context, MyForegroundService::class.java)
            context?.stopService(stopServiceIntent)
        }
    }
}