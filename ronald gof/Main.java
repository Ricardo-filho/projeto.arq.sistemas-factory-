import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

 
        System.out.println("Escolha a categoria do veículo:");
        System.out.println("  1 - Econômico   (Volkswagen Gol)    R$ 80/dia");
        System.out.println("  2 - Intermediário (Toyota Corolla)  R$ 150/dia");
        System.out.println("  3 - Luxo         (BMW Série 5)      R$ 350/dia");
        System.out.println("  4 - SUV           (Jeep Commander)  R$ 220/dia");
        System.out.println();
        System.out.print("Digite o número da opção: ");

        int opcao = scanner.nextInt();

        System.out.print("Quantos dias de aluguel? ");
        int dias = scanner.nextInt();

        try {
            Veiculo veiculo = VeiculoFactory.criar(opcao);

            System.out.println();
            System.out.println("══════════════════════════════");
            System.out.println("        RESUMO DO ALUGUEL     ");
            System.out.println("══════════════════════════════");
            System.out.println("Veículo  : " + veiculo.modelo);
            System.out.println("Categoria: " + veiculo.getTipo());
            System.out.println("Diária   : R$ " + veiculo.precoPorDia);
            System.out.println("Dias     : " + dias);
            System.out.println("──────────────────────────────");
            System.out.printf("TOTAL    : R$ %.2f%n", veiculo.calcularAluguel(dias));
            System.out.println("══════════════════════════════");

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        scanner.close();
    }
}