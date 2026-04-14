package model;

public class Moto extends Veiculo {

    private int cilindrada;
    private String tipoPartida; // "Elétrica" ou "Pedal"

    public Moto(String marca, String modelo, int ano, double precoDiaria,
                int cilindrada, String tipoPartida) {
        super(marca, modelo, ano, precoDiaria);
        this.cilindrada = cilindrada;
        this.tipoPartida = tipoPartida;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipoPartida() {
        return tipoPartida;
    }

    public void setTipoPartida(String tipoPartida) {
        this.tipoPartida = tipoPartida;
    }

    @Override
    public String toString() {
        return String.format("Moto: %s %s (%d) | %dcc | Partida: %s",
                getMarca(), getModelo(), getAno(), cilindrada, tipoPartida);
    }
}