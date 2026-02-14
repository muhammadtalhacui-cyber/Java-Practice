import java.util.*;
public class labtask2 {
    public static void main(String[]args){
  
        Scanner console = new Scanner (System.in);
        int width;
        int length;

        System.out.print("Enter the width: ");
        width = console.nextInt();
        System.out.println();
        System.out.print("Enter the length: ");
        length = console.nextInt();
        System.out.println();
        
        double area = length * width;
        double perimeter = 2 * (length + width);
        
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);

        
        }
    }



    

