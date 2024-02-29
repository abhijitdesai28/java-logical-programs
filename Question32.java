import java.util.Scanner;

/**
 * QUE-32
 * WPD enter the number-1234 sum even number from given no and product of
 * odd number from given number and do addition of even noo and odd no and if sum is even then print 'even' else 'odd'
 */
public class Question32 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number:");
        int num= scanner.nextInt();
        int sum=0;
        long prod=1;
        while(num>0){
            int dig=num%10;
            if(dig%2==0) {
                sum = sum + dig;
            }else{
                prod=prod*dig;
            }
            num=num/10;
        }
        System.out.println("sum of even number:"+sum);
        System.out.println("prod of odd number:"+prod);
        long res=sum+prod;
        if(res%2==0){
            System.out.println("result is even :"+res);
        }else{
            System.out.println("result is odd :"+res);
        }


    }
}
