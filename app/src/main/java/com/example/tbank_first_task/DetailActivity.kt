package com.example.tbank_first_task

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.tbank_first_task.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding
    private val viewModel: DetailViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val joke = Joke(
            category = intent.getStringExtra("CATEGORY").orEmpty(),
            question = intent.getStringExtra("QUESTION").orEmpty(),
            answer = intent.getStringExtra("ANSWER").orEmpty()
        )
        viewModel.setJoke(joke)

        viewModel.joke.observe(this) { jokeData ->
            binding.detailCategoryTextView.text = jokeData.category
            binding.detailQuestionTextView.text = jokeData.question
            binding.detailAnswerTextView.text = jokeData.answer
        }
    }
}

