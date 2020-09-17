import java.util.Scanner;

public class LastLetterCount {
    public static void main(String args[]) {
        String str;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter string=");
        str = input.nextLine();

        str = str.toLowerCase();
        int l = str.length();
        int count1 = 0, count2 = 0;

        for (int i = 0; i < l; i++)
            if (str.charAt(i) == 's') {
                if (i < l - 1 && !Character.isLetter(str.charAt(i + 1)))
                    count1++;
                else if (i == l - 1)
                    count1++;
            }

        for (int i = 0; i < l; i++)
            if (str.charAt(i) == 'y') {
                if (i < l - 1 && !Character.isLetter(str.charAt(i + 1)))
                    count2++;
                else if (i == l - 1)
                    count2++;
            }

        System.out.println("Total number of words that ends in 's' =" + count1);
        System.out.println("Total number of words that ends in 'y' =" + count2);
        }
    }
}
