package io.askhole

import androidx.recyclerview.widget.DiffUtil

class QuestionDiffCallback(
    private val old: List<Question>,
    private val aNew: List<Question>
) : DiffUtil.Callback() {

    override fun getOldListSize(): Int {
        return old.size
    }

    override fun getNewListSize(): Int {
        return aNew.size
    }

    override fun areItemsTheSame(oldPosition: Int, newPosition: Int): Boolean {
        return old[oldPosition].id == aNew[newPosition].id
    }

    override fun areContentsTheSame(oldPosition: Int, newPosition: Int): Boolean {
        return old[oldPosition] == aNew[newPosition]
    }

}
