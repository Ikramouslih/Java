public class LinkedList {
	
	Node head;
	
	public LinkedList(){}
	
	//returns the number of elements of the list
	public int size()
	{
		int cpt = 0;
		Node tmp = this.head;
		while(tmp != null)
		{
			tmp = tmp.next;
			cpt++;
		}
		return cpt; 
	}
	
	//insert in an index
	public void add(int index, Node node)
	{
		Node tmp = this.head;
		
		//possible indexes : 0 <= index <= listSize 
		if(index == 0)
		{
			node.next = this.head;
			this.head = node;
		}
		else if(size() >= index)
		{
			for(int i = 0 ; i < index - 1 ; i++)//stop before index to insert in index
			{
				tmp = tmp.next;
			}
			node.next = tmp.next;
			tmp.next = node;
		}
		else
		{
			System.out.println("the index given is greated than the size of the list, so it will be added at the end.");
			addLast(node);
		}
	}
	
	//insert at the beginning
	public void addFirst(Node node)
	{
		if(this.head == null)
		{
			this.head = node;
		}
		else
		{
			node.next = this.head;
			this.head = node;
		}
	}
	
	//insert at the end
	public void addLast(Node node)
	{
		Node tmp = this.head;
		while(tmp.next != null)
		{
			tmp = tmp.next;
		}
		tmp.next = node;	
	}
	
	//insert another linked list starting from an index
	public void addAll(int index, LinkedList list)
	{
		
		//possible indexes : 0 <= index <= listSize 
		if(index == 0)
		{
			//connecting the new list to the beginning of the old list
			list.getLast().next = this.head;
			this.head = list.head;
		}
		else if(size() >= index)
		{
			//connecting the first element of the new list to the head of the old list at the end
			Node tmp = this.head;
			
			for(int i = 0 ; i < index - 1 ; i++)//stop before index to insert in index
			{
				tmp = tmp.next;
			}
			list.getLast().next = tmp.next;
			tmp.next = list.getFirst();
		}
		
	}
	
	
	//clears the list
	public void clear()
	{
		
		for(int i=0 ; i < this.size() ; i++)
		{
			Node node = this.head.next;
			this.head.next = null;
			this.head = null;
			this.head = node;
		}
		this.head = null;
		
	}
	
	//checks if an element exists in the list
	public boolean contains(String data)
	{
		
		Node tmp = this.head;
		while(tmp != null)
		{
			if(tmp.data == data)
				return true;
			tmp = tmp.next;
		}	
		return false;
	}
	
	//returns the first element of the list
	public Node getFirst()
	{
		return this.head;
	}
	
	//returns the last element of the list
	public Node getLast()
	{
		if(this.head == null)
			return null;
		
		Node tmp = this.head;
		while(tmp.next != null)
		{
			tmp = tmp.next;
		}	
		return tmp;
	}
	
	//returns the element positioned on the index 
	public Node get(int index)
	{
		if(this.head == null)
			return null;
		
		Node tmp = this.head;
		for(int i = 0 ; i < index ; i++)
		{
			tmp = tmp.next;
		}
		return tmp;
		
	}
	
	//returns the index of the first occurrence or -1 if this list does not contain the element
	public int indexOf(String data)
	{
		int cpt = 0;
		Node tmp = this.head;
		while(tmp != null)
		{
			if(tmp.data == data)
				return cpt;
			tmp = tmp.next;
			cpt++;
		}	
		return -1;	
	}
	
	//return a string with the data of the list separated by a ","
	@Override
	public String toString()
	{
		String data = "";
		Node tmp = this.head;
		
		if(this.head == null)
			return "[]";
					
		while(tmp.next != null)
		{
			data = data + tmp.data + ",";
			tmp = tmp.next;
		}
		data = data + tmp.data;
		
		return data;
	}

	//removes last element from the list
	public Node removeLast()
	{
		Node tmp = this.head;
		Node prev = tmp;
		while(tmp.next != null)
		{
			prev = tmp;
			tmp = tmp.next;
		}
		prev.next = null;
		tmp = null;
		return prev;
	}
	
	//removes first element from the list
	public Node removeFirst()
	{
		Node tmp = this.head;
		this.head = this.head.next;
		tmp = null;
		return this.head;
	}
	
	//removes the element with the index
	public void remove(int index)
	{
		Node tmp = this.head;
		Node prev = this.head;
		if(index == 0)
		{
			this.head = removeFirst();
		}
		else if(size() > index)
		{
			for(int i = 0 ; i < index ; i++)
			{
				prev = tmp;
				tmp = tmp.next;
			}
			prev.next = tmp.next;
			tmp = null;
		}
		else 
			System.out.println("Error! the index given is greater than the size of the list.");
		
	}
	
	//removes the first occurrence of a string
	public void removeFirstOccurrence(String data)
	{
		this.remove(this.indexOf(data));
				
	}
	
	//removes the last occurrence of a string
	public void removeLastOccurrence(String data)
	{
		Node tmp = this.head;
		Node last = tmp;
		int cpt = 0;
		
		//getting the last occurrence
		while(tmp != null)
		{
			if(tmp.data == data)
			{
				last = tmp;
			}
			tmp = tmp.next;
		}
		
		//getting the last occurrence's index
		tmp = this.head;
		while(tmp != null)
		{
			if (last == tmp)
				break;
			cpt++;
			tmp = tmp.next;
		}	
		
		//removing the last occurrence 
		if(last != null)
			this.remove(cpt);
	}
	
}
