import java.time.LocalDate;

public class Receita {
  public Date data;
  public String consulta;
  public String descritivo;

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
