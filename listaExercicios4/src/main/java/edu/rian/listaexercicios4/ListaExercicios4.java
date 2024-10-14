package edu.rian.listaexercicios4;

public class ListaExercicios4 {

    public static void main(String[] args) {
        Televisor tv = new Televisor();
        
        tv.canal = 2;
        tv.estado = true;
        tv.volume = 10;
        
        tv.mostraStatus();
    }
}
