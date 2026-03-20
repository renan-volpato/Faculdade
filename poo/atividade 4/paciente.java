/* Utilizando a correção da atividade 2 modifique as classes colocando os gets 
e sets e criando os 2 construtores um sem parametros e outro para 
inicialização de cada atributo e o método mostrar de cada classe */

public class Paciente {
  public String nome;
  public String cpf;
  public String telefone;
  public String genero;
  public Int idade;

  public Paciente() {
  }

  public Paciente(String nome, String cpf, String telefone, String genero, int idade) {
    try {
      this.nome = nome;
      this.cpf = cpf;
      this.telefone = telefone;
      this.genero = genero;
      this.idade = idade;
    } catch (Exception e) {
      this.nome = "";
      this.cpf = "";
      this.telefone = "";
      this.genero = "";
      this.idade = 0;
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

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    try {
      this.genero = genero;
    } catch (Exception e) {
      this.genero = "";
      System.out.println("Ocorreu uma exceção – Valores padrões definidos");
    }
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    try {
      this.idade = idade;
    } catch (Exception e) {
      this.idade = 0;
      System.out.println("Ocorreu uma exceção – Valores padrões definidos");
    }
  }
  
  public void cadastrar() {
    System.out.println("cadastrado");
  }

  public void consultar() {
    System.out.println("consultando");
  }

  public void mostrar() {
    System.out.println("nome: " + nome);
    System.out.println("CPF: " + cpf);
    System.out.println("telefone: " + telefone); 
    System.out.println("genero: " + genero);
    System.out.println("idade: " + idade);
  }  
}
