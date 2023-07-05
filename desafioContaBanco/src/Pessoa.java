import java.util.Scanner;

public class Pessoa {
    Scanner scanner = new Scanner(System.in);
    private String nome;
    private String tipoConta;
    private double saldo;

    // Getters para acessar informações no Main
    public String getNome() {
        return nome;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public double getSaldo() {
        return saldo;
    }


    public Pessoa(String nome, String tipoConta, double saldo) {
        this.nome = nome;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
    }

    public void consultarSaldo() {
        System.out.printf("O saldo atual é de: R$ %.2f\n\n", saldo);
    }

    public void receberValor() {
        System.out.println("Digite o valor a receber: ");
        saldo += scanner.nextDouble();
        System.out.printf("Saldo atualizado: R$ %.2f\n\n", saldo);
    }

    public void transferirValor() {
        double valorTransferencia = 0;
        do {
            System.out.println("Informe o valor que deseja transferir: ");
            valorTransferencia = scanner.nextDouble();
            if (valorTransferencia <= 0) {
                System.out.println("O valor deve ser maior que zero.");
            }
        } while (valorTransferencia <= 0);

        if (valorTransferencia > saldo){
            System.out.println("Não há saldo suficiente para realizar essa transferência.\n");
        } else {
            saldo -= valorTransferencia;
            System.out.printf("Saldo atualizado: R$ %.2f\n\n", saldo);
        }
    }
}
