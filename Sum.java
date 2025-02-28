//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
import java.util.Scanner;

class Sum {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        
         
        while (true) {
            System.out.println("Enter a number or 'x' to stop:");

            String s = in.nextLine();  
            
        
            if (s.equalsIgnoreCase("x")) {
                break;
            }
            
            try {
                // Convert the input string to an integer
                int num = Integer.parseInt(s);
                sum += num;  // Add the number to the sum
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }

        // Output the sum after exiting the loop
        System.out.println("Sum of all numbers entered: " + sum);
    }
}
