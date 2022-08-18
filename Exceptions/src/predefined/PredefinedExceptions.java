import java.util.Scanner;

public class PredefinedExceptions {

	static int[] tableau = {17, 12, 15, 38, 29, 157, 89, -22, 0, 5};
	
	static double division(int indice, int diviseur)
	{
			return (double)tableau[indice]/diviseur;
	}
	
	public static void main(String[] args){
		
		int x, y;
		Scanner scanner = new Scanner(System.in);
		boolean pass = false;
		do
		{
			try
			{
				System.out.println("Entrez the index of the integer to be divided : ");
				x = scanner.nextInt();
				
				System.out.println("Enter the divider: ");
				y = scanner.nextInt();
				
				System.out.print("The result of the division : ");
				System.out.println(division(x,y));
				pass = true;
				
			}
			catch(ArithmeticException arithE)
			{
				System.out.println("impossible to devide by 0!\n");
				pass = false;
			}
			catch(ArrayIndexOutOfBoundsException arrayE)
			{
				System.out.println("Index out of bound! Enter an index between 0 and "+ (tableau.length - 1) + " : \n");
				pass = false;
			}
		}while(!pass);
		scanner.close();	
		
	}
}
