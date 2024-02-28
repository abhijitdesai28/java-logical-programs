/**
 * QUE-24
 * WPD to sum of even number and product of odd number  from 10 to 20 using for loop
 */
public class Question24 {
    public static void main(String[] args) {
        int sum=0;
        long prod=1;
        for(int num=10;num<=20;num++){
            if (num%2==0) {
                sum=sum+num;
            }else{
                prod=prod*num;
            }
        }
        System.out.println("sum of even num:"+sum);
        System.out.println("prod of odd num:"+prod);
    }
}
