package com.usaama256.quizapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class ResultActivity : AppCompatActivity() {



    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        var userName = intent.getStringExtra(Constants.userName)
        var correctAnswers = intent.getIntExtra(Constants.correctAnswers, 0)
        var total_qns = intent.getIntExtra(Constants.totalQns, 0)

        var tvUserName: TextView = findViewById(R.id.tvUserName)
        var tvScore: TextView = findViewById(R.id.tvScore)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        tvUserName.text = "$userName"
        tvScore.setText("Your score is $correctAnswers out of $total_qns")


    }

    fun onFinish(view: View){
            startActivity(Intent(this, MainActivity::class.java))
            finish()
    }
}