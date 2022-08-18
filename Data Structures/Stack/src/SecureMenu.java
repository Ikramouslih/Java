package exceptions.userdefined;
import java.util.*;


public class SecureMenu {
	
	public static class NonNegativity extends Exception 
	{
		public String toString() 
		{
			return "You can't enter a negative number!";
		}
	}

	public static class InvalidChoice extends Exception 
	{
		public String toString() 
		{
			return "You can only enter the numbers proposed!";
		}
	}
	public static void main(String[] args) throws NonNegativity, InvalidChoice,InputMismatchException {
		
		Stack<AnimalSounds> myStack = new Stack<AnimalSounds>();
		AnimalSounds animal0 = new AnimalSounds("Cat","Meow");
		AnimalSounds animal1 = new AnimalSounds("Duck","Quack");
		AnimalSounds animal2 = new AnimalSounds("Dog","Bark");
		AnimalSounds animal3 = new AnimalSounds("Cow","Moo");
		AnimalSounds animal4 = new AnimalSounds("Lion","Roar");
		
		myStack.add(animal0);
		myStack.add(animal1);
		myStack.add(animal2);
		myStack.add(animal3);
		myStack.add(animal4);

		
		System.out.println("Our animals : ");
		for (int i = 0 ; i < myStack.size() ; i++)
		{
			System.out.println(i + ". "+myStack.get(i).toString());
		}
		
		System.out.print("\nChoose an animal : ");
		int a = inputValidity(myStack.size());
		
		AnimalSounds hi = myStack.get(a);
		System.out.println(hi.getSound());
	
	}	
	
	public static int inputValidity(int sizeStack)  throws NonNegativity,InvalidChoice,InputMismatchException
	{
			Scanner myScanner = new Scanner(System.in);
			boolean pass = false;
			do {
				try
				{
					
					int choice = myScanner.nextInt();
					
					if(choice < 0)
					{
						throw new NonNegativity();
					}
					if(choice >= sizeStack)
					{
						throw new InvalidChoice();
					}
					myScanner.close();
					return choice;
				}
				catch(InputMismatchException e1)
				{
					System.out.println("You can only enter numbers!");
					myScanner.nextLine();
				}
				catch(NonNegativity e2)
				{
					System.out.println(e2.toString());
				}
				catch(InvalidChoice e3)
				{
					System.out.println(e3.toString());
				}

				
			}while(!pass);
			
		return 0;
	}
		

}
	
	
	
