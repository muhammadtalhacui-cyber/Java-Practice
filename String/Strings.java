import java.util.Scanner;

public class Strings {
   public Strings() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();
      String[] var3 = new String[var2];
      int var4 = 0;

      for(int var5 = 0; var5 < var2; ++var5) {
         var3[var5] = var1.next();
         var4 += var3[var5].length();
      }

      System.out.println(var4);
   }


    
}
