/**
 * QUE-10
 * WPT find the smallest number from given 3 value using conditional operator
 */
public class Question10 {
    public static void main(String[] args) {
        int a=8, b=10,c =6;
        int result = a < b ? (a < c ? a : c) : (b < c ? b : c);
        System.out.println("smallest number is :"+result);
    }
}
