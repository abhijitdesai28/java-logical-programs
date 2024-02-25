/**
 * QUE-6
 * WPT Check the number is positive or negative
 */
public class Question6 {
    public static void main(String[] args) {
        int a=10;
        String result = a > 0 ? a + ":is positive number" : (a < 0 ? a + ":is negative number" : a + ":is zero");
        System.out.println(result);
    }
}
