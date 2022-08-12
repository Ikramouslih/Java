package ma.exelib.projet.bean;
import ma.exelib.projet.abst.*;
import ma.exelib.projet.inter.*;

public class Reel extends Affichage implements Arithmetique{
	
	private double x;
	
	public Reel(double y)
	{
		super();
		this.x = y;
	}
	
	@Override
	public String affiche()
	{
		return  String.valueOf(x);
	}
	
	@Override 
	public Object plus(Object y)
	{
		Reel reel = (Reel) y;
		return new Reel(this.x + reel.x);
	}
	
	@Override 
	public Object moins(Object y)
	{
		Reel reel = (Reel) y;
		return new Reel(this.x - reel.x);
	}
	
	//overloading
	public double plus(double y)
	{
		double som = this.x ;
		return som + y;
	}
	
	//overloading
	public double moins(double y)
	{
		double diff = this.x ;
		return diff - y;
	}
	

}
