package entidades;

import java.time.LocalDate;
import java.util.ArrayList;

public class Medico extends Pessoa {
    private String especialidade;
    private double salario;
    private ArrayList<String> certificacoes;

    public Medico(String nome, int idade, char genero, int cpf, String rg, LocalDate dataDeNascimento, ArrayList<Endereco> listaDeEnderecos, double altura, double peso, String nacionalidade, String estadoCivil, String etnia, String profissao, String especialidade, double salario, ArrayList<String> certificacoes) {
        super(nome, idade, genero, cpf, rg, dataDeNascimento, listaDeEnderecos, altura, peso, nacionalidade, estadoCivil, etnia, profissao);
        this.especialidade = especialidade;
        this.salario = salario;
        this.certificacoes = certificacoes;
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

    public ArrayList<String> getCertificacoes() {
        return certificacoes;
    }

    public void setCertificacoes(ArrayList<String> certificacoes) {
        this.certificacoes = certificacoes;
    }
}
