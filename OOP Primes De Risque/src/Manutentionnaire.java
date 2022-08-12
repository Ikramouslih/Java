public class Manutentionnaire extends Employe
	{
		private int nbrHeuresTraivailees;
		public Manutentionnaire(String nom, String prenom, int age, String date,int nbrHeuresTraivailees)
		{
			super(nom,prenom,age,date);
			this.nbrHeuresTraivailees = nbrHeuresTraivailees;
		}
		
		@Override
		public String getEmploye()
		{
			return "Le manutentionnaire "+this.getNom();
		}
		
		@Override
		public double calculerSalaire()
		{
			return this.nbrHeuresTraivailees * 65;
		}
		
	}