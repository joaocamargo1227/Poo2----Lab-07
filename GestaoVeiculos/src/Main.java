import model.Carro;
import model.Moto;
import model.Veiculo;

public class Main {

    public static void main(String[] args) {

        Carro carro1 = new Carro("Toyota", "Corolla", 2023, 150.0, 4, "Flex");
        Carro carro2 = new Carro("Honda", "Civic", 2022, 140.0, 4, "Gasolina");
        Carro carro3 = new Carro("Chevrolet", "Onix", 2021, 100.0, 4, "Flex");
        Carro carro4 = new Carro("Hyundai", "HB20", 2023, 110.0, 4, "Flex");
        Carro carro5 = new Carro("Volkswagen", "Golf", 2020, 130.0, 4, "Gasolina");

        Moto moto1 = new Moto("Honda", "CB 500", 2022, 80.0, 500, "Elétrica");
        Moto moto2 = new Moto("Yamaha", "MT-07", 2023, 90.0, 700, "Gasolina");

        System.out.println("============================================");
        System.out.println("       SISTEMA DE GESTÃO DE VEÍCULOS        ");
        System.out.println("============================================");

        exibirCustoLocacao(carro1, 5);
        exibirCustoLocacao(carro2, 3);
        exibirCustoLocacao(carro3, 7);
        exibirCustoLocacao(carro4, 10);
        exibirCustoLocacao(carro5, 2);

        exibirCustoLocacao(moto1, 7);
        exibirCustoLocacao(moto2, 10);
    }

    private static void exibirCustoLocacao(Veiculo v, int dias) {
        System.out.println("\n" + v);
        System.out.printf("  Diária       : R$ %,.2f%n", v.getPrecoDiaria());
        System.out.printf("  Período      : %d dia(s)%n", dias);
        System.out.printf("  Custo Total  : R$ %,.2f%n", v.calcularCustoLocacao(dias));
    }
}