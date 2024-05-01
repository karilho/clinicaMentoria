package entidades;

import java.time.LocalDateTime;

public class Consulta {
    private Atendente atendente;
    private LocalDateTime DataHora;
    private Medico medico;
    private Paciente paciente;
    private String diagnostico;
    private String prescricao;

    public Consulta(Atendente atendente, LocalDateTime dataHora, Medico medico, Paciente paciente) {
        this.atendente = atendente;
        this.DataHora = dataHora;
        this.medico = medico;
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "atendente=" + atendente +
                ", DataHora=" + DataHora +
                ", medico=" + medico +
                ", paciente=" + paciente +
                ", diagnostico='" + diagnostico + '\'' +
                ", prescricao='" + prescricao + '\'' +
                '}';
    }

    public Atendente getAtendente() {
        return atendente;
    }

    public void setAtendente(Atendente atendente) {
        this.atendente = atendente;
    }

    public LocalDateTime getDataHora() {
        return DataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        DataHora = dataHora;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getPrescricao() {
        return prescricao;
    }

    public void setPrescricao(String prescricao) {
        this.prescricao = prescricao;
    }
}
