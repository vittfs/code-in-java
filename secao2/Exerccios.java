package secao2;

public class Exerccios {
        public static void main(String[] args){


        /* Exercício 1: 
        
        Crie uma váriavel int par armazenar o valor 10.
        Crie uma segunda váriavel int que armazene o dobro do valor da primeira variável 
        usando operadores aritméticos.
        Exiba o resultado 
        */

        int valorOriginal = 10;
        int valorDobrado = valorOriginal * 2;

        
        System.out.println(valorDobrado);


        /* Exercício 2: 

        Declare uma variável char que armazene a letra 'B'.
        Faça o castin explicito dessa variável para int e exiba o valor numérico correspondente.
        */


        char letra = 'B';

        int valorAscii = (int) letra;

        System.out.println(valorAscii);



        /* Exercício 3:
         
        Declare duas variáveis double para armazenar os valores 15.75 e 20.40.
        Some os valores dessas variáveis e armazene em uma nova variável double.
        Exiba o resultado.
        
        */

        double n1 = 15.75;
        double n2 = 20.40;

        double soma = n1 + n2;

        System.out.println(soma);



        /* Exercício 4:
        
        Declare uma variável long para armazenar o número 2 bilhões (2_000_000_000).
        Em seguida, declare uma variável int e faça o casting explicito do valor long para int.
        Exiba o resultado.
        
        */ 

        long numeroGrande= 2_000_000_000L;

        int numeroInt = (int) numeroGrande;

        System.out.println(numeroInt);



        /* Exercício 5: 

        Escreva um programa que crie uma variável String com o valor "Olá Mundo!".
        Em seguida, crie outra variável String que concatene a primeira variável com o texto
        "Bem-vindo ao Java!".
        Exiba o resultado.
        
        */

        String saudacao = "Olá Mundo!";
        String mensagem = saudacao + "Bem-vindo ao Java!";

       System.out.println(mensagem);

        }
}
