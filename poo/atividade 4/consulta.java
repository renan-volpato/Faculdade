/* Utilizando a correção da atividade poo03 crie a proteção de exceções dos metodos 
set de cada classe e do metodos criadores, para caso ocorra uma exceção defina valores
padroes para os atribuitos e mostre uma mensagem “Ocorreu uma exceção – Valores padrões definidos” */

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
    try {
      this.data = data;
      this.hora = hora;
      this.medico = medico;
      this.paciente = paciente;
      this.motivo = motivo;
      this.historico = historico;
    } catch (Exception e) {
      this.data = null;
      this.hora = null;
      this.medico = "";
      this.paciente = "";
      this.motivo = "";
      this.historico = "";
      System.out.println("Ocorreu uma exceção – Valores padrões definidos");
    }
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

  public void setMedico(String medico) {
    try {
      this.medico = medico;
    } catch (Exception e) {
      this.medico = "";
      System.out.println("Ocorreu uma exceção – Valores padrões definidos");
    }
  }

  public void setPaciente(String paciente) {
    try {
      this.paciente = paciente;
    } catch (Exception e) {
      this.paciente = "";
      System.out.println("Ocorreu uma exceção – Valores padrões definidos");
    }
  }

  public void setMotivo(String motivo) {
    try {
      this.motivo = motivo;
    } catch (Exception e) {
      this.motivo = "";
      System.out.println("Ocorreu uma exceção – Valores padrões definidos");
    }
  }
  
  public void setHistorico(String historico) {
    try {
      this.historico = historico;
    } catch (Exception e) {
      this.historico = "";
      System.out.println("Ocorreu uma exceção – Valores padrões definidos");
    }
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
