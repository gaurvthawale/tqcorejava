package com.employee;

public class EmployeeTest {
	
	public static void displayEmployeesByDepartment(Employee[] emp, Department[] dept)
	{
		for(Department d:dept)
		{
			System.out.println("Department: "+d.getDname());
			for(Employee e:emp)
			{
				
				if(e.getDept().equals(d))
					System.out.println(e);
				
			}
			System.out.println();
		}
	}
	
	public static void sortEmployeeBySalary(Employee[] emp)
	{
		Employee e = new Employee();
		
		
		for(int i=0;i<emp.length;i++)
		{
			for(int j=i+1;j<emp.length;j++)
			{
				if(emp[i].getSalary()>emp[j].getSalary())
				{
					e = emp[i];
					emp[i]=emp[j];
					emp[j]=e;
				}
			}
		}
	}
	
	public static void printDetails(Employee[] emp)
	{
		for(Employee e : emp)
		{
			System.out.println(e);
		}
	}
	
	public static void highestSalaryEmployee(Employee[] emp)
	{
		float hSalary = Float.MIN_VALUE;
		Employee e = new Employee();
		
		for(Employee em : emp)
		{
			if(em.getSalary()>hSalary)
			{
				hSalary=em.getSalary();
			}
		}
		
		System.out.print(hSalary+" :");
		for(Employee em : emp)
		{
			if(em.getSalary()==hSalary)
			{
				System.out.println(em);
			}
		}
	}
	
	public static void displayDepartmentAndEmployeeCount(Employee[] emp,Department[] dept)
	{
		int cnt;
		for(int i=0;i<dept.length;i++)
		{
			System.out.print(dept[i].getDname()+" : ");
			cnt=0;
			for(int j=0;j<emp.length;j++)
			{
				if(emp[j].getDept().equals(dept[i]))
				{
					cnt++;
				}
			}
			System.out.println(cnt);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Department[] dept = new Department[3];
		
		dept[0]=new Department(1,"Sales");
		dept[1]=new Department(2,"Production");
		dept[2]=new Department(3,"Developement");
		
		Employee[] emp = new Employee[5];
		
		emp[0]= new Employee(1,"gaurav",15000f,dept[0]);
		emp[1]= new Employee(2,"pratik",5000f,dept[1]);
		emp[2]= new Employee(3,"omkar",4000f,dept[0]);
		emp[3]= new Employee(4,"sachin",9000f,dept[1]);
		emp[4]= new Employee(5,"shailesh",7000f,dept[2]);
		
		printDetails(emp);
		System.out.println();
		
		sortEmployeeBySalary(emp);
		
		System.out.println("After Sorting by salary");
		System.out.println();
		
		printDetails(emp);
		System.out.println();
		
		System.out.println("Highest Salary Employee");
		System.out.println();
		highestSalaryEmployee(emp);
		System.out.println();
		
		System.out.println("Display Employees By Department");
		System.out.println();
		displayEmployeesByDepartment(emp, dept);
		System.out.println();
		
		System.out.println("Display Department & Employee Count");
		System.out.println();
		displayDepartmentAndEmployeeCount(emp, dept);
	}

	

}
