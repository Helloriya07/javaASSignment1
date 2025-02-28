import java.util.Scanner;

public class Area {

    public static void main(String args[]) {
        // circle();
        // triangle();
        // rectangle();
         perimeter();
    }

    public static void circle() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter radius");
        int r;
        r = in.nextInt();
        double a = 3.14 * r * r;
        System.out.println("area of circle is " + a);
        in.close();
    }

    public static void triangle() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter base and height");
        int b = in.nextInt();
        int h = in.nextInt();
        double area = 0.5 * b * h;
        System.out.println("area of triangle is " + area);
        in.close();
    }

    public static void rectangle() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter length and breadth");
        int b = in.nextInt();
        int l = in.nextInt();
        double area = l * b;
        System.out.println("area of rectangle is " + area);
        in.close();
    }

    public static void perimeter() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter radius");
        int r = in.nextInt();
        double peri = 2 * r * r;
        System.out.println("area of triangle is " + peri);
        in.close();
    }

}
