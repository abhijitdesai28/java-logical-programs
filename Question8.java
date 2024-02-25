/**
 * QUE-8
 * WPT find the largest number from given 3 variable
 */
public class Question8 {
    public static void main(String[] args) {
        int a=10,b=20,c=15;
        String result = a > b ? (a > c ? a + ": is large" : c + ": is large") : (b > a ? b + ": is large" : c + " : is large");
        System.out.println(result);
    }
}
