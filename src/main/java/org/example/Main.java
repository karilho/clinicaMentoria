package org.example;

import Services.ArquivoTxtService;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ArquivoTxtService arquivo = new ArquivoTxtService();
        arquivo.criarArquivoTxt();
    }
}