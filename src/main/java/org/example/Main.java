package org.example;

import Services.PessoaService;
import servicos.Servicos;

public class Main {
    public static void main(String[] args) {
        PessoaService pessoaService = new PessoaService();

        pessoaService.cadastrarPessoa();
    }
}