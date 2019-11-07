package warmup.warmup5_11;

public class calc {
    public static void main(String[] args) {
        String toCalc = "((()))()(())";
        String inputArray[] = toCalc.split("");
        int length = inputArray.length;
        String checker_1 = "(";
        String checker_2 = ")";
        int counter = 0;
        int i = 0;
        int j = 0;
        do {
        if (inputArray[i] == "(")
            i++;

        else if (inputArray[i] == ")")
            j++;
        }
        while (inputArray[i] == inputArray[i + 1]);






    }
}