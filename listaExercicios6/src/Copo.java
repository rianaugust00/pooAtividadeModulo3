public class Copo {

    private String tipoBebida;
    private double valor;
    private boolean cheio;

    public Copo(String tipoBebida, double valor, boolean cheio) {
        this.tipoBebida = tipoBebida;
        this.cheio = cheio;
        this.valor = valor;
    }

    public boolean verificarCopoCheio(){
        if(cheio){
            System.out.println("Copo esta cheio!");
        }else{
            System.out.println("O copo esta vazio");
        }
        return cheio;
    }

    //acessa valor
    public double getValor() {
        return valor;
    }

}
