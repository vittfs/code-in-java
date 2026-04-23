package exercicios;
import java.util.Scanner;
public class numerosDe1A100 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int soma = 0, somaq=0;

        float media;

        System.out.println("Números de 1 a 100:");

        for (int i = 1; i <= 100; i++){
            System.out.println(i);

            soma += i;//soma = soma + i;

            somaq += i*i;
        }

        media = soma / 100;

        System.out.println("A soma de 1 a 100 vale: " + soma);

        System.out.println("A soma de quadrados de 1 a 100 "
                + "vale: " + somaq);
                
        System.out.println("A média dos números de"
                + " 1 a 100 vale: " + media);
    }   
}