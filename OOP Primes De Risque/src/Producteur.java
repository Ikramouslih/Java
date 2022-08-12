public class Producteur extends Employe
	{
		private int nbrUniteProduite;
		public Producteur(String nom, String prenom, int age, String date,int nbrUniteProduite)
		{
			super(nom,prenom,age,date);
			this.nbrUniteProduite = nbrUniteProduite;
		}
		
		@Override
		public String getEmploye()
		{
			return "Le producteur "+this.getNom();
		}
		
		@Override
		public double calculerSalaire()
		{
			return this.nbrUniteProduite * 5;
		}
			
	}