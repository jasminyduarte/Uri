
import java.util.Scanner;
public class Bruxa {

    public static void main (String[] args ) {
        
			Scanner leia = new Scanner(System.in); // 
            String a,b,op;
            int soma,mult;
            
            a = leia.next(); 
            op = leia.next(); 
            b = leia.next(); 

           // subtistuindo o 7 pelo 0
            a = a.replaceAll("7","0");
            b = b.replaceAll("7","0");
            
          //soma ou multiplicacao
            if(op.equals("+")){
                int ai = Integer.parseInt(a); // Transformando string para inteiro
                int bi = Integer.parseInt(b);
                soma = ai+bi;
                String aux = String.valueOf(soma); //convertendo inteiro para string
                aux = aux.replaceAll("7","0");
                System.out.println(Integer.parseInt(aux));
            }
            else if(op.equals("*")){
                int ai = Integer.parseInt(a);
                int bi = Integer.parseInt(b);
                mult = ai*bi;
                String aux = String.valueOf(mult);
                aux = aux.replaceAll("7","0");
                System.out.println(Integer.parseInt(aux));
            }
            
    }
}