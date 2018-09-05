import java.util.Scanner ;

/*package idade ;*/



public class Idade {

   static int anoAtual, nascimento,Idade,idade2,s;
   
   static int resp;



    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s;
        
        System.out.println("Que ano voce nasceu ?");
    
         s = new Scanner(System.in);
         
         
         nascimento = s.nextInt();
         
         System.out.println("Qual o ano atual ");
         anoAtual = s.nextInt();
         
         Idade = anoAtual - nascimento; 
         
         System.out.println("Ja fez aniversario este ano ? 1- SIM / 2- NÃO ");
         resp = s.nextInt();
         
         if(resp=='2'){
         System.out.print("Sua idade é: "+Idade);
    }
         else
         {
         idade2=Idade-1;
         System.out.println("Sua idade é: "+idade2);
         }
    }
    
}
