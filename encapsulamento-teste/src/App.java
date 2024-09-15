import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner texto = new Scanner(System.in);
        Cadastro pessoa = new Cadastro();
        
        System.out.println("Informe o seu nome: ");
        String nomeIn = texto.nextLine();
        System.out.println("Informe a sua idade: ");
        int idadeIn = texto.nextInt();

        pessoa.setNome(nomeIn);
        pessoa.setIdade(idadeIn);
        System.out.println("Seu nome é "+ pessoa.getNome()+ " e você tem "+pessoa.getIdade()+" anos");
        
        texto.close();
    }
}
