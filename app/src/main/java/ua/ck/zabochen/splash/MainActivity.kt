package ua.ck.zabochen.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppNoActionBarTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}