package com.example.alagatkalinga

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TimePicker
import android.widget.Toast
import android.widget.ToggleButton
import java.util.Calendar

class AlarmActivity : AppCompatActivity() {
    var alarmTimePicker: TimePicker? = null
    var pendingIntent: PendingIntent? = null
    var alarmManager: AlarmManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarm)
        alarmTimePicker = findViewById(R.id.timePicker)
        alarmManager = getSystemService(ALARM_SERVICE) as AlarmManager
    }

    fun onToggleClicked(view: View) {
        var time: Long
        if ((view as ToggleButton).isChecked) {
            Toast.makeText(this, "Alarm ON", Toast.LENGTH_SHORT).show()

            var calendar = Calendar.getInstance()

            calendar[Calendar.HOUR_OF_DAY] = alarmTimePicker!!.hour
            calendar[Calendar.MINUTE] = alarmTimePicker!!.minute

            val intent = Intent(this, AlarmReceiver::class.java)
            pendingIntent = PendingIntent.getBroadcast(this, 0, intent, 0)

            time = calendar.timeInMillis - calendar.timeInMillis % 60000

            if (System.currentTimeMillis() > time) {
                time = if (calendar[Calendar.AM_PM] == 0) {
                    time + 1000 * 60 * 60 * 12
                } else {
                    time + 1000 * 60 * 60 * 24
                }
            }
            alarmManager!!.setRepeating(AlarmManager.RTC_WAKEUP, time, 1000, pendingIntent)

        } else {
            // Cancel the alarm when the toggle button is turned off
            alarmManager?.cancel(pendingIntent)

            // Send the stop action to the AlarmReceiver to stop the alarm sound
            val stopIntent = Intent(this, AlarmReceiver::class.java)
            stopIntent.action = "com.example.alarmclock.STOP_ALARM"
            sendBroadcast(stopIntent)

            Toast.makeText(this, "Alarm OFF", Toast.LENGTH_SHORT).show()
        }
    }
}