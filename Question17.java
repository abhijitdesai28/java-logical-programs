/**
 * QUE-17
 * WPD Vowel/ Consonant using Switch case
 */
public class Question17 {
    public static void main(String[] args) {
        char value = '1';
        if((value>='a'&&value<='z')||(value>='A'&&value<='Z')) {
            switch (value) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    System.out.println("vowel");
                    break;
                default:
                    System.out.println("Consonant");
            }
        }
        else{
            System.out.println("its not a alphabet");
        }
    }
}
