import java.io.*;
class Inher
{
    int x;
    void get(int p)
    {
        x=p;
    }
}
class Inher1 extends Inher
{
    int y;
    void get1(int p)
    {
        y=p;
        System.out.println("x= "+x);
        System.out.println("y="+y);
    }
}
class Inher2
{
    public static void main(String args[])
    {
        Inher1 obj = new Inher1();
        obj.get(100);
        obj.get1(-50);
    }
}