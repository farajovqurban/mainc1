package homework.hw1;
import java.util.Random;
import java.util.Scanner;

public class homework_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand1 = new Random();
        int randomNumber = rand1.nextInt(100);
        System.out.println("Enter your name: ");
        String name = input.next();
        System.out.println("Let the game begin!");

        while (true){
            int inputNumber = input.nextInt();
            if (randomNumber == inputNumber) {
                System.out.println("Congratulations, " + name + "!");
                break;
            }
            else if (inputNumber < randomNumber)  System.out.println("Your number is too small. Please, try again.");
            else  System.out.println("Your number is too big. Please, try again.");
        }
    }
}