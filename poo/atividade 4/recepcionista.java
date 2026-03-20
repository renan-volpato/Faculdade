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
    try {
      this.nome = nome;
      this.cpf = cpf;
      this.telefone = telefone;
      this.senha = senha;
    } catch (Exception e) {
      this.nome = "";
      this.cpf = "";
      this.telefone = "";
      this.senha = "";
      System.out.println("Ocorreu uma exceção – Valores padrões definidos");
    }
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    try {
      this.nome = nome;
    } catch (Exception e) {
      this.nome = "";
      System.out.println("Ocorreu uma exceção – Valores padrões definidos");
    }
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    try {
      this.cpf = cpf;
    } catch (Exception e) {
      this.cpf = "";
      System.out.println("Ocorreu uma exceção – Valores padrões definidos");
    }
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    try {
      this.telefone = telefone;
    } catch (Exception e) {
      this.telefone = "";
      System.out.println("Ocorreu uma exceção – Valores padrões definidos");
    }
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    try {
      this.senha = senha;
    } catch (Exception e) {
      this.senha = "";
      System.out.println("Ocorreu uma exceção – Valores padrões definidos");
    }
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
