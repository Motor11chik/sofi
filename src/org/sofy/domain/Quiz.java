package org.sofy.domain;

/**
 * Test question/answer pair.
 *
 * @author Софи
 * @since 2016.08.27
 */
public class Quiz {
    private String question;
    private String answer;

    public Quiz(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Quiz)) return false;

        Quiz quiz = (Quiz) o;

        if (question != null ? !question.equals(quiz.question) : quiz.question != null) return false;
        return answer != null ? answer.equals(quiz.answer) : quiz.answer == null;

    }

    @Override
    public int hashCode() {
        int result = question != null ? question.hashCode() : 0;
        result = 31 * result + (answer != null ? answer.hashCode() : 0);
        return result;
    }
//
//        @Override
//    public boolean equals(Object obj) {
//        return Objects.equals(this, obj);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hashCode(this);
//    }

}
