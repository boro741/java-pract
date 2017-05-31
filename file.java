import java.io.*;

class file 
{
    public static void main(String args[]) throws Exception
    {
        File f = new File("hello.txt");
        FileOutputStream fos = new FileOutputStream(f);
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeUTF("Hello World");
        
        FileInputStream fis = new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);
        
        String s = dis.readUTF();
        
        System.out.println(s);
        
    }
}