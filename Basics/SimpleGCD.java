import java.util.Scanner;

public class SimpleGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        int result = calculateGCD(n1, n2);
        
        System.out.println("Number 1: " + n1);
        System.out.println("Number 2: " + n2);
        System.out.println("--------------------");
        System.out.println("The GCD is: " + result);
    }

    public static int calculateGCD(int a, int b) {
        // Handle 0 cases
        if (a == 0) return b;
        if (b == 0) return a;

        // If they are equal, we found the GCD
        if (a == b) {
            return a;
        }

        // If 'a' is larger, subtract 'b' and call function again
        if (a > b) {
            return calculateGCD(a - b, b);
        }
        
        // If 'b' is larger, subtract 'a' and call function again
        return calculateGCD(a, b - a);
    }
}
