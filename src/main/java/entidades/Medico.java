package entidades;

public class Medico {
    private Pessoa pessoa;
    private String especialidade;
    private double valorDaConsulta;

    public Medico(Pessoa pessoa, String especialidade, double valorDaConsulta) {
        this.pessoa = pessoa;
        this.especialidade = especialidade;
        this.valorDaConsulta = valorDaConsulta;
    }

    public Medico() {

    }

    @Override
    public String toString() {
        return "Medico{" +
                "pessoa=" + pessoa +
                ", especialidade='" + especialidade + '\'' +
                ", salario=" + valorDaConsulta +
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

    public double getValorDaConsulta() {
        return valorDaConsulta;
    }

    public void setValorDaConsulta(double valorDaConsulta) {
        this.valorDaConsulta = valorDaConsulta;
    }
}