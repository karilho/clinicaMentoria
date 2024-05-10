package Services;

import entidades.Consulta;
import entidades.Medico;
import entidades.Paciente;
import entidades.Pessoa;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuPrincipal {

    public void iniciarOSistemaDeCadastro() {
        printarMenuPrincipal();
        criacaoService criacaoService = new criacaoService();
        Scanner scanner = new Scanner(System.in);
        ArrayList <Paciente> pacientesList = new ArrayList<>();
        ArrayList <Medico> medicosList = new ArrayList<>();
        ArrayList <Consulta> consultasList = new ArrayList<>();
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                AgendarConsulta agendarConsulta = new AgendarConsulta();
                Consulta consultaAgendada = agendarConsulta.agendarAConsulta(pacientesList, medicosList);
                System.out.println("Consulta agendada com sucesso!" + consultaAgendada.toString());
                consultasList.add(consultaAgendada);
                break;
            case 2:
                System.out.println(consultasList.toString());
                break;
            case 3:
                Pessoa pessoaCriada = criacaoService.criarPessoa();
                Paciente pacienteCriado = criacaoService.criarPaciente(pessoaCriada);
                System.out.println("Paciente criado com sucesso!" + pacienteCriado.toString());
                 pacientesList.add(pacienteCriado);
                 scanner.close();
                return;
            case 4:
                Pessoa pessoaCriada2 = criacaoService.criarPessoa();
                Medico medicoCriado = criacaoService.criarMedico(pessoaCriada2);
                System.out.println("Paciente criado com sucesso!" + medicoCriado.toString());
                medicosList.add(medicoCriado);
                return;
            case 5:
                System.out.println("Saindo do sistema...");
        }
    }




    public static void printarMenuPrincipal() {
        System.out.println("BEM VINDO AO SISTEMA DE GERENCIAMENTO DE CONSULTAS");
        System.out.println("1 - AGENDAR CONSULTA");
        System.out.println("2 - LISTAR CONSULTAS");
        System.out.println("3 - CADASTRAR PACIENTE");
        System.out.println("4 - CADASTRAR MEDICO");
        System.out.println("5 - SAIR DO SISTEMA");
        System.out.println("DIGITE A OPÇÃO DESEJADA");
    }
}
