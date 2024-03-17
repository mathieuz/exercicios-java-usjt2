import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do vendedor: ");
        String nomeVendedor = scanner.nextLine();

        System.out.print("Digite o salário do vendedor: ");
        double salarioVendedor = scanner.nextDouble();

        System.out.print("Digite a quantidade de vendas feitas: ");
        int totalVendas = scanner.nextInt();

        double valorComissao = (totalVendas * 0.15); 

        System.out.println("\nDados do Vendedor:\n-----------------");
        System.out.print(
            "Vendedor: " + nomeVendedor + "\n" +
            "Total de vendas: " + totalVendas + "\n" +
            "Salário fixo: R$" + salarioVendedor + "\n" +
            "Valor da comissão (15% de comissão pra cada venda): R$" + valorComissao + "\n\n" +
            "Total Salário: R$" + (salarioVendedor + valorComissao)
        );

        scanner.close();
    }
}
