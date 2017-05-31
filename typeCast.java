import java.util.* ;

class typeCast
{
    public static void main(String args[])
    {
        List list = new ArrayList();
        list.add("hello");

        String s = (String) list.get(0);

        System.out.println(s);
    }

}