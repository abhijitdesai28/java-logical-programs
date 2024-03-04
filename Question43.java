/**
 * QUE-43
 * WAP to display following pattern
 *              54321
 *              54321
 *              54321
 *              54321
 *              54321
 */public class Question43{
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for (int j=5;j>0;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
