package great;

import java.util.Random;
import javax.swing.JOptionPane;


/**
 * @DanielSalgado
 */
public class Abordaje implements Runnable {
    Random generador = new Random();
    public static boolean band=false;    
    private int duracionAbordaje = generador.nextInt(5+1);
    private Aeropuerto aeropuerto = new Aeropuerto();
    private Queue Viaje = new Queue();
    private AdminIlegales ai = new AdminIlegales("./ilegales.bin");
    private Ilegal ilegal = new Ilegal();
    
    public Abordaje(Aeropuerto aeropuerto,AdminIlegales ai,Ilegal ilegal) {
        this.aeropuerto = aeropuerto;
        this.ai = ai;
        this.ilegal = ilegal;
    }
    
    
    @Override
    public void run() {
        band=false;
        for (int j=1; j <= this.duracionAbordaje ; j++){
            System.out.println("Abordaje Segundos: " +j);
            if (!ilegal.isDeported()) {
                aeropuerto.Abord(ilegal);
                ilegal.changeStatus(true);
                //JOptionPane.showMessageDialog(null, "Great!!");
                if (((Avion)aeropuerto.ver()).isFull()) {
                    Viaje.Queue(aeropuerto.salir());
                }
            } else {
                JOptionPane.showMessageDialog(null, "El Ilegal ya ha sido deportado!", "Error", JOptionPane.WARNING_MESSAGE);
            }
            for (int i  = 0; i <= ai.getList().size; i++) {
                System.out.println(((Ilegal)ai.getList().get(i)).isDeported());
            }
            ai.refresh();
            try{Thread.sleep( 1000 );}
            catch (InterruptedException e){
                System.err.println( e.getMessage() );
            }
        }
        band=true;
    }
    
}
