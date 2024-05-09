package Services;

import entidades.Consulta;
import entidades.Medico;
import entidades.Paciente;
import java.time.LocalDateTime;
import java.util.Scanner;

public class AgendarConsulta {
    public void agendarAConsulta() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao sistema de agendamento de consultas!");

        System.out.print("Nome do médico: ");
        String nomeMedico = scanner.nextLine();

        System.out.print("Nome do paciente: ");
        String nomePaciente = scanner.nextLine();

        System.out.print("Ano da consulta (AAAA): ");
        int ano = scanner.nextInt();

        System.out.print("Mês da consulta (1-12): ");
        int mes = scanner.nextInt();
        if (mes < 1 || mes > 12) {
            System.out.println("Mês da consulta inválido.");
            scanner.close();
            return;
        }

        System.out.print("Dia da consulta (1-31): ");
        int dia = scanner.nextInt();
        if (dia < 1 || dia > 31) {
            System.out.println("Dia da consulta inválido.");
            scanner.close();
            return;
        }

        System.out.print("Hora da consulta (9-18): ");
        int hora = scanner.nextInt();
        if (hora < 9 || hora >= 18) {
            System.out.println("Hora da consulta inválida. Os médicos só atendem das 9h às 18h.");
            scanner.close();
            return;
        }

        System.out.print("Minuto da consulta (0-59): ");
        int minuto = scanner.nextInt();
        if (minuto < 0 || minuto > 59) {
            System.out.println("Minuto da consulta inválido.");
            scanner.close();
            return;
        }

        LocalDateTime horarioDaConsulta = LocalDateTime.of(ano, mes, dia, hora, minuto);

        Medico medico = new Medico(nomeMedico);
        Paciente paciente = new Paciente(nomePaciente);

        Consulta consultaAgendada = new Consulta(horarioDaConsulta, paciente, medico);
        if (consultaAgendada != null) {
            System.out.println("Consulta agendada com sucesso para " + horarioDaConsulta +
                    " com o médico " + nomeMedico  + " Para o Paciente " + nomePaciente);
        } else {
            System.out.println("Falha ao agendar a consulta. Por favor, verifique os dados e tente novamente.");
        }
        scanner.close();
    }
}
