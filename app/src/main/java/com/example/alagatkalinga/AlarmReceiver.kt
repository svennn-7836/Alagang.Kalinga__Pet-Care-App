package com.example.alagatkalinga

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.Ringtone
import android.media.RingtoneManager
import android.os.Vibrator
import android.widget.Toast

class AlarmReceiver : BroadcastReceiver() {
    private var vibrator: Vibrator? = null
    private var ringtone: Ringtone? = null

    override fun onReceive(context: Context?, intent: Intent?) {
        val action = intent?.action

        if (action != null && action == "com.example.alarmclock.STOP_ALARM") {
            // Stop the alarm
            vibrator?.cancel()
            ringtone?.stop()
        } else {
            // Start the alarm
            vibrator = context?.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            vibrator?.vibrate(4000)

            Toast.makeText(context, "Alarm! Pet Time!", Toast.LENGTH_SHORT).show()

            var alarmUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM)

            if (alarmUri == null) {
                alarmUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
            }
            ringtone = RingtoneManager.getRingtone(context, alarmUri)
            ringtone?.play()
        }
    }
}