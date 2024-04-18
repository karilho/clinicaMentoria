package entidades;

import java.time.LocalDate;
import java.util.ArrayList;

public class Atendente extends Pessoa {
    private ArrayList<Consulta> agenda;
    private String cargo;
    private double salario;

    public Atendente(String nome, int idade, char genero, int cpf, String rg, LocalDate dataDeNascimento, ArrayList<Endereco> listaDeEnderecos, double altura, double peso, String nacionalidade, String estadoCivil, String etnia, String profissao, String cargo, double salario) {
        super(nome, idade, genero, cpf, rg, dataDeNascimento, listaDeEnderecos, altura, peso, nacionalidade, estadoCivil, etnia, profissao);
        this.cargo = cargo;
        this.salario = salario;
    }

    public ArrayList<Consulta> getAgenda() {
        return agenda;
    }

    public void setAgenda(ArrayList<Consulta> agenda) {
        this.agenda = agenda;
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
