package great;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
/**
 * @web http://www.jc-mouse.net
 * @author Mouse
 */
public class HiloViaje implements Runnable{
    
    Random generador = new Random();
    private JProgressBar barraProgreso;
    private int i = 1;
    private int value = 100;//retardo en milisegundos

    /**
     * Constructor de clase
     */
    public HiloViaje( JProgressBar barraProgreso)
    {
        this.barraProgreso = barraProgreso;
    }

    @Override
    public void run() {
        i=1;        
        while( !Viaje.band )
        {
            //si llega al limite 100 comienza otra vez desde 1, sino incrementa i en +1
            i = (i > 100) ? 1 : i+1;
            barraProgreso.setValue(i);
            barraProgreso.repaint();  
            //duracion en milisegundos
            try{Thread.sleep(this.value );}            
            catch (InterruptedException e){ System.err.println( e.getMessage() ); }            
            //si el trabajo en paralelo a terminado
            if( Viaje.band )
            {
                barraProgreso.setValue(1000);
                JOptionPane.showMessageDialog(null, "El Avion Termino Su Ruta");
                break;  
            }            
        }
    }

}
