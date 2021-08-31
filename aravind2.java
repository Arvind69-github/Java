import java.io.*;
class Inher
{
    int x;
    Inher(int p)
    {
        x=p;
        System.out.println("super class");
    }
}
class Inher1 extends Inher
{
    int y;
    Inher1(int p,int q)
    {
       super(p);
       y=q;
        System.out.println("sub class");
    }
}
class Inher2
{
    public static void main(String args[])
    {
        Inher1 obj = new Inher1(100,50);
        System.out.println("x="+obj.x); 
        System.out.println("y="+obj.y);
    }
}