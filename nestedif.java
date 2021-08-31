import java.io.*;
import java.util.*;
class test
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        System.out.println("enter your math marks");
        int math_marks=x.nextInt();
        System.out.println("enter your computer marks");
        int computer_marks=x.nextInt();
        System.out.println("enter your electronics marks"); 
        int electronics_marks=x.nextInt();
        if(math_marks>20){
        if(computer_marks>20){
                if(electronics_marks>20)
                    System.out.println("PASSED");
                    else
                        System.out.println("FAILED");
                }
            else
            System.out.println("FAILED");
            }
        else
        System.out.println("FAILED");
        }
}