/* Usando a correção da atividade anterior, crie as associações, composições e 
agregaçoes propostas no diagrama de classe abaixo: */

public class Recepcionista {

    private String nome;
    private String cpf;
    private String telefone;
    private String senha;

    public Recepcionista(String nome, String cpf, String telefone, String senha) throws Exception {
        setNome(nome);
        setCpf(cpf);
        setTelefone(telefone);
        setSenha(senha);
    }

    public Recepcionista() {
    }

    public void acessar() {
        System.out.println("Recepcionista acessando o sistema");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (nome == null || nome.length() <= 0)
            throw new Exception("Nome inválido");

        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws Exception {
        if (cpf == null || cpf.length() <= 0)
            throw new Exception("CPF inválido");

        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) throws Exception {
        if (telefone == null || telefone.length() <= 0)
            throw new Exception("Telefone inválido");

        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) throws Exception {
        if (senha == null || senha.length() <= 0)
            throw new Exception("Senha inválida");

        this.senha = senha;
    }

    public void mostrar() {
        var s = "Recepcionista [nome=" + getNome() +
                ", cpf=" + getCpf() +
                ", telefone=" + getTelefone() + "]";
        System.out.println(s);
    }
}
