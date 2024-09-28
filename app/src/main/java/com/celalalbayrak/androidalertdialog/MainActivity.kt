package com.celalalbayrak.androidalertdialog

import android.content.DialogInterface
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.celalalbayrak.androidalertdialog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        Toast.makeText(this@MainActivity, "Hoşgeldiniz", Toast.LENGTH_LONG).show()

    }


    fun kaydet(view: View) {

        val alert = AlertDialog.Builder(this@MainActivity)
        alert.setTitle("Kaydet")
        alert.setMessage("Kaydetmek istermisiniz")
        alert.setPositiveButton("Tamam", DialogInterface.OnClickListener { dialog, which ->
            Toast.makeText(this@MainActivity, "Kayıt Başarılı", Toast.LENGTH_LONG).show()
        })



        alert.setNegativeButton("Hayır") { dialog, which ->
            Toast.makeText(this@MainActivity, "İptal edildi", Toast.LENGTH_LONG).show()
        }



            alert.show()
        }
    }






