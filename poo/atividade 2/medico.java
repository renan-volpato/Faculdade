public class Medico {
  public String nome;
  public String crm;
  public String telefone;
  public String especialidade;
  public String senha;

  public void acessar () {
    System.out.println("medico: " + nome);
  }

  public void mostrar() {
    System.out.println("nome: " + nome);
    System.out.println("crm: " + crm);
    System.out.println("telefone: " + telefone);
    System.out.println("especialidade: " + especialidade);
  }
}
