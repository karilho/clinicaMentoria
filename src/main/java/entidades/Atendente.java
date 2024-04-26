package entidades;

import java.time.LocalDate;

public class Atendente extends Pessoa {
    private String cargo;
    private double salario;

    public Atendente(String nome, int idade, char genero, int cpf, String rg, LocalDate dataDeNascimento, String[] listaDeEnderecos, double altura, double peso, String nacionalidade, String estadoCivil, String etnia, String profissao, String numeroCelular, String numeroTelefoneFixo, String cargo, double salario) {
        super(nome, idade, genero, cpf, rg, dataDeNascimento, listaDeEnderecos, altura, peso, nacionalidade, estadoCivil, etnia, profissao, numeroCelular, numeroTelefoneFixo);
        this.cargo = cargo;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Atendente{" +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
