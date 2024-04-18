package entidades;

import java.time.LocalDate;
import java.util.ArrayList;

public class Paciente extends Pessoa {
    private String carteiraDeSaude;
    private int telefone;
    private String email;

    public Paciente(String nome, int idade, char genero, int cpf, String rg, LocalDate dataDeNascimento, ArrayList<Endereco> listaDeEnderecos, double altura, double peso, String nacionalidade, String estadoCivil, String etnia, String profissao, int telefone, String email, String carteiraDeSaude) {
        super(nome, idade, genero, cpf, rg, dataDeNascimento, listaDeEnderecos, altura, peso, nacionalidade, estadoCivil, etnia, profissao);
        this.telefone = telefone;
        this.email = email;
        this.carteiraDeSaude = carteiraDeSaude;
    }

    public String getCarteiraDeSaude() {
        return carteiraDeSaude;
    }

    public void setCarteiraDeSaude(String carteiraDeSaude) {
        this.carteiraDeSaude = carteiraDeSaude;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}