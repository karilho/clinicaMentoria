package entidades;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private int idade;
    private char genero;
    private long cpf;
    private String rg;
    private LocalDate dataDeNascimento;
    private ArrayList<Endereco> listaDeEnderecos;
    private double altura;
    private double peso;
    private String nacionalidade;
    private String estadoCivil;
    private String etnia;
    private String profissao;
    private long numeroCelular;
    private long numeroTelefoneFixo;

    public Pessoa(String nome, int idade, char genero, long cpf, String rg, LocalDate dataDeNascimento, ArrayList<Endereco> listaDeEnderecos, double altura, double peso, String nacionalidade, String estadoCivil, String etnia, String profissao, long numeroCelular, long numeroTelefoneFixo) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.cpf = cpf;
        this.rg = rg;
        this.dataDeNascimento = dataDeNascimento;
        this.listaDeEnderecos = listaDeEnderecos;
        this.altura = altura;
        this.peso = peso;
        this.nacionalidade = nacionalidade;
        this.estadoCivil = estadoCivil;
        this.etnia = etnia;
        this.profissao = profissao;
        this.numeroCelular = numeroCelular;
        this.numeroTelefoneFixo = numeroTelefoneFixo;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", genero=" + genero +
                ", cpf=" + cpf +
                ", rg='" + rg + '\'' +
                ", dataDeNascimento=" + dataDeNascimento +
                ", listaDeEnderecos=" + listaDeEnderecos +
                ", altura=" + altura +
                ", peso=" + peso +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", etnia='" + etnia + '\'' +
                ", profissao='" + profissao + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public ArrayList<Endereco> getListaDeEnderecos() {
        return listaDeEnderecos;
    }

    public void setListaDeEnderecos(ArrayList<Endereco> listaDeEnderecos) {
        this.listaDeEnderecos = listaDeEnderecos;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getEtnia() {
        return etnia;
    }

    public void setEtnia(String etnia) {
        this.etnia = etnia;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public long getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(long numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public long getNumeroTelefoneFixo() {
        return numeroTelefoneFixo;
    }

    public void setNumeroTelefoneFixo(long numeroTelefoneFixo) {
        this.numeroTelefoneFixo = numeroTelefoneFixo;
    }
}
