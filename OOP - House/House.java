import java.util.ArrayList;
public class House {
	
	private ArrayList<Door> doors;
	private ArrayList<Window> windows;
	private ArrayList<Light> lights;

	public House()
	{
		this.doors = new ArrayList<Door>();
		this.windows = new ArrayList<Window>();
		this.lights = new ArrayList<Light>();
		
	}
	
	public void add_door(Door d)
	{
		this.doors.add(d);
	}
	
	public void add_window(Window w)
	{
		this.windows.add(w);
	}
	
	public void add_light(Light l)
	{
		this.lights.add(l);
	}
	
	public void remove_door(int index)
	{
		this.doors.remove(index);
	}
	
	public void remove_window(int index)
	{
		this.windows.remove(index);
	}
	
	public void remove_light(int index)
	{
		this.lights.remove(index);
	}
	
	@Override
	public String toString()
	{
		String d = "";
		String w = "";
		String l = "";
		
		for (Door i : this.doors)
		{
			d = d + i.toString()+"\n";
		}
		
		for (Window i : this.windows)
		{
			w = w + i.toString()+"\n";
		}
		
		for (Light i : this.lights)
		{
			l = l + i.toString()+"\n";
		}
		
		return "This house has "+ this.doors.size()+" doors, "+this.windows.size()+" windows and "+this.lights.size()+" lights.\n\n"+d+"\n"+w+"\n"+l;
	}
	
	
	public void turn_on_light(int id_light)
	{
		for(Light i : this.lights)
		{
			if (i.get_id() == id_light)
			{
				i.turn_on(id_light);
			}
		}
	}
	
	public void turn_off_light(int id_light)
	{
		for(Light i : this.lights)
		{
			if (i.get_id() == id_light)
			{
				i.turn_off(id_light);
			}
		}
	}
	
	public void close_door(int id_door)
	{
		for(Door i : this.doors)
		{
			if (i.get_id() == id_door)
			{
				i.close(id_door);
			}
		}
	}
	
	public void open_door(int id_door)
	{
		for(Door i : this.doors)
		{
			if (i.get_id() == id_door)
			{
				i.open(id_door);
			}
		}
	}
	
	public void close_window(int id_window)
	{
		for(Window i : this.windows)
		{
			if (i.get_id() == id_window)
			{
				i.close(id_window);
			}
		}
	}
	
	public void open_window(int id_window)
	{
		for(Window i : this.windows)
		{
			if (i.get_id() == id_window)
			{
				i.open(id_window);
			}
		}
	}
	
	
}
