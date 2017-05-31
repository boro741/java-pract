import java.util.*;

class iterator
{
    public static void main(String args[])
    {
        ArrayList<String> list = new ArrayList<String>();
        
        list.add("Pavan");
        list.add("Boro");
        
        String s = list.get(0);
        System.out.println("Element is: "+s);
        
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}