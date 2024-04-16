package org.example.Entidades;

import java.time.LocalDate;

public class Atendentes extends Pessoa {

    private String cargo;
    private double salario;


    public Atendentes(String nome, LocalDate dataDeNascimento, int cpf, int rg, String genero, String nacionalidade, double peso, double altura, String estadoCivil, String etinia, String cargo, double salario) {
        super(nome, dataDeNascimento, cpf, rg, genero, nacionalidade, peso, altura, estadoCivil, etinia);
        this.cargo = cargo;
        this.salario = salario;
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
