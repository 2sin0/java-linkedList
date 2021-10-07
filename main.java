
public class Main {

	public static void main(String[] args) {
		linkedList numbers = new linkedList();
		numbers.addFirst(0);
		numbers.addLast(3);
		numbers.addLast(4);
		numbers.add(1, 2);
		numbers.add(1, 1);
		numbers.addLast(5);
		numbers.removeLast();
		numbers.removeLast();
		System.out.println(numbers);
		
		linkedList.ListIterator i  = numbers.listIterator();
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.hasNext());
	}
	
}

