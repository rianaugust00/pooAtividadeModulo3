package edu.rian.listaexercicios7;
public class Funcionarios {
    
    private String nome;
    private int numMesa;
    private double valorTotal;
    private Copo c1, c2, c3, c4;
    
    //construtor
    public Funcionarios(String nome, int numMesa, Copo c1, Copo c2, Copo c3, Copo c4){
        this.nome = nome;
        this.numMesa = numMesa;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.c4 = c4;
    }
    
    public boolean verificarCopos() {
        return c1.verificarCheio() && c2.verificarCheio() && c3.verificarCheio() && c4.verificarCheio();
    }
    
    public double calcularValor(){
        valorTotal = c1.getValor() + c2.getValor() + c3.getValor() + c4.getValor();
        return valorTotal;
    }
    
    public void servir(){
        if(verificarCopos()){
            double valor = calcularValor();
            System.out.println("Pedido entregue por " + nome + " na mesa " + numMesa + ". Total: R$:" + valorTotal);
        }else{
            System.out.println("Algo errado, copo não esta cheio");
        }
        
    }
        
}
