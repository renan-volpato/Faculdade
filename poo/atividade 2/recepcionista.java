public class Recepcionista {
  public String nome;
  public String cpf;
  public String telefone;
  public String senha;

  public void acessar () {
    System.out.println("recepcionista: " + nome);
  }
    
  public void mostrar () {
    System.out.println("nome: " + nome);
    System.out.println("CPF: " + cpf);
    System.out.println("telefone: " + telefone);
  }
}
