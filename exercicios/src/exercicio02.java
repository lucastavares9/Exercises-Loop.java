import java.util.Scanner;

public class exercicio02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome,senha;
        do {
            System.out.print("Informe o usuario: ");
            nome = sc.nextLine();
            System.out.print("Informe a senha: ");
            senha=sc.nextLine();
            
            if(!nome.equals(senha)){
                System.out.println("Nome de usuario e senha aceitos.");
            }else{
                System.out.println("Usuario e senha iguais, formato nao aceito.");
            }

            } while (nome.equals(senha));
            sc.close();
        }
    }
