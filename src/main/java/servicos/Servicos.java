package servicos;

import entidades.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;

public class Servicos {
    public void cadastrarPessoas() {
        LocalDate dataDeNascimentoPaciente1 = LocalDate.of(1934, Month.MARCH, 22);
        ArrayList<Endereco> listaDoEnderecoPaciente1 = new ArrayList<>();
        ArrayList<Endereco> listaDoEnderecoPaciente2 = new ArrayList<>();
        ArrayList<Endereco> listaDoEnderecoPaciente3 = new ArrayList<>();
        Endereco enderecopaciente3 = new Endereco("Estado: Minas Gerais ", "Cidade: Belo Horizonte ", "Bairro: Savassi ", "Rua: Rua Pernambuco ", 13);
        Endereco enderecopaciente1 = new Endereco("Estado: São Paulo ", "Cidade: São Paulo ", "Bairro: Jardim Paulista ", "Rua: Avenida Paulista ", 1000);
        Endereco enderecopaciente2 = new Endereco("Estado: Rio de Janeiro ", "Cidade: Rio de Janeiro ", "Bairro: Copacabana ", "Rua: Avenida Atlântica ", 1702);


        listaDoEnderecoPaciente1.add(enderecopaciente1);
        listaDoEnderecoPaciente2.add(enderecopaciente2);
        listaDoEnderecoPaciente3.add(enderecopaciente3);


        Pessoa pessoapaciente1 = new Pessoa("Icaro", 18, 'M', 1544834462, "MG-091.013", dataDeNascimentoPaciente1,listaDoEnderecoPaciente1, 1.43, 49.7, "Brasil", "Solteiro", "Branco", "Traficante", 99649412, 32244400);
        Paciente paciente1 = new Paciente();
        paciente1.setPessoa(pessoapaciente1);
        paciente1.setEmail("icarodazini7@gmail.com");
        paciente1.setCarteiraDeSaude("unimed Facil");
        System.out.println("Paciente1: " + paciente1.getPessoa().getNome() + ", idade=" + paciente1.getPessoa().getIdade() + ", genero=" + paciente1.getPessoa().getGenero() + ", cpf=" + paciente1.getPessoa().getCpf() + ", rg=" + paciente1.getPessoa().getRg() + ", data de nascimento=" + paciente1.getPessoa().getDataDeNascimento() + ", endereços=" + paciente1.getPessoa().getListaDeEnderecos() + ", altura=" + paciente1.getPessoa().getAltura() + ", peso=" + paciente1.getPessoa().getPeso() + ", nacionalidade=" + paciente1.getPessoa().getNacionalidade() + ", estado civil=" + paciente1.getPessoa().getEstadoCivil() + ", etnia=" + paciente1.getPessoa().getEtnia() + ", profissao=" + paciente1.getPessoa().getProfissao() + ", numero de celular=" + paciente1.getPessoa().getNumeroCelular() + ", numero de telefone fixo=" + paciente1.getPessoa().getNumeroTelefoneFixo() + ", email=" + paciente1.getEmail() + ", Carteira De Saude=" + paciente1.getCarteiraDeSaude());

        LocalDate dataDeNascimentoPaciente2 = LocalDate.of(1994, Month.MARCH, 22);
        Pessoa pessoapaciente2 = new Pessoa("Lucas", 67, 'M', 1346890032, "RJ-043.023", dataDeNascimentoPaciente2, listaDoEnderecoPaciente2, 1.87, 90.7, "Chile", "Noivo", "Branco", "Jovem aprendiz", 99870943, 32265840);
        Paciente paciente2 = new Paciente();
        paciente2.setPessoa(pessoapaciente2);
        paciente2.setEmail("luansouzao@gmail.com");
        paciente2.setCarteiraDeSaude("unimed Complicada");
        System.out.println("Paciente2: " + paciente2.getPessoa().getNome() + ", idade=" + paciente2.getPessoa().getIdade() + ", genero=" + paciente2.getPessoa().getGenero() + ", cpf=" + paciente2.getPessoa().getCpf() + ", rg=" + paciente2.getPessoa().getRg() + ", data de nascimento=" + paciente2.getPessoa().getDataDeNascimento() + ", endereços=" + paciente2.getPessoa().getListaDeEnderecos() + ", altura=" + paciente2.getPessoa().getAltura() + ", peso=" + paciente2.getPessoa().getPeso() + ", nacionalidade=" + paciente2.getPessoa().getNacionalidade() + ", estado civil=" + paciente2.getPessoa().getEstadoCivil() + ", etnia=" + paciente2.getPessoa().getEtnia() + ", profissao=" + paciente2.getPessoa().getProfissao() + ", numero de celular=" + paciente2.getPessoa().getNumeroCelular() + ", numero de telefone fixo=" + paciente2.getPessoa().getNumeroTelefoneFixo() + ", email=" + paciente2.getEmail() + ", Carteira De Saude=" + paciente2.getCarteiraDeSaude());

        LocalDate dataDeNascimentoPaciente3 = LocalDate.of(1984, Month.MARCH, 22);
        Pessoa pessoapaciente3 = new Pessoa("pedro", 28, 'M', 1234685434, "MG-098.045", dataDeNascimentoPaciente3, listaDoEnderecoPaciente3, 1.69, 32.2, "França", "Casado", "Branco", "Programador", 99876123, 32248875);
        Paciente paciente3 = new Paciente();
        paciente3.setPessoa(pessoapaciente3);
        paciente3.setEmail("lucascarrilho@gmail.com");
        paciente3.setCarteiraDeSaude("unimed Dificil");
        System.out.println("Paciente3: " + paciente3.getPessoa().getNome() + ", idade=" + paciente3.getPessoa().getIdade() + ", genero=" + paciente3.getPessoa().getGenero() + ", cpf=" + paciente3.getPessoa().getCpf() + ", rg=" + paciente3.getPessoa().getRg() + ", data de nascimento=" + paciente3.getPessoa().getDataDeNascimento() + ", endereços=" + paciente3.getPessoa().getListaDeEnderecos() + ", altura=" + paciente3.getPessoa().getAltura() + ", peso=" + paciente3.getPessoa().getPeso() + ", nacionalidade=" + paciente3.getPessoa().getNacionalidade() + ", estado civil=" + paciente3.getPessoa().getEstadoCivil() + ", etnia=" + paciente3.getPessoa().getEtnia() + ", profissao=" + paciente3.getPessoa().getProfissao() + ", numero de celular=" + paciente3.getPessoa().getNumeroCelular() + ", numero de telefone fixo=" + paciente3.getPessoa().getNumeroTelefoneFixo() + ", email=" + paciente3.getEmail() + ", Carteira De Saude=" + paciente3.getCarteiraDeSaude());

        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        LocalDate dataDeNascimentoMedico1 = LocalDate.of(1984, Month.MARCH, 22);
        Endereco endereco0Medico1 = new Endereco("Estado: Rio Grande do Sul ", "Cidade: Porto Alegre ", "Bairro: Moinhos de Vento ", "Rua: Rua Padre Chagas ", 814);
        Endereco endereco1Medico1 = new Endereco("Estado: Bahia ", "Cidade: Salvador ", "Bairro: Barra ", "Rua: Avenida Oceânica ", 376);
        Medico medico1 = new Medico();
        ArrayList<String> certificacoesMedico1 = new ArrayList<>();
        certificacoesMedico1.add("Certificado 1");
        ArrayList<Endereco> listaDoEnderecoMedico1 = new ArrayList<>();
        listaDoEnderecoMedico1.add(endereco0Medico1);
        listaDoEnderecoMedico1.add(endereco1Medico1);
        Pessoa pessoaMedico1 = new Pessoa("Luiza", 20, 'F', 1544834462, "MG-091.013", dataDeNascimentoMedico1, listaDoEnderecoMedico1, 1.43, 49.7, "Brasil", "Solteiro", "Branco", "Traficante", 99649412, 32244400);
        medico1.setPessoa(pessoaMedico1);
        medico1.setEspecialidade("Implante De Orgons");
        medico1.setSalario(5000.00);
        medico1.setCertificacoes(certificacoesMedico1);
        System.out.println("Medico1: " + medico1.getPessoa().getNome() + ", idade=" + medico1.getPessoa().getIdade() + ", genero=" + medico1.getPessoa().getGenero() + ", cpf=" + medico1.getPessoa().getCpf() + ", rg=" + medico1.getPessoa().getRg() + ", data de nascimento=" + medico1.getPessoa().getDataDeNascimento() + ", endereços=" + medico1.getPessoa().getListaDeEnderecos() + ", altura=" + medico1.getPessoa().getAltura() + ", peso=" + medico1.getPessoa().getPeso() + ", nacionalidade=" + medico1.getPessoa().getNacionalidade() + ", estado civil=" + medico1.getPessoa().getEstadoCivil() + ", etnia=" + medico1.getPessoa().getEtnia() + ", profissao=" + medico1.getPessoa().getProfissao() + ", numero de celular=" + medico1.getPessoa().getNumeroCelular() + ", numero de telefone fixo=" + medico1.getPessoa().getNumeroTelefoneFixo() + ", especialidades=" + medico1.getEspecialidade() + ", certificaçoes=" + medico1.getCertificacoes() + ", salario=" + medico1.getSalario());

        LocalDate dataDeNascimentoMedico2 = LocalDate.of(1984, Month.MARCH, 22);
        Endereco endereco0Medico2 = new Endereco("Estado: Paraná ", "Cidade: Curitiba ", "Bairro: Batel ", "Rua: Alameda Dr. Carlos de Carvalho ", 777);
        Endereco endereco1Medico2 = new Endereco("Estado: Ceará ", "Cidade: Fortaleza ", "Bairro: Meireles ", "Rua: Avenida Beira Mar ", 250);
        Medico medico2 = new Medico();
        ArrayList<String> certificacoesMedico2 = new ArrayList<>();
        certificacoesMedico2.add("Certificado 2");
        ArrayList<Endereco> listaDoEnderecoMedico2 = new ArrayList<>();
        listaDoEnderecoMedico2.add(endereco0Medico2);
        listaDoEnderecoMedico2.add(endereco1Medico2);
        Pessoa pessoaMedico2 = new Pessoa("Luiza", 20, 'F', 1544834462, "MG-091.013", dataDeNascimentoMedico2, listaDoEnderecoMedico2, 1.43, 49.7, "Brasil", "Solteiro", "Branco", "Traficante", 99649412, 32244400);
        medico2.setPessoa(pessoaMedico2);
        medico2.setEspecialidade("Implante De Orgons");
        medico2.setSalario(9800.00);
        medico2.setCertificacoes(certificacoesMedico2);
        System.out.println("Medico2: " + medico2.getPessoa().getNome() + ", idade=" + medico2.getPessoa().getIdade() + ", genero=" + medico2.getPessoa().getGenero() + ", cpf=" + medico2.getPessoa().getCpf() + ", rg=" + medico2.getPessoa().getRg() + ", data de nascimento=" + medico2.getPessoa().getDataDeNascimento() + ", endereços=" + medico2.getPessoa().getListaDeEnderecos() + ", altura=" + medico2.getPessoa().getAltura() + ", peso=" + medico2.getPessoa().getPeso() + ", nacionalidade=" + medico2.getPessoa().getNacionalidade() + ", estado civil=" + medico2.getPessoa().getEstadoCivil() + ", etnia=" + medico2.getPessoa().getEtnia() + ", profissao=" + medico2.getPessoa().getProfissao() + ", numero de celular=" + medico2.getPessoa().getNumeroCelular() + ", numero de telefone fixo=" + medico2.getPessoa().getNumeroTelefoneFixo() + ", especialidades=" + medico2.getEspecialidade() + ", certificaçoes=" + medico2.getCertificacoes() + ", salario=" + medico2.getSalario());

        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        LocalDate dataDeNascimentoAtendente1 = LocalDate.of(1994, Month.MAY, 17);
        LocalDateTime dataDaAgendaAtendente1 = LocalDateTime.of(2024, Month.JUNE, 7, 12, 30);
        Endereco enderecoAtendente1 = new Endereco("Estado: Pernambuco ", "Cidade: Recife ", "Bairro: Boa Viagem", "Rua: Avenida Boa Viagem ", 809);
        Pessoa pessoaAtendente1 = new Pessoa("Italo", 34, 'M', 654789098, "RJ-743.651", dataDeNascimentoAtendente1, listaDoEnderecoMedico1, 1.96, 94.0, "Brasil", "Noivo", "Negro", "Engenheiro Civil", 99765456, 32245567);
        Atendente atendente1 = new Atendente();
        Consulta consultaAtendente1 = new Consulta(atendente1, dataDaAgendaAtendente1, medico1, paciente3, "Consulta pediatrica", "a caminho", 750.0, "inchaço no pancreas", "Tomar 1 comprimido por dia de timacrofilade");
        ArrayList<Endereco> listaEnderecoAtendente1 = new ArrayList<>();
        ArrayList<Consulta> agendaAtendente1 = new ArrayList<>();
        agendaAtendente1.add(consultaAtendente1);
        listaEnderecoAtendente1.add(enderecoAtendente1);
        atendente1.setPessoa(pessoaAtendente1);
        atendente1.setSalario(3500.00);
        atendente1.setAgenda(agendaAtendente1);
        atendente1.setCargo("Otorrinolaringologista");
        System.out.println("Atendente1: " + atendente1.getPessoa().getNome() + ", idade=" + atendente1.getPessoa().getIdade() + ", genero=" + atendente1.getPessoa().getGenero() + ", cpf=" + atendente1.getPessoa().getCpf() + ", rg=" + atendente1.getPessoa().getRg() + ", data de nascimento=" + atendente1.getPessoa().getDataDeNascimento() + ", endereços=" + atendente1.getPessoa().getListaDeEnderecos() + ", altura=" + atendente1.getPessoa().getAltura() + ", peso=" + atendente1.getPessoa().getPeso() + ", nacionalidade=" + atendente1.getPessoa().getNacionalidade() + ", estado civil=" + atendente1.getPessoa().getEstadoCivil() + ", etnia=" + atendente1.getPessoa().getEtnia() + ", profissao=" + atendente1.getPessoa().getProfissao() + ", numero de celular=" + atendente1.getPessoa().getNumeroCelular() + ", numero de telefone fixo=" + atendente1.getPessoa().getNumeroTelefoneFixo() + ", cargo=" + atendente1.getCargo() + ", salario=" + atendente1.getSalario());
        System.out.println("Agenda do Atendente1:");
        for (Consulta consulta : atendente1.getAgenda()) {
            System.out.println("Data da consulta: " + dataDaAgendaAtendente1 + ", Médico: " + medico1.getPessoa().getNome() + ", Paciente: " + paciente3.getPessoa().getNome() + ", Atendente: " + paciente3.getPessoa().getNome() + ", Status: " + consulta.getStatus() + ", Valor: " + consulta.getPreco() + ", Diagnóstico: " + consulta.getDiagnostico() + ", Prescrição: " + consulta.getPrescricao());

            System.out.println(" ");

            LocalDate dataDeNascimentoAtendente2 = LocalDate.of(1994, Month.MAY, 17);
            LocalDateTime dataDaAgendaAtendente2 = LocalDateTime.of(2024, Month.JUNE, 7, 12, 30);
            Endereco enderecoAtendente2 = new Endereco("Estado: Espírito Santo ", "Cidade: Vitória ", "Bairro: Jardim da Penha", "Rua: Avenida Fernando Ferrari ", 514);
            Pessoa pessoaAtendente2 = new Pessoa("Italo", 34, 'M', 654789098, "RJ-743.651", dataDeNascimentoAtendente2, listaDoEnderecoMedico2, 1.96, 94.0, "Brasil", "Noivo", "Negro", "Engenheiro Civil", 99765456, 32245567);
            Atendente atendente2 = new Atendente();
            Consulta consultaAtendente2 = new Consulta(atendente2, dataDaAgendaAtendente2, medico2, paciente2, "Consulta pediatrica", "a caminho", 750.0, "inchaço no pancreas", "Tomar 1 comprimido por dia de timacrofilade");
            ArrayList<Endereco> listaEnderecoAtendente2 = new ArrayList<>();
            ArrayList<Consulta> agendaAtendente2 = new ArrayList<>();
            agendaAtendente2.add(consultaAtendente2);
            listaEnderecoAtendente2.add(enderecoAtendente2);
            atendente2.setPessoa(pessoaAtendente2);
            atendente2.setSalario(3500.00);
            atendente2.setAgenda(agendaAtendente2);
            atendente2.setCargo("Otorrinolaringologista");
            System.out.println("Atendente2: " + atendente2.getPessoa().getNome() + ", idade=" + atendente2.getPessoa().getIdade() + ", genero=" + atendente2.getPessoa().getGenero() + ", cpf=" + atendente2.getPessoa().getCpf() + ", rg=" + atendente2.getPessoa().getRg() + ", data de nascimento=" + atendente2.getPessoa().getDataDeNascimento() + ", endereços=" + atendente2.getPessoa().getListaDeEnderecos() + ", altura=" + atendente2.getPessoa().getAltura() + ", peso=" + atendente2.getPessoa().getPeso() + ", nacionalidade=" + atendente2.getPessoa().getNacionalidade() + ", estado civil=" + atendente2.getPessoa().getEstadoCivil() + ", etnia=" + atendente2.getPessoa().getEtnia() + ", profissao=" + atendente2.getPessoa().getProfissao() + ", numero de celular=" + atendente2.getPessoa().getNumeroCelular() + ", numero de telefone fixo=" + atendente2.getPessoa().getNumeroTelefoneFixo() + ", cargo=" + atendente2.getCargo() + ", salario=" + atendente2.getSalario());

            System.out.println("Agenda do Atendente1:");
            for (Consulta consulta1 : atendente1.getAgenda()) {
                System.out.println("Data da consulta: " + dataDaAgendaAtendente2 + ", Médico: " + medico2.getPessoa().getNome() + ", Paciente: " + paciente2.getPessoa().getNome() + ", Atendente: " + paciente2.getPessoa().getNome() + ", Status: " + consulta.getStatus() + ", Valor: " + consulta.getPreco() + ", Diagnóstico: " + consulta.getDiagnostico() + ", Prescrição: " + consulta.getPrescricao());
            }
        }
    }
}