package eva1_18_antro;

import java.util.Scanner;

public class Eva1_18_ANTRO {

    public static void main(String[] args) {
        int edad;
     boolean credencial;
     Scanner input = new Scanner(System.in);
     System.out.println("Captura tu edad");
     edad = input.nextInt();
     System.out.println("¿Tienes INE?");
    credencial = input.nextBoolean();
    
   if ((edad >= 18) && (credencial == true)){
     System.out.println("Puedes entrar");
    } else {
     System.out.println("No puedes entrar");
            }
    }
    
}
//Jesus Montañez