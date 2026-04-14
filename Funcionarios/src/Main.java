import model.Desenvolvedor;
import model.Funcionario;
import model.Gerente;

public class Main {

    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("Ana Lima", "111.222.333-44", 3000.0);
        Funcionario funcionario2 = new Funcionario("Renato", "123.456.789-00", 3000.0);
        Funcionario funcionario3 = new Funcionario("Fernando", "000.999.888-11", 2000.0);
        Funcionario funcionario4 = new Funcionario("Ronaldo", "987.654.321-12", 5000.0);
        Funcionario funcionario5 = new Funcionario("Joao", "897.457.021-99", 1000.0);

        Gerente gerente1 = new Gerente(
                "Carlos Souza", "555.666.777-88",
                5000.0, "Tecnologia da Informação", 20.0
        );

        Gerente gerente2 = new Gerente(
                "Fernando", "333.777.666-17",
                7000.0, "Tecnologia da Informação", 20.0
        );

        Desenvolvedor desenvolvedor = new Desenvolvedor(
                "Beatriz Melo", "999.000.111-22",
                4000.0, "Java", 800.0
        );

        System.out.println("============================================");
        System.out.println("   SISTEMA DE GERENCIAMENTO DE FUNCIONÁRIOS ");
        System.out.println("============================================");

        exibirSalario(funcionario1);
        exibirSalario(funcionario2);
        exibirSalario(funcionario3);
        exibirSalario(funcionario4);
        exibirSalario(funcionario5);

        exibirSalario(gerente1);
        exibirSalario(gerente2);
        exibirSalario(desenvolvedor);
    }

    private static void exibirSalario(Funcionario f) {
        System.out.println("\n" + f);
        System.out.printf("  Salário Base  : R$ %,.2f%n", f.getSalarioBase());
        System.out.printf("  Salário Total : R$ %,.2f%n", f.calcularSalarioTotal());
    }
}