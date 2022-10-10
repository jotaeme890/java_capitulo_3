/**
 * 1 Escribe un programa que sume, reste, multiplique y divida dos números introducidos por teclado.
 * 
 * @author Jotaeme
 */

import java.util.Scanner;

public class Ejercicio4 {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un número: ");
        float n = sc.nextInt();
        System.out.print("Dime otro número: ");
        float c = sc.nextInt();
        
        System.out.println("Dado esos números: ");
        System.out.println("La suma es: "+ (n+c));
        System.out.println("La resta es: " + (n-c));
        System.out.println("La multiplicación es:"+ (n*c));
        System.out.println("La división es: "+(n/c));

        sc.close();
    }
}