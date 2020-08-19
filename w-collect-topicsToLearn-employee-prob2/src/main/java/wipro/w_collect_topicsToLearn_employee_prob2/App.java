package wipro.w_collect_topicsToLearn_employee_prob2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("unlikely-arg-type")
	public static void main( String[] args )
    {
        @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
        List<Employee> a=new ArrayList<Employee>();
        String c;
        do {
        System.out.println("Enter employee id ");
        int id=sc.nextInt();
        System.out.println("Enter employee name ");
        String name=sc.next();
        System.out.println("Enter employee email ");
        String email=sc.next();
        System.out.println("Enter employee gender ");
        String gen=sc.next();
        System.out.println("Enter employee salary ");
        float sal=sc.nextFloat();   
        Employee e=new Employee(id,name,email,gen,sal);
        e.getEmployeeDetails();
        a.add(e);
        System.out.println("Do u want to enter another employee detils ");
        c=sc.next();
        }while(c.equals("yes"));
        
        System.out.println("Enter employee id to delete");
        int n=sc.nextInt();
        boolean de=deleteEmployee(a,n);
        System.out.println(de==true? "Employee of id "+n+" deleted" : " Employee of id "+n+" not deleted");
        
        System.out.println("Enter the employee id to show payslip");
        int id=sc.nextInt();
        String s1=showPaySlip(a,id);
        System.out.println("PaySlip of "+id+" is "+s1);
        
        System.out.println("Employee details are");
        Iterator t1=a.iterator();
        while(t1.hasNext()) {
        	Employee e=(Employee)t1.next();
        	System.out.println(e.empId+" "+e.empName+" "+e.email+" "+e.gender+" "+e.salary);
        }
    }
    
    public static boolean  deleteEmployee(List<Employee> a,int id1) {
    	Iterator it=a.iterator();
        while(it.hasNext()) {
        	Employee t=(Employee)it.next();
        	if(t.empId==id1){
        		return a.remove(t);
        	}
        }
		return false;
    }
    
    public static String showPaySlip(List<Employee> a1,int id) {
    	Iterator i1=a1.iterator();
    	String r;
    	while(i1.hasNext()) {
        	Employee t=(Employee)i1.next();
        	if(t.empId==id){
        		r=String.valueOf(t.salary);
        		return r;
        	}
        }
    	return "-1";
    }
}
