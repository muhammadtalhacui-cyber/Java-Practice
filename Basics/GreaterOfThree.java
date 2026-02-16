    import java.util.Scanner;

public class GreaterOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        
        int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();
        
        // Shortest logic: nested Math.max
        int largest = Math.max(n1, Math.max(n2, n3));
        
        System.out.println("The greatest number is: " + largest);
    }
}

    
