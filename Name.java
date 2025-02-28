//Take name as input and print a greeting message for that particular name.
import java.util.Scanner;
public class Name{
    public static void main(String args[])
    {
        System.out.println("enter your name");
        Scanner in = new Scanner(System.in);
        String n=in.nextLine();
        while(true)
        {
            System.out.println("hello"+n);
            break;

        }
in.close();
    }
}