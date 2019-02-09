import util.Array;
public class ArrayStack<E> implements Stack<E> {


	private Array<E> array;

	public ArrayStack(int cap) {
		this.array = new Array<>(cap);
	}
	public ArrayStack() {
		this.array = new Array<>();
	}


	@Override
	public void push(E e){

		array.addLast(e);
	}
	@Override
	public E pop(){

		return array.removeLast();
	}
	@Override
	public E peek(){

		return array.get(getSize()-1);
	}
	@Override
	public int getSize(){

		return array.getSize();
	}
	@Override
	public boolean isEmpty(){

		return array.isEmpty();
	}
	public int getCap() {
		return array.getCap();
	}


	@Override
	public String toString(){

		StringBuilder buf = new StringBuilder();
		buf.append(String.format("Stack size = %d, cap = %d\n",array.getSize(),array.getCap()));
		buf.append("buttom [");
		for(int i = 0 ;i <array.getSize(); ++i){
			buf.append(array.get(i));
			if(i != (array.getSize() - 1))
				buf.append(",");
		}
		buf.append("] top");
		return buf.toString();
	}

}
