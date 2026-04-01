/* Utilizando o modelo de classe abaixo, implemente as heranças 
ropostas na correção da atividade POO05 */

import java.time.LocalDate;
import java.time.LocalTime;

public class Agenda {

    protected LocalDate data;
    protected LocalTime hora;

    public Agenda() {
    }

    public Agenda(LocalDate data, LocalTime hora) throws Exception {
        setData(data);
        setHora(hora);
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) throws Exception {
        if (data == null) {
            throw new Exception("nao pode ser nula");
        }
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) throws Exception {
        if (hora == null) {
            throw new Exception("nao pode ser nula");
        }
        this.hora = hora;
    }

    public void consultar() {
        System.out.println("agenda consultada");
    }

    public void mostrar() {
        System.out.println("agenda [data=" + data + ", hora=" + hora + "]");
    }
}
