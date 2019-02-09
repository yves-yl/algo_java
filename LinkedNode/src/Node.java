import java.util.List;

public class Node {

	private final int value;
	private Node next;

	public Node(int value) {
		this.value = value;
		this.next = null;
	}

	public int getValue() {
		return value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}



	public static void println(Node node){


		while (null != node){

			System.out.print(node.getValue());
			node = node.getNext();
			if(null != node)
				System.out.print(", ");



		}
		System.out.println();


	}


	public static Node reverseLinkedNode(Node node){



		if(null == node)
			return null;
		if(null == node.getNext()){
			return node;
		}


		Node newHead = reverseLinkedNode(node.getNext());
		node.getNext().setNext(node);
		node.setNext(null);


		return newHead;


	}

	public static Node createLinkedNode(List<Integer> data){

		if(data.isEmpty()) {
			return null;

		}

		Node curNode = new Node(data.get(0));
		curNode.setNext(createLinkedNode(data.subList(1,data.size())));
		return curNode;
	}


}
