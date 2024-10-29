package edu.rian.listaexercicios7;
public class Copo {
    private String tipoBebida;
    private double valor;
    private boolean cheio;
    
    //metodo construtor
    public Copo(String tipoBebida, double valor, boolean cheio){
        this.tipoBebida = tipoBebida;
        this.valor = valor;
        this.cheio = cheio;
    }
    
    public boolean verificarCheio(){
        return cheio;
    }
    
    //Getters
    public double getValor(){
        return valor;
    } 
    
}
