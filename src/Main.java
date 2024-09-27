import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the hidden number: ");
        int hiddenNum = input.nextInt();
        System.out.print("Enter your guess: ");
        int choice = input.nextInt();
        int guesses = 0;
        while (choice != hiddenNum) {
            if (choice < hiddenNum) {
                System.out.println("The number is bigger");
                choice = input.nextInt();
            }
            else if (choice > hiddenNum) {
                System.out.println("The number is smaller");
                choice = input.nextInt();
            }
            else if (choice == hiddenNum) {
                break;
            }
            guesses++;
        }
        input.close();
        System.out.println("You guessed it in " + guesses + " attempts!");
    }
}