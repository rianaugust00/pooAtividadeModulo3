package edu.rian.listaexercicios4;

public class Televisor {
   
    int canal;
    int volume;
    boolean estado;
    
    //construtor
    public Televisor(){
        this.volume = 0;
        this.canal = 1;
        this.estado = false;    
    }
    
    public int aumentarVolume(){
        if(volume >= 10 && estado == true){
            System.out.print("Volume já esta no maximo\n");
        }else{
            volume++;
        }
        return volume;
    }
    
    public int diminuirVolume(){
        if(volume == 0 && estado == true){
            System.out.print("Volume já esta no minimo\n");
        }else{
            volume--;
        }
        return volume;
    }
    
    public int subirCanal(){
        if(canal <= 16 && estado == true){
            System.out.print("Não existem mais canais para cima\n");
        }else{
            canal++;
        }
        return canal;
    }
    
        public int descerCanal(){
        if(canal == 1 && estado == true){
            System.out.print("Não existem mais canais para baixo\n");
        }else{
            canal--;
        }
        return canal;
    }
        
        public boolean ligaTv(){
            estado = true;
            System.out.println("TV esta ligada!");
            return estado;
        }
        
        public boolean desligarTv(){
            estado = false;
            System.out.println("TV esta desligada");
            volume = 0;
            canal = 1;
            
            return estado;
        }
    
        public void mostraStatus(){
            
            if(estado == true){
                System.out.println("Canal: " + canal + " Volume: " + volume + " A tv esta ligada");   
            }else{
                System.out.println("Canal: " + canal + " Volume: " + volume + " A tv esta desligada");
            }
            
        }
    
    
}
