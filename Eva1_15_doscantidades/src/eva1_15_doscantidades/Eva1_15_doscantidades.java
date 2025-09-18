
package eva1_15_doscantidades;

import java.util.Scanner;

public class Eva1_15_doscantidades {

    public static void main(String[] args) {
   int num1 , num2;
   Scanner input = new Scanner(System.in);
   System.out.println("Ingresa el primer numero");
   num1 = input.nextInt();
   System.out.println("Ingresa el primer numero");
   num2 = input.nextInt();
   
   if (num1 > num2) {
   System.out.println("El numero mayor es");
   System.out.println(num1);
   }else {
   System.out.println("El numero mayor es");
   System.out.println(num2);
   }
    }
}
//Jesus Montañez