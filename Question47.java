/**
 * QUE-47
 * WAP to display following pattern
 *              EDCBA
 *              EDCBA
 *              EDCBA
 *              EDCBA
 *              EDCBA
 */public class Question47 {
    public static void main(String[] args) {
        for(char i='A' ;i<='E';i++){
            for (char j='E';j>='A';j--){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
