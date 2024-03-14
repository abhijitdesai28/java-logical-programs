import java.util.Scanner;

/**
 * QUE-54
 * WAP to display following pattern
 *              ******
 *              *****
 *              ***
 *              **
 *              *
 */
public class Question54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
