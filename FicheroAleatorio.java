import java.io.*;

public class FicheroAleatorio {

    public static void main(String[] args) throws IOException {
        // Se abre el fichero para lectura y escritura.
        RandomAccessFile fichero = new RandomAccessFile ("binario.txt", "rw");
        
        // Nos situamos en el byte 100 del fichero.
        fichero.seek(10); 
        
        // Escribimos un "Hola" a partir de la posición 100 del fichero,
        // machacando lo que hubiera allí.
        fichero.writeChars("Hola");
        
        fichero.close();
    }
}