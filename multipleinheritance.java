import java.io.*;
class student
{
int rno,m1,m2,m3;
void getrno(int p)
{
rno=p;
}
void getmarks(int p,int q,int r)
{ 
m1=p;
m2=q;
m3=r;
}
}
interface sport
{
final int sp=10;
void dispsport();
}
class student1 extends student implements sport
{
int tot;
public void dispsport()
{
System.out.println("sports points="+sp);
}
void process()
{
tot=m1+m2+m3+sp;
System.out.println("rno="+rno);
System.out.println("m1="+m1);
System.out.println("m2="+m2);
System.out.println("m3="+m3);
dispsport();
System.out.println("tot="+tot);
}
}
class student2
{
public static void main(String args[])
{
student1 x= new student1();
x.getrno(10);
x.getmarks(30,30,30);
x.process();
}
}

