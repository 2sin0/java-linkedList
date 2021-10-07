
public class Main {

	public static void main(String[] args) {
		linkedList numbers = new linkedList();
		numbers.addFirst(0);
		numbers.addLast(3);
		numbers.addLast(4);
		numbers.add(1, 2);
		numbers.add(1, 1);
		numbers.addLast(5);
		System.out.println(numbers);
		
		numbers.remove(4);
		numbers.removeLast();
		
		linkedList.ListIterator i  = numbers.listIterator();
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.hasNext());
	}
	
}

/*output
[ 0 1 2 3 4 5 ]
0
1
2
3
-1
false
*/
