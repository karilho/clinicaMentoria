package org.example;

import Services.AgendarConsulta;
import Services.ArquivoTxtService;
import Services.MenuPrincipal;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //ArquivoTxtService arquivo = new ArquivoTxtService();
        //arquivo.criarArquivoTxt();

        MenuPrincipal menu = new MenuPrincipal();
        menu.iniciarOSistemaDeCadastro();

    }
}