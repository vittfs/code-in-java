package exercicios;
import java.util.Scanner;
public class fatorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num, i, fat = 1;

        System.out.println("Fatorial de um número positivo");

        System.out.println("Digite um no. positivo:");

        num = scanner.nextInt();

        for(i = 1; i <= num; i++){ fat *= i; }

        System.out.println(num + "! = " + fat);

        scanner.close();
    }   
} 
    
