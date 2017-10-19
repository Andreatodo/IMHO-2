package server.models;

import java.util.ArrayList;

public class Question {

    private int idQuestion;
    private String question;
    private int quizIdQuiz;
    private ArrayList<Option> options;
    /*private int quizTopicIdTopic;*/

    /*evt tilføj til parameter (slettet pr 17/10) int quizTopicIdTopic)*/
    public Question(int idQuestion, String question, int quizIdQuiz, ArrayList<Option> options) {
        this.idQuestion = idQuestion;
        this.question = question;
        this.quizIdQuiz = quizIdQuiz;
        this.options = options;
       /* this.quizTopicIdTopic = quizTopicIdTopic; */
    }

    public Question(){

    }

    public ArrayList<Option> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<Option> options) {
        this.options = options;
    }

    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getQuizIdQuiz() {
        return quizIdQuiz;
    }

    public void setQuizIdQuiz(int quizIdQuiz) {
        this.quizIdQuiz = quizIdQuiz;
    }

   /* public int getQuizTopicIdTopic() {
        return quizTopicIdTopic;
    }

    public void setQuizTopicIdTopic(int quizTopicIdTopic) {
        this.quizTopicIdTopic = quizTopicIdTopic;
    } */
}