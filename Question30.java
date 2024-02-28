import java.util.Scanner;

/**
 * QUE-30
 * WPD separate the digits and print the odd digit from user entered value using while loop
 * i.e-12578
 * o/p-1579
 */
public class Question30 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number:");
        int num=scanner.nextInt();
        while(num>0){
            int dig=num%10;
            if(dig%2!=0){
                System.out.println(dig);
            }
            num=num/10;
        }
    }
}
