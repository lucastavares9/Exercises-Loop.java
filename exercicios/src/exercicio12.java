package exercicios;

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. Escreva uma mensagem que indique se esses valores foram digitados em ordem crescente ou decrescente

        int x = sc.nextInt();
        int y = sc.nextInt();

        while ( x != y){
            if(x < y){
                System.out.println("Crescente");
            } 
            else {
                System.out.println("Descrecente");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }

    
        sc.close();
    }
}
