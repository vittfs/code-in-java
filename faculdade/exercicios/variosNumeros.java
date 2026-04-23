package exercicios;
import java.util.Scanner;
public class variosNumeros {
    public static void main(String[] args) {

        int num;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Leitura de Vários Números");

        
        System.out.println("Digite um nº positivo ou 0 para finalizar:");
        
        num = scanner.nextInt();

        while (num > 0){
            System.out.println("Digite um nº positivo ou 0 para finalizar:");
            num = scanner.nextInt();
        }
    }    
}
