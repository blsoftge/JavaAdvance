package br.com.blsoft.javaadvance.video22.comparator;

public class Cliente {
    
    private String nome;
    private double creditoNaPraca;

    public Cliente(String nome, double creditoNaPraca) {
        this.nome = nome;
        this.creditoNaPraca = creditoNaPraca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCreditoNaPraca() {
        return creditoNaPraca;
    }

    public void setCreditoNaPraca(double creditoNaPraca) {
        this.creditoNaPraca = creditoNaPraca;
    }

    @Override
    public String toString() {
        return "Cliente [creditoNaPraca=" + creditoNaPraca + ", nome=" + nome + "]";
    }
}