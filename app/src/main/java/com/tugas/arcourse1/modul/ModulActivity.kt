package com.tugas.arcourse1.modul

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tugas.arcourse1.HomeActivity
import com.tugas.arcourse1.R
import kotlinx.android.synthetic.main.activity_modul.*

class ModulActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_modul)

        btn_modul.setOnClickListener {
            startActivity(Intent(this, ModulRewardActivity::class.java))
            finish()
        }

        imgBack.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }
    }
}