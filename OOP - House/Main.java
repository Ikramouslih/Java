
public class Main {

	public static void main(String[] args) {
		
		Door d1 = new Door(2,200.5,80.5);
		Door d2 = new Door(3,11.5,12.5);

		Window w1 = new Window("Glass",30.5,80);
		Window w2 = new Window("Aluminium",30.5,80);
		Window w3 = new Window("Glass",30.5,80);
		Window w4 = new Window("Glass",30.5,80);
		
		Light l1 = new Light(110,60);
		Light l2 = new Light(120,60);
		Light l3 = new Light(120,100);
		Light l4 = new Light(110,60);
		Light l5 = new Light(120,60);
		
		House h1 = new House();
		
		h1.add_door(d1);
		h1.add_door(d2);
		h1.add_window(w1);
		h1.add_window(w2);
		h1.add_window(w3);
		h1.add_window(w4);
		h1.add_light(l1);
		h1.add_light(l2);
		h1.add_light(l3);
		h1.add_light(l4);
		h1.add_light(l5);
		
		
		h1.turn_on_light(3);
		h1.open_door(2);
		h1.open_window(1);
		
		System.out.println(h1.toString());
		
		h1.close_door(2);
		h1.close_window(1);
		h1.turn_off_light(3);
		
		System.out.println("------------------\n");
		
		System.out.println(h1.toString());
		
		
		/*System.out.println(h1.toString());
		
		System.out.println("------------------\n");
		
		h1.remove_window(1);
		System.out.println(h1.toString());
		*/
		
	}

}
