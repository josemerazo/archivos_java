import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class LeerObjeto {
    public static void main(String[] args) {

        int data1 = 5;
        String data2 = "This is programiz";

        try {

            FileInputStream fis = new FileInputStream("file.txt");
            // Creating an object input stream
            ObjectInputStream ois = new ObjectInputStream(ois);

            //Using the readInt() method
            System.out.println("Integer data :" + ois.readInt());

            // Using the readObject() method
            System.out.println("String data: " + ois.readObject());

            ois.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }
}