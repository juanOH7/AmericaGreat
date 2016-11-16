package great;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class HiloViaje implements Runnable{
    
    private JProgressBar barraViaje;
    private int i = 1;
    private int value = 100;//retardo en milisegundos

    /**
     * Constructor de clase
     */
    public HiloViaje( JProgressBar barraViaje)
    {
        this.barraViaje = barraViaje;
    }

    @Override
    public void run() {
        i=1;        
        while( !Viaje.band )
        {
            //si llega al limite 100 comienza otra vez desde 1, sino incrementa i en +1
            i = (i > 100) ? 1 : i+1;
            barraViaje.setValue(i);
            barraViaje.repaint();  
            //duracion en milisegundos
            try{Thread.sleep(this.value );}            
            catch (InterruptedException e){ System.err.println( e.getMessage() ); }            
            //si el trabajo en paralelo a terminado
            if( Viaje.band )
            {
                barraViaje.setValue(1000);
                JOptionPane.showMessageDialog(null, "El Avion Termino Su Ruta");
                break;  
            }            
        }
    }

}
