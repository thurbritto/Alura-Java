import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Iniciando scanner, pessoa e varíável pra receber operação
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa("Arthur Britto", "Corrente", 2500);
        int operacao = 0;

        // Print com dados do cliente
        System.out.println("""
                ***********************
                Dados iniciais do cliente:
                                
                Nome: %s
                Tipo conta: %s
                Saldo inicial: R$ %.2f
                ***********************               
                """.formatted(pessoa.getNome(), pessoa.getTipoConta(), pessoa.getSaldo()));

        // Loop para operações
        do {
            System.out.println("""
                    Operações
                                
                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- Sair
                                
                Digite a opção desejada:
                """);
            operacao = scanner.nextInt();
            if (operacao == 1) {
                pessoa.consultarSaldo();
            } else if (operacao == 2) {
                pessoa.receberValor();
            } else if (operacao == 3) {
                pessoa.transferirValor();
            } else if (operacao == 4) {
                break;
            } else {
                System.out.println("Operação inválida.\n");
            }
        } while (operacao != 4);

    }
}