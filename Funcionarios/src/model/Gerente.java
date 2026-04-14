package model;

public class Gerente extends Funcionario {

    private String departamento;
    private double bonificacaoPercentual;

    public Gerente(String nome, String cpf, double salarioBase,
                   String departamento, double bonificacaoPercentual) {
        super(nome, cpf, salarioBase);
        this.departamento = departamento;
        this.bonificacaoPercentual = bonificacaoPercentual;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getBonificacaoPercentual() {
        return bonificacaoPercentual;
    }

    public void setBonificacaoPercentual(double bonificacaoPercentual) {
        this.bonificacaoPercentual = bonificacaoPercentual;
    }

    @Override
    public double calcularSalarioTotal() {
        double bonificacao = getSalarioBase() * (bonificacaoPercentual / 100);
        return getSalarioBase() + bonificacao;
    }

    @Override
    public String toString() {
        return String.format("Gerente: %s | CPF: %s | Depto: %s", getNome(), getCpf(), departamento);
    }
}