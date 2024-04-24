package Services;

import entidades.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class PessoaService {
    public Medico criarNovoMedico(){

        LocalDate dataDeNascimentoMedico1 = LocalDate.of(1988, 2, 1);

        ArrayList<Endereco> enderecoMedico1 = new ArrayList<>();
        Endereco endereco1 = new Endereco("MG", "Juiz de Fora", "Bairro de Lourdes", "Rua A", 326);
        enderecoMedico1.add(endereco1);

        ArrayList<String> certificacoes = new ArrayList<>();
        String certificoesMedico1 = new String("diploma de medicina ds UFJF, diploma de oncologia na residencia da UFRJ");
        certificacoes.add(certificoesMedico1);

        Medico medico1 = new Medico("Jose Aldo", 36, 'H', 181-123-567-13, "MG-19389", dataDeNascimentoMedico1, enderecoMedico1, 1.75, 80.5, "brasileiro", "Solteiro", "Negro", "Médico",3298845-1328, 3235-8819, "Oncologista", 40.000, certificacoes);


        return medico1;
    }
    public Paciente criarNovoPaciente(){

        LocalDate dataDeNascimentoPaciente1 = LocalDate.of(1988, 2, 1);

        ArrayList<Endereco> enderecoPaciente1 = new ArrayList<>();
        Endereco endereco1 = new Endereco("MG", "Juiz de Fora", "Bairro São Mateus", "Rua Claudio Honorio", 36);
        enderecoPaciente1.add(endereco1);

        Paciente paciente1 = new Paciente("Reginaldo Manzoti", 19, 'H', 198-245-886-14, "MG-936712", dataDeNascimentoPaciente1, enderecoPaciente1, 1.89, 75.0, "Brasileiro", "Casado", "Branco", "Jogador de basquete", 3298813-2928, 3235-9977, "reginaldoman@gmail.com", "Plano Unimed");

        return paciente1;
    }
    public Atendente criarNovoAtendente(){


        LocalDate dataDeNascimentoAtendente1 = LocalDate.of(1988, 2, 1);

        ArrayList<Endereco> enderecoAtendente1 = new ArrayList<>();
        Endereco endereco1 = new Endereco("MG", "Belo Horizonte", "Bairro Joseph Alves", "Rua Manoel de castanha", 901);
        enderecoAtendente1.add(endereco1);

        Atendente atendente1 = new Atendente("Aline Queiroz", 29, 'M', 198 - 295 - 838 - 80, "RJ-12423", dataDeNascimentoAtendente1, enderecoAtendente1, 1.60, 55.0, "Brasileira", "Solteira", "pardo", "Atendente de clinica médica", 3298856 - 7789, 3232 - 4578, "Atendente chefe", 3.500);


        return atendente1;
    }







}
