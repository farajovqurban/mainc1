package classwork.class3;

import java.util.Arrays;

public class class3 {
    public boolean isUpper(char c){
        return c >= 'A' && c <= 'Z';
    }
    public boolean isLower(char c){
        return c >= 'a' && c <= 'z';
    }
    public boolean isVowel(char c){
        char upper = Character.toUpperCase(c);
        return upper == 'A' || upper == 'E' || upper == 'I' || upper == 'O' || upper == 'U';
    }
    public boolean isConsonant(char c){
        return ! isVowel(c);
    }
    public boolean isUpperVowel(char c){
        return isVowel(c) && isUpper(c);
    }
    public boolean isLowerVowel(char c){
        return isVowel(c) && isLower(c);
    }

    public static void main(String[] args) {
        int min = 0;
        int max = 26;
        int range = max - min;
        char[] array1 = new char[26];
        for (int i = 0; i < 26; i++) {
            array1[i] = (char) (Math.random()*range + 'a');
        }

        System.out.println(Arrays.toString(array1));









        /* Random randomLetter = new Random();
        char letter = (char) (randomLetter.nextInt(26) + 'a');
        System.out.println(letter); */
    }
}
