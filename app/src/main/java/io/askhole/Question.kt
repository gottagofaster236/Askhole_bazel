package io.askhole

data class Question(
        val id: Long,
        val text: String,
        val type: QuestionType
) {

        companion object {
                enum class QuestionType {
                        GENERIC, SEXY, SAD, EDGY, THOUGHTFUL, PERSONAL, UNCLASSIFIED
                }
}
}
