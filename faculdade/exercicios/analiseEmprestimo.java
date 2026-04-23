package exercicios;
import java.util.Scanner;

/* A prefeitura de Guarulhos abriu uma linha de crédito para os funcionários
estatutários.
O valor máximo da prestação não poderá ultrapassar 30% do salário bruto.
Crie um algoritmo que permita entrar com o salário bruto e o valor da prestação,
e informar se o empréstimo pode ou não ser concedido.*/

public class analiseEmprestimo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salário bruto: R$ ");

        double salarioBruto = scanner.nextDouble();

        System.out.print("Digite o valor da prestação pretendida: R$ ");

        double valorPrestacao = scanner.nextDouble();

        double limiteMaximo = salarioBruto * 0.30;

        System.out.println("--- Resultado da Análise ---");
        
        if (valorPrestacao <= limiteMaximo) {
            System.out.println("Empréstimo CONCEDIDO.");
            System.out.printf("O valor da prestação está dentro do limite de R$ %.2f\n", limiteMaximo);
        } else {
            System.out.println("Empréstimo NEGADO.");
            System.out.printf("A prestação excede o limite permitido de R$ %.2f\n", limiteMaximo);
        }
        scanner.close();
    }
}
