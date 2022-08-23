package sortedMatchingopsConcat;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Demo {

	public static void main(String[] args) {
		
		
		//sorted() -> sorts the stream (non terminal)
		
		//numbers
		List <Integer> numbersList = Arrays.asList(1,7,5,8,9,4,6,37,5,5,7);
		//Asc
		System.out.println(numbersList.stream().sorted().collect(Collectors.toList()));
		//Desc
		System.out.println(numbersList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));//asc
		//strings
		List <String> stringsList = Arrays.asList("a","z","d","f","gg","go","hi","hello","rr");
		//Asc
		System.out.println(stringsList.stream().sorted().collect(Collectors.toList()));
		//Desc
		System.out.println(stringsList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));//asc

		System.out.println("----------------------");
		
		
		
		Set<String> fruites = new HashSet<String>();
		fruites.add("one apple");
		fruites.add("one mango");
		fruites.add("two apples");
		fruites.add("more garpes");
		fruites.add("two guavas");
		
		//anyMatch() -> returns bool, true if at least one element in the stream matches
		boolean results = fruites.stream().anyMatch(value-> {return value.startsWith("one");});
		System.out.println(results);//true 
		
		//allMatch() -> returns bool, true if all the elements in the stream match
		System.out.println(fruites.stream().allMatch(value-> {return value.startsWith("one");}));//false

		//noneMatch() ->  returns bool, true if none of the elements in the stream match
		System.out.println(fruites.stream().noneMatch(value-> {return value.startsWith("one");}));//false
		
		System.out.println("----------------------");
		
		
		List<String> stringList = Arrays.asList("one", "two","three","four");
		//findAny -> returns optional any element of the stream, null if stream is emplty
		Optional<String> element1 = stringList.stream().findAny();
		System.out.println(element1.get()); 
		
		//findFirst -> returns optional first element of the stream if ordered, any elementif not, null if stream is emplty
		Optional<String> element2 = stringList.stream().findFirst();
		System.out.println(element2.get());
		
		System.out.println("----------------------");
		
		//concatenation of two streams
		Stream<String> stream1 = fruites.stream();
		Stream<String> stream2 = stringList.stream();
		
		List<String> finalList = Stream.concat(stream1,stream2).collect(Collectors.toList());
		System.out.println(finalList);
		
	}

}
