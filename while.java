//To print even number from 0 to n using while loop//
import java.io.*;
import java.util.*;
class whileloop
{
    public static void main(String args[])
    {
        int i;
        Scanner x=new Scanner(System.in);
        System.out.println("enter a number");
        int n=x.nextInt();
        i=0;
        System.out.println("The even numbers are: ");
        while(i<=n){
            System.out.println(i +" ");
       i=i+2;
            }
}
}