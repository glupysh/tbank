package com.example.tbank_first_task

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DetailViewModel : ViewModel() {
    private val _joke = MutableLiveData<Joke>()
    val joke: LiveData<Joke> get() = _joke

    fun setJoke(joke: Joke) {
        _joke.value = joke
    }
}
