public class Door extends Opening {
	
	private final int id;
    private static int cpt=0;
	private int numLocks;
	
	public Door(int nl, double height, double width)
	{
		super(height, width);//to invoke Opening's constructor 
		this.id = ++cpt;
		this.numLocks = nl;
	}
	
	@Override
	public String toString()
	{
		return "Door n"+this.id+" : \n    Number of locks : "+numLocks+"\n    "+super.toString();
	}
	
	public int getId()
	{
		return id;
	}
	
}

