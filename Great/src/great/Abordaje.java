package great;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

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
    JProgressBar barraViaje;

    public Abordaje(Aeropuerto aeropuerto, AdminIlegales ai, Ilegal ilegal, Queue cola,JProgressBar barraViaje) {
        this.aeropuerto = aeropuerto;
        this.ai = ai;
        this.ilegal = ilegal;
        this.Viaje = cola;
        this.barraViaje = barraViaje;
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
        if (((Avion) aeropuerto.ver()).isFull()) {
            Viaje.Queue(aeropuerto.salir());
            aeropuerto.entrar((Avion)Viaje.Dequeue());
            new Thread(new Viaje()).start();
            new Thread(new HiloViaje(this.barraViaje)).start();
        }
        ai.refresh();
        band = true;
    }

}
