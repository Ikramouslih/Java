
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
		
		h1.addDoor(d1);
		h1.addDoor(d2);
		h1.addWindow(w1);
		h1.addWindow(w2);
		h1.addWindow(w3);
		h1.addWindow(w4);
		h1.addLight(l1);
		h1.addLight(l2);
		h1.addLight(l3);
		h1.addLight(l4);
		h1.addLight(l5);
		
		
		h1.turnonLight(3);
		h1.openDoor(2);
		h1.openWindow(1);
		
		System.out.println(h1.toString());
		
		h1.closeDoor(2);
		h1.closeWindow(1);
		h1.turnoffLight(3);
		
		System.out.println("------------------\n");
		
		System.out.println(h1.toString());
		
		
		/*System.out.println(h1.toString());
		
		System.out.println("------------------\n");
		
		h1.removeWindow(1);
		System.out.println(h1.toString());
		*/
		
	}

}
