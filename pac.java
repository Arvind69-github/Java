class student1
{
int rno;
public void getrno(int p)
{
rno=p;
}
public void display()
{
System.out.println("roll no="+rno);
}
}
class marks1
{
public int m1,m2,m3;
public void getmarks(int p,int q,int r)
{
m1=p;
m2=q;
m3=r;
}
void dispmarks()
{
System.out.println("m1="+m1);
System.out.println("m2="+m2);
System.out.println("m3="+m3);
}
}
class package1
{
public static void main(String args[])
{
student1 x=new student1();
marks1 y=new marks1();
x.getrno(10);
y.getmarks(30,30,30);
x.disp();
y.dispmarks();
}
}

