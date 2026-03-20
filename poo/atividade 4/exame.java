/* Utilizando a correção da atividade poo03 crie a proteção de exceções dos metodos 
set de cada classe e do metodos criadores, para caso ocorra uma exceção defina valores
padroes para os atribuitos e mostre uma mensagem “Ocorreu uma exceção – Valores padrões definidos” */

import java.time.LocalDate;

public class Exame {
  public Date data;
  public String consulta;
  public String descritivo;

  public Exame() {
  }

  public Exame(LocalDate data, String consulta, String descritivo) {
    try {
      this.data = data;
      this.consulta = consulta;
      this.descritivo = descritivo;
    } catch (Exception e) {
      this.data = null;
      this.consulta = "";
      this.descritivo = "";
      System.out.println("Ocorreu uma exceção – Valores padrões definidos");
    }
  }


  public LocalDate getData() {
    return data;
  }

  public void setData(LocalDate data) {
    try {
      this.data = data;
    } catch (Exception e) {
      this.data = null;
      System.out.println("Ocorreu uma exceção – Valores padrões definidos");
    }
  }

  public String getConsulta() {
    return consulta;
  }

  public void setConsulta(String consulta) {
    try {
      this.consulta = consulta;
    } catch (Exception e) {
      this.consulta = "";
      System.out.println("Ocorreu uma exceção – Valores padrões definidos");
    }
  }

  public String getDescritivo() {
    return descritivo;
  }

  public void setDescritivo(String descritivo) {
    try {
      this.descritivo = descritivo;
    } catch (Exception e) {
      this.descritivo = "";
      System.out.println("Ocorreu uma exceção – Valores padrões definidos");
    }
  }

  public void solicitar () {
    System.out.println("solicitado");
  }

  public void consultar () {
    System.out.println("consultado");
  }
  
  public void mostrar () {
    System.out.println("data: " + data);
    System.out.println("consulta: " + consulta);
    System.out.println("descrição: " + descritivo);
  }  
}
