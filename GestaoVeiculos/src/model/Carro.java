package model;

public class Carro extends Veiculo {

    private int numeroPortas;
    private String tipoCombustivel;

    public Carro(String marca, String modelo, int ano, double precoDiaria,
                 int numeroPortas, String tipoCombustivel) {
        super(marca, modelo, ano, precoDiaria);
        this.numeroPortas = numeroPortas;
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public String toString() {
        return String.format("Carro: %s %s (%d) | %d portas | %s",
                getMarca(), getModelo(), getAno(), numeroPortas, tipoCombustivel);
    }
}