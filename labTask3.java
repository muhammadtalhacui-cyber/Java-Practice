 .import java.util.*;

public class labTask3{

public static void main(String[] args) {

    Scanner console = new Scanner(System.in); //create a Scanner class for input ;

    /*
    declare int constant value and double;
    */
        final int SECRET = 11;
        final double RATE = 12.50;
        int num1,num2,newNum;
        double hoursWorked,wages;
        String name; 
      
        System.out.println("enter num1 = ");
        num1 = console.nextInt();            //input num1 from user;
        System.out.println("enter num2 = ");
        num2 = console.nextInt();            //input num2 from user;

        System.out.println("the value of num1 = "+num1 +" and the value of num2 = "+num2);//display values of num1 & num2;
        newNum = (2*num1+num2);// assign num1+num2 to newNum and multiply by 2;
        System.out.println("newNum is "+newNum);
        newNum += SECRET; //update newNum with adding constant SECRET;
        System.out.println("Updated newNum with add SECRET CONSTANT = "+newNum);
    
        System.out.println("Enter last name");
        name = console.next();//Input last name from user;

        System.out.println("Enter decimal number b/w 0 to 70");
        hoursWorked = console.nextDouble();

        wages = RATE*hoursWorked;//calculate salary;
        
        //final output is this;
        System.out.println("Name : "+name);
        System.out.println("Pay Rate : "+RATE);
        System.out.println("Hours Worked : "+hoursWorked);
        System.out.println("Salary : "+RATE*hoursWorked);
  
    }
}