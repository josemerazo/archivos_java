import java.io.File;

public class UsoFile {
    public static void main(String args[]) { 
        File fichero = new File("FicheroEjemplo.txt"); 
        
        if (fichero.exists()) { 
            System.out.println("Nombre del archivo "+ fichero.getName()); 
            System.out.println("Ruta "+ fichero.getPath()); 
            System.out.println("Ruta absoluta "+ fichero.getAbsolutePath()); 
            System.out.println("Se puede escribir "+fichero.canRead()); 
            System.out.println("Se puede leer "+fichero.canWrite()); 
            System.out.println("Tamaño "+fichero.length()); 
            
        } 
        else {
            System.out.println("Fichero no existe"); 
        }
    }
}