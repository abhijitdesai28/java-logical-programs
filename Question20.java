/**
 * QUE-20
 * WPD sum of even number from 60 to 90 using while loop
 */public class Question20 {
    public static void main(String[] args) {
        int num=60;
        int sum=0;
        while(num<=90){
            if(num%2==0){
                sum=sum+num;
            }
            num++;
        }
        System.out.println("sum of even number :"+sum);
    }
}
