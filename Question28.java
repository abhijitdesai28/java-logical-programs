import java.util.Scanner;
/**
 * QUE-28
 * WPD separate the value/number .i.e-1234 using while loop
 * o/p-
 *  1
 *  2
 *  3
 *  4
 */
public class Question28 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=scanner.nextInt();
        while(num>0){
            int dig=num%10;
            System.out.println(dig);
            num=num/10;
        }
    }
}
