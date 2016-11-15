package great;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class HiloAbordaje implements Runnable{
    
    private JProgressBar barraProgreso;
    private int i = 1;
    private int value = 50;//retardo en milisegundos
    
    public HiloAbordaje( JProgressBar barraProgreso)
    {
        this.barraProgreso = barraProgreso;
    }

    @Override
    public void run() {
        i=1;        
        while( !Abordaje.band )
        {
            //si llega al limite 100 comienza otra vez desde 1, sino incrementa i en +1
            i = (i >100) ? 1 : i+1;
            barraProgreso.setValue(i);
            barraProgreso.repaint();  
            //duracion en milisegundos
            try{Thread.sleep(this.value );}            
            catch (InterruptedException e){ System.err.println( e.getMessage() ); }            
            //si el trabajo en paralelo a terminado
            if( Abordaje.band )
            {
                barraProgreso.setValue(1000);
                JOptionPane.showMessageDialog(null, "El Ilegal Termino Su Abordaje");
                break;  
            }            
        }
    }

}
