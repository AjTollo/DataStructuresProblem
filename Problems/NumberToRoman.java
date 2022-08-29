package Problems;

import java.util.TreeMap;

public class NumberToRoman {
    public static void main(String[] args) {

    }

    public static String numberToRoman(int num) {

        TreeMap<Integer, String> map = new TreeMap<Integer, String>() {
            {

                put(1, "I");
                put(4, "IV");
                put(5, "V");
                put(9, "IX");
                put(10, "X");
                put(40, "XL");
                put(50, "L");
                put(90, "XC");
                put(100, "C");
                put(400, "CD");
                put(500, "D");
                put(900, "CM");
                put(1000, "M");
            }
        };

        String romanNumber = "";

        while (num > 0) {
            int number = map.floorKey(num);
            romanNumber = romanNumber + map.get(number);
            num = num - number;
        }
        return romanNumber;
    }
}
