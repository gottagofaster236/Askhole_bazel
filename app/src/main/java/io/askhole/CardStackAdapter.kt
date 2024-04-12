package io.askhole

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.makeramen.roundedimageview.RoundedImageView
import io.askhole.Question.Companion.QuestionType.*
import io.askhole.idk.R


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

        val borderColorId = questionColor(question.type)
        val borderColor = ContextCompat.getColor(holder.itemView.context, borderColorId)
        holder.image.borderColor = borderColor
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
        val image: RoundedImageView = view.findViewById(R.id.item_image)
    }

    companion object {
        fun questionColor(type: Question.Companion.QuestionType): Int {
            return when(type) {
                UNCLASSIFIED -> R.color.borderUnclassified
                GENERIC -> R.color.borderGeneric
                SEXY -> R.color.borderSexy
                SAD -> R.color.borderSad
                EDGY -> R.color.borderEdgy
                THOUGHTFUL -> R.color.borderThoughtful
                PERSONAL -> R.color.borderPersonal
            }
        }
    }

}
