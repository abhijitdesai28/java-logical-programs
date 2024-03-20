import java.util.Scanner;

/**
 * QUE-57
 * WAP to display following pattern
 *              1
 *             11
 *            111
 *           1111
 *          11111
 */
public class Question57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("1");
            }
            System.out.println();
        }
    }
}
