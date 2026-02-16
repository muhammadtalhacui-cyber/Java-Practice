import java.util.Scanner;

public class average{
    static double avg(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3.0;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter three numbers: " + "\t" + "and we find the average:");
        int num1 = console.nextInt();
        int num2 = console.nextInt();
        int num3 = console.nextInt();
        System.out.printf("%4.2f", avg(num1, num2, num3));

    }
}
