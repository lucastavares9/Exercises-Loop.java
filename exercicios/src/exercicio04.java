package exercicios;



public class exercicio04 {
public static void main(String[] args) {
        
double popA = 80000;
double popB = 200000;
int contadoranos = 0;

while ( popA < popB) {
    popA += ((popA * 3.0)/100);
    popB += ((popB * 1.5)/100);
    contadoranos++;

}
System.out.println("Total de Anos: " + contadoranos);





}
}
