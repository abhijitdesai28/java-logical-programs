/**
 * QUE-44
 * WAP to display following pattern
 *              AAAAA
 *              BBBBB
 *              CCCCC
 *              DDDDD
 *              EEEEE
 */public class Question45 {
    public static void main(String[] args) {
        for(char i='A';i<='E';i++){
            for (char j='A';j<='E';j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
