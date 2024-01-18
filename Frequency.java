//Java Program to Find the Frequency of Characters in a String

public class Frequency{

    public static void main(String[] args) {
        String str = "hiiiiiiii  tie kite";
        char ch = 'i';
        int frequency = 0;

        for(int i = 0; i < str.length(); i++) {
            if(ch == str.charAt(i))
 {
                frequency++;
            }
        }

        System.out.println("Freq of " + ch + " = " + frequency);
    }
}