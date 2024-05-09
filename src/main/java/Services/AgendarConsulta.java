package Services;

import entidades.Consulta;
import entidades.Medico;
import entidades.Paciente;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class AgendarConsulta {

    Scanner scanner = new Scanner(System.in);

    public Consulta agendarAConsulta(ArrayList<Paciente> listaDePacientes, ArrayList<Medico> listaDeMedicos) {
        System.out.println("Bem-vindo ao sistema de agendamento de consultas!");

        Medico medicoEncontrado = null;
        Paciente pacienteEncontrado = null;

        System.out.print("Escolha um médico da Lista: ");
        for (Medico medico : listaDeMedicos) {
            System.out.println(medico.getPessoa().getNome());
        }
        String nomeMedico = scanner.nextLine();

        for (Medico medico : listaDeMedicos) {
            if (medico.getPessoa().getNome().equals(nomeMedico)) {
                System.out.println("Médico encontrado!");
                medicoEncontrado = medico;
            } else {
                System.out.println("Médico não encontrado.");
                return null;
            }
        }


        System.out.print("Nome do paciente: ");
        for (Paciente paciente : listaDePacientes) {
            System.out.println(paciente.getPessoa().getNome());
        }
        String nomePaciente = scanner.nextLine();

        for (Paciente paciente : listaDePacientes) {
            if (paciente.getPessoa().getNome().equals(nomePaciente)) {
                System.out.println("Paciente encontrado!");
                pacienteEncontrado = paciente;
            } else {
                System.out.println("Paciente não encontrado.");
                return null;
            }
        }

        System.out.print("Ano da consulta (AAAA): ");
        int ano = scanner.nextInt();

        System.out.print("Mês da consulta (1-12): ");
        int mes = scanner.nextInt();
        if (mes < 1 || mes > 12) {
            System.out.println("Mês da consulta inválido.");
            scanner.close();
            return null;
        }

        System.out.print("Dia da consulta (1-31): ");
        int dia = scanner.nextInt();
        if (dia < 1 || dia > 31) {
            System.out.println("Dia da consulta inválido.");
            scanner.close();
            return null;
        }

        System.out.print("Hora da consulta (9-18): ");
        int hora = scanner.nextInt();
        if (hora < 9 || hora >= 18) {
            System.out.println("Hora da consulta inválida. Os médicos só atendem das 9h às 18h.");
            scanner.close();
            return null;
        }

        System.out.print("Minuto da consulta (0-59): ");
        int minuto = scanner.nextInt();
        if (minuto < 0 || minuto > 59) {
            System.out.println("Minuto da consulta inválido.");
            scanner.close();
            return null;
        }

        LocalDateTime horarioDaConsulta = LocalDateTime.of(ano, mes, dia, hora, minuto);

        Consulta consultaAgendada = new Consulta(horarioDaConsulta, pacienteEncontrado, medicoEncontrado);

        System.out.println("Consulta agendada com sucesso para " + horarioDaConsulta +
                " com o médico " + nomeMedico + " Para o Paciente " + nomePaciente);

        scanner.close();
        return consultaAgendada;
    }
}
