import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[CONVERSOR DE CELSIUS PARA FAHRENHEIT]");
        System.out.println("--------------------------------------\n");

        System.out.print("Digite o valor de grau em Celsius: ");
        int grauEmCelsius = scanner.nextInt();

        scanner.close();

        System.out.println(String.format("O valor de temperatura %d°C em Fahrenheit é: %d°F", grauEmCelsius, (grauEmCelsius * 9/5) + 32));
    }
}
