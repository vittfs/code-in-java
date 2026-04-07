package secao2;

import java.util.Scanner;

public class TesteScanner {

    public static void main(String[] args){

        // 1 - Testando Scanner 
        Scanner scanner = new Scanner(System.in);

        // Mensagem para o usuário entender o que precisa digitar 
        System.out.println("Digite o seu nome:");

        // Resgata o valor no terminal 
        String nome = scanner.nextLine();

        //Exibe o valor 
        System.out.println("Olá " + nome + "!");

        // nexInt 
        System.out.println("Digite a sua idade:");

        int idade = scanner.nextInt();
        
        System.out.println("Você tem " + idade + " anos.");

        // Fechamento do Scanner, para evitar memory leak
        scanner.close();

        // 2 - Problema do nextLine 
        System.out.println("Digite um número:");

        int num = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite um texto:");

        String txt = scanner.nextLine();

        System.out.println("Os dados são, n = " + num + " e txt = " + txt);

        scanner.close();

    }
}