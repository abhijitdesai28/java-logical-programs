import java.util.Scanner;

/**
 * QUE-35 WPD table from 1 to user given  number
 */
public class Question35 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter first number:");
        int num= scanner.nextInt();
        for (int i=1;i<=num;i++){
            for (int j=1;j<=10;j++){
                System.out.println(i +"*"+j+" ="+(i*j));
            }
            System.out.println("-----------------------");
        }



    }
}
