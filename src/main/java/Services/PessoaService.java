package Services;
import entidades.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

public class PessoaService {
    public Pessoa criarPessoa() {
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

        return new Pessoa(nome, idade, genero, cpf, rg, dataDeNascimento, listaDeEnderecos, altura, peso,
                nacionalidade, estadoCivil, etnia, profissao, numeroCelular, numeroTelefoneFixo);
    }
    public Medico criarMedico(Pessoa pessoa) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o salário do médico?");
        double salarioDoMedico = scanner.nextDouble();
        ArrayList<String> certificacoes = new ArrayList<>();

        System.out.println("Qual a especialidade do médico?");
        String especialidadeDoMedico = scanner.next();

        String certificacao;
        System.out.println("Digite as certificações (digite 'fim' para parar):");
        while (!(certificacao = scanner.nextLine()).equalsIgnoreCase("fim")) {
            certificacoes.add(certificacao);
        }
        Medico medico = new Medico(pessoa, especialidadeDoMedico, salarioDoMedico, certificacoes);
        medico.setPessoa(pessoa);

        return medico;
    }

    public Atendente criarAtendente(Pessoa pessoa) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o cargo do atendente?");
        String cargoDoAtendente = scanner.nextLine();

        System.out.println("Qual o salário do atendente?");
        double salarioDoAtendente = scanner.nextDouble();

        Atendente atendente = new Atendente(pessoa, cargoDoAtendente, salarioDoAtendente);
        atendente.setPessoa(pessoa);

        return atendente;
    }

    public Paciente criarPaciente(Pessoa pessoa) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a carteira de saúde do paciente?");
        String carteiraDeSaude = scanner.nextLine();

        System.out.println("Qual o email do paciente?");
        String emailDoPaciente = scanner.nextLine();

        Paciente paciente = new Paciente(pessoa, carteiraDeSaude, emailDoPaciente);
        paciente.setPessoa(pessoa);

        return paciente;
    }
    public void cadastrarPessoa() {
        Scanner scanner = new Scanner(System.in);

        Pessoa pessoa = criarPessoa();

        System.out.println("Que tipo de pessoa você deseja cadastrar? (médico/atendente/paciente)");
        String tipoDePessoa = scanner.next();

        if (tipoDePessoa.equalsIgnoreCase("médico")) {
            Medico medico = criarMedico(pessoa);
            System.out.println(medico);
        } else if (tipoDePessoa.equalsIgnoreCase("atendente")) {
            Atendente atendente = criarAtendente(pessoa);
            System.out.println(atendente);
        } else if (tipoDePessoa.equalsIgnoreCase("paciente")) {
            Paciente paciente = criarPaciente(pessoa);
            System.out.println(paciente);
        }
    }
}