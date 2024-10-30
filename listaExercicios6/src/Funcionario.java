public class Funcionario {

    private String nome;
    private int numMesa;
    double valorTotal;
    private Copo c1;
    private Copo c2;
    private Copo c3;
    private Copo c4;

    public Funcionario(String nome, int numMesa, double valorTotal, Copo c1, Copo c2, Copo c3, Copo c4) {
        this.nome = nome;
        this.numMesa = numMesa;
        this.valorTotal = valorTotal;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.c4 = c4;
    }

    // Verifica se todos os copos estão cheios
    public boolean verificarCopo(){
        if(c1 == true && c2 == true && c3 == true && c4 = true){
            return true;
        }else{
            return false;
        }
    }

    //calcula o valor de todos os copos
    public double calcularValor(){
        valorTotal =
    }


}
