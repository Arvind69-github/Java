import java.io.*;
import java.util.*;
class project
{
	public static void main(String args[])
	{
		int i=0,p;
        String[][] employee = 
		{
			{"1001","saisiva","01/08/2021","a","R&D","20000","8000","3000"},
			{"1002","kishore","02/08/2021","b","PM","3000","12000","9000"},
			{"1003","aravind","03/08/2021","c","Acct","10000","8000","1000"}
		};
        String[][] designation =
		{
			{"a","Engineer","20000"},
			{"b","Consultant","32000"},
			{"c","Clerk","12000"}
		};
        Scanner s=new Scanner(System.in);
        System.out.print("Enter employee ID");
        String x=s.next();
        int empid = Integer.parseInt(x);
        while(Integer.parseInt(employee[i][0])!=empid){
        i++;
        }
        char desigCode = employee[i][3].charAt(0);
		String desig = "";
		int salary = 0;
		String empName = employee[i][1];
		String department = employee[i][4];
		int basic = Integer.parseInt(employee[i][5]);
		int hra = Integer.parseInt(employee[i][6]);
		int it = Integer.parseInt(employee[i][7]);
        switch(desigCode)
		{
			case 'a':	desig = "Engineer";
						salary = basic + hra + 20000 - it;
						break;
			case 'b':	desig = "Consultant";
						salary = basic + hra + 32000 - it;
						break;
			case 'c':	desig = "Clerk";
						salary = basic + hra + 12000 - it;
	   }
        System.out.println("Emp No\t\tEmp Name\t\tDepartment\t\tDesignation\t\tSalary");
		System.out.println(empid+"\t\t"+empName+"\t\t\t"+department+"\t\t\t"+desig+"\t\t"+salary);
}
	return 0;
}