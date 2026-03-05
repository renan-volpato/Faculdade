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
    this.data = data;
    this.consulta = consulta;
    this.descritivo = descritivo;
  }

  public LocalDate getData() {
    return data;
  }

  public void setData(LocalDate data) {
    this.data = data;
  }

  public String getConsulta() {
    return consulta;
  }

  public void setConsulta(String consulta) {
    this.consulta = consulta;
  }

  public String getDescritivo() {
    return descritivo;
  }

  public void setDescritivo(String descritivo) {
    this.descritivo = descritivo;
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
