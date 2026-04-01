/* Utilizando o modelo de classe abaixo, implemente as heranças 
ropostas na correção da atividade POO05 */

import java.time.LocalDate;
import java.time.LocalTime;

public class Agenda {

    protected LocalDate data;
    protected LocalTime hora;

    public Agenda() {
    }

    public Agenda(LocalDate data, LocalTime hora) {
        this.data = data;
        this.hora = hora;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public void consultar() {
        System.out.println("Agenda consultada");
    }
}
