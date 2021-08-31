import java.util.*;
class wipro
{
	public static void main(String args[])
	{
        String[][] employee = 
		{
			{"1001","Ashish","01/04/2009","e","R&D","20000","8000","3000"},
			{"1002","Sushma","23/08/2012","c","PM","3000","12000","9000"},
			{"1003","Rahul","12/11/2008","k","Acct","10000","8000","1000"},
			{"1004","Chahat","29/01/2013","r","Front Desk","12000","6000","2000"},
			{"1005","Ranjan","16/07/2005","m","Engg","50000","20000","20000"},
			{"1006","Suman","1/1/2000","e","Manufacturing","23000","9000","4400"},
			{"1007","Tanmay","12/06/2006","c","PM","29000","12000","10000"}
		};
        String[][] designation =
		{
			{"e","Engineer","20000"},
			{"c","Consultant","32000"},
			{"k","Clerk","12000"},
			{"r","Receptionist","15000"},
			{"m","Manager","40000"}
		};
        Scanner s=new Scanner(System.in);
        System.out.print("Enter employee id: ");
        String x=s.next();
        int empid = Integer.parseInt(x);
        int row=-1;
        int i=0;
        while(Integer.parseInt(employee[i][0])!=empid)
        i++;
        row=i;
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
			case 'e':	desig = "Engineer";
						salary = basic + hra + 20000 - it;
						break;
			case 'c':	desig = "Consultant";
						salary = basic + hra + 32000 - it;
						break;
			case 'k':	desig = "Clerk";
						salary = basic + hra + 12000 - it;
						break;
			case 'r':	desig = "Receptionist";
						salary = basic + hra + 15000 - it;
						break;
			case 'm':	desig = "Manager";
						salary = basic + hra + 40000 - it;
						break;
		}
        if(employee[i][0].equals(x)){
            row=i;
        System.out.println("EmpNo\t\t"+empid);
        System.out.println("EmpName\t\t"+empName);
        System.out.println("Department\t"+department);
        System.out.println("Designation\t"+desig);
        System.out.println("Salary\t\t"+salary);
        }
            else{
                System.out.println("There is no employee with empid : ");
            }
    }
}