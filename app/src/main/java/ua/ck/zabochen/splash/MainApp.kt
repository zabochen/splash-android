package ua.ck.zabochen.splash

import android.app.Application

class MainApp : Application() {
    override fun onCreate() {
        super.onCreate()

        // loading app libs
        Thread.sleep(5000)
    }
}