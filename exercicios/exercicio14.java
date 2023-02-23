package exercicios;

import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();
        int soma = 0;
        int cont = 0;

        while (idade >= 0) {
            soma = soma + idade;
            cont = cont + 1;
            idade = sc.nextInt();
        }
        if (cont > 0) {
        double media = (double) soma / cont;
        System.out.println("Media: " + media);
        }
        else {
            System.out.println("Impossivel calcular");
        }
        sc.close();
    }
}
