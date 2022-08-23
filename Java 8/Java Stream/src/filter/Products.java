package filter;
import java.util.*;
import java.util.stream.Collectors;

class Product
{
	private String name;
	private double price;
	
	public Product(String name, double price)
	{
		this.name = name;
		this.price = price;
	}
	
	public double getPrice()
	{
		return this.price;
	}
	
	public String getName()
	{
		return this.name;
	}
	
}
public class Products {

	public static void main(String[] args) {
	
		List<Product> productsList = new ArrayList<Product>();
		
		productsList.add(new Product("name1" , 50));
		productsList.add(new Product("name2" , 40));
		productsList.add(new Product("name3" , 70));
		productsList.add(new Product("name4" , 80));
		productsList.add(new Product("name5" , 30));
		
		
		List<Product> filteredProducts = new ArrayList<Product>();
		filteredProducts = productsList.stream().filter(n-> n.getPrice()>50).collect(Collectors.toList());		
		for(Product i : filteredProducts)
		{
			System.out.println(i.getName());
		}
		
		//productsList.stream().filter(n -> n.getPrice() > 50).forEach(n->System.out.println(n.getName()));

	}

}
