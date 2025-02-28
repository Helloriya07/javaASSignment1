//Take a number as input and print the multiplication table for it.
import java.util.Scanner;
class Mul{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number");
        int num = in.nextInt();
        System.out.println("table of number is");
        for(int i =0; i<=10;i++)
        {
            int t= num*i;
        
            
            System.out.println(+t);
            
        }
        
    }
}