import java.io.*;    
public class DataStreamDemo {  
  public static void main(String[] args) throws IOException {  
    
    InputStream input = new FileInputStream("datastreamdemo.txt");  
    DataInputStream inst = new DataInputStream(input);  
    
    int count = input.available();
    System.out.println(count);
    byte[] arr = new byte[count];  
    
    inst.read(arr);  
    
    for (byte byt : arr) {  
      char ki = (char) byt;  
      System.out.print(ki+"-");  
    }  
  }  
}