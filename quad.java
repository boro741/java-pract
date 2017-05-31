import java.io.*;
import java.lang.Math;

class quad
{
    public static void main(String args[])
    {
        String s;
        int a,b,c,d;
        double r1,r2;
        
        DataInputStream in = new DataInputStream(System.in);
        
        System.out.println("Enter a value: ");
        
        s = in.nextInt();
        a = Integer.parseInt(s);
        
        System.out.println("Enter b value: ");
        
        s = in.readline();
        b = Integer.parseInt(s);
        
        System.out.println("Enter c value: ");
        
        s = in.readline();
        c = Integer.parseInt(s);
        
        d = ((b*b) - (4*a*c));
        
        if(d < 0){
            System.out.println("No real solution");
        } else {
            r1 = ((-b) + Math.sqrt(d))/(2*a);
            r2 = ((-b) - Math.sqrt(d))/(2*a);
            
            System.out.println("Root 1: "+r1);
            System.out.println("Root 2: "+r2);
        }
    }
}