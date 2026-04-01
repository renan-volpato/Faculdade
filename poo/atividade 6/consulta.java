/* Utilizando o modelo de classe abaixo, implemente as heranças 
ropostas na correção da atividade POO05 */

public class Consulta extends Agenda {

    private Medico medico;
    private Paciente paciente;
    private String motivo;
    private String historico;

    private Receita receita;
    private Exame exame;

    public void marcar(){}

    public void cancelar(){}

    @Override
    public void consultar(){}

    public void realizar(){}

    public void atualizar(){}

    public void mostrar(){
        System.out.println("data:" + getData());
        System.out.println("hora:" + getHora());
        System.out.println("medico:" + medico.getNome());
        System.out.println("paciente:" + paciente.getNome());
        System.out.println("motivo:" + motivo);
        System.out.println("historico:" + historico);
    }
}
