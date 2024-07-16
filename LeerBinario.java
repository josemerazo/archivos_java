import java.io.*;
public class LeerBinario {
 
    public static void main(String[] args) {
 
        try {
            FileInputStream fis = new FileInputStream("binario.ddr");
            DataInputStream dis = new DataInputStream(fis);
 
            //Leemos un numero y lo mostramos
            System.out.println(dis.readInt());
 
            //Leemos una cadena y lo mostramos
            System.out.println(dis.readUTF());
 
            //Leemos un numero y lo mostramos
            System.out.println(dis.readInt());
 
        }catch(IOException e){
            System.out.println("Error E/S");
        }
 
    }
 
}