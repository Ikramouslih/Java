
public class Main {

	public static void main(String[] args) {
		
		DoublyLinkedList list1 = new DoublyLinkedList();
		Node node1 = new Node("1");
		Node node2 = new Node("2");
		Node node3 = new Node("3");
		Node node4 = new Node("4");
		Node node10 = new Node("5");
		
		list1.addFirst(node1);
		list1.addLast(node4);
		list1.add(1, node2);
		list1.addLast(node3);
		list1.add(3,node10);
		
		DoublyLinkedList list2 = new DoublyLinkedList();
		Node node5 = new Node("5");
		Node node6 = new Node("6");
		Node node7 = new Node("7");
		Node node8 = new Node("8");
		Node node9 = new Node("2");

		list2.addFirst(node5);
		list2.addLast(node8);
		list2.add(1, node6);
		list2.add(2, node7);
		list2.addLast(node9);
		
		
		System.out.println("List 1 : "+list1.toString());
		
		System.out.println("Does list 1 contain 5? "+list1.contains("5"));
		
		list1.addAll(3,list2);
		System.out.println("List 1 after inserting list 2 in index 2 : " +list1.toString());
		
		System.out.println("The index of the number 3 is : "+list1.indexOf("3"));
		
		/////////////////
		list1.removeFirst();
		System.out.println("List 1 after removing the first element : " +list1.toString());
		
		list1.remove(5);
		System.out.println("List 1 after removing the element with the index 5 (6th) : " +list1.toString());
		
		list1.removeLast();
		System.out.println("List 1 after removing the last element : " +list1.toString());
		
		list1.removeFirstOccurrence("2");
		System.out.println("List 1 after removing the first occurrence of 2 : " +list1.toString());
		
		list1.removeLastOccurrence("5");
		System.out.println("List 1 after removing the last occurrence of 5 : " +list1.toString());
		
		list1.clear();
		System.out.println("List Cleared : "+list1.toString());

	}

}
