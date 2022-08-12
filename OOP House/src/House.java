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
	
	public void addDoor(Door d)
	{
		this.doors.add(d);
	}
	
	public void addWindow(Window w)
	{
		this.windows.add(w);
	}
	
	public void addLight(Light l)
	{
		this.lights.add(l);
	}
	
	public void removeDoor(int index)
	{
		this.doors.remove(index);
	}
	
	public void removeWindow(int index)
	{
		this.windows.remove(index);
	}
	
	public void removeLight(int index)
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
	
	
	public void turnonLight(int id_light)
	{
		for(Light i : this.lights)
		{
			if (i.getId() == id_light)
			{
				i.turnOn(id_light);
			}
		}
	}
	
	public void turnoffLight(int id_light)
	{
		for(Light i : this.lights)
		{
			if (i.getId() == id_light)
			{
				i.turnOff(id_light);
			}
		}
	}
	
	public void closeDoor(int id_door)
	{
		for(Door i : this.doors)
		{
			if (i.getId() == id_door)
			{
				i.close(id_door);
			}
		}
	}
	
	public void openDoor(int id_door)
	{
		for(Door i : this.doors)
		{
			if (i.getId() == id_door)
			{
				i.open(id_door);
			}
		}
	}
	
	public void closeWindow(int id_window)
	{
		for(Window i : this.windows)
		{
			if (i.getId() == id_window)
			{
				i.close(id_window);
			}
		}
	}
	
	public void openWindow(int id_window)
	{
		for(Window i : this.windows)
		{
			if (i.getId() == id_window)
			{
				i.open(id_window);
			}
		}
	}
	
	
}
