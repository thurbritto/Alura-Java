import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int tentativas = 5;
        int numeroDigitado;
        boolean acertou = false;

        System.out.println("Tente adivinhar o número gerado entre 1 a 100. ");

        while (tentativas != 0) {
            System.out.println(String.format("Você tem: %d tentativa(s)!", tentativas));
            numeroDigitado = leitor.nextInt();

            if (numeroDigitado == numeroAleatorio) {
                System.out.println(String.format("Parabéns você acertou! O número era: %d!%n", numeroAleatorio));
                acertou = true;
                break;
            } else if (numeroDigitado < numeroAleatorio) {
                System.out.println("O número que você digitou é MENOR do que o número gerado.");
            } else {
                System.out.println("O número que você digitou é MAIOR do que o número gerado.");
            }
            tentativas--;
        }

        if (!acertou) {
            System.out.println(String.format("Que pena, você não conseguiu! O número era: %d.%n", numeroAleatorio));
        }

    }
}