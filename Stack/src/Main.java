public class Main {

    public static void main(String[] args) {
	// write your code here

        Stack<Integer> stack = new ArrayStack<>();
        for (int i = 0 ;i<10 ;++i){
            stack.push(i);
        }

        System.out.println(stack);
        for (int i = 0 ;i<10 ;++i) {
            stack.pop();
            System.out.println(stack);
        }

    }
}
