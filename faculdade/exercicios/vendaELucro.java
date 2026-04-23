package exercicios;
import java.util.Scanner;

/* Crie um algoritmo que leia o valor da compra e imprima o valor da venda.*/

public class vendaELucro {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float venda, lucro = 0, compra;

        System.out.println("Valor de Compra, Lucro e Venda de um produto");

        System.out.println("Digite o valor de compra do produto, em R$:");

        compra = scanner.nextFloat();

        if (compra < 10){ lucro = (float) (0.70 * compra) ; }
        else
          if (compra < 30){ lucro = (float) (0.50 * compra) ; }  
          else
            if (compra < 50){ lucro = (float) (0.40 * compra) ; }                
            else { lucro = (float) (0.30 * compra) ; }  

        venda = compra + lucro;

        System.out.printf("\nValor de Compra: R$ %.2f ",compra);

        System.out.printf("\nLucro: R$ %.2f ",lucro);

        System.out.printf("\nValor de Venda: R$ %.2f ",venda);

        scanner.close();
    }   
}
