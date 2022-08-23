package flatmap;

import java.util.*;
import java.util.stream.Collectors;


public class FlatMapDemo {

	public static void main(String[] args) {
		
		//flatMap() returns a stream consisting of the results of replacing each element of 
		//this stream with the contents of a mapped stream produced by applying the provided 
		//mapping function to each element
		//non terminal
		List <Integer> list1 = Arrays.asList(1,2);
		List <Integer> list2 = Arrays.asList(3,4);
		List <Integer> list3 = Arrays.asList(5,6);
		
		List<List<Integer>> finalList = Arrays.asList(list1,list2,list3);
		
		//each x is a collection, x->x.stream adds each collection to the stream
		//then, we modify each number in the stream with map
		List <Integer> finalResults = finalList.stream().flatMap(x->x.stream().map(n->n+10)).collect(Collectors.toList());
		System.out.println(finalResults); 
		
		System.out.println("---------------------------");
		
		List<String> teamA = Arrays.asList("Scott","David","John");
		List<String> teamB = Arrays.asList("Mary","Luna","Tom");
		List<String> teamC = Arrays.asList("Ken","Jony","Kitty");
		
		List<List<String>> players = new ArrayList<List<String>>();
		players.add(teamA);
		players.add(teamB);
		players.add(teamC);
		
		System.out.println(players.stream().flatMap(x->x.stream()).collect(Collectors.toList()));
		
	}

}
