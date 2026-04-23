package exercicios;
import java.util.Scanner;

/* Faça um algoritmo que receba o preço de um produto, calcule e mostre, 
de acordo com as tabelas a seguir, o novo preço e a classificação.

PERCENTUAL DE AUMENTO:
Preço até R$50,00 ->            05% 
Entre R$50,00 e R$100,00 ->     10%
Acima de R$100,00 ->            15%

CLASSIFICAÇÕES:
Até R$80,00                                    Barato
Entre R$80,00 E R$120,00(INCLUSIVE )           Normal 
Entre R$120,00 E R$200,00(INCLUSIVE )          Caro
Maior que R$200,00                             Muito Caro 
*/

public class classificaPreco {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float preco, novo_preco, aum;

        System.out.println("Preço, aumento e classificação");

        System.out.println("Digite o preço de um produto, em R$: ");

        preco = scanner.nextFloat();

        if (preco <= 50){ aum = (float) (0.05 * preco); }
        else if (preco <= 100 ) { aum = (float) (0.10 * preco); }
        else { aum = (float) (0.15 * preco); }

        novo_preco = preco + aum;

        if (novo_preco <= 80) {
           System.out.printf("\nNovo Preço = R$%.2f - BARATO",novo_preco);
        }
        else
        if (novo_preco <= 120){
        System.out.printf("\nNovo Preço = R$%.2f - NORMAL",novo_preco);
        }
        else
        if (novo_preco <= 200){
        System.out.printf("\nNovo Preço = R$%.2f - CARO", novo_preco);
        }
        scanner.close();
    }
}
