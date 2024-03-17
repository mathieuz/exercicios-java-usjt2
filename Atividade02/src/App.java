import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int distanciaPercorrida;
        int totalCombustivelGasto;

        System.out.println("[CALCULO DE CONSUMO MÉDIO DE COMBUSTÍVEL]");
        System.out.println("------------------------------------------\n");

        System.out.print("Informe a distância total percorrida pelo automóvel (em quilômetros): ");
        distanciaPercorrida = scanner.nextInt();

        System.out.print("Informe o total de combustível gasto (em litros): ");
        totalCombustivelGasto = scanner.nextInt();

        scanner.close();

        System.out.println(String.format("Consumo médio do automóvel: %dkm/l", distanciaPercorrida / totalCombustivelGasto));
    }
}
