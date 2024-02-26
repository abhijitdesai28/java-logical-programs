/**
 * QUE-15
 * WPD given no is positive even,negative even,positive odd,negative odd using if else if
 */
public class Question15 {
    public static void main(String[] args) {
        int number=-7;
        if(number%2==0 && number>0){
            System.out.println(number+":number is positive even");
        }
        else if(number%2==0 && number<0){
            System.out.println(number+":number is negative even");
        }
        else if(number%2!=0 && number>0){
            System.out.println(number+":number is positive odd");
        }
        else if(number%2!=0 && number<0){
            System.out.println(number+":number is negative odd");
        }
        else {
            System.out.println(number+":number is zero");
        }
    }
}
