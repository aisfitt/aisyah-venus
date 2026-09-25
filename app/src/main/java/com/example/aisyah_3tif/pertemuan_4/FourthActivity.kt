package com.example.aisyah_3tif.pertemuan_4

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.aisyah_3tif.MainActivity
import com.example.aisyah_3tif.R
import com.example.aisyah_3tif.databinding.ActivityFourthBinding
import com.example.aisyah_3tif.databinding.ActivityMainBinding
import com.example.aisyah_3tif.pertemuan_3.ThirdResultActivity

class FourthActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFourthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding= ActivityFourthBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.btnKembali.setOnClickListener {
//            //Mengambil value dari inputNama dan menampilkan di Logcat
//            val nama = binding.kembali.text
//            Log.e("Klik btnSubmit","Tombol berhasil di tekan. Isi dari inputNama = $nama")
//            val intent = Intent(this, MainActivity::class.java)
//            Toast.makeText(this, "Pesan berhasil dikirim ke $nama", Toast.LENGTH_SHORT).show()
//            startActivity(intent)
            finish()
        }
    }
}