
package eva1_14_descuento;
import java.util.Scanner;
public class Eva1_14_Descuento {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Ingresa un monto");
     double cantidad = sc.nextDouble();
     double desc;
     
     if (cantidad > 1000){
     System.out.println("Tiene un descuento del 15%");
     desc = cantidad - (cantidad * 0.15);
     System.out.println("El monto a pagar es: ");
     System.out.println(desc);
     }else{ 
     System.out.println("El monto a pagar es: ");
     System.out.println(cantidad);
     }
    } 
}
//Jesus Montañez