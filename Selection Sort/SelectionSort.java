import java.util.Scanner;
import java.util.ArrayList;
public class SelectionSort 
{
	
	public static void main(String[] args) 
	{
		
		Scanner inp = new Scanner(System.in);
		
		//Getting the length of the array
		System.out.println("Hello! Enter the length of the array to be sorted:");
		int leng = inp.nextInt();
		
		
		
		//With Arrays
		System.out.println("First, We'll work with static Arrays!");
		int tab[]= new int[leng];
		
		//Input of the numbers 
		for (int i = 0 ; i < leng ; i++ )
		{
			System.out.println("Enter a number : ");
			tab[i]=inp.nextInt();	
		}
		
		//Selection sort Asc
		int temp;
		for (int i = 0 ; i < tab.length - 1 ; i++ ) 
		{
			for(int j = i+1 ; j < tab.length ; j++)
			{
				if(tab[i] > tab[j])
				{
					temp= tab[i];
					tab[i] = tab[j]; 
					tab[j] = temp;	
				}
			}
		}
				
		//Output
		System.out.println("The sorted array : ");
		System.out.print("| "); 
		for (int i = 0 ; i < tab.length ; i++ ) 
		{
			System.out.print(tab[i]+" | "); 
		}
		
		
		
		System.out.println("\n---------------------------------");		
		
		
		
		//With ArrayList
		System.out.println("We'll work now with ArrayList!");
		ArrayList<Integer> array_to_sort = new ArrayList<Integer>();
		
		//Input of the numbers 
		for (int i = 0 ; i < leng ; i++ )
		{
			System.out.println("Enter a number : ");
			array_to_sort.add(inp.nextInt());
		}
		
		//Selection sort Asc
		for (int i = 0 ; i < array_to_sort.size()-1 ; i++ ) 
		{
			for(int j = i+1 ; j < array_to_sort.size() ; j++)
			{
				if(array_to_sort.get(i) > array_to_sort.get(j))
				{
					temp= array_to_sort.get(i);
					array_to_sort.set(i,array_to_sort.get(j));
					array_to_sort.set(j,temp);
				}
			}
		}
		
		//Output
		System.out.println("The sorted array : ");
		System.out.print("| "); 
		for (int i = 0 ; i < array_to_sort.size() ; i++ ) 
		{
			System.out.print(array_to_sort.get(i)+" | "); 
		}

		inp.close();
		
	}

}
