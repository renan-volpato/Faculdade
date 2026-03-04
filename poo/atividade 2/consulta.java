import java.time.LocalDate; 
import java.time.LocalTime;

public class Consulta {

  public LocalDate data;
  public LocalTime hora;
  public String medico;
  public String paciente;
  public String motivo;
  public String historico;

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
