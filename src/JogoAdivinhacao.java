import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        int numero = new Random().nextInt(100);
        Scanner leitura = new Scanner(System.in);
        int chances = 5;

        while (chances > 0) {
            System.out.println("Faça uma tentativa");
            int tentativa = leitura.nextInt();

            if (tentativa == numero) {
                System.out.println("Você venceu!");
                break;
            } else if (tentativa > numero) {
                System.out.println("Tentativa muito alta");
            } else {
                System.out.println("Tentativa muito baixa");
            }

            chances--;

            if (chances == 0) {
                System.out.println("Você perdeu.");
            }
        }
    }
}

