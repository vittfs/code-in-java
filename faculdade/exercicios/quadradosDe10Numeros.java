package exercicios;
import java.util.Scanner;
public class quadradosDe10Numeros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i, num;

        System.out.println("Quadrados de 10 números");
        for(i = 1; i <= 10; i++){

            System.out.println("Digite o " + i + "º nº:");

            num = scanner.nextInt();

            System.out.println(num + "² = " + num*num);
        }
    }   
}