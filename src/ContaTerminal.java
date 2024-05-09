import java.util.Scanner;

public class ContaTerminal {

    //TODO: Conhecer e importar a classe Scanner
    //Exibir as mensagens para o nosso usuário
    //Obter pela scanner os valores digitados no termnal
    // Exibir a mensagem conta criada
    int numero;
    String agencia;
    String NomeCliente;
    double saldo;
    public static void main(String[] args) {
        System.out.println("===================================" +
                "\nSEJA BEM VINDO AO BANCO DIO-DIGITAL\n===================================");

        //Cria um objeto Scanner para ler a entrada do teclado
        Scanner scanner = new Scanner(System.in);

        //Solicita ao usúario que digite o seu nome
        System.out.println("Digite o seu nome: ");
        //Le a entrada do usúario com uma String

        String NomeCliente = scanner.nextLine();


        //Solicita ao usuário que digite o número da Agência.
        System.out.println("Por favor, digite o número da Agência: ");

        //Lê a entrada do usuário com uma String
        String agencia = scanner.nextLine();

        //Solicita ao usuário que digite o número da conta
        System.out.println("Agora, digite o número da conta: ");

        //Le a entrada do usúario com um int
        int numero = scanner.nextInt();


        //Solicita que coloque o saldo atual
        System.out.println("Digite o seu saldo atual: ");

        //Le a entrada do usúario com um double
        double saldo = scanner.nextDouble();

        //Fecha o objeto Scanner para liberar recursos
        scanner.close();

        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco," +
        "sua agência é " + agencia + " ,conta " + numero + ", e o seu saldo de R$" + saldo +
                " já está disponível para saque.");



    }
}
