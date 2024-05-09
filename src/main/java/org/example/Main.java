package org.example;

import Services.AgendarConsulta;

public class Main {
    public static void main(String[] args) {
        ArquivoTxtService arquivo = new ArquivoTxtService();

        arquivo.criarArquivoTxt();

        AgendarConsulta agendarConsulta = new AgendarConsulta();

        agendarConsulta.agendarAConsulta();
     
    }
}