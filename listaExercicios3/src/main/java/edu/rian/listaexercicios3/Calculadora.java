package edu.rian.listaexercicios3;

public class Calculadora {
    double numero1;
    double numero2;
    

    //método soma
    public double Soma(double numero1, double numero2){
        
        double total;
        
        total = numero1 + numero2;
        
        System.out.print("A soma dos números " + numero1 + " + " + numero2 + " = " + total + "\n");
      
        return total;
    }
    
    //metodo subtração
    public  double subtra(double numero1, double numero2){
        double total;
        
        total = numero1 - numero2;
        
        System.out.print("A subtração dos números " + numero1 + "  " + numero2 + " = " + total + "\n");
        
        return total;
    }
    
    //metodo multiplicar 
    public double Mult(double numero1, double numero2){
        double total;
        
        total = numero1 * numero2;
        
        System.out.print("A multiplicação dos números " + numero1 + " * " + numero2 + " = " + total + "\n");
        
        return total;
    }
    
    //metodo divisao
    public double Dividir(double numero1, double numero2){
        double total;
        
        total = numero1 / numero2;
        
        System.out.print("A divisão dos números " + numero1 + " / " + numero2 + " = " + total + "\n");
        
        return total;
    }
}


