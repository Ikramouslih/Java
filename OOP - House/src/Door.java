public class Door extends Opening {
	
	private  final int id;
    private static int c=0;
	private int num_locks;
	
	public Door(int nl, double height, double width)
	{
		super(height, width);//to invoke Opening's constructor 
		this.id = ++c;
		this.num_locks = nl;
	}
	
	@Override
	public String toString()
	{
		return "Door n"+this.id+" : \n    Number of locks : "+num_locks+"\n    "+super.toString();
	}
	
	public int get_id()
	{
		return this.id;
	}
	
}

