package homework;

import java.util.Random;
import java.util.Scanner;

public class homework_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean check;

        Random rand1 = new Random();
        int ranum = rand1.nextInt(100);

        System.out.println("Let the game begin!");

        do {
            int inum = input.nextInt();
            check = (inum == ranum);

            if (ranum == inum) {
                System.out.println("Congratulations!");
                break;
            }

            else if (inum < ranum)
                System.out.println("Your number is too small. Please, try again.");

            else
                System.out.println("Your number is too big. Please, try again.");

        }
        while (check = true);


    }
}
