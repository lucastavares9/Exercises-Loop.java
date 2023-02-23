package exercicios;

import java.util.Scanner;

public class exercicio07 {
public static void main(String[] args) {
        
Scanner sc = new Scanner(System.in);

int n1, n2, n3, n4, n5;

do {
System.out.println("Insert n1: ");
n1 = sc.nextInt();
System.out.println("Insert n2: ");
n2 = sc.nextInt();
System.out.println("Insert n3: ");
n3 = sc.nextInt();
System.out.println("Insert n4: ");
n4 = sc.nextInt();
System.out.println("Insert n5: ");
n5 = sc.nextInt();

if(n1>n2 && n1>n3 && n1>n4 && n1>n5){
    System.out.println("n1 is the bigger: " + n1);
} else if (n2>n1 && n2>n3 && n2>n4 && n2>n5){
    System.out.println("n2 is the bigger: " + n2);
}else if (n3>n1 && n3>n2 && n3>n4 && n3>n5){
    System.out.println("n3 is the bigger: " + n3);
} else if (n4>n1 && n4>n2 && n4>n3 && n4>n5){
    System.out.println("n4 is the bigger: " + n4);
}else{
System.out.println("n5 is the bigger: " + n5);    
}
} while ((n1== 0) && (n2==0) && (n3==0) && (n4==0) && (n5==5));
sc.close();
}
}
