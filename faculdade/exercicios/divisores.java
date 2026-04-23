package exercicios;
import java.util.Scanner;
public class divisores {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num, i, cont=0;

        System.out.println("Divisores de um nº positivo");

        System.out.println("Digite um inteiro positivo:");

        num = scanner.nextInt();

        System.out.println("Divisores de " + num + ":");
        
        for(i = 1; i <= num; i++){
            if(num % i==0){
                System.out.println(i);
                cont++;
            }
        }
        System.out.println(num + " tem " + cont + " divisores");
    }    
}
