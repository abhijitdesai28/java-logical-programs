import java.util.Scanner;
/**
 * QUE-51
 * WAP to display following pattern
 *              A
 *              BB
 *              CCC
 *              DDDD
 *              EEEEE
 */
class Question51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System. in );
        System.out.println("Enter the word to limit the Pattern (In Capitals) : ");
        // There is difference A-Z in Capitals and a-z in small cases
        //Enter input Carefully
        char c = sc.next().charAt(0);
        for (char i = 'A'; i <= c; i++) {
            for (char j = 'A'; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
