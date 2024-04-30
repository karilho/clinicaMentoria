package org.example;

import Services.PessoaService;
import servicos.Servicos;

public class Main {
    public static void main(String[] args) {
        PessoaService pessoaService = new PessoaService();
        Servicos servicos = new Servicos();

        servicos.cadastrarPessoas();
        pessoaService.cadastrarPessoa();
    }
}