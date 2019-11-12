package classwork.class10;

public class BinaryShifting {
    public static void main(String[] args) {

        //43 & 56
        int[] number1 =
                converter(43);
        int[] number2 = converter(56);

        int x = 1;
        int s = 0;

        for (int i = 0; i < 8; i++) {
            int a = number1[i] * 2 ^ i;
            s = a + number1[i];
        }
        System.out.println(s);
    }


    static int[] converter(int n) {
        int[] binaryNumber = new int[99];

        int i = 0;

        while (n > 0) {
            binaryNumber[i] = n % 2;
            n = n / 2;
            i++;
        }
        return binaryNumber;
    }
}