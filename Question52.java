import java.util.Scanner;

/**
 * QUE-52
 * WAP to display following pattern
 *              A
 *              AB
 *              ABC
 *              ABCD
 *              ABCDE
 */
class Question52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System. in );
        System.out.println("Enter the word to limit the Pattern (In Capitals) : ");
        // There is difference A-Z in Capitals and a-z in small cases
        //Enter input Carefully
        char c = sc.next().charAt(0);
        for (char i = 'A'; i <= c; i++) {
            for (char j = 'A'; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
