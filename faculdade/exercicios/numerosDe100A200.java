package exercicios;
import java.util.Scanner;
public class numerosDe100A200 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i;

        System.out.println("Números de 100 a 200:");
        
        for (i = 100; i <= 200; i++){
            System.out.println(i);
        }
        scanner.close();
    }    
}
