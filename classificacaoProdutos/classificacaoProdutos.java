package classificacaoProdutos;

import java.util.Scanner;

public class classificacaoProdutos {
    
    public static void main(String[] args) {
        
    // Ter três produtos catalogados => Nome 
    // Pedir o nome do produto => Novo ou de um já existente 
    // Verificar se o produto está catalogado 
    // Se sim, podemos escolher alterar o preço ou não 
        // Se alterar o preço, exibir classificação (Abaixo)
        // Senão alterar, Encerrar o programa 
    // Se não, pedir o preço do produto
         //Exibir classificação 
    // Classificações: preço < 50 = barato, 50 a 100 = moderado, maior que 100 = caro
    //Exibir no fim nome do produto e preço 

    Scanner scanner = new Scanner(System.in);

    // Catalogo de produtos
    String produto1 = "Base";
    String produto2 = "Corretivo";
    String produto3 = "Rimel";

    double preco = 0;

    System.out.println("Digite o nome do produto: ");

    String nomeProduto = scanner.nextLine();

    // Ver se o produto está no catalogo
    if(produto1.equalsIgnoreCase(nomeProduto) || 
    produto2.equalsIgnoreCase(nomeProduto) || 
    produto3.equalsIgnoreCase (nomeProduto)) {

        System.out.println("Produto já existe. Quer atualizar o preço? (sim/não)");

        String resposta = scanner.nextLine();

        if(resposta.equalsIgnoreCase("Sim")) {
        
            System.out.println("Insira o novo preço:");
            preco = scanner.nextDouble();

        } else {

        System.out.println("Preço não atualizado!");
        scanner.close();
        return;

        }

    } else {

    System.out.println("Insira o preço do produto:");
    preco = scanner.nextDouble(); 

    }
        
    if(preco < 50) {

        System.out.println("Classificação: Barato");

    } else if(preco >= 50 && preco <= 100){

        System.out.println("Classificação: Moderado");

    } else {
        System.out.println("Classificação: Caro ");
    }

    System.out.println("Produto: " + nomeProduto + ". Preço: " + preco);




    scanner.close();

    }
}
