public class carro {

    boolean motor ;
    int acelerador;

    //metodo construtor
    public carro(boolean motor, int acelerador){
        this.motor = motor;
        this.acelerador = acelerador;
    }

    //metodo ligar carro
    public void ligarMotor(){
        motor = true;
        System.out.println("Ligando motor");
    }

    //metodo acelerar
    public int acelerarCarro(){
        acelerador = 0;
        while(acelerador < 50){
            acelerador++;
            System.out.println("Km/h: " + acelerador);
            try {
                Thread.sleep(200);
            }catch (InterruptedException e){
                System.out.println("A thread foi interrompida.");
            }
        }
        return acelerador;
    }

    //metodo frear
    public int frearCarro(){
        while(acelerador >= 30){
            acelerador--;
            System.out.println("Km/h: " + acelerador);
            try {
                Thread.sleep(200);
            }catch (InterruptedException e){
                System.out.println("A thread foi interrompida.");
            }
        }
        return acelerador;
    }

    //metodo parar e desligar
    public void desligarCarro(){
        //primeiro parar o carro
        while(acelerador > 0){
            acelerador--;
            System.out.println("Km/h: " + acelerador);
            try {
                Thread.sleep(200);
            }catch (InterruptedException e){
                System.out.println("A thread foi interrompida.");
            }
        }
        motor = false;
        if(motor == false && acelerador == 0){
            System.out.println("Motor desligado e carro parado");
        }
    }
}
