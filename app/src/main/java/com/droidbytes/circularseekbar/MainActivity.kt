package com.droidbytes.circularseekbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.droidbytes.circularseekbar.databinding.ActivityMainBinding
import me.tankery.lib.circularseekbar.CircularSeekBar

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.seekBar.setOnSeekBarChangeListener(object : CircularSeekBar.OnCircularSeekBarChangeListener{
            override fun onProgressChanged(
                circularSeekBar: CircularSeekBar?,
                progress: Float,
                fromUser: Boolean,
            ) {

            }

            override fun onStartTrackingTouch(seekBar: CircularSeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: CircularSeekBar?) {
                println("seek bar ${seekBar!!.progress}")
            }

        })

    }
}