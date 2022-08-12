public class Representant extends Commercial
{
		public Representant(String nom, String prenom, int age, String date, double chiffreAffaire)
		{
			super(nom,prenom,age,date,chiffreAffaire);
		}
		
		@Override
		public String getEmploye()
		{
			return "Le Representant " + this.getNom();
		}
		
		@Override
		public double calculerSalaire()
		{
			return getChiffreAffaire() * 0.2 + 800;
		}
}