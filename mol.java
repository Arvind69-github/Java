import java.io.*;
class mol
{
int add(int p,int q)
{
return(p+q);
}
float add(int p,int q,float r)
{
return(p+q+r);
}
}
class mol1
{
public static void main(String args[])
{
mol x=new mol();
int a=x.add(10,20);
float b=x.add(10,20,15.35f);
System.out.println("a="+a);
System.out.println("b="+b);
}
}