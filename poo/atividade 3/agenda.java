/* Utilizando a correção da atividade 2 modifique as classes colocando os gets 
e sets e criando os 2 construtores um sem parametros e outro para 
inicialização de cada atributo e o método mostrar de cada classe */

import java.time.LocalDate; 
import java.time.LocalTime;

public class Agenda {
  public LocalDate data;
  public LocalTime hora;
  public Medico medico;
  public Paciente paciente;

  public Agenda() {
  }

  public Agenda(LocalDate data, LocalTime hora, Medico medico, Paciente paciente) {
    this.data = data;
    this.hora = hora;
    this.medico = medico;
    this.paciente = paciente;
  }

  public LocalDate getData() {
    return data;
  }

  public LocalTime getHora() {
    return hora;
  }

  public Medico getMedico() {
    return medico;
  }

  public Paciente getPaciente() {
    return paciente;
  }

  public void setData(LocalDate data) {
    this.data = data;
  }

  public void setHora(LocalTime hora) {
    this.hora = hora;
  }

  public void setPaciente(Paciente paciente) {
    this.paciente = paciente;
  }

  public void setMedico(Medico medico) {
    this.medico = medico;
  }
  
  public void consultar (){
    System.out.println("sucesso")
  }

  public void mostrar() {
    System.out.println("medico: " + medico);
    System.out.println("paciente: " + paciente);
    System.out.println("data: " + data);
    System.out.println("hora: " + hora);
  }
  
}
