package exercicios;
import java.util.Scanner;
public class reajusteSalarial {
    
/* Uma empresa resolve dar um aumento de 30% aos funcionários que recebem 
um salário inferior a R$ 2.500,00 e 20% a quem ganha mais que R$ 2.500,00.
Implemente um algoritmo que receba como dado de entrada o salário de um 
funcionário e imprima o valor do salário reajustado. */

 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float sal_ini, reaj, sal_reaj;

        System.out.println("Reajuste de Salários");

        System.out.println("Digite o salário inicial: ");

        sal_ini = scanner.nextFloat();

        if (sal_ini <= 2500){ reaj = (float) (0.30 * sal_ini); }

        else { reaj = (float) (0.20 * sal_ini); }

        sal_reaj = sal_ini + reaj;

        System.out.printf("Salário Inicial: %.2f",sal_ini);

        System.out.printf("\nReajuste: %.2f",reaj);

        System.out.printf("\nSalário Final: %.2f",sal_reaj);

     scanner.close();
    }  
}
