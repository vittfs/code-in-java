package exercicios;
import java.util.Scanner;

/*Crie um algoritmo que leia um número inteiro positivo e verifique se ele 
é ou não número PRIMO. */

public class numeroPrimo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num, i, cont=0;

        System.out.println("Números PRIMOS");

        System.out.println("Digite um inteiro positivo:");

        num = scanner.nextInt();       

        for(i = 1; i <= num; i++){
            if(num % i==0){ cont++; }
        }
        if (cont == 2){
            System.out.println(num+" é primo!");
        }
        else {System.out.println(num+" não é primo!");}

        scanner.close();
    }    
}
