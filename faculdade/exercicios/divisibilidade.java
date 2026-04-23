package exercicios;
import java.util.Scanner;

/* Escreva um algoritmo para determinar se um número A é divisível por outro 
número B. Esses valores devem ser fornecidos pelo usuário. Detalhe: Se B FOR zero
(0), o algoritmo deve retornar uma mensagem, dizendo que não é possível haver divisão
por zero! */

public class divisibilidade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a, b;

        System.out.println("Divisibilidade entre 2 números");

        System.out.println("Digite o primeiro número:");

        a = scanner.nextInt();

        System.out.println("Digite o segundo número:");

        b = scanner.nextInt();

        if (b == 0){
            System.out.println("Não se divide por ZERO!");
        }
        else 
            if (a % b == 0){
         System.out.printf("\n%d é divisivel por %d",a,b);                
            }
            else{
         System.out.printf("\n%dnão é divisivel por %d",a,b);                                
            }
        scanner.close();
    }   
}
