package com.tayyba.alarm

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.widget.Toast

class AlarmReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        Toast.makeText(context, "Alarm", Toast.LENGTH_SHORT).show()
        val alarm = MediaPlayer.create(context,R.raw.alarm)
        alarm.start()
//        val notificationUtils = NotificationUtils(context)
//        val notification = notificationUtils.getNotificationBuilder().build()
//        notificationUtils.getManager().notify(150, notification)
    }
}