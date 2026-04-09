package secao5;

import java.util.Scanner;

public class ExercicosCondicionais {
    
    public static void main(String[] args) {
        
    /*
    
    > Exercício 1: Verificação de Categoria de Preço

    Peça ao usuário para inserir o preço de um poduto.
    Se o preço for menor que 50, categorize-o como "Barato".
    Se estiver entre 50 e 100, categorize como "Médio".
    Se for maior que 100, categorize como "Caro". 
    Exiba a categoria correspondente. 
    */
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o preço do produto: ");

    double preco = scanner.nextDouble();

    if(preco < 50){
        System.out.println("Categoria: Barato");
    } else if(preco >= 50 && preco <= 100) {
        System.out.println("Categoria: Médio");
    } else {
        System.out.println("Categoria: Caro");
    }

    
    

    /* 
    > Exercício 2: Validação de Login 

    Peça ao usuário para inserir um nome de usuário e uma senha.
    Verifique se o nome de usuário é "admin" e a senha é "1234".
    Se ambos forem corretos, exiba "Acesso permitido".
    Caso contrário, exiba "Acesso negado".

    */

    System.out.println("Digite o nome do usuário: ");

    String usuario = scanner.next();

    System.out.println("Digite a senha do usuário: ");
    
    String senha = scanner.next();

    // String -> equals
    if(usuario.equals("admin") && senha.equals("1234")) {
        System.out.println("Acesso permitido");
    } else {
         System.out.println("Acesso negado.");
    }


    


    /*
    > Exercício 3: Identificação de Paridade com Strings 

    Peça ao usuário para inserir o número.
    Verifique se o número é par ou ímpar, e exiba a palavra "Par" ou "Ímpar".
    Use uma string para armazenar o resultado e exibi-la.

    */

    System.out.println("Digite um número: ");

    int numero = scanner.nextInt();

    // 12 / 2 = 6 -> resto 0;
    // 13 / 2 = 6 -> resto 1;
    String resultado = "";

    if(numero % 2 == 0) {
        resultado = "Par";
    } else {
        resultado = "Ímpar";
    }

    System.out.println("O número é: " + resultado);



    /*
    > Exercício 4: Identificação de Dia Útil 

    Peça ao usuário para inserir um número de 1 a 7,
    representando os dias da semana (1 para domingo, 2 para segunda, etc...).
    Use switch para verificar se o dia é um dia útil (segunda a sexta) ou final de semana (sábado e domingo).
    Exiba uma mensagem correspondente.

    */

    









        scanner.close();
    }
}
