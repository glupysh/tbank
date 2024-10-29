package com.example.tbank_first_task

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class JokeAdapter : ListAdapter<Joke, JokeAdapter.JokeViewHolder>(JokeDiffCallback()) {

    class JokeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val categoryTextView: TextView = itemView.findViewById(R.id.categoryTextView)
        val questionTextView: TextView = itemView.findViewById(R.id.questionTextView)
        val answerTextView: TextView = itemView.findViewById(R.id.answerTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JokeViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_joke, parent, false)
        return JokeViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: JokeViewHolder, position: Int) {
        val joke = getItem(position) // используем getItem вместо прямого доступа
        holder.categoryTextView.text = joke.category
        holder.questionTextView.text = joke.question
        holder.answerTextView.text = joke.answer
    }
}

class JokeDiffCallback : DiffUtil.ItemCallback<Joke>() {
    override fun areItemsTheSame(oldItem: Joke, newItem: Joke): Boolean {
        return oldItem.question == newItem.question // Предполагаем, что вопрос уникален
    }

    override fun areContentsTheSame(oldItem: Joke, newItem: Joke): Boolean {
        return oldItem == newItem
    }
}