import java.lang.Exception;
class Exception
{
public static void main(String args[])
{
int a[]={10,20};
float x;
int b=10;
try
{
x=a[2]/b-a[1];
}
catch(ArithmeticException e)
{
System.out.println("division error");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Array Index error");
}
}
}