// Importamos el paquete para el manejo de archivos
import java.io.*;
 
public class EscribirFichero1 {
 
    public static void main(String[] args) {
     
        // Creamos una variable de tipo File para manipular el archivo
        // y le asignamos la ruta de un archivo txt. En este caso,
        // asignaremos una ruta relativa.
        File archivo = new File("OtroFichero.txt");
          
        // Creamos una variable de tipo PrintWriter para escribir en el archivo
        PrintWriter escribir;
          
        // Verificamos que el archivo no existe
          
        if(!archivo.exists()) { // Si el archivo NO EXISTE...
              
            try {
                  
                // Creamos el archivo
                archivo.createNewFile();
                  
                // Asignamos un nuevo objeto PrintWriter
                //para escribir con codificación UTF-8
                escribir = new PrintWriter(archivo, "UTF-8");
              
                // Escribimos en el archivo.
                escribir.println("Primera frase escrita en el fichero");
                  
                // Cerramos el objeto de escritura
                escribir.close();
              
              
            } catch (IOException e) {
                  
                // Si no se puede lanzamos un mensaje
                //con el error que pueda ocurrir
                e.printStackTrace();
            }
        }
          
        else { // Si el archivo SI EXISTE.
              
            try {
                  
                // Asignamos un nuevo objeto PrintWriter para escribir
                // con codificación UTF-8
                escribir = new PrintWriter(archivo, "UTF-8");
              
                // Escribimos en el archivo.
                escribir.println("Nueva Primera frase escrita en el fichero");
                  
                // Cerramos el objeto de escritura
                escribir.close();
                  
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
          
        System.out.println("Programa finalizado.");
        }
}