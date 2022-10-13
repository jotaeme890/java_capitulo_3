/**
 * 3 Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere 
 * convertir debe ser introducida por teclado.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio3 {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime la cantidad de pesetas: ");
        double n = sc.nextDouble();
        double euros = 0.0060;
        
        System.out.print("La cantidad de "+ n + " pesetas en euros, son: " + n*euros);

        sc.close();
    }
}
