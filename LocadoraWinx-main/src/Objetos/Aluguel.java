package Objetos;
public class Aluguel {
    private String cpf = "";
    private String cliente= "";
    private String carro= "";
    private String placa = "";
    private int dias = 0;
    private float valor = 0;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    public void LimparAluguel(){
        cpf =  "";
        cliente = "";
        carro = "";
        placa = "";
        dias = 0;
        valor = 0;
    }
}
