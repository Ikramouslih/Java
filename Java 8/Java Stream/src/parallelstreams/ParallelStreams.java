package parallelstreams;
import java.util.*;

class Student
{
	String name;
	int score;
	
	Student(String name, int score)
	{
		this.name = name;
		this.score = score;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getScore()
	{
		return this.score;
	}
	
}
public class ParallelStreams {

	
	public static void main(String[] args) {
		
		List<Student> studentList = Arrays.asList(
				new Student("David",82),
				new Student("Bob",90),
				new Student("John",65),
				new Student("Canedy",90),
				new Student("Bob",82)				
				);
		
		//sequential stream (stream())
		studentList.stream().filter(s->s.getScore()>=80)
						.limit(3)
						.forEach(stu->System.out.println(stu.getName()+" "+stu.getScore()));
				

		//parallel stream (parallelStream())
		studentList.parallelStream().filter(s->s.getScore()>=80)
						.limit(3)
						.forEach(stu->System.out.println(stu.getName()+" "+stu.getScore()));
						
		
	}

}
