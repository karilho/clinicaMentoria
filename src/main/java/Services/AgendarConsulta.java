package Services;

import entidades.Consulta;
import entidades.Medico;
import entidades.Paciente;
import java.time.LocalDateTime;
import java.util.Scanner;

public class AgendarConsulta {
    public Consulta horarioPermitidoDaConsulta(Medico medico, Paciente paciente, LocalDateTime horarioDaConsulta, String local){

        if (horarioDaConsulta.getHour() < 9 || horarioDaConsulta.getHour() >= 18){
            System.out.println("Horário da consulta inválido. O médico só atende das 9h às 18h.");
            return null;
        }
        return new Consulta(horarioDaConsulta, local, paciente, medico);
    }

    public void agendandoAConsulta() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao sistema de agendamento de consultas!");

        System.out.print("Nome do médico: ");
        String nomeMedico = scanner.nextLine();

        System.out.print("Nome do paciente: ");
        String nomePaciente = scanner.nextLine();

        System.out.print("Local da consulta: ");
        String localConsulta = scanner.nextLine();

        System.out.print("Ano da consulta (AAAA): ");
        int ano = scanner.nextInt();

        System.out.print("Mês da consulta (1-12): ");
        int mes = scanner.nextInt();

        System.out.print("Dia da consulta (1-31): ");
        int dia = scanner.nextInt();

        System.out.print("Hora da consulta (9-18): ");
        int hora = scanner.nextInt();

        System.out.print("Minuto da consulta (0-59): ");
        int minuto = scanner.nextInt();

        LocalDateTime horarioDaConsulta = LocalDateTime.of(ano, mes, dia, hora, minuto);

        Medico medico = new Medico(nomeMedico);
        Paciente paciente = new Paciente(nomePaciente);

        Consulta consultaAgendada = horarioPermitidoDaConsulta(medico, paciente, horarioDaConsulta, localConsulta);
        if (consultaAgendada != null) {
            LocalDateTime horarioAgendado = consultaAgendada.getDataHora();
            String nomeMedicoConsulta = consultaAgendada.getMedico().getNomeMedico();
            String local = consultaAgendada.getLocal();

            System.out.println("Consulta agendada com sucesso para " + horarioAgendado +
                    " com o médico " + nomeMedico +
                    " no local " + local);
        } else {
            System.out.println("Falha ao agendar a consulta. Por favor, verifique os dados e tente novamente.");
        }
    }
}

