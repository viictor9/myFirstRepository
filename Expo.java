class Expo
{
    int x, result;
    public void squ()
    {
        result=x*x;
        System.out.println("Square="+result);
    }
    public void cub()
    {
        result=x*x*x;
        System.out.println("Cube="+result);
    }
}

public class Expo
{
    public static void main(String[]args)
    {
        Expo obj1=new Expo();
        obj1.x=2;
        obj1.squ();
        obj1.cub();
    }
}
