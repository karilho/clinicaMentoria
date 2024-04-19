package org.example.Entidades;

import java.time.LocalDate;
import java.util.List;

public class Paciente extends Pessoa {

    private long telefoneCelular;
    private long telefoneFixo;

    public Paciente(String nome, LocalDate dataDeNascimento, int cpf, int rg, String genero, String nacionalidade, double peso, double altura, String estadoCivil, String etinia, String email, List<Enderecos> listaDeEnderecos, long telefoneCelular, long telefoneFixo) {
        super(nome, dataDeNascimento, cpf, rg, genero, nacionalidade, peso, altura, estadoCivil, etinia, email, listaDeEnderecos);
        this.telefoneCelular = telefoneFixo;
        this.telefoneFixo = telefoneFixo;
    }

    public long getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(long telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    public long getTelefoneFixo() {
        return telefoneFixo;
    }

    public void setTelefoneFixo(long telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
    }
}