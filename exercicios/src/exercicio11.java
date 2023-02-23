package exercicios;

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Insira primeiro nome: ");
    String nome1 = sc.nextLine();
    System.out.print("Insira o segundo nome: ");
    String nome2 = sc.nextLine();

    for (int i = 0; i <= 1000000; i++){
        System.out.println(nome1);
        System.out.println();
        System.out.println(nome2);
    }
    sc.close();
    }
}
