/* Utilizando a correção da atividade 2 modifique as classes colocando os gets 
e sets e criando os 2 construtores um sem parametros e outro para 
inicialização de cada atributo e o método mostrar de cada classe */

import java.time.LocalDate;

public class Receita {
  public Date data;
  public String consulta;
  public String descritivo;

  public Receita() {
  }

  public Receita(LocalDate data, String consulta, String descritivo) {
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

  public void preescrever () {
    System.out.println("receita preescrevida");
  }

  public void consultar () {
    System.out.println("receita consultada");
  }

  public void mostrar () {
    System.out.println("data: " + data);
    System.out.println("consulta: " + consulta);
    System.out.println("descrição: " + descritivo);
  }
  
}
