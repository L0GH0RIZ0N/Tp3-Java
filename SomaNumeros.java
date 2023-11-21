import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
        // Cria um Scanner para obter entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir o primeiro número
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        // Solicita ao usuário para inserir o segundo número
        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        // Fecha o Scanner após obter as entradas
        scanner.close();

        // Calcula a soma dos dois números
        int soma = numero1 + numero2;

        // Exibe o resultado
        System.out.println("A soma de " + numero1 + " e " + numero2 + " é: " + soma);
    }
}
