
package eva1_20_califas;

import java.util.Scanner;

public class Eva1_20_Califas {

    public static void main(String[] args) {
      double cali;
      Scanner input = new Scanner(System.in);
     System.out.println("Ingresa tu calificacion");
     cali = input.nextInt();
     
     if (cali >= 90) {
     System.out.println("A");
     }else if (cali >= 80) {
     System.out.println("B");
     }else if (cali >= 70) {
     System.out.println("C");
     }   else if (cali >= 60) {
     System.out.println("D");
     }   else if (cali >= 0) {
     System.out.println("F");
     }      
    }
}
//Jesus Montañez