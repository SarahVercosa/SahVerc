package sarahquestao3;

import java.util.Scanner;

public class Sarahquestao3 {

    public static void main(String[] args) {

        int n, seg1, seg2, min1, min2, hr1, hr2, soma, dif, minuto, segundo, hora, stotal1, stotal2;
        float horas, minutos, segundos;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro horário (hora):  ");
        hr1 = teclado.nextInt();
        System.out.println("minuto/s: ");
        min1 = teclado.nextInt();
        System.out.println("segundo/s: ");
        seg1 = teclado.nextInt();
        System.out.println("Digite o segundo horário (hora): ");
        hr2 = teclado.nextInt();
        System.out.println("minuto/s: ");
        min2 = teclado.nextInt();
        System.out.println("segundo/s: ");
        seg2 = teclado.nextInt();
        System.out.println("Escolha a operação:\n1- soma\n2- diferença");
        n = teclado.nextInt();

        stotal1 = ((hr1 * 3600) + (min1 * 60) + seg1);
        stotal2 = ((hr2 * 3600) + (min2 * 60) + seg2);

        if (n == 1) {
            soma = (stotal1 + stotal2);
            horas = soma / 3600;
            minutos = (horas % 3600) / 60;
            segundos = (horas % 3600) % 60;
            System.out.printf("A soma das horas é: %.0f:%.0f:%.0f",horas,minutos,segundos);

        } else if (stotal1 > stotal2) {
            dif = stotal1 - stotal2;
        } else {
            dif = (stotal2 - stotal1);
            horas = dif / 3600;
            minutos = (horas % 3600) / 60;
            segundos = (horas % 3600) % 60;
            System.out.printf("A diferença das horas é: %.0f:%.0f:%.0f",horas,minutos,segundos);
        }

    }
}
