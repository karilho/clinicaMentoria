package org.example.Entidades;

import java.time.LocalDate;
import java.util.List;

public class Pessoa {

    private List<Enderecos> enderecos;
    private String nome;
    private LocalDate dataDeNascimento;
    private int cpf;
    private int rg;
    private String genero;
    private String nacionalidade;
    private double peso;
    private double altura;
    private String estadoCivil;
    private String etinia;

    public Pessoa(String nome, LocalDate dataDeNascimento, int cpf, int rg, String genero, String nacionalidade, double peso, double altura, String estadoCivil, String etinia) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.cpf = cpf;
        this.rg = rg;
        this.genero = genero;
        this.nacionalidade = nacionalidade;
        this.peso = peso;
        this.altura = altura;
        this.estadoCivil = estadoCivil;
        this.etinia = etinia;

    }

    public List<Enderecos> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Enderecos> enderecos) {
        this.enderecos = enderecos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getEtinia() {
        return etinia;
    }

    public void setEtinia(String etinia) {
        this.etinia = etinia;
    }
}
