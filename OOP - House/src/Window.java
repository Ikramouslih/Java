public class Window extends Opening {
	
	private String material;
	private  final int id;
    private static int c=0;
	
	public Window(String t, double height, double width)
	{
		super(height,width);
		this.id = ++c;	
		this.material = t;
	}
	
	@Override
	public String toString()
	{
		return "Window n"+this.id+" :\n    Material : "+this.material+"\n    "+super.toString();
	}
	
	public int get_id()
	{
		return this.id;
	}
	
	
}
