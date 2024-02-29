import java.util.Scanner;

/**
 * QUE-39 find the power of the number
 * input- base num=5
 *        power num=3
 *output- 125
 */
public class Question39 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter base value:");
        int base=scanner.nextInt();//5
        System.out.println("enter power value:");
        int power=scanner.nextInt();//3
        int result=1;
        while(power>0){//3  2  1
            result=result*base;//1*5 5*5=25 25*5 =125
            power--;//3(2)2(1)1(0)
        }
        System.out.println("result is --->"+result);//11
    }
}
