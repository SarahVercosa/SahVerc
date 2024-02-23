
package questão2;

import java.util.Scanner;

public class Questão2 {

    public static void main(String[] args) {
        float critA, critB;
        int livros;

        Scanner teclado = new Scanner(System.in);

        System.out.println("No plano A você paga  R$ 0,25 por livro + R$ 7,50 fixo. \nJá no plano B, você paga R$ 0,50 por livro + R$ 2,50 fixo. \nMas não se preocupe com as contas. Indicaremos o plano ideal para você! Para isso, digite a quantidadde de livros que deseja comprar.");
        livros = teclado.nextInt();
        critA = (float) ((livros * 0.25) + 7.50);
        critB = (float) ((livros * 0.50) + 2.50);
        System.out.println("Seu total foi: no plano A R$" + critA + " \nNo plano B R$" + critB);
        if (critA == critB) {
            System.out.println("Nesse caso, os dois planos servem igualmente para você.");
        } else if (critA > critB) {
            System.out.println("Sendo assim, o plano B é o ideal para você.");
        } else {
            System.out.println("Sendo assim, plano A é o ideal para você.");

        }
    }
}
    

