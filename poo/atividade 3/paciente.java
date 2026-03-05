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
