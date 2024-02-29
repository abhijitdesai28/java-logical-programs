/**
 * QUE-37 WPD reverse a number -1234>4321
 */
public class Question37 {
    public static void main(String[] args) {
        int a=1234;
        int rev=0;
        System.out.println("actual number :"+a);//1234
        while(a>0){
            int dig=a%10;
            rev=(rev*10)+dig;
            a=a/10;
        }
        System.out.println("reverse number :"+rev);//4321
    }
}
