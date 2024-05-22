package Services;
import entidades.*;

import java.util.Scanner;

public class criacaoService {

    public Pessoa criarPessoa(Scanner scanner) {

        System.out.print("Digite o nome:");
        String nome = scanner.next();

        System.out.print("Digite a idade:");
        int idade = scanner.nextInt();

        System.out.println("Pessoa criada com sucesso!    " + nome + "     " + idade);

        return new Pessoa(nome, idade);

    }


    public Medico criarMedico(Pessoa pessoa, Scanner scanner) {

        System.out.print("Qual a especialidade do médico?");

        String especialidadeDoMedico = scanner.next();

        System.out.print("Qual o valor da consulta do médico?");

        double valorDaConsulta = scanner.nextDouble();

        Medico medico = new Medico(pessoa, especialidadeDoMedico, valorDaConsulta);
        medico.setPessoa(pessoa);

        return medico;
    }

    public Paciente criarPaciente(Pessoa pessoa, Scanner scanner) {

        System.out.print("Qual a carteira de saúde do paciente?");
        String carteiraDeSaude = scanner.next();

        System.out.print("Qual o valor da poupança do paciente?");
        Double poupanca = scanner.nextDouble();

        Paciente paciente = new Paciente(carteiraDeSaude, pessoa, poupanca);
        paciente.setPessoa(pessoa);

        return paciente;
    }

}