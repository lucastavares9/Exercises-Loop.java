import java.util.Scanner;
public class exercicio03 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String nome, estadocv,sexo;
    double salario; 
    int idade;

    do{
    System.out.print("Insira seu nome: ");
     nome=sc.nextLine();
    if(nome.length()<=3){
    System.out.println("Nome valido.");
    } else{
    System.out.println("Nome Invalido.");
    }
    } while ((nome.length()>3));

    do{
    System.out.print("Insira sua idade: ");
    idade=sc.nextInt();
    if ( idade <=150){
    System.out.println("Idade aceita.");
    }else{
    System.out.println("Idade invalida!");
    }
    }while ((idade <0) || (idade>150));
      
    do{
    System.out.print("Informe salario= ");
    salario= sc.nextDouble();
    if (salario>=0){
    System.out.println("Salario ok! ");
    } else {
    System.out.println("Salario invalido!");
    }
    } while((salario<0));

    do {
    System.out.print("Infome seu sexo: ");
    sexo= sc.next();
    if(sexo.equals("F")) {
    System.out.println("Sexo informado é Feminino.");
    } else if (sexo.equals("M")){
    System.out.println("Sexo informado é Masculino.");
    }else{
    System.out.println("Sexo invalido! ");
    }
    }while ((!sexo.equals("F") && !sexo.equals("M")));

    do{
    System.out.print("Insira estado civil: ");
    estadocv = sc.next();
    if (estadocv.equals("C")){
    System.out.println("Casado");
    } else if (estadocv.equals("S")){
    System.out.println("Solteiro");
    } else if (estadocv.equals("V")){
    System.out.println("Viuvo");
    }else if (estadocv.equals("D")){
    System.out.println("Divorciado(a)");
    }else{
    System.out.println("Estado civil invalido!");
    }
    }while((!estadocv.equals("S")&&!estadocv.equals("C")&&!estadocv.equals("V")&& !estadocv.equals("D")));
    sc.close();
}
}