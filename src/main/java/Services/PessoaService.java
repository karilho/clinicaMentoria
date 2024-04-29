package Services;
import entidades.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class PessoaService {

    public void cadastrarPessoa() {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Endereco> listaDeEnderecos = new ArrayList<>();

        System.out.println("Digite o nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade:");
        int idade = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite o gênero (M/F):");
        char genero = scanner.nextLine().charAt(0);

        System.out.println("Digite o CPF:");
        long cpf = Long.parseLong(scanner.nextLine());

        System.out.println("Digite o RG:");
        String rg = scanner.nextLine();

        System.out.println("Digite a data de nascimento (no formato AAAA-MM-DD):");
        LocalDate dataDeNascimento = LocalDate.parse(scanner.nextLine());

        System.out.println("Digite a altura:");
        double altura = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite o peso:");
        double peso = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite a nacionalidade:");
        String nacionalidade = scanner.nextLine();

        System.out.println("Digite o estado civil:");
        String estadoCivil = scanner.nextLine();

        System.out.println("Digite a etnia:");
        String etnia = scanner.nextLine();

        System.out.println("Digite a profissão:");
        String profissao = scanner.nextLine();

        System.out.println("Digite o número de celular:");
        long numeroCelular = Long.parseLong(scanner.nextLine());

        System.out.println("Digite o número de telefone fixo:");
        long numeroTelefoneFixo = Long.parseLong(scanner.nextLine());


        Pessoa pessoaNumero1 = new Pessoa(nome, idade, genero, cpf, rg, dataDeNascimento, listaDeEnderecos, altura, peso,
                nacionalidade, estadoCivil, etnia, profissao, numeroCelular, numeroTelefoneFixo);

        System.out.println("Que tipo de pessoa você deseja cadastrar? (médico/atendente/paciente)");
        String tipoDePessoa = scanner.next();
        if (tipoDePessoa.equalsIgnoreCase("médico")){
            System.out.println("Qual o salário do médico? ");
              double salarioDoMedico = scanner.nextDouble();
             ArrayList<String> certificacoes = new ArrayList<>();
            System.out.println("Qual a especialidade do médico? ");
            String especialidadeDoMedico = scanner.next();
              System.out.println("Digite as certificações (digite 'fim' para parar):");
            String certificacao;
            while (!(certificacao = scanner.nextLine()).equalsIgnoreCase("fim")) {
             certificacoes.add(certificacao);

             Medico medico1 = new Medico(pessoaNumero1, especialidadeDoMedico, salarioDoMedico, certificacoes);
             medico1.setPessoa(pessoaNumero1);

             System.out.println(medico1);
            }
            if (tipoDePessoa.equalsIgnoreCase("atendente")){
                System.out.println("Qual o cargo do atendente?");
                String cargoDoAtendente = scanner.next();
                System.out.println("Qual o salário do atendente? ");
                double salarioDoAtendente = scanner.nextDouble();

                Atendente atendente1 = new Atendente(pessoaNumero1, cargoDoAtendente, salarioDoAtendente);
                atendente1.setPessoa(pessoaNumero1);

                System.out.println(atendente1);
            }
            if (tipoDePessoa.equalsIgnoreCase("paciente")){
                System.out.println("Qual a carteira de saúde do paciente?");
                String carteiraDeSaude = scanner.next();
                System.out.println("Qual o email do paciente?");
                String emailDoPaciente = scanner.next();

                Paciente paciente1 = new Paciente(pessoaNumero1, carteiraDeSaude, emailDoPaciente);
                paciente1.setPessoa(pessoaNumero1);

                System.out.println(paciente1);
            }
        }

    }
}