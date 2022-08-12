public class Opening {
	
	private double height;
	private double width;
	private boolean state;
	
	public Opening(double h, double w)
	{
		this.height = h;
		this.width = w;
		this.state = false;
	}
	
	@Override
	public String toString()
	{
		String s = this.state == true ? "Open" : "Closed";
		return ("State : "+s+"\n    The dimentions of the opening are : \n       Height : "+height+"\n       Width : "+width);
	}

	public void open(int id_light)
	{
		this.state = true;
	}
	
	public void close(int id_light)
	{
		this.state = false;
	}
	
}
