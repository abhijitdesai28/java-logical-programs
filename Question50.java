import java.util.Scanner;

/**
 * QUE-50
 * WAP to display following pattern
 *              1
 *              22
 *              333
 *              4444
 *              55555
 */public class Question50 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int rows=scanner.nextInt();
        for(int i=1 ;i<=rows;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
