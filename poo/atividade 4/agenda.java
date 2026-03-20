/* Utilizando a correção da atividade poo03 crie a proteção de exceções dos metodos 
set de cada classe e do metodos criadores, para caso ocorra uma exceção defina valores
padroes para os atribuitos e mostre uma mensagem “Ocorreu uma exceção – Valores padrões definidos” */

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
    try {
      this.data = data;
      this.hora = hora;
      this.medico = medico;
      this.paciente = paciente;
    } catch (Exception e) {
      this.data = null;
      this.hora = null;
      this.medico = null;
      this.paciente = null;
      System.out.println("Ocorreu uma exceção – Valores padrões definidos");
    }
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
    try {
      this.data = data;
    } catch (Exception e) {
      this.data = null;
      System.out.println("Ocorreu uma exceção – Valores padrões definidos");
    }
  }

  public void setHora(LocalTime hora) {
    try {
      this.hora = hora;
    } catch (Exception e) {
      this.hora = null;
      System.out.println("Ocorreu uma exceção – Valores padrões definidos");
    }
  }
  
  public void setPaciente(Paciente paciente) {
    try {
      this.paciente = paciente;
    } catch (Exception e) {
      this.paciente = null;
      System.out.println("Ocorreu uma exceção – Valores padrões definidos");
    }
  }

  public void setMedico(Medico medico) {
    try {
      this.medico = medico;
    } catch (Exception e) {
      this.medico = null;
      System.out.println("Ocorreu uma exceção – Valores padrões definidos");
    }
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
