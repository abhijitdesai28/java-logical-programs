/**
 * QUE-7
 * WPT Check the 2 numbers are even or odd if both numbers are even. find the sum else find the product
 */
public class Question7 {
    public static void main(String[] args) {
        int a=10, b=10;
        String result =
                (a % 2 == 0 && b % 2 == 0) ? (a + ":number is even sum is: " + (a + b)) :
                        (a + ":number is odd product is: " + (a * b));
        System.out.println(result);
    }
}
