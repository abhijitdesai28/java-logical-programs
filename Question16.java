/**
 * QUE-16
 *  WPD given no is positive even,negative even,positive odd,negative odd using NESTED if else
 */
public class Question16 {
    public static void main(String[] args) {
        int number=21;
        if(number%2==0){
            if (number>0){
                System.out.println(number+":positive even");
            } else if (number<0) {
                System.out.println(number+":negative even");
            }
            else{
                System.out.println(number+":number is Zero");
            }
        }
        else{
            if (number>0){
                System.out.println(number+":number is positive odd");
            }
            else{
                System.out.println(number+":number is negative odd");
            }
        }
    }
}
