import java.io.*;
class A extends Thread
{
public void run()
{
for(int i=1;i<=3;i++)
System.out.println("thread="+i);
}
}
class B extends Thread
{
public void run()
{
for(int j=1;j<=3;j++)
System.out.println("thread="+j);
}
}
class C extends Thread
{
public void run()
{
for(int k=1;k<=3;k++)
System.out.println("thread="+k);
}
}
class multithread
{
public static void main(String args[])
{
A x=new A();
B y=new B();
C z=new C();
x.start();
y.start();
z.start();
}
}