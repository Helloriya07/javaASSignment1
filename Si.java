//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;
public class Si {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("enter rate , time , principal");
        float rate = in.nextFloat();
        int time = in.nextInt();
        int principal = in.nextInt();
        float si = principal*rate*time/100;
        System.out.println("Simple interst is"+si);

    }
    
}
