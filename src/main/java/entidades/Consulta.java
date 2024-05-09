package entidades;

import java.time.LocalDateTime;

public class Consulta {

    private LocalDateTime dataHora;
    private Paciente paciente;
    private Medico medico;

    public Consulta(LocalDateTime dataHora, Paciente paciente, Medico medico) {
        this.dataHora = dataHora;
        this.paciente = paciente;
        this.medico = medico;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
}
