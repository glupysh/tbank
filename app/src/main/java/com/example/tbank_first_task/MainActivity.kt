package com.example.tbank_first_task

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Список статичных шуток
        val jokes = listOf(
            Joke("Christmas", "What does Santa suffer from if he gets stuck in a chimney?", "Claustrophobia!"),
            Joke("Animals", "Why don't elephants use computers?", "Because they are afraid of the mouse!"),
            Joke("Science", "Why did the physics teacher break up with the biology teacher?", "There was no chemistry!"),
            Joke("Math", "Why is six afraid of seven?", "Because seven eight nine!"),
            Joke("Food", "Why don't eggs tell jokes?", "Because they'd crack up!"),
            Joke("Tech", "Why do programmers prefer dark mode?", "Because the light attracts bugs!"),
            Joke("Sports", "Why are basketball players such messy eaters?", "They are always dribbling!")
        )

        // Инициализация RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = JokeAdapter(jokes)
    }
}