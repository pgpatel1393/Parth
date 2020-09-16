import java.util.Scanner;

public class Vowels {
    public static void main (String args[])
    {
            int count=0, i;
            String sentence;

        Scanner name = new Scanner(System.in);

        System.out.println("Enter your full name=");
            sentence=name.nextLine();

            sentence=sentence.toLowerCase();

            for(i=0; i<sentence.length(); i++)
            {
                if (sentence.charAt(i)== 'a'||
                    sentence.charAt(i)== 'e'||
                    sentence.charAt(i)== 'i'||
                    sentence.charAt(i)== 'o'||
                    sentence.charAt(i)== 'u')

                {
                    count++;
                    }
                }
                System.out.println("Total number of vowels in the full name= "+count);
            }
         }

