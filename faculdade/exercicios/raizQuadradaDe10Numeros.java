package exercicios;
import java.util.Scanner;
public class raizQuadradaDe10Numeros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);       

        double num;

        System.out.println("Raiz Quadrada de 10 números");

        for(int i = 1; i <= 10; i++){
            System.out.println("Digite o " + i + "º nº:");

            num = scanner.nextDouble();

            System.out.println("raiz de " + num + " = " + Math.sqrt((float) num));
        }
        scanner.close();
    }    
}
