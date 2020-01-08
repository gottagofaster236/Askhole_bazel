package io.askhole

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class CardStackAdapter(
        private var questions: List<Question> = emptyList()
) : RecyclerView.Adapter<CardStackAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ViewHolder(inflater.inflate(R.layout.item_question, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val question = questions[position]
        holder.text.text = question.text
        holder.itemView.setOnClickListener { v ->
            Toast.makeText(v.context, question.text, Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return questions.size
    }

    fun setQuestions(questions: List<Question>) {
        this.questions = questions
    }

    fun getQuestions(): List<Question> {
        return questions
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val text: TextView = view.findViewById(R.id.item_text)
    }

}
