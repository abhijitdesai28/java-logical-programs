import java.util.Scanner;

/**
 * QUE-27
 * WPD SUM of even number from 1 to user entered value using while loop
 */
public class Question27 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number:");
        int num=scanner.nextInt();
        int i=1,sum=0;
        while(i<=num){
            if(i%2==0){
                sum=sum+i;
            }
            i++;
        }
        System.out.println("sum of even number :"+sum);
    }
}
