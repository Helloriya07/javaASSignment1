public class New {
    public static void main(String args[]) {
        // fibonacci(10);
        // amstrong();
         palindrome();
    }

    public static void fibonacci(int n) {
        int num1 = 0, num2 = 1;
        System.out.println(num1); // Print the first number
        for (int i = 1; i < n; i++) {
            int num3 = num1 + num2; // Next Fibonacci number
            System.out.println(num3); // Print the Fibonacci number
            num1 = num2; // Update num1 to the last number
            num2 = num3; // Update num2 to the current Fibonacci number
        }
    }

    public static void amstrong() {

        int num = 153;
        int org = num;
        int sum = 0;
        while (num > 0) {
            int temp = num % 10; // Extract last digit
            sum = sum + (temp * temp * temp); // Add the cube of the digit to sum
            num = num / 10;// Remove the last digit
        }
        System.out.println(+sum);
        if (org == sum) {
            System.out.println("amstrng");
        } else {
            System.out.println("not");
        }
    }

    public static void palindrome() {

        int num = 141;
        int org = num;
        int rev = 0;
        while (num > 0) {
            int temp = num % 10; 
            rev= rev*10 + temp; 
            num = num / 10;
        }
        System.out.println(+rev);
        if (org == rev) {
            System.out.println("palindrome");
        } else {
            System.out.println("not");
        }
    }
}
