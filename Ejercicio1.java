import java.util.Scanner;

public class Ejercicio1{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un número: ");
        int n = sc.nextInt();
        System.out.print("Dime otro número: ");
        int c = sc.nextInt();

        System.out.print("La multiplicación es: "+ n*c);
    }
}