package great;

import java.util.Random;


/**
 * @DanielSalgado
 */
public class Abordaje implements Runnable{
    Random generador = new Random();
    public static boolean band=false;    
    private int duracionAbordaje = generador.nextInt(5+1);
    
    public Abordaje(){
        
    }
    
    @Override
    public void run() {
        band=false;
        for (int i=1; i <= this.duracionAbordaje ; i++){
            System.out.println("Abordaje Segundos: " +i);
            try{Thread.sleep( 1000 );}
            catch (InterruptedException e){
                System.err.println( e.getMessage() );
            }
        }
        band=true;
    }
    
}
