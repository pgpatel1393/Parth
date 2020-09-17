import java.util.Scanner ;

public class Palindrome {

    public static void main(String args[]) {
        Scanner line = new Scanner(System.in);
        String sentence;

        System.out.println("Enter a string to check if it is palindrome= ");
        sentence = line.nextLine();

        String original=sentence;
        String reverse="";

        int length=sentence.length();

        for(int i=length-1; i>=0; i--)
        {
            reverse=reverse+original.charAt(i);
        }

        if (original.equals(reverse))
        {
            System.out.println("String is palindrome");
        }
        else
        {
            System.out.println("String is not palindrome");
        }
    }
}