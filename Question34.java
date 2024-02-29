import java.util.Scanner;

/**
 * QUE-34
 * WPD find sum of number from user given range and check sum is even or odd if it is even print the table
 */
public class Question34 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter first number:");
        int num1=scanner.nextInt();
        System.out.println("enter second number:");
        int num2=scanner.nextInt();
        if(num1>num2){
            int temp=num1;
            num1=num2;
            num2=temp;
        }
        int sum=0;
        while(num1<=num2){
            sum=sum+num1;
            num1++;
        }
        System.out.println("sum is:"+sum);
        if(sum%2==0){
            for (int i=1;i<=10;i++){
                System.out.println(sum +"X"+i+ " = "+(sum*i));
            }
        }else{
            System.out.println("sum is odd: "+sum);
        }
    }
}
