package sarahquestao4;

import java.util.Scanner;

public class Sarahquestao4 {

    public static void main(String[] args) {
        int cont = 0, n;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escreva um número.");
        n = teclado.nextInt();
        if (n == 0) {
            cont = 1;
        } else {
            while (n > 0) {
                n /= 10;
                cont++;
            }

        }
        System.out.println("A quantidade de dígitos desse número é: " + cont);
    }
}
