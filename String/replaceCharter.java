import java.util.*;
public class replaceCharter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number and we replace a character in it with b .");
        String num = sc.nextLine();
        System.out.println(num.replace('a', 'b'));

        for(int i=0;i<num.length();i++){
            if(num.charAt(i) == 'a'){
                System.out.print('b');
            }
            else{
                System.out.print(num.charAt(i));
            }

        }
    }

}
