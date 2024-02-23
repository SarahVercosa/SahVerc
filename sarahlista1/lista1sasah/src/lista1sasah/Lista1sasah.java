
package lista1sasah;
import java.util.Scanner;
public class Lista1sasah {

    
    public static void main(String[] args) {
      float n1, n2, n3, media, recpar, mfinal;
        Scanner teclado = new Scanner (System.in);
       
        System.out.println("Digite as notas das suas três avaliações.");
        n1 = teclado.nextFloat();
        n2 = teclado.nextFloat();
        n3 = teclado.nextFloat();
        media = (n1 + n2 + n3)/3;
        System.out.println("Sua média foi: "+media);
        if(media>=7){
            System.out.println("Você foi aprovado!");
        }
        
        else{
            System.out.println("Você foi reprovado. Digite a nota da sua recuperação.");
            recpar = teclado.nextFloat();
            mfinal = (media + recpar)/2;
            
            if(mfinal>=5){
                System.out.println("Você foi aprovado com a média final de "+mfinal+" pontos.");
            }
            else{
                System.out.println("Você foi reprovado definitivamente.Sua média final foi: "+mfinal);
            }
        } 
        
    }
    
} 
