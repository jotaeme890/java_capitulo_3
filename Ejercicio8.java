/**
 * 1 Escribe un programa que calcule el salario semanal de un empleado en base a las horas trabajadas, a razón de 12 euros la hora.
 * 
 * @author Javier Miguel Martín Gallardo
 */

import java.util.Scanner;

public class Ejercicio8 {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántas horas has trabajado esta semana?");
        float n = sc.nextInt();

        
        System.out.print("Tu salario semanal es de: " + n*12 +" euros");

        sc.close();
    }
}
