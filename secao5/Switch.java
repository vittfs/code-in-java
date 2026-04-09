package secao5;

public class Switch {

    public static void main(String[] args) {
        
        // 11 - switch case e break
        // para validar dia de semana baseado no número 
        // 1 = domingo 
        // 7 = Sábado 
        int diaDaSemana = 2;

        switch (diaDaSemana) {

            case 1: 
            System.out.print("Domingo");
            break;

            case 2:
            System.out.print("Segunda-Feira");
            break;

            case 3:
            System.out.print("Terça-Feira");
            break;

            case 4:
            System.out.print("Quarta-Feira");
            break;
        }

        // if(diaDeSemana == 1) {} else if (diaDeSemana == 2) {} ...

        // 12 - default 

        // default é o else do switch 

        int n = 10;

        switch (n) {
            case 1:
            System.out.print("É 1");
            break;

            case 2:
            System.out.print("É 2");
            break;
        
            default:
            System.out.print("Nímero não encontrado");
            break;
        }

        // 13 - switch sem break 

        switch (1) {
            case 1:
            System.out.print("Executou 1");
               
            case 2:
            System.out.print("Executou 2");
              

            case 3:
            System.out.print("Executou 3");
                
        
            default:
            System.out.print("Executou 4");
                
        }








    }
    
}
