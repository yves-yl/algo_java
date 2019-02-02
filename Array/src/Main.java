public class Main {

    public static void main(String[] args) {
	    Array<Integer> arr = new Array<>(5);
	    for(int i = 0 ;i <5; ++i)
	        arr.addLast(i);

//		arr.add(9,222);
//		arr.addFirst(111);
//		arr.addLast(222);
//	    System.out.println(arr);
	    arr.removeFirst();
		System.out.println("removeFirst: " + arr);
		arr.removeLast();
		System.out.println("removeLast: " + arr);
		arr.removeElement(1);
		System.out.println("removeElement: "+ arr);
    }
}
