import java.io.*;
class methodoverriding1
{
int x;
methodoverriding1(int p)
{
int x=p;
}
void display()
{
System.out.println("x="+x);
}
}
class methodoverriding2 extends methodoverriding1
{
int y;
methodoverriding2(int p,int q)
{
super(p);
y=q;
}
void display()
{
System.out.println("x="+x);
System.out.println("y="+y);
}
}
class methodoverriding3
{
public static void main(String args[])
{
methodoverriding2 a=new methodoverriding2(10,20);
a.display();
}
}

