// find gcd and lcm of three numbers.
import java.util.Scanner;

class Ass {
    
    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);  // Recursive call
        }
    }

    // Method to calculate GCD of three numbers
    public int gcdOfThree(int a, int b, int c) {
        return gcd(gcd(a, b), c);  
    }

    public static void main(String[] args) {
        // Create an object of the class to access non-static method
        Ass obj = new Ass();

        // Take user input for three numbers
        System.out.println("Enter three numbers:");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int gcdValue = obj.gcdOfThree(a, b, c);
        
        
        int lcm = (a * b * c) / gcdValue;


        System.out.println("LCM of the three numbers = " + lcm);
        System.out.println("HCF (GCD) of the three numbers = " + gcdValue);
    }
}
