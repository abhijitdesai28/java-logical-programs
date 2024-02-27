/**
 * QUE-21
 * WPD find the sum of odd number and product of even number from 15 to 50 using while loop
 */public class Question21 {
    public static void main(String[] args) {
        int num=15;
        int sum=0;
        long prod=1;
        while(num<=50){
            if (num%2!=0){
                sum=sum+num;
            }
            else{
                prod=prod*num;
            }
            num++;
        }
        System.out.println("sum of odd numbers:"+sum);
        System.out.println("product of even numbers:"+prod);
    }
}
