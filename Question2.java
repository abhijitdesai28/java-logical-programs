/**
 * QUE-2
 * Write java program which contain Increment Operations & Print Operation
 */
public class Question2 {
    public static void main(String[] args) {
        int a=10;
        a++;//10(11)
        a++;//11(12)
        a++;//12(13)
        System.out.println(a+ a++);//13+ 13(14)=26
        System.out.println(a++);//14(15)=14
    }


}
