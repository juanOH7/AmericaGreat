package great;

import java.util.Random;


/**
 * @DanielSalgado
 */
public class Abordaje implements Runnable{
    Random generador = new Random();
    public static boolean band=false;    
    private int duracionRuta = generador.nextInt(5+1);
    
    public Abordaje(){
        
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
