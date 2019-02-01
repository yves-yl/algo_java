public class Main {

    public static void main(String[] args) {
	    Array<Integer> arr = new Array<>(20);
	    for(int i = 0 ;i <9; ++i)
	        arr.addLast(i);

		arr.add(9,222);
	    System.out.println(arr);


    }
}
