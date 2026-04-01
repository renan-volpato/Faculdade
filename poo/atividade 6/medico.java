/* Utilizando o modelo de classe abaixo, implemente as heranças 
propostas na correção da atividade POO05 */

public class Medico extends Funcionario {

    private String crm;
    private String especialidade;

    public Medico() {
    }

    public Medico(String nome, String cpf, String telefone, String senha,
                  String crm, String especialidade) {
        super(nome, cpf, telefone, senha);
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void acessar() {
        System.out.println("Medico acessando o sistema");
    }

    public void mostrar() {
        System.out.println("nome: " + getNome());
        System.out.println("cpf: " + getCpf());
        System.out.println("telefone: " + getTelefone());
        System.out.println("crm: " + crm);
        System.out.println("especialidade: " + especialidade);
    }
}
