
package eva1_16_diassemana;

import java.util.Scanner;

public class Eva1_16_DiasSemana {
    
    public static void main(String[] args) {
      int dia;
      System.out.println("Ingresa un numero del 1 al 7 y te dire que dia de la semana es");
    Scanner input = new Scanner(System.in);
    dia = input.nextInt();
   if (dia == 1){
   System.out.println("DOMINGO");
   }else if (dia == 2) {
   System.out.println("LUNES");
   }else if (dia == 3) {
   System.out.println("MARTES");
   }else if (dia == 4) {
   System.out.println("MIERCOLES");
   }else if (dia == 5) {
   System.out.println("JUEVES");
   }else if (dia == 6) {
   System.out.println("VIERNES");
   }else if (dia == 7) {
   System.out.println("SABADO");
   }else {
   System.out.println("DATO INCORRECTO");
   }
    } 
}
//Jesus Montañez