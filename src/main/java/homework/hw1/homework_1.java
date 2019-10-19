package homework.hw1;
import java.util.Random;
import java.util.Scanner;

public class homework_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand1 = new Random();
        int ranum = rand1.nextInt(100);
        System.out.println("Let the game begin!");

        while (true){
            int inum = input.nextInt();
            if (ranum == inum) {
                System.out.println("Congratulations!");
                break;
            }
            else if (inum < ranum)  System.out.println("Your number is too small. Please, try again.");
            else  System.out.println("Your number is too big. Please, try again.");
        }
    }
}
