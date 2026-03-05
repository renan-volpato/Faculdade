/* Utilizando a correção da atividade 2 modifique as classes colocando os gets 
e sets e criando os 2 construtores um sem parametros e outro para 
inicialização de cada atributo e o método mostrar de cada classe */

  public class Medico {
    public String nome;
    public String crm;
    public String telefone;
    public String especialidade;
    public String senha;
  
  public Medico() {
    }
  
  public Medico(String nome, String crm, String telefone, String especialidade, String senha) {
    this.nome = nome;
    this.crm = crm;
    this.telefone = telefone;
    this.especialidade = especialidade;
    this.senha = senha;
    }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCrm() {
    return crm;
  }

  public void setCrm(String crm) {
    this.crm = crm;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public String getEspecialidade() {
    return especialidade;
  }

  public void setEspecialidade(String especialidade) {
    this.especialidade = especialidade;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }
  
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
