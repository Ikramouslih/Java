import ma.exelib.projet.bean.*;

public class Main {

	public static void main(String[] args) {
		Reel reel1 = new Reel(12);
		Reel reel2 = new Reel(18);
		
		Complexe comp1 = new Complexe(12,-18);
		Complexe comp2 = new Complexe(17,-20);
		
		
		Complexe comp3 = comp1.plus(comp2);//
		System.out.println(comp1.affiche() + " + " + comp2.affiche() + " = " + comp3.affiche());
		comp3 = comp1.moins(comp2);
		System.out.println(comp2.affiche() + " - (" + comp1.affiche() + ") = " +comp3.affiche());


		System.out.println("------------------");
		
		Reel reel3 = (Reel)reel1.plus(reel2);
		System.out.println(reel1.affiche() + " + " + reel2.affiche() + " = " + reel3.affiche());
		reel3 = (Reel)reel1.moins(reel2);
		System.out.println(reel1.affiche() + " - " + reel2.affiche() + " = " + reel3.affiche());
		
	}

}
