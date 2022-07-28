package com.usaama256.quizapp

object Constants{

    val userName: String = "userName"
    val correctAnswers: String = "correct Answers"
    val totalQns: String = "totalQns"


    fun getQuestions(): ArrayList<Qns> {
    val questionList = ArrayList<Qns>()

    val qn1: Qns = Qns(
        1,
        "Which Country does this Flag belong to??",
        R.drawable.argentina,
        "Australia",
        "Albania",
        "Argentina",
        "Armenia",
        3
    )
    questionList.add(qn1)


    val qn2: Qns = Qns(
        2,
        "Which Country does this Flag belong to??",
        R.drawable.china,
        "Spain",
        "Ukraine",
        "Japan",
        "China",
        4
    )
    questionList.add(qn2)


    val qn3: Qns = Qns(
        3,
        "Which Country does this Flag belong to??",
        R.drawable.kenya,
        "Kenya",
        "Tanzania",
        "Lesotho",
        "Congo",
        1
    )
    questionList.add(qn3)


    val qn4: Qns = Qns(
        4,
        "Which Country does this Flag belong to??",
        R.drawable.uganda,
        "Germany",
        "Uganda",
        "Angola",
        "Peru",
        2
    )
    questionList.add(qn4)


    val qn5: Qns = Qns(
        5,
        "Which Country does this Flag belong to??",
        R.drawable.denmark,
        "Switzerland",
        "United Kingdom",
        "Austria",
        "Denmark",
        4
    )
    questionList.add(qn5)


    val qn6: Qns = Qns(
        6,
        "Which Country does this Flag belong to??",
        R.drawable.niger,
        "Nigeria",
        "Cameroon",
        "Niger",
        "Ghana",
        3
    )
    questionList.add(qn6)


    val qn7: Qns = Qns(
        7,
        "Which Country does this Flag belong to??",
        R.drawable.nigeria,
        "Nigeria",
        "Cameroon",
        "Niger",
        "Ghana",
        1
    )
    questionList.add(qn7)


    val qn8: Qns = Qns(
        8,
        "Which Country does this Flag belong to??",
        R.drawable.tanzania,
        "Kenya",
        "Tanzania",
        "Lesotho",
        "Congo",
        2
    )
    questionList.add(qn8)


    val qn9: Qns = Qns(
        9,
        "Which Country does this Flag belong to??",
        R.drawable.germany,
        "Germany",
        "Uganda",
        "Angola",
        "Peru",
        1
    )
    questionList.add(qn9)


    val qn10: Qns = Qns(
        10,
        "Which Country does this Flag belong to??",
        R.drawable.mongolia,
        "China",
        "Mongolia",
        "Sri Lanka",
        "Indonesia",
        2
    )
    questionList.add(qn10)


    val qn11: Qns = Qns(
        11,
        "Which Country does this Flag belong to??",
        R.drawable.brazil,
        "Congo",
        "Albania",
        "Ghana",
        "Brazil",
        4
    )
    questionList.add(qn11)


    val qn12: Qns = Qns(
        12,
        "Which Country does this Flag belong to??",
        R.drawable.albania,
        "Australia",
        "Albania",
        "Argentina",
        "Armenia",
        2
    )
    questionList.add(qn12)


    val qn13: Qns = Qns(
        13,
        "Which Country does this Flag belong to??",
        R.drawable.algeria,
        "Oman",
        "Algeria",
        "Morocco",
        "Kuwait",
        2
    )
    questionList.add(qn13)


    val qn14: Qns = Qns(
        14,
        "Which Country does this Flag belong to??",
        R.drawable.portugal,
        "Paraguay",
        "Portugal",
        "Argentina",
        "Cuba",
        2
    )
    questionList.add(qn14)


    val qn15: Qns = Qns(
        15,
        "Which Country does this Flag belong to??",
        R.drawable.sudan,
        "Egypt",
        "Libya",
        "Sudan",
        "South Sudan",
        3
    )
    questionList.add(qn15)


    val qn16: Qns = Qns(
        16,
        "Which Country does this Flag belong to??",
        R.drawable.saudiarabia,
        "Saudi Arabia",
        "Azerbaijan",
        "United Arab Emirates",
        "Iraq",
        1
    )
    questionList.add(qn16)


    val qn17: Qns = Qns(
        17,
        "Which Country does this Flag belong to??",
        R.drawable.southafrica,
        "Peru",
        "South Sudan",
        "South Africa",
        "Madagascar",
        3
    )
    questionList.add(qn17)


    val qn18: Qns = Qns(
        18,
        "Which Country does this Flag belong to??",
        R.drawable.mali,
        "Mali",
        "Congo",
        "Mozambique",
        "Chad",
        1
    )
    questionList.add(qn18)


    val qn19: Qns = Qns(
        19,
        "Which Country does this Flag belong to??",
        R.drawable.pakistan,
        "Pakistan",
        "Saudi Arabia",
        "Somalia",
        "Libya",
        1
    )
    questionList.add(qn19)


    val qn20: Qns = Qns(
        20,
        "Which Country does this Flag belong to??",
        R.drawable.somalia,
        "Belarus",
        "Jordan",
        "Hungary",
        "Somalia",
        4
    )
    questionList.add(qn20)

    return questionList

    }
}