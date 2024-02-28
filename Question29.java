import java.util.Scanner;
/**
 * QUE-29
 * WPD separate the value/number .i.e-1234 using for loop
 * o/p-
 *  1
 *  2
 *  3
 *  4
 */
public class Question29 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number:");
        for(int num=scanner.nextInt();num>0;num=num/10){
            int dig=num%10;
            System.out.println(dig);
        }
    }
}
