/**
 * QUE-9
 * WPT find the smallest number from given 2 value using conditional operator
 */
public class Question9 {
    public static void main(String[] args) {
        int a=10, b=15;
        int result = a < b ? a : b < a ? b : a;
        System.out.println("smallst number is :"+result);

    }
}
