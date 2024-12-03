package org.example.Models;

import java.util.List;

public class Question {
    private String question;
    private List<String> answers;
    String rightAnswer;

    public Question(String question, List<String> answers, String rightAnswer) {
        this.question = question;
        this.answers = answers;
        this.rightAnswer = rightAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public String getRightAnswer() {
        return rightAnswer;
    }

}
