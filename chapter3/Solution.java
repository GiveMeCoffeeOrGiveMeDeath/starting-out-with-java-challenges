public class Solution {
    public boolean isPalindrome(int x) {
        int[] digits = new int[String.valueOf(x).length()];

        if (x < 0) {
            return false;
        }

        int reverse = 0;
        int temp = x;
        // System.out.println(digits);
        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }
        return reverse == x;
    }

    public static void main(String[] args) {

        isPalindrome(121);

    }

}