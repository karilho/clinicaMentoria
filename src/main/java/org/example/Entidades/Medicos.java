package org.example.Entidades;

import java.time.LocalDate;
import java.util.List;


public class Medicos extends Pessoa{

    private String especialidade;
    private double salario;

    public Medicos(String nome, LocalDate dataDeNascimento, int cpf, int rg, String genero, String nacionalidade, double peso, double altura, String estadoCivil, String etinia, String email, String especialidade, double salario, List<Enderecos> listaDeEnderecos) {
        super(nome, dataDeNascimento, cpf, rg, genero, nacionalidade, peso, altura, estadoCivil, etinia, email, listaDeEnderecos);
        this.especialidade = especialidade;
        this.salario = salario;
    }
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
