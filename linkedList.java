
public class linkedList {
	private Node head;
	private Node tail;
	private int size=0;
	
	
	private class Node{
		private Object data;
		private Node next;
		public Node(Object input) {
			this.data = input;
			this.next = null;
		}
	
		public String toString() {
			return String.valueOf(this.data);
		}

	}
		
	Node node(int index) {
		Node x = head;
		for(int i =0; i<index; i++) {
			x = x.next;
		}
		return x;
	}
	
	public void addFirst(Object input){
		Node newNode = new Node(input);
		newNode.next = head; 
		head = newNode;
		if(size==0) {
			tail = head;
		}
		size++;
	}
	
	public void addLast(Object input) {
		Node newNode = new Node(input);
		if(size==0) {
			addFirst(input);
		}
		else {
		tail.next = newNode;
		tail = newNode;
		size++;
		}
	}

	
	public void add(int index, Object input) {
		if(index==0) {
			addFirst(input);
		}
		else if(index==size) {
			addLast(input);
		}
		else if(index>size) {
			System.out.println("index가 size보다 큽니다. add("+index+","+size+") 실행불가");
		}
		else {
			Node newNode = new Node(input);
			Node temp1 = node(index-1);
			Node temp2 = node(index);
			temp1.next = newNode;
			newNode.next = temp2;
			size++;
		}
			
	}
	
	public Object removeFirst() { 									//remove 값 반환
		Node temp = head;
		head = head.next;
		Object returnData = temp.data;
		temp = null;
		size --;
		return returnData;
	}
	
	public Object removeLast() {
		Node temp = tail;
		tail = node(size-1);
		node(size-1).next=null;
		tail.next = null;
		Object returnData = temp.data;
		temp = null;
		size--;
		return returnData;
	}
	
	public Object remove(int index) {
		if(index==0) {
			return removeFirst();
		}
		else if(index==size-1) {
			return removeLast();
		}
		else if(index>=size) {
			return -1;
		}
		else {
			Node temp1 = node(index-1);
			Node temp2 = node(index);
			Node temp3 = node(index+1);
			temp1.next = temp3;
			Object returnData = temp2.data;
			temp2 = null;
			size--;
			return returnData;
		}
	}
	
	
	public Object get(int index) {
		return node(index).data;
	}
	/*
	public void search(Object input) {					//전체탐색 && return안하고 바로 출력
		Node temp = head;
		System.out.print("데이터가 "+input+"인 노드는 ");
		for(int i=0; i<size; i++) {
			if(temp.data==input) {
				System.out.print(i+" ");
			}
			temp=temp.next;
		}
		System.out.println("번째 노드입니다.");
	}
	*/
	
	public int indexOf(Object data) {
		Node temp = head;
		int index=0;
		while(temp.data != data) {
			temp = temp.next;
			index++;
			if(temp==null) {
				return -1;
			}
		}
		return index;
	}
	
	public ListIterator listIterator(){
		return new ListIterator();
	}
	
	class ListIterator{
		private Node temp;
		private Node lastReturned;
		private int index=0;
		
		ListIterator(){
			temp = head;
		}
		
		public Object next() {
			lastReturned = temp;
			temp = temp.next;
			index++;
			if(temp==null) {
				return -1;
			}
			return lastReturned.data;
		}
		
		public boolean hasNext() {
			return  index<size;
		}
		
	}
	
	public String toString() {
		if(head==null)  
			return "[]";
		
		Node temp = head;
		String str = "[ ";
		for(int i=0; i<size; i++) {
				str = str + temp.data + " ";
				temp = temp.next;
			}
		return str+"]";
		}
		
}
