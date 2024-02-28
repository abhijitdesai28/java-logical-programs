import java.util.Scanner;

/**
 * QUE-31
 * WPD number between starting value and ending value using while loop
 */
public class Question31 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter first number:");
        int firstNum=scanner.nextInt();
        System.out.println("enter second number:");
        int secondNum=scanner.nextInt();
        while (firstNum<=secondNum){
            System.out.println(firstNum);
            firstNum++;
        }
    }
}
