import java.util.Scanner;

public class word
{
    public static void main (String args[])
    {
        String s;
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the string=");
        s=scan.nextLine();

        int count=1;

        for(int i=0; i<s.length()-1; i++)
        {
            if ((s.charAt(i)==' ') &&  (s.charAt(i+1)!=' '))
            {
                count++;
            }
        }
        System.out.println("Number of words in string="+count);
    }
}
