package great;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AdminIlegales {

    private File archivo;
    private LinkedList Ilegales;

    public AdminIlegales(String path) {
        this.archivo = new File(path);
    }

    public LinkedList getList() {
        return Ilegales;
    }

    public void setList(LinkedList x) {
        this.Ilegales = x;
    }

    public void refresh() {
        File Guardar = null;
        try {
            Guardar = new File("./ilegales.bin");
            FileOutputStream salidaSobrEscritura = new FileOutputStream(Guardar);
            ObjectOutputStream objectoSobrescritura = new ObjectOutputStream(salidaSobrEscritura);
            for (int i = 0; i < Ilegales.size; i++) {
                objectoSobrescritura.writeObject(Ilegales.get(i));
            }
            objectoSobrescritura.flush();
            objectoSobrescritura.close();
            salidaSobrEscritura.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void write(Ilegal neo) {
        try {
            File archivo = null;
            try {
                archivo = new File("./ilegales.bin");
                if (!archivo.exists()) {//Se escribe el primer objeto
                    FileOutputStream salidaEscritura = null;
                    ObjectOutputStream objetoEscritura = null;
                    salidaEscritura = new FileOutputStream(archivo);
                    objetoEscritura = new ObjectOutputStream(salidaEscritura);
                    objetoEscritura.writeObject(neo);
                    objetoEscritura.flush();
                    objetoEscritura.close();
                    salidaEscritura.close();
                } else {//sobrescribir archivo Carga datos al arraylist
                    FileInputStream entradaLectura = new FileInputStream(archivo);
                    ObjectInputStream objetoLectura = new ObjectInputStream(entradaLectura);
                    Ilegal temp;
                    Ilegales = new LinkedList();
                    //Cargar Objetos del archivo al arraylist
                    try {
                        while ((temp = (Ilegal) objetoLectura.readObject()) != null) {
                            Ilegales.add(temp);
                        }
                    } catch (Exception e) {
                        //fin archivo
                    } finally {
                        entradaLectura.close();
                        objetoLectura.close();
                    }
                    Ilegales.add(neo);
                    //sobrescribir archivo
                    FileOutputStream salidaSobrEscritura = new FileOutputStream(archivo);
                    ObjectOutputStream objectoSobrescritura = new ObjectOutputStream(salidaSobrEscritura);
                    for (int i = 0; i < Ilegales.size; i++) {
                        objectoSobrescritura.writeObject(Ilegales.get(i));
                    }
                    objectoSobrescritura.flush();
                    objectoSobrescritura.close();
                    salidaSobrEscritura.close();
                }//Fin else
            } catch (Exception e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
        }
    }
    
    public void cargarArchivo() {
        File archivo = null;
        try {
            archivo = new File("./ilegales.bin");
            if (archivo.exists()) {
                //leer lo que ya tiene el archivo y cargarlo en el ArrayList
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                Ilegal temp;
                Ilegales = new LinkedList();
                try {
                    while ((temp = (Ilegal) objeto.readObject()) != null) {
                        Ilegales.add(temp);
                    }
                } catch (EOFException e) {
                } finally {
                    objeto.close();
                    entrada.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
