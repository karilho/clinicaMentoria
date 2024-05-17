package Services;
import entidades.*;

import java.io.IOException;
import java.util.Scanner;

public class criacaoService {

    public Pessoa criarPessoa() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome:");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade:");
        int idade = scanner.nextInt();

        System.out.println("Pessoa criada com sucesso!" + nome + " " + idade);

        return new Pessoa(nome, idade);
    }

    public Medico criarMedico(Pessoa pessoa) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual a especialidade do médico?");
        String especialidadeDoMedico = scanner.nextLine();

        System.out.print("Qual o valor da consulta do médico?");
        double valorDaConsulta = scanner.nextDouble();

        Medico medico = new Medico(pessoa, especialidadeDoMedico, valorDaConsulta);

        ArquivoTxtService arquivoTxtService = new ArquivoTxtService();
        arquivoTxtService.criarArquivoTxt("M", pessoa.getNome(), medico.toString());

        return medico;
    }

    public Paciente criarPaciente(Pessoa pessoa) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual a carteira de saúde do paciente?");
        String carteiraDeSaude = scanner.nextLine();

        System.out.print("Qual o valor da poupança do paciente?");
        Double poupanca = scanner.nextDouble();

        Paciente paciente = new Paciente(carteiraDeSaude, pessoa, poupanca);

        ArquivoTxtService arquivoTxtService = new ArquivoTxtService();
        arquivoTxtService.criarArquivoTxt("P", pessoa.getNome(), paciente.toString());

        return paciente;
    }
}