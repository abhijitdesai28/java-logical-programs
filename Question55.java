import java.util.Scanner;

/**
 * QUE-55
 * WAP to display following pattern
 *              11111
 *              2222
 *              333
 *              44
 *              5
 */
public class Question55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1;j <= (n-i+1);j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
