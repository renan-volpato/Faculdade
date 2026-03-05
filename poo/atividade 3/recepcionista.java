/* Utilizando a correção da atividade 2 modifique as classes colocando os gets 
e sets e criando os 2 construtores um sem parametros e outro para 
inicialização de cada atributo e o método mostrar de cada classe */

public class Recepcionista {
  public String nome;
  public String cpf;
  public String telefone;
  public String senha;

  public Recepcionista() {
  }

  public Recepcionista(String nome, String cpf, String telefone, String senha) {
    this.nome = nome;
    this.cpf = cpf;
    this.telefone = telefone;
    this.senha = senha;
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

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public void acessar () {
    System.out.println("recepcionista: " + nome);
  }
    
  public void mostrar () {
    System.out.println("nome: " + nome);
    System.out.println("CPF: " + cpf);
    System.out.println("telefone: " + telefone);
  }
}
