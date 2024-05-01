package servicos;

import entidades.Atendente;
import entidades.Consulta;
import entidades.Medico;
import entidades.Paciente;

import java.time.LocalDateTime;

public class AgendamentoServices {
    public Consulta agendamentoDaConsulta(Medico medico, Atendente atendente, Paciente paciente){
        LocalDateTime dataDaConsulta = LocalDateTime.now();
        Consulta consulta = new Consulta(atendente, dataDaConsulta, medico, paciente);
        consulta.setDiagnostico("Cancer");
        consulta.setPrescricao("Tomar remedio");

        return consulta;
    }
}


//1 - Criar novo objeto - Consulta
//2 - setar todos os atributos dessa nova entidade