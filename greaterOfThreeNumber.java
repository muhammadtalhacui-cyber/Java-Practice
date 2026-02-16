import java.util.Scanner;
public class greaterOfThreeNumber {
    static int greater(int num1, int num2, int num3) {
        if ((num1 > num2 && num1 >= num3) || (num1 == num2 && num1 > num3)) {
            return num1;
        } else if ((num2 > num1 && num2 >= num3) || (num2 == num3 && num2 > num1)) {
            return num2;
        } else if ((num3>num1 && num3>=num2) || (num3 == num1 && num3 > num2)) {
             return num3;
        } else{
            System.out.println("All numbers are equal");
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter three numbers: " + "\t" + "and we find the greatest:");
        int num1 = console.nextInt();
        int num2 = console.nextInt();
        int num3 = console.nextInt();
        System.out.println(greater(num1, num2, num3));
    }
}