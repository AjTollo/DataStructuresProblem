package Problems;

import java.util.HashMap;
import java.util.Scanner;

public class RomanToNumber {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        String x = s.nextLine();

        System.out.println("Number is: " + Converter(x));

    }

    public static int Converter(String x) {
        HashMap<Character, Integer> roman = new HashMap<Character, Integer>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        char[] arr = x.toCharArray();
        int rmt = 0;

        int intVal, nextIntVal;

        for (int i = 0; i < arr.length; i++) {
            intVal = roman.get(arr[i]);
            if (i != arr.length - 1) {
                nextIntVal = roman.get(arr[i + 1]);
                if (nextIntVal > intVal) {
                    intVal = nextIntVal - intVal;
                    i = i + 1;
                }
            }
            rmt = rmt + intVal;
        }
        return rmt;
    }
}
