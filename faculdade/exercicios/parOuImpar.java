package exercicios;
import java.util.Scanner;
public class parOuImpar {
    public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);

     int num;

     System.out.println("Par ou ímpar?");

     System.out.println("Digite um nº inteiro positivo: ");

     num = scanner.nextInt();
     
     if (num % 2 == 0){
         System.out.println(num + " é PAR!");
     }
     else{
         System.out.println(num + " é ÍMPAR!");
     }
        scanner.close();
    }    
}
