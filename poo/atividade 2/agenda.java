import java.time.LocalDate; 
import java.time.LocalTime;

public class Agenda {

  public LocalDate data;
  public LocalTime hora;
  public Medico medico;
  public Paciente paciente;

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
