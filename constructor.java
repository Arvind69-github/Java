import java.io.*;
class Constructor
{
	int x,y;//instance variables 
	Constructor(int p,int q)
	{
		x=p;
		y=q;
		System.out.println("my constructor");
	}
	public static void main(String arg[])
	{
		Constructor p=new Constructor(100,-150);
		System.out.println("x="+p.x);
		System.out.println("y="+p.y);
	}
}	