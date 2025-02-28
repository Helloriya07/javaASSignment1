//Input currency in rupees and output in USD.
import java.util.Scanner;
public class Curr {
    public static void main(String args[])
    {
        System.out.println("enter currency in inr");
        Scanner in = new Scanner(System.in);
        int c=in.nextInt();
       int  usd=c*79;
        System.out.println("currency in usd="+usd);
in.close();
    }
    
}
