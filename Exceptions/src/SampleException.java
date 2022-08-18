import java.util.*;

class SampleException {

	 static void validateInput(int number) throws InvalidInputException 
	{
		if(number > 100)
		{
			throw new InvalidInputException();
		}
		System.out.println("Valid");
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input : ");
		int number = scanner.nextInt();
		try 
		{
			validateInput(number);
		}
		catch(InvalidInputException e)
		{
			System.out.println("Caught Exception - Input greater than 100!");
		}
		scanner.close();

	}

}

class InvalidInputException extends Exception
	{
		InvalidInputException(){}
	}
