import java.util.Scanner;

public class consonant {
    public static void main (String args[])
    {
        int consonant=0, vowel=0, i;
        String sentence;
        String str="";

        Scanner name = new Scanner(System.in);

        System.out.println("Enter your full name=");
        sentence=name.nextLine();

        sentence=sentence.toLowerCase();

        for(i=0; i<sentence.length(); i++)

                if (sentence.charAt(i) == 'a' ||
                    sentence.charAt(i) == 'e' ||
                    sentence.charAt(i) == 'i' ||
                    sentence.charAt(i) == 'o' ||
                    sentence.charAt(i) == 'u' ||
                    sentence.charAt(i) == ' ' )
                    {
                        vowel++;
                    }
                else
                {
                    consonant++;
                }

        System.out.println("Total number of consonant in the full name= "+consonant);


        String rep= sentence.replaceAll("consonant","*");

        System.out.println(rep);
    }
}

