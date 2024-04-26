package entidades;

public class Paciente {
    private Pessoa pessoa;
    private String carteiraDeSaude;
    private String email;

    public Paciente(Pessoa pessoa, String carteiraDeSaude, String email) {
        this.pessoa = pessoa;
        this.carteiraDeSaude = carteiraDeSaude;
        this.email = email;
    }

    public Paciente() {

    }

    @Override
    public String toString() {
        return "Paciente{" +
                "pessoa=" + pessoa +
                ", carteiraDeSaude='" + carteiraDeSaude + '\'' +
                ", email='" + email + '\'' +
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}