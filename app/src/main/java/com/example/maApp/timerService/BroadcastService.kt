package com.example.maApp.timerService

import android.app.Service
import android.content.Intent
import android.os.CountDownTimer
import android.os.IBinder
class BroadcastService : Service() {
    var bi = Intent(COUNTDOWN_BR)
    var cdt: CountDownTimer? = null
    override fun onCreate() {
        super.onCreate()
        cdt = object : CountDownTimer(5000, 100) {
            override fun onTick(millisUntilFinished: Long) {
                bi.putExtra("countdown", millisUntilFinished/1000)
                sendBroadcast(bi)
            }

            override fun onFinish() {
                bi.putExtra("done", true)
                sendBroadcast(bi)
            }
        }.start()
    }

    override fun onDestroy() {
        cdt!!.cancel()
        super.onDestroy()
    }

    override fun onStartCommand(intent: Intent, flags: Int, startId: Int): Int {
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onBind(arg0: Intent): IBinder? {
        return null
    }

    companion object {
        const val COUNTDOWN_BR = "com.example.nasaapp.countdown_br"
    }
}