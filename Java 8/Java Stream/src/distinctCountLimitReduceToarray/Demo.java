package distinctCountLimitReduceToarray;

import java.util.*;
import java.util.stream.Collectors;


public class Demo {

	public static void main(String[] args) {
		List<String> vehiclesList = Arrays.asList("bus","bus","bycle","bus","car","bike");

		//distinct() -> eliminates doubles (non terminal)
		System.out.println(vehiclesList.stream().distinct().collect(Collectors.toList()));
		//vehiclesList.stream().distinct().forEach(System.out::println);
		
		System.out.println("--------------------------");

		//count() -> returns the number of objects (terminal)
		System.out.println(vehiclesList.stream().count());
		System.out.println(vehiclesList.stream().distinct().count());
		
		System.out.println("--------------------------");

		//limit() -> gives the first n objects in the stream (n is the argument passed)(non terminal)
		System.out.println(vehiclesList.stream().limit(3).collect(Collectors.toList()));

		
		System.out.println("--------------------------");
		
		
		List <Integer> numbersList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		//min() -> returns the minimum as an optional, and we get the actual value with .get() (terminal)
 		Optional <Integer> min = numbersList.stream().min((val1,val2)->{
 											return val1.compareTo(val2);
 											});
 		System.out.println(min.get());
 		
 		
 		//max() -> returns the maximum as an optional, and we get the actual value with .get() (terminal)
 		Optional <Integer> max = numbersList.stream().max((val1,val2)->{
 											return val1.compareTo(val2);
 											});
 		System.out.println(max.get());
 		
		System.out.println("--------------------------");

 		//reduce() -> returns an optional where the first argument to the operator is
 		//the return value of the previous application and second argument is the
 		//current stream element. (terminal)
 		
 		List<String> stringList = Arrays.asList("A","B","C","11","2","3");
 		Optional<String> reduced = stringList.stream()
 				.reduce((value,combinedvalue)->{
 						 return combinedvalue + value;});
 		System.out.println(reduced.get());
 		
 		Optional<String> longestString = stringList.stream()
                 .reduce((word1, word2)
           -> word1.length() > word2.length()
                         ? word1 : word2);
 		System.out.println(longestString.get());
 		
		System.out.println("--------------------------");

 		//toArray returns an object after turning the collection's data into an array
 		Object arr[] = stringList.stream().toArray();
 		System.out.println(arr);//returns address
 		System.out.println(arr[0]);//prints the value of the object
 		
 		
 		}
 		
	
 		
 		
	
}
