/* Utilizando o modelo de classe abaixo, implemente as heranças 
propostas na correção da atividade POO05 */

public class Paciente {

    private String nome;
    private String cpf;
    private String telefone;
    private String genero;
    private int idade;

    public Paciente() {
    }

    public Paciente(String nome, String cpf, String telefone, String genero, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.genero = genero;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void cadastrar() {
        System.out.println("oaciente cadastrado");
    }

    public void consultar() {
        System.out.println("paciente consultado");
    }

    public void mostrar() {
        System.out.println("nome: " + nome);
        System.out.println("cpf: " + cpf);
        System.out.println("telefone: " + telefone);
        System.out.println("genero: " + genero);
        System.out.println("idade: " + idade);
    }
}
