/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author Gabriel
 */
public class Alugar {
    private Carro carro;
    private Cliente cliente;
    private int valor;
    private int QtdDias; 

    public Alugar(Carro carro, Cliente cliente, int valor, int QtdDias) {
        this.carro = carro;
        this.cliente = cliente;
        this.valor = valor;
        this.QtdDias = QtdDias;
        
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getQtdDias() {
        return QtdDias;
    }

    public void setQtdDias(int QtdDias) {
        this.QtdDias = QtdDias;
    }

    public void alugarCarro(Cliente cliente, Carro carro){
        
    }
    
    public void CalcularValor(Cliente cliente, Carro carro){
        switch (carro.getClasse()){
            case "Classe A":
                this.valor = this.QtdDias * 150;
                break;
            case "Classe B":
                this.valor = this.QtdDias * 180;
            case "Classe C":
                this.valor = this.QtdDias * 200;
            case "Classe D":
                this.valor = this.QtdDias * 250;
                
        }
        
    }
}
