
import java.util.Scanner;

public class pattern {
    public static void main(String [] arg) {
        Scanner my = new Scanner(System.in);

        int lt;
        System.out.println("Enter odd username");
        lt = my.nextInt();
        
        System.out.println("output pattern to print");
  int n= Math.round(lt/2)+1;
    for (int i = 1; i <= n; i++) {

      for (int j = 1; j <= i; j++) {
          System.out.print(" ");
          
      }
      for (int k = n; k>=i; k--) {
          System.out.print("*");
      }
        for (int l = (n-1); l>=i; l-- ) {
            System.out.print("*");
        }
       System.out.println();
        }       
    
}
 



}
