package filter;
import java.util.*;
import java.util.stream.Collectors;
public class FilterDemo  {

	public static void main(String[] args) {
		//filter() filters out a stream using a condition in a lambda expression (non terminal)
		
		List <Integer> numberList = Arrays.asList(10,15,20,25,30);//another way to create a list
		List <Integer> evenNumberList = new ArrayList<Integer>();
		
		//n is each element in the stream
		//even numbers will be added in this list
		evenNumberList = numberList.stream().filter(n->n%2==0).collect(Collectors.toList());//1st method
		System.out.println(evenNumberList);
		
		//numberList.stream().filter(n->n%2==0).forEach(n->System.out.println(n));//2nd method
		//numberList.stream().filter(n->n%2==0).forEach(System.out::println);//3rd method
		
		System.out.println("------------------------");

		List<String> names = Arrays.asList("Ikram","Khadija","Mohamed","Meryem","Hakim","Floki");
		
		List<String> filteredNames = new ArrayList<String>();
		filteredNames = names.stream().filter(n->n.length()>6 && n.length()<8).collect(Collectors.toList());
		System.out.println(filteredNames);
		
		//names.stream().filter(n-> n.length() > 6 &&  n.length() < 8 ).forEach(System.out::println);
		//names.stream().filter(n-> n.length() > 6 &&  n.length() < 8 ).forEach(n->System.out.println(n));
		
		System.out.println("------------------------");

		List<String> words = Arrays.asList("animals",null,"family","money","career",null,null);
		
		List<String> filteredWords = new ArrayList<String>();
		filteredWords = words.stream().filter(str->str != null).collect(Collectors.toList());
		System.out.println(filteredWords);
		
		//words.stream().filter(str -> str != null).forEach(str->System.out.println(str));
		//words.stream().filter(str -> str != null).forEach(System.out::println);

	}

}
