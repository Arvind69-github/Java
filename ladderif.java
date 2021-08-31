import java.io.*;
import java.util.Scanner;
class ladderif  
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter your marks from range 0-50");
        int marks=x.nextInt();
        {
        if(marks<=50 && marks>=40)
            System.out.println("A grade");
        else if(marks<40 && marks>=30)
            System.out.println("B grade");
        else if(marks<30 && marks>=20)
            System.out.println("C grade");
        else if(marks<20)
            System.out.println("Fail");
        else
            System.out.println("wrong choice");
        }
    }
}