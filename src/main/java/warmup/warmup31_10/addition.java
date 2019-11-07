package warmup.warmup31_10;

import java.util.Scanner;

public class addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputNumbers = input.next();
        String inputArray[] = inputNumbers.split("");
        Integer[] outputArray = new Integer[inputArray.length];

        //System.out.println(inputArray[1]);

        for (int i = 0; i < inputArray.length; i += 2) {
            try {
                outputArray[i] = Integer.parseInt(inputArray[i]);
            } catch (Exception e) {
                throw new IllegalArgumentException("a problem occurs");
            }
        }

        int result1 = outputArray[0] + outputArray[4];
        int result2 = outputArray[2];


        if (result1 == result2) {
            System.out.println("1");
        } else System.out.println(result1 + "/" + result2);


    }
}
