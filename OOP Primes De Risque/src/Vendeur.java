public class Vendeur extends Commercial
	{
		public Vendeur(String nom, String prenom, int age, String date, double chiffreAffaire)
		{
			super(nom,prenom,age,date,chiffreAffaire);
		}
		
		@Override
		public String getEmploye()
		{
			return "Le vendeur "+this.getNom();
		}
		
		@Override
		public double calculerSalaire()
		{
			return getChiffreAffaire() * 0.2 + 400;
		}
	}