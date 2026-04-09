package secao5;

public class OperadoresLogicos {
    
    public static void main(String[] args){

        // 8 - AND 

        int idade = 18;
        boolean temCarteiraDeMotorista = true;

        // true == true > true (variável)
        System.out.println(idade >= 18 && temCarteiraDeMotorista);
        System.out.println(idade >= 18 && temCarteiraDeMotorista == true);

        boolean carteiraVencida = false;

        System.out.println(idade >= 18 && temCarteiraDeMotorista && carteiraVencida == false);

        int a = 10;
        int b = 20;

        // True && True -> True 
        if (a > 5 && b > 10){

            System.out.println("Deu certo!");
        }

         // False && True -> True (curto circuito)
        if (a > 55 && b > 10){
            
            System.out.println("Deu certo! 2");
        }

        // 9 - OR

        boolean estaChovendo = false; 
        boolean temGuardaChuva = true;
        
        System.out.println(estaChovendo || temGuardaChuva);


        System.out.println(false || false);

        System.out.println(10 > 20 || 100 == 200);

        int idade2 = 16;
        boolean ehMembro = false;

        //O usuário pode participar do clube 
        // ele precisa ter > 16 anos OU ser membro 

        if (idade2 > 16 || ehMembro){
            
            System.out.println("Você pode entrar");
        } else {

            System.out.println("Entrada negada!");
        }

        // 10 - NOT 

        System.out.println(estaChovendo);
        System.out.println(!estaChovendo);

        System.out.println(estaChovendo || !temGuardaChuva);

        System.out.println(!(estaChovendo || !temGuardaChuva));
    }
}
