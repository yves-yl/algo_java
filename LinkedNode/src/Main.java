import java.util.Arrays;
import java.util.List;

public class Main {



	public static void main(String[] args) {


		Node firstNode =  Node.createLinkedNode(Arrays.asList(1,2,3,4,5) );
		Node reverseNode = Node.reverseLinkedNode(firstNode);
		Node.println(reverseNode);

	}
}
