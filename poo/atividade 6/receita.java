/* Utilizando o modelo de classe abaixo, implemente as heranças 
propostas na correção da atividade POO05 */

public class Receita {

    private Consulta consulta;
    private String data;
    private String descritivo;

    public Receita() {
    }

    public Receita(Consulta consulta, String data, String descritivo) {
        this.consulta = consulta;
        this.data = data;
        this.descritivo = descritivo;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescritivo() {
        return descritivo;
    }

    public void setDescritivo(String descritivo) {
        this.descritivo = descritivo;
    }

    public void prescrever() {
        System.out.println("prescrita");
    }

    public void consultar() {
        System.out.println("consultada");
    }

    public void mostrar() {
        System.out.println("data: " + data);
        System.out.println("descritivo: " + descritivo);
    }
}
