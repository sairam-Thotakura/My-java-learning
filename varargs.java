public class varargs {
    public static void main(String[] args) {
      main obj=new main();
      obj.display(4,5,6);
    }
}

class main
{
    public void display(int ... a)
    {
        for(int i:a)
        {
            System.out.println(i);
        }
    }
}



