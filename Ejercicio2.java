/**
 * 1 Convertor de euros a pesetas, cogiendo los euros por el teclado
 * 
 * @author Jotaeme
 */

import java.util.Scanner;

public class Ejercicio2 {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime la cantidad de euros: ");
        double n = sc.nextDouble();
        double pesetas = 166.38;
        
        System.out.print("La cantidad de "+ n + " euros en pesetas, son: " + n*pesetas);
        
        sc.close();
    }
}