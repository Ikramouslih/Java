public class Light {
	
	private  final int id;
    private static int cpt=0;
	private int voltage;
	private int wattage;
	private boolean state;
	
	public Light(int v, int w)
	{
		this.id = ++cpt;
		this.voltage = v;
		this.state = false;
		this.wattage = w;
	}
	
	@Override
	public String toString()
	{
		String s = state == true ? "Turned On" : "Turned Off";
		return "Light n"+this.id+"\n    State : "+s+"\n    Voltage : "+this.voltage+"\n    Wattage : "+this.wattage;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void turnOn(int id_light)
	{
		this.state = true;
	}
	
	public void turnOff(int id_light)
	{
		this.state = false;
	}
}
