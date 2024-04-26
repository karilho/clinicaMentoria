package entidades;

import java.util.ArrayList;

public class Atendente {
    private Pessoa pessoa;
    private String cargo;
    private double salario;

    public Atendente(Pessoa pessoa, String cargo, double salario) {
        this.pessoa = pessoa;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Atendente() {

    }

    @Override
    public String toString() {
        return "Atendente{" +
                "pessoa=" + pessoa +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
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
