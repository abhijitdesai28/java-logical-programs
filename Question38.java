/**
 * QUE-38
 * WPD check whether the given number is palindrome or not
 */

import java.util.Scanner;
public class Question38 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number:");
        int number=scanner.nextInt();
        int temp=number,rev=0;
        while(number>0){
            int dig=number%10;
            rev=(rev*10)+dig;
            number=number/10;
        }
        if (temp==rev){
            System.out.println(temp+":  number is palindrome");
        }else {
            System.out.println(temp+" :Not a palindrome number");
        }
    }
}
