import java.io.*;
class rect
{
int w,h;
void get(int p,int q)
{
w=p;
h=q;
}
int area()
{
return(w*h);
}
}
class rect1
{
public static void main(String args[])
{
rect x=new rect();
x.get(10,20);
System.out.println("area="+x.area());
}
}