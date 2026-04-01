/* Utilizando o modelo de classe abaixo, implemente as heranças 
propostas na correção da atividade POO05 */

public class Recepcionista extends Funcionario {

    public Recepcionista() {
    }

    public Recepcionista(String nome, String cpf, String telefone, String senha) {
        super(nome, cpf, telefone, senha);
    }

    public void acessar() {
        System.out.println("acessando o sistema");
    }

    public void mostrar() {
        System.out.println("nome: " + getNome());
        System.out.println("cpf: " + getCpf());
        System.out.println("telefone: " + getTelefone());
    }
}
