package edu.rian.listaexercicios2;

public class Conta {
    private double saldo;
    private String tipo ;
    
    //construtor
    public Conta(double valorInicial, String tipo){
        this.saldo = valorInicial;
        this.tipo = tipo;
    }
    
    //método para depositar 
    public boolean Depositar(double valor){
        if (tipo.equals("Corrente") && valor < 5000 && valor > 0){
            saldo = saldo + valor;
            return true;
        }
        return false;
    }
    
    public boolean Sacar(double valor){
      
        if(valor > 0 && valor <= saldo){
            saldo = saldo - valor;
            return true;
        }else{
            System.out.println("O valor que deseja sacar é maior que o saldo");
        }
        return false;
    }
    
    public boolean transferir(double valor, Conta contaDestino){
        if (this.tipo.equals("Poupança")){
            System.out.println("Operacao Invalida. Nao pode transferir partindo da poupanca");
            return false;
        }
        
        if (valor <= 0 || valor > this.saldo) {
            System.out.println("Operação inválida. Valor de transferência inválido.");
            return false;
        }
        
        this.saldo -= valor;    //tira da conta corrente
        
        contaDestino.saldo += valor; //deposita na conta poupanca
        
        System.out.println("Operacao realizada!");
        
        
        return true;
    }
    
    public void getSaldo(){
        System.out.println("Saldo atual: "+ saldo);
    }
        
}
