package com.example.tbank_first_task

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _jokes = MutableLiveData<List<Joke>>()
    val jokes: LiveData<List<Joke>> get() = _jokes

    init {
        loadJokes()
    }

    private fun loadJokes() {
        _jokes.value = listOf(
            Joke("Christmas", "What does Santa suffer from if he gets stuck in a chimney?", "Claustrophobia!"),
            Joke("Animals", "Why don't elephants use computers?", "Because they are afraid of the mouse!"),
            Joke("Science", "Why did the physics teacher break up with the biology teacher?", "There was no chemistry!"),
            Joke("Math", "Why is six afraid of seven?", "Because seven eight nine!"),
            Joke("Food", "Why don't eggs tell jokes?", "Because they'd crack up!"),
            Joke("Tech", "Why do programmers prefer dark mode?", "Because the light attracts bugs!"),
            Joke("Sports", "Why are basketball players such messy eaters?", "They are always dribbling!")
        )
    }
}
