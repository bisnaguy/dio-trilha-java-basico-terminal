import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // TODO Conhecer e importar a classe Scanner
        // Exibir as mensagens para o nosso usuário
        // Obter pela classe Scanner os valores digitados no terminal
        // Exibir a mensagem conta criada
        Scanner texto = new Scanner(System.in);
        texto.useLocale(Locale.US);

        System.out.println("Qual é o seu nome: ");
        String nome = texto.nextLine();

        System.out.println("Por favor, digite sua agência! ");
        String agencia = texto.nextLine();

        System.out.println("Agora digite a sua conta! ");
        int conta = texto.nextInt();

        System.out.println("Qual é o seu saldo: ");
        double saldo = texto.nextDouble();

        System.out.println("Olá "+ nome +", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+conta+" e seu saldo R$ "+saldo+" já está disponível para saque");
        
    }
}
