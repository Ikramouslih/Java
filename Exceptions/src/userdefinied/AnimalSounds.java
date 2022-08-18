package exceptions.userdefined;

public class AnimalSounds 
{
	private String animal, sound;
	
	public AnimalSounds( String animal, String sound)
	{	
		this.animal = animal;
		this.sound = sound;
	};
		
	public String getSound()
	{
		return "The " + this.animal + " goes "+this.sound;
	}
	
	@Override
	public String toString()
	{
		return this.animal + " sound.";
	}
		
}