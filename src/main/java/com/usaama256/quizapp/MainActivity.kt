package com.usaama256.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

    }

    fun onStart(view: View){
        var etName = findViewById<TextView>(R.id.etName)

        if(etName.text.toString().isEmpty()){
            Toast.makeText(this, "Please Enter Your Name", Toast.LENGTH_SHORT).show()
        }else{
            val intent1 = Intent(this, Questions::class.java)
            intent1.putExtra(Constants.userName, etName.text.toString())
            startActivity(intent1)
            finish()
        }


    }
    fun onAbout(view: View){
        startActivity(Intent(this, aboutActivity::class.java))
    }



}