package map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Employees {

	public static class Employee
	{
		int id;
		String name;
		int salary;
		
		public Employee(int id, String name,int salary)
		{
			this.id = id;
			this.name = name;
			this.salary = salary;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> employeesList = Arrays.asList(
				new Employee(1,"name1",20000),
				new Employee(2,"name2",10000),
				new Employee(3,"name3",15000),
				new Employee(4,"name4",23000),
				new Employee(5,"name5",9000)
				);
		List<Integer> employeeSalList = employeesList.stream().filter(e->e.salary > 20000).map(e->e.salary).collect(Collectors.toList());
		System.out.println(employeeSalList);
		
				
	}

}
