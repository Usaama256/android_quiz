package com.usaama256.quizapp

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat

class Questions : AppCompatActivity(), View.OnClickListener{
    private var currentPosition: Int = 1
    private var questionList: ArrayList<Qns>? = null
    private var selectedOption: Int = 0
    private var correctAnswers: Int = 0
    private var userName: String? = null
    private var selected: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)

        userName = intent.getStringExtra(Constants.userName)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        var progressBar: ProgressBar = findViewById(R.id.progressBar)
        var tvProgress: TextView = findViewById(R.id.tvProgress)
        var tvQn: TextView = findViewById(R.id.tvQuestion)
        var ivFlag: ImageView = findViewById(R.id.ivFlag)
        var tvOption1: TextView = findViewById(R.id.tvOption1)
        var tvOption2: TextView = findViewById(R.id.tvOption2)
        var tvOption3: TextView = findViewById(R.id.tvOption3)
        var tvOption4: TextView = findViewById(R.id.tvOption4)
        var btnSubmit: TextView = findViewById(R.id.btnSubmit)

        setQuestion()

        tvOption1.setOnClickListener(this)
        tvOption2.setOnClickListener(this)
        tvOption3.setOnClickListener(this)
        tvOption4.setOnClickListener(this)
    }

    fun onSubmit(view: View){
        var btnSubmit: TextView = findViewById(R.id.btnSubmit)

//       if(currentPosition == questionList!!.size){btnSubmit.setOnClickListener{   btnSubmit.text = "FINISH"
//           Toast.makeText(this, "You have completed the Quiz", Toast.LENGTH_SHORT).show()} }

        if(selectedOption == 0){
            currentPosition++

            when{
                currentPosition <= questionList!!.size -> {
                    setQuestion()
                } else -> {
                    val intent2 = Intent(this, ResultActivity::class.java)
                    intent2.putExtra(Constants.userName, userName)
                    intent2.putExtra(Constants.correctAnswers, correctAnswers)
                    intent2.putExtra(Constants.totalQns, questionList!!.size)
                    startActivity(intent2)
                    finish()
                    }
            }


        }else{
            val qn = questionList?.get(currentPosition - 1)
            if(qn!!.correct != selectedOption){
                answerView(selectedOption, R.drawable.wrongsectselectedtxtbackground)
                selected = true
            }else{correctAnswers++
                 selected = true }
            answerView(qn.correct, R.drawable.correctselectedtxtbackground)

           if(currentPosition == questionList!!.size){

            }else{
                btnSubmit.text = "GO TO NEXT QUESTION"
            }

            selectedOption = 0
        }
    }

    private fun setQuestion(){
        var progressBar: ProgressBar = findViewById(R.id.progressBar)
        var tvProgress: TextView = findViewById(R.id.tvProgress)
        var tvQn: TextView = findViewById(R.id.tvQuestion)
        var ivFlag: ImageView = findViewById(R.id.ivFlag)
        var tvOption1: TextView = findViewById(R.id.tvOption1)
        var tvOption2: TextView = findViewById(R.id.tvOption2)
        var tvOption3: TextView = findViewById(R.id.tvOption3)
        var tvOption4: TextView = findViewById(R.id.tvOption4)
        var btnSubmit: TextView = findViewById(R.id.btnSubmit)



        selected = false
        questionList  = Constants.getQuestions()
        defaultOptionView()

        if(currentPosition == questionList!!.size){
            btnSubmit.text = "SUBMIT"
            btnSubmit.setOnClickListener{

                if(selectedOption == 0){
                    currentPosition++

                    when{
                        currentPosition <= questionList!!.size -> {
                            setQuestion()
                        } else -> {
                        val intent2 = Intent(this, ResultActivity::class.java)
                        intent2.putExtra(Constants.userName, userName)
                        intent2.putExtra(Constants.correctAnswers, correctAnswers)
                        intent2.putExtra(Constants.totalQns, questionList!!.size)
                        startActivity(intent2)
                        finish()
                    }
                    }


                }else{
                    val qn = questionList?.get(currentPosition - 1)
                    if(qn!!.correct != selectedOption){
                        answerView(selectedOption, R.drawable.wrongsectselectedtxtbackground)
                        selected = true
                    }else{correctAnswers++
                        selected = true }
                    answerView(qn.correct, R.drawable.correctselectedtxtbackground)

                    selectedOption = 0
                }
                btnSubmit.text = "FINISH"}
        }else{btnSubmit.text = "SUBMIT"}

        var question = questionList!![currentPosition - 1]

        progressBar.progress = currentPosition
        tvProgress.text = "${currentPosition}/${progressBar.max}"

        tvQn.text = "${question!!.Qn}"
        ivFlag.setImageResource(question!!.image)
        tvOption1.text = "${question.option1}"
        tvOption2.text = "${question!!.option2}"
        tvOption3.text = "${question!!.option3}"
        tvOption4.text = "${question!!.option4}"

    }

    private fun defaultOptionView(){

        var tvOption1: TextView = findViewById(R.id.tvOption1)
        var tvOption2: TextView = findViewById(R.id.tvOption2)
        var tvOption3: TextView = findViewById(R.id.tvOption3)
        var tvOption4: TextView = findViewById(R.id.tvOption4)

        var option = ArrayList<TextView>()
        option.add(0, tvOption1)
        option.add(1, tvOption2)
        option.add(2, tvOption3)
        option.add(3, tvOption4)

        for(option in option){
            option.setTextColor(Color.parseColor("#444967"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this, R.drawable.txtbackground)

        }
    }

    override fun onClick(v: View?) {
        var tvOption1: TextView = findViewById(R.id.tvOption1)
        var tvOption2: TextView = findViewById(R.id.tvOption2)
        var tvOption3: TextView = findViewById(R.id.tvOption3)
        var tvOption4: TextView = findViewById(R.id.tvOption4)
        var btnSubmit: TextView = findViewById(R.id.btnSubmit)

        if(btnSubmit.text.toString() != "GO TO NEXT QUESTION" && btnSubmit.text.toString() != "FINISH") {
            when (v?.id) {
                R.id.tvOption1 -> {selectedOptionView(tvOption1, 1)}
                R.id.tvOption2 -> {selectedOptionView(tvOption2, 2)}
                R.id.tvOption3 -> {selectedOptionView(tvOption3, 3)}
                R.id.tvOption4 -> {selectedOptionView(tvOption4, 4)}
            }
        }


    }
     fun answerView(answer: Int, appearance: Int){
         var tvOption1: TextView = findViewById(R.id.tvOption1)
         var tvOption2: TextView = findViewById(R.id.tvOption2)
         var tvOption3: TextView = findViewById(R.id.tvOption3)
         var tvOption4: TextView = findViewById(R.id.tvOption4)

         when(answer){
             1 -> {tvOption1.background = ContextCompat.getDrawable(this, appearance)}
             2 -> {tvOption2.background = ContextCompat.getDrawable(this, appearance)}
             3 -> {tvOption3.background = ContextCompat.getDrawable(this, appearance)}
             4 -> {tvOption4.background = ContextCompat.getDrawable(this, appearance)}
         }
     }

    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int){
        defaultOptionView()
        selectedOption = selectedOptionNum

        tv.setTextColor(Color.parseColor("#FF000000"))
        tv.typeface = Typeface.DEFAULT_BOLD
        tv.background = ContextCompat.getDrawable(this, R.drawable.selectedtxtbackground)
    }
}