public class reverseInteger {
    public static void main(String[] args) {
        int x=-123;
        int INT_MAX = 2147483647, INT_MIN = -2147483648;
        int reversed_x = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (reversed_x > INT_MAX / 10 || (reversed_x == INT_MAX / 10 && pop > 7)) {
                System.out.println("0");
            }
            if (reversed_x < INT_MIN / 10 || (reversed_x == INT_MIN / 10 && pop < -8)) {
                System.out.println("0");
            }
            reversed_x = reversed_x * 10 + pop;
        }
        System.out.println(reversed_x);
    }
}
