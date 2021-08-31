import java.io.*;
import java.util.Scanner;
class ifelse 
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter your marks from 0-50");
        int marks=x.nextInt();
        if(marks>=20)
        System.out.println("Pass");
            else
                System.out.println("fail");
    }
}