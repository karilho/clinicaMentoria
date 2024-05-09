package Services;
import entidades.*;

import java.util.Scanner;

public class criacaoService {

    public Pessoa criarPessoa() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome:");
        String nome = scanner.next();

        System.out.println("Digite a idade:");
        int idade = scanner.nextInt();

        scanner.close();
        System.out.println("Pessoa criada com sucesso!" + nome + " " + idade);
        return new Pessoa(nome, idade);
    }


    public Medico criarMedico(Pessoa pessoa) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual a especialidade do médico?");

        String especialidadeDoMedico = scanner.nextLine();

        System.out.println("Qual o valor da consulta do médico?");
        double valorDaConsulta = scanner.nextDouble();

        Medico medico = new Medico(pessoa, especialidadeDoMedico, valorDaConsulta);

        scanner.close();

        return medico;
    }

    public Paciente criarPaciente(Pessoa pessoa) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a carteira de saúde do paciente?");
        String carteiraDeSaude = scanner.next();

        System.out.println("Qual o valor da poupança do paciente?");
        Double poupanca = scanner.nextDouble();

        Paciente paciente = new Paciente(carteiraDeSaude, pessoa, poupanca);
        paciente.setPessoa(pessoa);

        scanner.close();

        return paciente;
    }

}