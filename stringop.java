import java.io.*;
class string
{
public static void main(String args[])
{
String s1=new String("	object oriented	program ");
String s2=s1.toUpperCase();
System.out.println("UpperCase String is ="+ s2);
String s3=s2.toLowerCase();
System.out.println("LowerCase String is ="+ s3);
String s4=s1.replace('e','*');
System.out.println("replace a character in a String="+ s4);
String s5=s1.trim();
System.out.println("remove white spaces from a String="+ s5);
if(s1.equals(s2))
System.out.println("s1 and s2 are equal");
else 
System.out.println("s1 and s2 are not equal");
int len=s1.length();
System.out.println("Length of s1="+ len);
char n=s1.charAt(15);
System.out.println("Character at a 15 position in s1="+ n);
if(s1.compareTo(s2)>0)
System.out.println("s1 is bigger than s2");
else 
if(s1.compareTo(s2)<0)
System.out.print("s1 is lesser than s2");
else
if(s1.compareTo(s2)==0)
System.out.println("s1 is equal to s2");
String s6= s1.concat(s2);
System.out.println("s2 add at end of s1="+ s6);
String s7= s1.substring(15);
System.out.println("subString "+ s7);
}
}


