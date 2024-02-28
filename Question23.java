/**
 * QUE-23
 * WPD number from 20 to 60 ,which are divisible by 6 and count that number using do while loop
 */
public class Question23 {
    public static void main(String[] args) {
        int number=20,count=0;
        do{
            if(number%6==0){
                System.out.println(number);
                count++;
            }
            number++;
        }while(number<=60);
        System.out.println("count of number ,divisible by 6 ,from 20 to 60 :"+ count);
    }
}
