package entidades;

public class Paciente {
    private Pessoa pessoa;
    private String carteiraDeSaude;
    private Double poupanca;



    public Paciente(String carteiraDeSaude, Pessoa pessoa, Double poupanca) {
        this.pessoa = pessoa;
        this.carteiraDeSaude = carteiraDeSaude;
        this.poupanca = poupanca;
    }

    public Paciente() {
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "pessoa=" + pessoa +
                ", carteiraDeSaude='" + carteiraDeSaude + '\'' +
                ", poupanca=" + poupanca +
                '}';
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getCarteiraDeSaude() {
        return carteiraDeSaude;
    }

    public void setCarteiraDeSaude(String carteiraDeSaude) {
        this.carteiraDeSaude = carteiraDeSaude;
    }

    public Double getPoupanca() {
        return poupanca;
    }

    public void setPoupanca(Double poupanca) {
        this.poupanca = poupanca;
    }
}