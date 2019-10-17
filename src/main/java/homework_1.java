import java.util.Random;
import java.util.Scanner;

public class homework_1 {
    public static void main(String[] args) {
        Random rand1 = new Random();
        System.out.println("Let the game begin!");
        System.out.println(rand1);
        Scanner input = new Scanner(System.in);

        int inum = input.nextInt();
        int ranum = rand1.nextInt(100);

        if (ranum == inum)
            System.out.println("Congratulations, {name}!");
        else if (inum < ranum)
            System.out.println("Your number is too small. Please, try again.");
        else
            System.out.println("Your number is too big. Please, try again.");
    }
}
