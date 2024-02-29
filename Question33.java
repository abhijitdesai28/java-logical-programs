import java.util.Scanner;

/**
 * WPD table from user given number
 */
public class Question33 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number for u want to print table: ");
        int num=scanner.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(num+ "X"+ i+ "= "+(num*i));
        }

    }
}
