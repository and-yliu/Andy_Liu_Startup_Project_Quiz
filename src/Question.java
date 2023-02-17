import java.util.ArrayList;

public class Question {
    private String question;
    private ArrayList<String> choices = new ArrayList<>();
    private String correctAnswer;

    public String getQuestion() {
        return question;
    }

    public ArrayList<String> getChoices() {
        return choices;
    }

    public void setChoices(ArrayList<String> choices) {
        this.choices = choices;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }


    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public Question(String question, ArrayList<String> choices, String correctAnswer){
        this.question = question;
        this.choices = choices;
        this.correctAnswer = correctAnswer;
    }

}
