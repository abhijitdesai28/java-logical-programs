/**
 * QUE-5
 * WPT Check the number is even of odd by using conditional operator
 */
public class Question5 {
    public static void main(String[] args) {
        int a=25;
        String result = (a % 2==0 ? a + ":is even number" : a + ":is Odd number");
        System.out.println(result);

    }
}
