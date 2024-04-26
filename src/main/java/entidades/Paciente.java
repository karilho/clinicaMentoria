package entidades;

import java.time.LocalDate;

public class Paciente extends Pessoa {
    private String carteiraDeSaude;
    private String email;

    public Paciente(String nome, int idade, char genero, long cpf, String rg, LocalDate dataDeNascimento, String[] listaDeEnderecos, double altura, double peso, String nacionalidade, String estadoCivil, String etnia, String profissao, String numeroCelular, String numeroTelefoneFixo, String email, String carteiraDeSaude) {
        super(nome, idade, genero, cpf, rg, dataDeNascimento, listaDeEnderecos, altura, peso, nacionalidade, estadoCivil, etnia, profissao, numeroCelular, numeroTelefoneFixo);
        this.email = email;
        this.carteiraDeSaude = carteiraDeSaude;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "carteiraDeSaude='" + carteiraDeSaude + '\'' +
                ", email='" + email + '\'' +
                '}';
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