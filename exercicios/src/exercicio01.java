import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
       
        int nota;
        do{
            System.out.print("Informe sua nota de 0 a 10: ");
            nota = sc.nextInt();
            if (nota<=10){
                System.out.println("Sua nota é valida!");
            } else{
                System.out.println("Valor nao aceito, informa sua nota novamente.");
            }  
        } while (nota<0||nota>10);
        sc.close();
    }
}
