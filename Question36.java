/**
 * QUE-36 WPD swapping of two number using third variable
 */
public class Question36 {
    public static void main(String[] args) {
        int a=50,b=60;
        System.out.println("before swapping :a="+a+" b="+b);//a=50 b=60
        int temp=a;
        a=b;
        b=temp;
        System.out.println("after swapping :a="+a+" b="+b);//a=60 b=50
    }
}
