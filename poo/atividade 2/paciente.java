public class Paciente {
  public String nome;
  public String cpf;
  public String telefone;
  public String genero;
  public Int idade;

  public void cadastrar() {
    System.out.println("cadastrado");
  }

  public void consultar() {
    System.out.println("consultando paciente");
  }

  public void mostrar() {
    System.out.println("nome: " + nome);
    System.out.println("CPF: " + cpf);
    System.out.println("telefone: " + telefone); 
    System.out.println("genero: " + genero);
    System.out.println("idade: " + idade);
  }  
}
