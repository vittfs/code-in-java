package exercicios;
import java.util.Scanner;

/* Construa um algoritmo para determinar se o indivíduo esta com o peso
 favorável. Essa situação é determinada através do IMC (índice de peso Massa 
 Corpórea), que é definida como sendo a relação entre o peso(PESO) e o quadrado
 da altura(ALTURA) do indivíduo. */
 
public class IMC {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       float imc, alt, peso;

       System.out.println("IMC de uma pessoa");

       System.out.println("Digite a altura da pessoa(m):");

       alt = scanner.nextFloat();

       System.out.println("Digite o peso da pessoa(kg):");

       peso = scanner.nextFloat();

       imc = (float) (peso / Math.pow(alt,2));

       if (imc < 20){
          System.out.printf("IMC = %.1f - ABAIXO DO PESO",imc);
       }
       else
           if(imc <= 25){
          System.out.printf("IMC = %.1f - PESO NORMAL",imc);
           }
           else
              if (imc <= 30){
          System.out.printf("IMC = %.1f - SOBREPESO",imc);                  
              } 
              else
                  if (imc <= 40){
          System.out.printf("IMC = %.1f - OBESO",imc);
                  }                         
}
}