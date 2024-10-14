package edu.rian.listaexercicios2;

public class ListaExercicios2 {

    public static void main(String[] args) {
        
        Conta c1 = new Conta(500, "Corrente");
        Conta c2 = new Conta(200, "Corrente");
        Conta c3 = new Conta(200, "Poupança");
        
        c1.transferir(100, c2);
        c1.transferir(100, c3);
        c3.transferir(100, c2);
        
        c1.getSaldo();
        
    }
}

