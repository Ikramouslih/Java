public abstract class Employe {

	private String nom ;
	private String prenom;
	private int age;
	private String dateEntree;
	
	public Employe(String nom, String prenom, int age, String date)
	{
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.dateEntree = date;
	}
	
	public abstract double calculerSalaire();
	
	public String getNom()
	{
		return prenom+" "+nom;
	}
	public String getEmploye()
	{
		return "L'employe ";
	}
	
}
