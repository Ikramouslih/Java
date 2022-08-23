package map;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {

	public static void main(String[] args) {
		
		//map modifies a stream using a lambda expression (non terminal)
		
		List<String> vehicles = Arrays.asList("bus","car","bicycle","flight","train");

		//vehicles.stream().map(n->n.toUpperCase()).forEach(n->System.out.println(n));
		//vehicles.stream().map(n->n.toUpperCase()).forEach(System.out::println);

		List<String> upperVehicles = new ArrayList<String>();
		upperVehicles = vehicles.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
		System.out.println(upperVehicles);
		
		System.out.println("------------------------");

		vehicles.stream().map(n-> n.length()).forEach(System.out::println);
		vehicles.stream().map(n-> n.length()).forEach(len->System.out.println(len));
		
		System.out.println("------------------------");

		List<Integer> numbersList= Arrays.asList(2,3,4,5);
		
		numbersList.stream().map(n->n*3).forEach(System.out::println);
		numbersList.stream().map(n->n*3).forEach(n->System.out.println(n));
	
		
		
	}

}
