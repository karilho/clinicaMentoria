package entidades;

import java.util.ArrayList;

public class Atendente {
    private Pessoa pessoa;
    private ArrayList<Consulta> agenda;
    private String cargo;
    private double salario;

    public Atendente(Pessoa pessoa, ArrayList<Consulta> agenda, String cargo, double salario) {
        this.pessoa = pessoa;
        this.agenda = agenda;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Atendente() {

    }

    @Override
    public String toString() {
        return "Atendente{" +
                "pessoa=" + pessoa +
                ", agenda=" + agenda +
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
