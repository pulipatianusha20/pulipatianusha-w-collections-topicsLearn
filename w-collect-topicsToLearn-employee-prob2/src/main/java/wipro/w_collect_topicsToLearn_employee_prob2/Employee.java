package wipro.w_collect_topicsToLearn_employee_prob2;

public class Employee {
	 int empId;
	 String empName;
	 String email;
	 String gender;
	 float salary;
	Employee(int empId,String empName,String email,String gender,float salary){
		this.empId=empId;
		this.empName=empName;
		this.email=email;
		this.gender=gender;
		this.salary=salary;
	}
	public void getEmployeeDetails() {
		System.out.println("Employee Details are");
		System.out.println("EmpId : "+empId);
		System.out.println("EmpName : "+empName);
		System.out.println("Email : "+email);
		System.out.println("Gender : "+gender);
		System.out.println("Salary : "+salary);
	}
}
