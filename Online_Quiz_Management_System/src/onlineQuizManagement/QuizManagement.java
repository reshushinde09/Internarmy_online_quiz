package onlineQuizManagement;

import java.util.List;
import java.util.Scanner;

public class QuizManagement {
	private DatabaseManager databaseManager;
    private User currentUser;
    private Scanner scanner;

    public void QuizManager() {
        databaseManager = new DatabaseManager();
        scanner = new Scanner(System.in);
        currentUser = null; // Initialize as null, will be set after login
    }

    public void startQuiz() {
        if (currentUser == null) {
            System.out.println("Please login to start the quiz.");
            return;
        }

        System.out.println("Enter the test name: ");
        String testName = scanner.nextLine();

        Test test = databaseManager.getTest(testName);
        if (test == null) {
            System.out.println("Test not found.");
            return;
        }

        System.out.println("Starting test: " + testName);
        System.out.println("Test duration: " + test.getDurationInMinutes() + " minutes");

        List<Question> questions = test.getQuestions();
        int score = 0;

        for (int i = 0; i < questions.size(); i++) {
            Question question = questions.get(i);

            System.out.println("\nQuestion " + (i + 1) + ": " + question.getQuestionText());
            for (int j = 0; j < question.getOptions().length; j++) {
                System.out.println((j + 1) + ". " + question.getOptions()[j]);
            }

            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == question.getCorrectOption()) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect! Correct option: " + question.getCorrectOption());
            }
        }

        System.out.println("\nTest completed!");
        System.out.println("Your score: " + score + "/" + questions.size());
    }

}
