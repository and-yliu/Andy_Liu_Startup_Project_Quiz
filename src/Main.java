import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Quiz quiz = new Quiz();
        while(true){
            System.out.println("What do you want to do? (Please Add Questions First before Starting an Quiz!)\n 1. Take a Quiz \n 2. Add an Question \n 3. Quit");
            String choice = scanner.nextLine();
            while(!choice.equals("1") && !choice.equals("2") && !choice.equals("3")) {
                System.out.println("Try Again");
                choice = scanner.nextLine();
            }
            if (choice.equals("1")){
                quiz.startQuiz();
            }
            else if (choice.equals("2")) {
                Scanner scanner1 = new Scanner(System.in);
                ArrayList<String> choices = new ArrayList<String>();
                System.out.println("Questions: ");
                String q = scanner1.nextLine();
                for (int i = 0; i < 4; i++){
                    System.out.println("Choice " + (char)(i+65) + ":");
                    choices.add(scanner.nextLine());
                }
                System.out.println("Index of Correct Answer: ");
                String cA = scanner1.nextLine();

                Question question = new Question(q, choices, cA);
                quiz.addQuestion(question);
            }
            else if (choice.equals("3")){
                break;
            }
        }
    }
}