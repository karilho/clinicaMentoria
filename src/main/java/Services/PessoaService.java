package Services;

import entidades.*;

import java.time.LocalDate;
import java.util.Scanner;

public class PessoaService {
    Scanner scanner = new Scanner(System.in);
    public Medico criarNovoMedico() {

        System.out.println("Cadastro de Médico:");
        System.out.println("Digite o nome do médico:");
        String nome = scanner.next();
        System.out.println("Digite a idade do médico:");
        int idade = Integer.parseInt(scanner.next());
        System.out.println("Digite o gênero do médico:");
        char genero = scanner.next().charAt(0);
        System.out.println("Digite o CPF do médico:");
        int cpf = scanner.nextInt();
        System.out.println("Digite o RG do médico:");
        String rg = scanner.next();
        System.out.println("Digite a data de nascimento do médico:");
        LocalDate dataDeNascimento = LocalDate.parse(scanner.next());
        System.out.println("Digite a lista de endereços do médico:");
        String listaDeEnderecos = scanner.next();
        System.out.println("Digite a altura do médico:");
        double altura = Double.parseDouble(scanner.next());
        System.out.println("Digite o peso do médico:");
        double peso = Double.parseDouble(scanner.next());
        System.out.println("Digite a nacionalidade do médico:");
        String nacionalidade = scanner.next();
        System.out.println("Digite o estado civil do médico:");
        String estadoCivil = scanner.next();
        System.out.println("Digite a etnia do médico:");
        String etnia = scanner.next();
        System.out.println("Digite a profissão do médico:");
        String profissao = scanner.next();
        System.out.println("Digite o número de celular do médico:");
        String numeroCelular = scanner.next();
        System.out.println("Digite o número de telefone fixo do médico:");
        String numeroTelefoneFixo = scanner.next();
        System.out.println("Digite a especialidade do médico:");
        String especialidade = scanner.next();
        System.out.println("Digite o salário do médico:");
        double salario = Double.parseDouble(scanner.next());
        System.out.println("Digite os certificados do médico:");
        String certificados = scanner.next();

        return new Medico(nome, idade, genero, cpf, rg, dataDeNascimento, listaDeEnderecos, altura, peso, nacionalidade, estadoCivil, etnia, profissao, numeroCelular, numeroTelefoneFixo, especialidade, salario, certificados);
    }
    public Atendente criarNovoAtendente(){

        System.out.println("Por favor, insira as informações do atendente:");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        System.out.print("Gênero: ");
        char genero = scanner.next().charAt(0);
        System.out.print("CPF: ");
        int cpf = scanner.nextInt();
        System.out.print("RG: ");
        String rg = scanner.nextLine();
        System.out.print("Data de Nascimento (DD/MM/AAAA): ");
        LocalDate dataDeNascimento = LocalDate.parse(scanner.next());
        System.out.print("Lista de Endereços (separados por vírgula): ");
        String[] listaDeEnderecos = scanner.nextLine().split(",");
        System.out.print("Altura (em metros): ");
        double altura = scanner.nextDouble();
        System.out.print("Peso: ");
        double peso = scanner.nextDouble();
        System.out.print("Nacionalidade: ");
        String nacionalidade = scanner.nextLine();
        System.out.print("Estado Civil: ");
        String estadoCivil = scanner.nextLine();
        System.out.print("Etnia: ");
        String etnia = scanner.nextLine();
        System.out.print("Profissão: ");
        String profissao = scanner.nextLine();
        System.out.print("Número de Celular: ");
        String numeroCelular = scanner.nextLine();
        System.out.print("Número de Telefone Fixo: ");
        String numeroTelefoneFixo = scanner.nextLine();
        System.out.print("Cargo: ");
        String cargo = scanner.nextLine();
        System.out.print("Salário: ");
        double salario = scanner.nextDouble();

        return new Atendente(nome, idade, genero, cpf, rg, dataDeNascimento,listaDeEnderecos, altura, peso, nacionalidade, estadoCivil, etnia, profissao, numeroCelular, numeroTelefoneFixo, cargo, salario);
    }
    public Paciente criarNovoPaciente(){

        System.out.println("Por favor, insira as informações do paciente:");
        System.out.print("Nome: ");
        String nomePaciente = scanner.nextLine();
        System.out.print("Idade: ");
        int idadePaciente = Integer.parseInt(scanner.nextLine());
        System.out.print("Gênero: ");
        char genero = scanner.next().charAt(0);
        System.out.print("CPF: ");
        int cpf = scanner.nextInt();
        System.out.print("RG: ");
        String rgPaciente = scanner.nextLine();
        System.out.print("Data de Nascimento (DD/MM/AAAA): ");
        LocalDate dataDeNascimento = LocalDate.parse(scanner.next());
        System.out.print("Lista de Endereços (separados por vírgula): ");
        String[] listaDeEnderecos = scanner.nextLine().split(",");
        System.out.print("Altura (em metros): ");
        double alturaPaciente = Double.parseDouble(scanner.nextLine());
        System.out.print("Peso: ");
        double pesoPaciente = Double.parseDouble(scanner.nextLine());
        System.out.print("Nacionalidade: ");
        String nacionalidadePaciente = scanner.nextLine();
        System.out.print("Estado Civil: ");
        String estadoCivilPaciente = scanner.nextLine();
        System.out.print("Etnia: ");
        String etniaPaciente = scanner.nextLine();
        System.out.print("Profissão: ");
        String profissaoPaciente = scanner.nextLine();
        System.out.print("Número de Celular: ");
        String numeroCelularPaciente = scanner.nextLine();
        System.out.print("Número de Telefone Fixo: ");
        String numeroTelefoneFixoPaciente = scanner.nextLine();
        System.out.print("Email: ");
        String emailPaciente = scanner.nextLine();
        System.out.print("Carteira de Saúde: ");
        String carteiraDeSaudePaciente = scanner.nextLine();

        return new Paciente(nomePaciente, idadePaciente, genero, cpf, rgPaciente, dataDeNascimento, listaDeEnderecos, alturaPaciente, pesoPaciente, nacionalidadePaciente, estadoCivilPaciente, etniaPaciente, profissaoPaciente, numeroCelularPaciente, numeroTelefoneFixoPaciente, emailPaciente, carteiraDeSaudePaciente);
    }

    public void escolhaOpcoes(){
        Scanner scanner = new Scanner(System.in);
        PessoaService pessoaService = new PessoaService();
        pessoaService.criarNovoAtendente();

        System.out.println("Escolha o tipo de pessoa que deseja criar:");
        System.out.println("1 - Atendente");
        System.out.println("2 - Médico");
        System.out.println("3 - Paciente");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            Atendente atendente1 = pessoaService.criarNovoAtendente();
            System.out.println("Novo atendente criado: " + atendente1);
        }if (opcao == 2) {
            Medico novoMedico = PessoaService.criarNovoMedico(scanner);
            System.out.println("Novo médico criado: " + novoMedico);
        }if (opcao == 3) {
            Paciente novoPaciente = PessoaService.criarNovoPaciente(scanner);
            System.out.println("Novo paciente criado: " + novoPaciente);
        }else {
            System.out.println("Opção inválida.");
        }

    }

}
