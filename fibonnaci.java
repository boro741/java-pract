import java.io.*;
import java.util.*;

class fibonacci
{
    public static void main(String args[])
    {
        String s;
        int a = 1,  b = 1, c = a+b, n;
        
        System.out.println("Enter nth value: ");
        Scanner in = new Scanner(System.in);
        
        n = in.nextInt();
        //n = Integer.parseInt(s);
        
        System.out.print(a + ","+b);
        
        while(c <= n)
        {
            System.out.print(","+c);
            
            a = b;
            b = c;
            c = a+b;
        }
    }
}