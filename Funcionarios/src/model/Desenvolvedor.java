package model;

public class Desenvolvedor extends Funcionario {

    private String linguagemPrincipal;
    private double bonusPorProjeto;

    public Desenvolvedor(String nome, String cpf, double salarioBase,
                         String linguagemPrincipal, double bonusPorProjeto) {
        super(nome, cpf, salarioBase);
        this.linguagemPrincipal = linguagemPrincipal;
        this.bonusPorProjeto = bonusPorProjeto;
    }

    public String getLinguagemPrincipal() {
        return linguagemPrincipal;
    }

    public void setLinguagemPrincipal(String linguagemPrincipal) {
        this.linguagemPrincipal = linguagemPrincipal;
    }

    public double getBonusPorProjeto() {
        return bonusPorProjeto;
    }

    public void setBonusPorProjeto(double bonusPorProjeto) {
        this.bonusPorProjeto = bonusPorProjeto;
    }


    @Override
    public double calcularSalarioTotal() {
        return getSalarioBase() + bonusPorProjeto;
    }

    @Override
    public String toString() {
        return String.format("Desenvolvedor: %s | CPF: %s | Linguagem: %s",
                getNome(), getCpf(), linguagemPrincipal);
    }
}