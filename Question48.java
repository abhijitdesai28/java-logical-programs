import java.util.Scanner;

/**
 * QUE-48
 * WAP to display following pattern
 *              *
 *              **
 *              ***
 *              ****
 *              *****
 */public class Question48 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int rows=scanner.nextInt();
        for(int i=1 ;i<=rows;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
