



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author Gabriel
 */
public class Cliente {
    private String Nome;
    private String CPF;
    private String Sexo;
    private String Endereço;
    private String Cidade;
    private String Estado;
    private String email;
    private String telefone;
    
    public Cliente(){
    }

    public Cliente(String Nome, String CPF, String Sexo, String Endereço, String Cidade, String Estado) {
        this.Nome = Nome;
        this.CPF = CPF;
        this.Sexo = Sexo;
        this.Endereço = Endereço;
        this.Cidade = Cidade;
        this.Estado = Estado;
        this.email = email;
        this.telefone = telefone;
        
    }
    
     public void IncluirCliente(String Nome, String CPF, String Sexo, String Endereço, String Cidade, String Estado, String email, String telefone) {
        this.Nome = Nome;
        this.CPF = CPF;
        this.Sexo = Sexo;
        this.Endereço = Endereço;
        this.Cidade = Cidade;
        this.Estado = Estado;
        this.email = email;
        this.telefone = telefone;

    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

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

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getEndereço() {
        return Endereço;
    }

    public void setEndereço(String Endereço) {
        this.Endereço = Endereço;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    public void LimparCliente(){
    this.Nome = ("");
    this.CPF = ("");
    this.Sexo = ("");
    this.Endereço = ("");
    this.Cidade = ("");
    this.Estado = ("");
    this.email = "";
    this.telefone = "";

    }
}
