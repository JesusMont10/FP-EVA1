
package eva1_12_califa;

import java.util.Scanner;

public class Eva1_12_Califa {

    public static void main(String[] args) {
        int califa;
        Scanner input = new Scanner (System.in);
        System.out.println("Introduce la calificacion: ");
        califa = input.nextInt();
     
        if(califa > 70){
         System.out.println("APROBADO"); }
        else {System.out.println("NO APROBADO");}
    }
}
//Jesus Montañez