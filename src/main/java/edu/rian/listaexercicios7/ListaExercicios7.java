package edu.rian.listaexercicios7;
public class ListaExercicios7 {

    public static void main(String[] args) {
        
        //criando copos
        Copo copo1 = new Copo("Coca-Cola", 5.0, true);
        Copo copo2 = new Copo("Budweiser",6.5, true);
        Copo copo3 = new Copo("Boa", 9.0, true);
        Copo copo4 = new Copo("Agua", 2.0, false);
        
        Copo copo5 = new Copo("Pepsi", 5.0, true);
        Copo copo6 = new Copo("Heineken",6.5, true);
        Copo copo7 = new Copo("Skol", 9.0, true);
        Copo copo8 = new Copo("Agua com gás", 2.0, true);
        
        //criando funcionario
        Funcionarios func1 = new Funcionarios("Rian", 3, copo1, copo2, copo3, copo4);       //dar aviso de erro
        Funcionarios func2 = new Funcionarios("Manuela", 1, copo5, copo6, copo7, copo8);    //correto
        
        func1.servir();
        func2.servir();
        
    }
}
