package great;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 * @DanielSalgado
 */
public class Abordaje implements Runnable {

    Random generador = new Random();
    public static boolean band = false;
    private int duracionAbordaje = generador.nextInt(5 + 1);
    private Aeropuerto aeropuerto;
    private Queue Viaje;
    private AdminIlegales ai;
    private Ilegal ilegal;

    public Abordaje(Aeropuerto aeropuerto, AdminIlegales ai, Ilegal ilegal, Queue cola) {
        this.aeropuerto = aeropuerto;
        this.ai = ai;
        this.ilegal = ilegal;
        this.Viaje = cola;
    }

    @Override
    public void run() {
        band = false;
        for (int j = 1; j <= this.duracionAbordaje; j++) {
            System.out.println("Abordaje Segundos: " + j);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }
        aeropuerto.Abord(ilegal);
        ilegal.changeStatus(true);
        //JOptionPane.showMessageDialog(null, "Great!!");
        if (((Avion) aeropuerto.ver()).isFull()) {
            Viaje.Queue(aeropuerto.salir());
        }
        ai.refresh();
        band = true;
    }

}
