import java.io.*;
public class EscribirBinario {
 
    public static void main(String[] args) {
 
        try{
            FileOutputStream fos = new FileOutputStream("binario.txt");
            DataOutputStream dos=new DataOutputStream(fos);
 
            //Escribimos un numero
            dos.writeInt(44);
 
            //Escribimos una cadena
            dos.writeUTF("Galo");
 
            //Escribimos un numero
            dos.writeInt(1976);
 
        }catch(IOException e){
            System.out.println("Error E/S");
        }
 
    }
 
}