public class ManutRique extends Manutentionnaire implements Risquable
	{
		
		public ManutRique(String nom, String prenom, int age, String date,int nbrHeuresTraivailees)
		{
			super(nom,prenom,age,date, nbrHeuresTraivailees);
		}
		
		@Override
		public String getEmploye()
		{
			return "Le manutentionnaire a risque "+this.getNom();
		}
		
		@Override
		public double calculerSalaire()
		{
			return super.calculerSalaire() + RISQUE_MENSUELLE;
		}
		
	}