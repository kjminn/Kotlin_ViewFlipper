package kr.ac.yuhan.minn.kotlin_viewflipper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kr.ac.yuhan.minn.kotlin_viewflipper.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.btnStart.setOnClickListener(btnL)
        binding.btnStop.setOnClickListener(btnL)
        binding.viewflip.flipInterval = 1000
    }
    val btnL = View.OnClickListener{
        when(it.id){
            R.id.btn_start->  binding.viewflip.startFlipping()
            R.id.btn_stop->   binding.viewflip.stopFlipping()
        }
    }
}