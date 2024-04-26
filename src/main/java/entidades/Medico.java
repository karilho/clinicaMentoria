package entidades;

import java.util.ArrayList;

public class Medico {
    private Pessoa pessoa;
    private String especialidade;
    private double salario;
    private ArrayList<String> certificacoes;

    public Medico(Pessoa pessoa, String especialidade, double salario, ArrayList<String> certificacoes) {
        this.pessoa = pessoa;
        this.especialidade = especialidade;
        this.salario = salario;
        this.certificacoes = certificacoes;
    }

    public Medico() {

    }

    @Override
    public String toString() {
        return "Medico{" +
                "pessoa=" + pessoa +
                ", especialidade='" + especialidade + '\'' +
                ", salario=" + salario +
                ", certificacoes=" + certificacoes +
                '}';
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
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
