package com.example.tbank_first_task

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // Получаем данные из Intent
        val category = intent.getStringExtra("CATEGORY")
        val question = intent.getStringExtra("QUESTION")
        val answer = intent.getStringExtra("ANSWER")

        // Инициализируем TextView
        val categoryTextView: TextView = findViewById(R.id.detailCategoryTextView)
        val questionTextView: TextView = findViewById(R.id.detailQuestionTextView)
        val answerTextView: TextView = findViewById(R.id.detailAnswerTextView)

        // Устанавливаем данные в TextView
        categoryTextView.text = category
        questionTextView.text = question
        answerTextView.text = answer
    }
}
