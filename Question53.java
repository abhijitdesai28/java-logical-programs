import java.util.Scanner;

/**
 * QUE-51
 * WAP to display following pattern
 *              0
 *              01
 *              012
 *              0123
 *              01234
 */
class Question53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System. in );
        System.out.println("Enter the number to limit the Pattern  : ");
        //Enter input Carefully
        int number = sc.nextInt();
        for (int i = 0; i <= number; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
