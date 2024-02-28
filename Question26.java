import java.util.Scanner;

/**
 * QUE-26
 * WPD print even number from 0 to user entered value
 */
public class Question26 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter any value");
        int num=scanner.nextInt();
        for(int i=0;i<=num;i++) {
            if (i%2==0) {
                System.out.println(i);
            }
        }
    }
}
