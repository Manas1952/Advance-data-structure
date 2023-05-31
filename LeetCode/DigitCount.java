package LeetCode;

public class DigitCount {
    public static boolean digitCount(String num) {
        int[] count = new int[10];

        int j = 0;
        for (final char c : num.toCharArray()) {
            ++count[c - '0'];
        }

        for (int i = 0; i < num.length(); ++i)
            if (count[i] != num.charAt(i) - '0')
                return false;

        return true;
    }
    public static void main(String[] args) {
        System.out.println(digitCount("1210"));
    }
}
