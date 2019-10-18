package homework;
import java.util.Random;
import java.util.Scanner;

public class homework_2 {
    public static void main(String[] args) {
        int column = 5;
        int row = 5;

        char [] [] array1 = new char[column][row];
        System.out.println("All set. Get ready to rumble!");
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                array1 [i] [j] ++;
                System.out.print("-");
            }
            System.out.println();
        }



        Random rand = new Random();
        int ranrow = rand.nextInt(5) + 1;
        int rancol = rand.nextInt(5) + 1;
        System.out.println(ranrow + " " + rancol);

            Scanner scn = new Scanner(System.in);

            while(true) {
                int inrow = scn.nextInt();
                int incol = scn.nextInt();

                if (inrow == ranrow && incol == rancol) {
                    System.out.println("You have won!");
                    break;
                }
                else {
                    System.out.println("try again");

                    for (int i = 0; i < array1.length; i++) {
                        for (int j = 0; j < row; j++) {

                            array1[i][j] = '-';
                            array1[inrow][incol] = '*';
                            System.out.print(array1[i][j]);

                        }

                        System.out.println();
                    }

                    }
            }

        }











        }