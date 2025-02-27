import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        // Step 1: Get the student's score
        double score = getStudentScore();
        
        // Step 2: Determine the grade
        String grade = calculateGrade(score);
        
        // Step 3: Display the result
        System.out.println("Your Grade is: " + grade);
    }

    // Method to get the student's score from user input
    public static double getStudentScore() {
        Scanner scanner = new Scanner(System.in);
        double score = -1; // Default invalid value
        
        while (true) {
            try {
                System.out.print("Enter your score: ");
                score = Double.parseDouble(scanner.nextLine());

                // Validate score range (0-100)
                if (score < 0 || score > 100) {
                    System.out.println("Invalid input. Score must be between 0 and 100.");
                } else {
                    break; // Exit loop if valid
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
        scanner.close();
        return score;
    }

    // Method to determine the letter grade based on score
    public static String calculateGrade(double score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
