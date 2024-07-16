
// Importamos el paquete para el manejo de archivos
import java.io.*;
// Importamos el paquete donde se encuentra el JOptionPane
import javax.swing.JOptionPane;
 
public class EscribirFichero2 {
 
    public static void main(String[] args) {
        // Creamos una variable de tipo File para manipular el archivo
    // y le asignamos la ruta de un archivo txt. En este caso,
    // asignaremos una ruta relativa.
    File archivo = new File("FicheroParaEscribir.txt");
         
    // Objeto para escribir en el archivo.
    FileWriter escribir;
         
    // Creamos una variable de tipo PrintWriter para escribir en el archivo
    // en este caso, lo almacenaremos en una variable llamada linea
    PrintWriter linea;
         
    // Declaramos dos variables donde se almacenará
        //lo que se escribirá en el fichero
    String nombre = "";
    String apellidos = "";
                 
    // Verificamos que el archivo no existe
         
    if(!archivo.exists()) { // Si el archivo NO EXISTE...
            try {
                 
                // Creamos el archivo
                archivo.createNewFile();
 
                // Pedimos los datos al usuario a través de un JOptionPane.
                nombre = JOptionPane.showInputDialog(null, "Escribe tu nombre");
                apellidos = JOptionPane.showInputDialog(null,
                        "Escribe apellidos");
 
                // Escribirmos en el archivo. Como segundo parámetro
                // le pasamos true para que escriba al final del archivo.
                escribir = new FileWriter(archivo, true);
 
                // Con esta instrucción escribimos en varias lineas.
                linea = new PrintWriter(escribir);
 
                // Escribimos en el archivo.
                linea.println(nombre + " " + apellidos);
 
                // Cerramos el objeto de escritura
                linea.close();
                escribir.close();
 
            } catch (IOException e) {
                 
        // Si no se puede lanzamos un mensaje
                //con el error que pueda ocurrir
        e.printStackTrace();
            }
    }
         
    else { // Si el archivo SI EXISTE.
             
            try {
 
                // Pedimos los datos al usuario a través de un JOptionPane.
                nombre = JOptionPane.showInputDialog(null, "Escribe tu nombre");
                apellidos = JOptionPane.showInputDialog(null,
                        "Escribe apellidos");
 
                // Escribirmos en el archivo. Como segundo parámetro
                // le pasamos true para que escriba al final del archivo.
                escribir = new FileWriter(archivo, true);
 
                // Con esta instrucción escribimos en varias lineas.
                linea = new PrintWriter(escribir);
 
                // Escribimos en el archivo.
                linea.println(nombre + " " + apellidos);
 
                // Cerramos el objeto de escritura
                linea.close();
                escribir.close();
 
            } catch (Exception e) {
                e.printStackTrace();
            }       
    }
        System.out.println("Programa finalizado.");
}
}