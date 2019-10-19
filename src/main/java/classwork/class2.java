/* package classwork;

import java.util.Arrays;

public class class2 {
    public static int[] filter_neg(int[] origin){
        int[] result = new int[origin.length];
        int pos = 0;
        for (int val: origin /*=  int i=0; i<origin; i++  ) {
            if (val < 0)  result[pos++] = val;
        }

        if (pos == origin.length) return result;
        else return Arrays.copyOf(result, pos);
    }

    public static int[] filter_odd(int[] origin){

    }

    public static int[] filter_even(int[] origin){

    }


    public static void main(String[] args) {
        //Random ranum1 = new Random();

        int min = -5;
        int max = 5;
        int length = 20;
        int range = max - min;

        int[] array1 = new int[length];

        for (int i = 0; i < length; i++) {
            array1[i] = (int) (Math.random()*range + min);
        }
        System.out.println(Arrays.toString(array1));

        int[] reverted = new int[length];
        for (int i = 0; i < length; i++) {
            int src_pst = i;
            int dst_pst = 20 - i - 1;
            reverted[dst_pst] = array1[src_pst];
        }
        System.out.println(Arrays.toString(reverted));

        int negatives = filter_neg(array1);
        int odds = filter_odd(array1);
        int evens = filter_even(array1);

        }

    }
}
 */