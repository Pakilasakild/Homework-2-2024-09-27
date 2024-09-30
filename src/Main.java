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
            int diff = Math.abs(choice - hiddenNum);
            if (choice < hiddenNum && diff < 10) {
                System.out.println("The number is bigger, you're very close! Try again");
                choice = input.nextInt();
            }
            else if (choice < hiddenNum && diff < 20) {
                System.out.println("The number is bigger, you're close! Try again");
                choice = input.nextInt();
            }
            else if (choice < hiddenNum && diff > 20) {
                System.out.println("The number is bigger, Keep trying.");
                choice = input.nextInt();
            }
            else if (choice > hiddenNum && diff < 10) {
                System.out.println("The number is smaller, you're very close! Try again");
                choice = input.nextInt();
            }
            else if (choice > hiddenNum && diff < 20) {
                System.out.println("The number is smaller, you're close! Try again");
                choice = input.nextInt();
            }
            else if (choice > hiddenNum && diff > 20) {
                System.out.println("The number is smaller, Keep trying.");
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