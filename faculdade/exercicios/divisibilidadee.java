package exercicios;
import java.util.Scanner;

/* Escreva um algoritmo que leia um número e informe se ele é divisível 
por 10, por 5 ou por 2 ou se não é divisível por nenhum deles. */

public class divisibilidadee {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num;

        System.out.println("Divisibilidade por 10, 5 ou 2");

        System.out.println("Digite um nº inteiro positivo: ");

        num = scanner.nextInt();

        if (num % 10 == 0){
            System.out.printf("\n%d é divisível por 10",num);
        }
        else{ System.out.printf("\n%d não é divisível por 10",num); }
        if (num % 5 == 0){
            System.out.printf("\n%d é divisível por 5",num);
        }
        else{ System.out.printf("\n%d não é divisível por 5",num); }
        if (num % 2 == 0){
            System.out.printf("\n%d é divisível por 2",num);
        }
        else{ System.out.printf("\n%d não é divisível por 2",num); }
    }   
}