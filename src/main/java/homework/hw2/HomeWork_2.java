package homework.hw2;

import java.util.Random;
import java.util.Scanner;

public class HomeWork_2 {
    public static void main(String[] args) {
        int column = 5;
        int row = 5;

        char[][] array1 = new char[column][row];
        System.out.println("All set. Get ready to rumble!");
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                array1[i][j]++;
                System.out.print("-");
            }
            System.out.println();
        }

        Random random = new Random();
        int randomRow = random.nextInt(5) + 1;
        int randomColumn = random.nextInt(5) + 1;
        System.out.println(randomRow + " " + randomColumn);
        Scanner scn = new Scanner(System.in);

        while (true) {
            System.out.println("Enter row: ");
            int inputRow = scn.nextInt();
            System.out.println("Enter column: ");
            int inputColumn = scn.nextInt();

            if (inputRow == randomRow && inputColumn == randomColumn) {
                for (int i = 0; i < array1.length; i++) {
                    for (int j = 0; j < array1.length; j++) {
                        array1[i][j] = '-';
                        array1[inputRow - 1][inputColumn - 1] = 'X';
                        System.out.print(array1[i][j]);
                    }
                    System.out.println();
                }

                System.out.println("You have won!");
                break;


            } else {
                System.out.println("Try again");
                for (int i = 0; i < array1.length; i++) {
                    for (int j = 0; j < array1.length; j++) {
                        array1[i][j] = '-';
                        array1[inputRow - 1][inputColumn - 1] = '*';
                        System.out.print(array1[i][j]);
                    }
                    System.out.println();
                }
            }
        }
    }
}