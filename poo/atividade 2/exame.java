public class Exame {
  public Date data;
  public String consulta;
  public String descritivo;

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
