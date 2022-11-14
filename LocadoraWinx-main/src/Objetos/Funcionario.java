package Objetos;
public class Funcionario {
    private String Nome;
    private String CPF;
    private String Senha;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
    public void LimparCliente(){
    this.Nome = ("");
    this.CPF = ("");
    this.Senha = ("");
    }
}
