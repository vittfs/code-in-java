package exercicios;

import java.util.Scanner;

/* Faça um programa que receba quatro notas de um aluno, calcule e mostre a
média aritmética das notas e a mensagem de aprovado ou reprovado, considerando
para aprovação média 7. */

public class mediaAluno {
    
    public static void main(String[ ] args) {

        Scanner scanner = new Scanner(System.in);

        // Obter o nome 
        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        //Obter notas 
        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        System.out.println("Digite a quarta nota: ");
        double nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("O nome do aluno é: "+ nome + ", e sua média foi: " + media);

        if(media >= 7.0) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado!");
        }

        scanner.close();

    }
}
