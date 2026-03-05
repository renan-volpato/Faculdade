/* Utilizando a correção da atividade 2 modifique as classes colocando os gets 
e sets e criando os 2 construtores um sem parametros e outro para 
inicialização de cada atributo e o método mostrar de cada classe */

import java.time.LocalDate; 
import java.time.LocalTime;

public class Consulta {
  public LocalDate data;
  public LocalTime hora;
  public String medico;
  public String paciente;
  public String motivo;
  public String historico;

  public Consulta() {
  }

  public Consulta(LocalDate data, LocalTime hora, String medico, String paciente, String motivo, String historico) {
    this.data = data;
    this.hora = hora;
    this.medico = medico;
    this.paciente = paciente;
    this.motivo = motivo;
    this.historico = historico;
  }

  public LocalDate getData() {
    return data;
  }

  public LocalTime getHora() {
    return hora;
  }

  public String getMedico() {
    return medico;
  }

  public String getPaciente() {
    return paciente;
  }
  
  public String getMotivo() {
    return motivo;
  }

  public String getHistorico() {
    return historico;
  }

  public void setData(LocalDate data) {
    this.data = data;
  }

  public void setHora(LocalTime hora) {
    this.hora = hora;
  }

  public void setMedico(String medico) {
    this.medico = medico;
  }

  public void setPaciente(String paciente) {
    this.paciente = paciente;
  }

  public void setMotivo(String motivo) {
    this.motivo = motivo;
  }
  
  public void setHistorico(String historico) {
    this.historico = historico;
  }

  public void marcar () {
    System.out.println("consulta marcada");
  }

  public void cancelar () {
    System.out.println("consulta desmarcada");
  }

  public void consultar () {
    System.out.println("sistema acessado");
  }

  public void realizar () {
    System.out.println("consulta realizada");
  }

  public void atualizar () {
    System.out.println("consulta atualizada");
  }

  public void mostrar() {
    System.out.println("medico: " + medico);
    System.out.println("paciente: " + paciente);
    System.out.println("motivo: " + motivo);
    System.out.println("historico: " + historico);
    System.out.println("data: " + data);
    System.out.println("hora: " + hora);
  }
}
