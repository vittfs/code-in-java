package exercicios;
import java.util.Scanner;
public class numerosDe200A100 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Números de 200 a 100:");
        
        for (int i = 200; i >= 100; i--){
            System.out.println(i);
        }
        scanner.close();
    }    
}
