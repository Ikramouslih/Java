import java.util.ArrayList;

public class Personnel
	{
		private ArrayList<Employe> listEmploye;
		
		public Personnel()
		{
			this.listEmploye = new ArrayList<Employe>();
		}
		
		public void ajouterEmploye(Employe employe)
		{
			listEmploye.add(employe);
		}
		
		public void afficherSalaires()
		{
			for ( Employe i : this.listEmploye)
			{
				System.out.println(i.getEmploye() + " gagne " + i.calculerSalaire() + " Francs.");
			}
		}
		public double salaireMoyen()
		{
			double sum = 0;
			for ( Employe i : this.listEmploye)
			{
				sum = sum + i.calculerSalaire();
			}
			return sum/this.listEmploye.size();
		}
	}	
	