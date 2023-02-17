import java.util.ArrayList;
import java.util.Scanner;


public class Quiz {
    public ArrayList<Question> questions = new ArrayList<>();

    public void addQuestion(Question question){
        questions.add(question);
    }


    public void startQuiz(){
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        for(int i = 0; i <questions.size(); i++){
            System.out.println(questions.get(i).getQuestion());
            ArrayList<String> choices = questions.get(i).getChoices();
            for (int n = 0; n < choices.size(); n++) {
                System.out.println((char)(n + 65) + ": " + choices.get(n));
            }
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase(questions.get(i).getCorrectAnswer())){
                System.out.println("Correct!");
                score++;
            }
            else{
                System.out.println("Incorrect!");
            }
        }
        System.out.println("You scored " + score + " out of " + questions.size() +".");
    }

}
