package great;

import java.util.Random;


/**
 * @DanielSalgado
 */
public class Viaje implements Runnable{
    Random generador = new Random();
    public static boolean band=false;    
    private int duracionRuta = 5+generador.nextInt((10+1)-5);;
    
    public Viaje(){
        
    }
    
    @Override
    public void run() {
        band=false;
        for (int i=1; i <= this.duracionRuta ; i++){
            System.out.println("Viajando Segundos: " +i);
            try{Thread.sleep( 1000 );}
            catch (InterruptedException e){
                System.err.println( e.getMessage() );
            }
        }
        band=true;
    }
    
}
