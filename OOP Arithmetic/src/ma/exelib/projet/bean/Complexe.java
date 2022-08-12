package ma.exelib.projet.bean;
import ma.exelib.projet.abst.*;
import ma.exelib.projet.inter.*;

public class Complexe extends Affichage implements Arithmetique {
	double re;
	double im;
	
	public Complexe(double r, double i)
	{
		super();
		this.re = r;
		this.im = i;
	}
	
	@Override
	public String affiche()
	{
		return im < 0 ? re + " - " + (-im) + "i" : re + " + " + im + "i" ;
	}
	
	@Override 
	public Object plus(Object obj)
	{
		Complexe comp= (Complexe) obj; 
		return new Complexe(comp.re + this.re , comp.im + this.im);
	}
	
	@Override 
	public Object moins(Object obj)
	{
		Complexe comp= (Complexe) obj; 
		return new Complexe(comp.re - this.re , comp.im - this.im);
	}
	
	//overloading
	public Complexe plus(Complexe comp)
	{
		return new Complexe(comp.re + this.re , comp.im + this.im);
	}
	
	//overloading
	public Complexe moins(Complexe comp)
	{
		return new Complexe(comp.re - this.re , comp.im - this.im);
	}
}
