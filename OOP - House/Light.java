public class Light {
	
	private  final int id;
    private static int c=0;
	private int voltage;
	private int wattage;
	private boolean state;
	
	public Light(int v, int w)
	{
		this.id = ++c;
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
	
	public int get_id()
	{
		return this.id;
	}
	
	public void turn_on(int id_light)
	{
		this.state = true;
	}
	
	public void turn_off(int id_light)
	{
		this.state = false;
	}
}
