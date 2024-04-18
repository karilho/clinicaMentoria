package entidades;

import java.time.LocalDateTime;

public class Consulta {
    private Atendente atendente;
    private LocalDateTime DataHora;
    private Medico medico;
    private Paciente paciente;
    private String tipo;
    private String status;
    private double preco;
    private String diagnostico;
    private String prescricao;

    public Consulta(Atendente atendente, LocalDateTime dataHora, Medico medico, Paciente paciente, String tipo, String status, double preco, String diagnostico, String prescricao) {
        this.atendente = atendente;
        this.DataHora = dataHora;
        this.medico = medico;
        this.paciente = paciente;
        this.tipo = tipo;
        this.status = status;
        this.preco = preco;
        this.diagnostico = diagnostico;
        this.prescricao = prescricao;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
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
