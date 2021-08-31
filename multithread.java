class a extends thread
{
public void run()
{
for(int i=1;i<=5;i++)
System.out.print("Thread A"+i);
}
}
class b extends thread
{
public void run()
{
for(int j=1;j<=5;j++)
System.out.print("Thread b"+j);
}
}
class thread
{
public static void main(String args[])
{
a t1=new a();
b t2=new b();
t1.start();
t2.start();
}
}