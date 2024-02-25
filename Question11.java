/**
 * QUE-11
 * WPT find the smallest number from given 4 value using conditional operator
 */
public class Question11 {
    public static void main(String[] args) {
        int a=8, b=10, c=15, d=20;
        int result = a < b ? (a < c ? (a < d ? a : d) : (c < d ? c : d)) : (b < c ? (b < d ? b : d) : (c < d ? c : d));
        System.out.println("smallest number is: "+result);

    }
}
