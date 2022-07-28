package com.usaama256.quizapp

data class Qns(
    val id: Int,
    val Qn: String,
    val image: Int,
    val option1: String,
    val option2: String,
    val option3: String,
    val option4: String,
    val correct: Int
)