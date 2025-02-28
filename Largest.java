//Take 2 numbers as input and print the largest number.
import java.util.Scanner;
public class Largest{
    public static void main(String args[])
    {
        System.out.println("enter two num");
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int p=in.nextInt();
        if(n>p){
            System.out.println("n is greater than p"+n);

        }
        else{
            System.out.println("p is greater than n"+p);
        }
in.close();
    }
}