interface area
{
final float pi=3.14f;
float compute(float p,float q);
}
class rectangle implements area
{
public float compute(float p,float q)
{
return(p*q);
}
}
class circle implements area
{
public float compute(float p,float q)
{
return(pi*p*p);
}
}
class area1
{
public static void main(String args[])
{
rectangle r = new rectangle();
circle c = new circle();
area a;
a=r;
System.out.println("rectangle area="+a.compute(10,20));
a=c;
}
}