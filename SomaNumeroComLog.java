import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SomaNumerosComLog {
    private static final Logger logger = Logger.getLogger(SomaNumerosComLog.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            logger.log(Level.INFO, "Digite o primeiro número: ");
            int numero1 = scanner.nextInt();

            logger.log(Level.INFO, "Digite o segundo número: ");
            int numero2 = scanner.nextInt();

            int soma = numero1 + numero2;

            logger.log(Level.INFO, "A soma de {0} e {1} é: {2}", new Object[]{numero1, numero2, soma});
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Ocorreu um erro: " + e.getMessage(), e);
        } finally {
            scanner.close();
        }
    }
}
