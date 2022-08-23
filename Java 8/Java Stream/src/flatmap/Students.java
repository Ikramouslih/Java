package flatmap;
import java.util.*;
import java.util.stream.Collectors;

public class Students {

	public static class Student
	{
		int id;
		String name;
		char grade;
		
		public Student(int id,String name, char grade)
		{
			this.id = id;
			this.name = name;
			this.grade = grade;
		}
	}
	
	public static void main(String[] args) {
		
		List<Student> studentList1 = new ArrayList<Student>();
		studentList1.add(new Student(1,"name1",'A'));
		studentList1.add(new Student(2,"name2",'B'));
		studentList1.add(new Student(3,"name3",'A'));
	
		List<Student> studentList2 = new ArrayList<Student>();
		studentList1.add(new Student(4,"name4",'B'));
		studentList1.add(new Student(5,"name5",'A'));
		studentList1.add(new Student(6,"name6",'C'));
		
		List<List<Student>> studentList = Arrays.asList(studentList1,studentList2);
		
		System.out.println(studentList.stream().
				flatMap(x->x.stream().map(s->s.name)).
				collect(Collectors.toList()));

	}

}
