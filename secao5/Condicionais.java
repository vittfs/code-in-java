package secao5;

public class Condicionais {
    
    public static void main(String[] args){

        // 1 - O que é boolean?
        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println(isTrue);
        System.out.println(isFalse);

        // 2 - Operadores de comparação 

        int x = 10;

        // x é igual a 10 
        System.out.println(x == 10);

        // x é igual a 9
        System.out.println(x == 9);

        // x é diferente de 5 
        System.out.println(x != 5);

        // x é diferente de 10
        System.out.println(x != 10);

        // x é maior que 10 
        System.out.println(x > 10);

        // x é maior ou igual a 10 
        System.out.println(x >= 10);

        // x é menor que 10 
        System.out.println(x < 10);

        // x é menor ou igual a 10 
        System.out.println(x <= 10);

        // 3 - Atribuição e Comparação 

        int n = 5;
        int m = 10;

        // System.out.println(n = 12);

        System.out.println(n == 12);

        System.out.println(n);

        System.out.println(n == m);

        // 4 - Comparação de Strings 

        String str1 = "Java";
        String str2 = new String("Java");

        System.out.println(str1 == str2);

        System.out.println(str1 == "Java");

        System.out.println(str1.equals(str2)); 

        System.out.println(str1.equals(str1)); 

        System.out.println(str1.equals("Java")); 

        String str3 = "Java";

        System.out.println(str1.equals(str3)); 

        // Java == JAVA (false) > java == java 
        System.out.println(str1.equalsIgnoreCase(str3)); 

        // 5 - If 
        int numero = 10;

        //Baseado em uma comparação, eu executo algo 
        if (numero > 5) {

            System.out.println("O número é maior que 5");

        } 

        // if com Strings 
        String texto = "Teste";

        // Se a função retorna um booleano, eu posso usar no if 
        if(texto.equals("Teste")) {

            System.out.println("O texto é: Teste");

        }

        // declaração do if (comparação o retorno de booleano) { o que será executado...}

        // 6 - else 

        int q = 7;

        if(q > 10) {

            System.out.println("Q é maior que 10");
        } else {

            System.out.println("Insira um número maior que 10!");
        }

        // todo else precisa de um if, mas nem todo if precisa ter um else 


        if(texto.equals("Teste2")) {

            System.out.println("O texto é: Teste");

        } else {

            System.out.println("O texto não é igual!");
        }


        // 7 - else if 
        double nota =  8.5;

        if (nota == 10) {

            System.out.println("Você tirou a nota máxima, parabéns!");

        }else if(nota >= 9) {

            System.out.println("Nota muito boa!");
        } else if (nota >= 7) {

            System.out.println("Acima da média");

        } else {

            System.out.println("Abaixo da média");
        }

        int num = 5;

        if (nota > 3 && num < 5) {

            System.out.println("Alguma coisa");

        }else if(nota == 5) {

            System.out.println("Outra coisa aqui");

        }
        
        // 1 - escolher qual a situação que eu quero que mais ocorra
        // 2 - melhorar a lógica, deixando a comparação mais específica

    }
}
