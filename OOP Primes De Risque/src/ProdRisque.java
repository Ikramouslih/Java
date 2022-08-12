public class ProdRisque extends Producteur implements Risquable
	{

		public ProdRisque(String nom, String prenom, int age, String date,int nbrUniteProduite)
		{
			super(nom,prenom,age,date,nbrUniteProduite);
		}
		
		@Override
		public String getEmploye()
		{
			return "Le producteur a risque "+this.getNom();
		}
		
		@Override
		public double calculerSalaire()
		{
			return super.calculerSalaire() + RISQUE_MENSUELLE;
		}
			
	}