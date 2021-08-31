import java.io.*;
class ifelseif
{
public static void main(String arg[])
{
int a,b,c;
a=Integer.parseInt(arg[0]);
b=Integer.parseInt(arg[1]);
c=Integer.parseInt(arg[2]);
if(a>b && a>c)
System.out.println("a is big");
else
if(b>c)
System.out.println("b is big");
else
System.out.println("c is big");
}
}