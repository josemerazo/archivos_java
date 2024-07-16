// Importamos el paquete donde se encuentra la clase Random
import java.io.*;
 
public class LeerFichero {
    public static void main(String[] args) {
        // Creamos una variable de tipo File para manipular el archivo
        // y le asignamos la ruta de un archivo txt. En este caso,
        // asignaremos una ruta relativa.
        File archivo = new File("FicheroEjemplo.txt");
         
        // Creamos una variable para leer el archivo
        FileReader leer;
         
        // Creamos una variable para leer el texto de nuestro archivo
        String cadena;
         
        // Creamos una variable objeto que contendrá
        // una instancia de tipo FileReader dentro de una estructura
        // de control de errores try - catch.
         
        try {
            leer = new FileReader(archivo);
             
            try (
                // Creamos una instancia de tipo BufferedReader
                // Para almacenar lo que se va leyendo.
                BufferedReader lecturaAlmacenada = new BufferedReader(leer)) {
                cadena="";
                while(cadena != null){
                    cadena = lecturaAlmacenada.readLine();
                    if(cadena !=null){
                        System.out.println(cadena);
                    }
                }
            }
            leer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}