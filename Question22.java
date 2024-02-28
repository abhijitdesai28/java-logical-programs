/**
 * QUE-22
 * WPD sum of odd number and product of even number from 1 to 20 using do while loop
 */
public class Question22 {
    public static void main(String[] args) {
        int number=1,sum=0;
        long prod=1;

        do{
            if (number%2!=0){
                sum=sum+number;
            }
            else{
                prod=prod*number;
            }
            number++;
        }while(number<=20);
        System.out.println("sum of odd number :"+sum);
        System.out.println("prod of even number :"+prod);
    }

}
