package org.example.Entidades;

import java.time.LocalDate;

public class Pasciente extends Pessoa{

    private int telefoneDeContato;
    private String email;

    public Pasciente(String nome, LocalDate dataDeNascimento, int cpf, int rg, String genero, String nacionalidade, double peso, double altura, String estadoCivil, String etinia, int telefoneDeContato, String email) {
        super(nome, dataDeNascimento, cpf, rg, genero, nacionalidade, peso, altura, estadoCivil, etinia);
        this.telefoneDeContato = telefoneDeContato;
        this.email = email;
    }

    public int getTelefoneDeContato() {
        return telefoneDeContato;
    }

    public void setTelefoneDeContato(int telefoneDeContato) {
        this.telefoneDeContato = telefoneDeContato;
    }
}
