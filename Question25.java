import java.util.Scanner;
/**
 * QUE-25
 * WAP to enter any value[dynamic input from user] and add 10 in that value and print .
 */
public class Question25 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter value");
        int number=scanner.nextInt();
        System.out.println(number+10);
    }
}
