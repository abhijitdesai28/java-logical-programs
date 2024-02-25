/**
 * QUE-11
 * WPT check the character is vowel or consonant using conditional operator
 * vowel=A,E,I,O,U
 * consonant=Except vowel
 */
public class Question12 {
    public static void main(String[] args) {
        char ch='A';
        String result = ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'
                ? " GIVEN CHAR IS VOWEL " : ((ch >='a' && ch<='z')||(ch >='A' && ch<='Z')) ?"GIVEN CHAR IS CONSONANT" :
                "Not Alphabet";
        System.out.println(result);


    }
}
