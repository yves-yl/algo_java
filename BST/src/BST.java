import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BST  <E extends Comparable<E> >{

    private class Node {
        public  E e;

        public Node left,right;
        public Node(E e){
            this.e = e;
            this.left = null;
            this.right = null;

        }



    }

    private Node root;
    private int size;
    public BST(){
        root = null;
        size = 0;

    }
    public boolean  isEmpty(){


        return size ==0;
    }


    public int size(){

        return size;
    }

    private Node newNode(E e){

        ++size;
        return new Node(e);

    }


    private Node add(Node node,E e){


        if(null == node)
            return newNode(e);

        if (e.compareTo(node.e) < 0){

            node.left = add(node.left,e);
        }

        if (e.compareTo(node.e) > 0){

            node.right = add(node.right,e);

        }


        return  node;

    }
    public void add(E e){

        root = add(root,e);

    }

    public boolean contains(E e){

        return contains(root,e);

    }

    private Node minimun(Node node){

        if(null == node.left)
            return node;

        return minimun(node.left);

    }

    public E minimun(){


        if(null == root)
            throw new IllegalArgumentException("BST is empty");

        return minimun(root).e;
    }

    private Node maximun(Node node){

        if(null == node.right)
            return node;

        return maximun(node.right);

    }

    public E maximun(){


        if(null == root)
            throw new IllegalArgumentException("BST is empty");

        return maximun(root).e;
    }


    private Node removeMin(Node node) {

        if (null == node.left) {
            Node rightNode = node.right;
            node.right = null;
            --size;
            return rightNode;

        }else {
            node.left = removeMin(node.left);
            return node;
        }
    }

    public E removeMin(){

        E min = minimun();

        root = removeMin(root);
        return min;

    }

    private Node removeMax(Node node) {

        if (null == node.right) {
            Node leftNode = node.left;
            node.left = null;
            --size;
            return leftNode;

        }else {
            node.right = removeMax(node.right);
            return node;
        }
    }


    public E removeMax(){

        E max = maximun();

        root = removeMax(root);
        return max;

    }

    private Node remove(Node node,E e){


        if (null == node)
                return null;

        if (node.e.compareTo(e) < 0 ) {
            node.left = remove(node.left, e);
            return node;
        }

        if (node.e.compareTo(e) > 0 ){
            node.right = remove(node.right, e);
            return node;
        }

        else {//if (node.e.compareTo(e) == 0 ){

            if(null == node.left){
                Node  rightNode = node.right;
                node.right = null;
                --size;
                return rightNode;

            }

            else if(null == node.right){

                Node leftNode = node.left;
                node.left = null;
                --size;
                return leftNode;

            }


            Node succesor = minimun(node.right);
            succesor.right = removeMin(node.right);
            succesor.left = node.left;
            node.right = node.left = null;
            return succesor;



        }


    }

    public void remove(E e){


        root = remove(root,e);


    }

    private boolean contains(Node node,E e){



        if(node == null)
            return false;
        if (e.compareTo(node.e) == 0)
                return true;
        if (e.compareTo(node.e) <0)
            return contains(node.left,e);

        if (e.compareTo(node.e) >0)
            return contains(node.right,e);

        return false;

    }

    public void preOrder(){

        preOrder(root);

    }

    private void preOrder(Node node){

        if(null == node)
            return;
        System.out.println(node.e);
        preOrder(node.left);
        preOrder(node.right);

    }

   public void preOrderNR(){

       Stack<Node> stack = new Stack<>();
        stack.push(root);
        while ( !stack.isEmpty() ){

            Node cur = stack.pop();
            if (cur == null)
                continue;

            System.out.println(cur.e);
            if (null != cur.right )
                stack.push(cur.right);
            if (null != cur.left)
                stack.push(cur.left);

        }

   }

   public void levelOrder(){
       Queue<Node> q = new LinkedList<>();
       q.add(root);
       while ( !q.isEmpty() ){

            Node cur = q.remove();
            if (null == cur)
                continue;
           System.out.println(cur.e);
           if (null != cur.left)
               q.add(cur.left);
           if (null != cur.right )
               q.add(cur.right);




       }




   }

    public void inOrder(){

        inOrder(root);
    }

    private void inOrder(Node node){

        if(null == node)
            return;

        inOrder(node.left);
        System.out.println(node.e);
        inOrder(node.right);

    }



    public void postOrder(){

        postOrder(root);

    }


    private void postOrder(Node node){

        if(null == node)
            return;

        postOrder(node.left);
        System.out.println(node.e);
        postOrder(node.right);

    }






    private String generateDepthString(int depth){

        StringBuilder res = new StringBuilder();

        for(var i = 0;i<depth;++i){

            res.append("-");
        }
        return  res.toString();
    }
    private void generateBSTString(Node node,int depth,StringBuilder res){
        if(null == node){
            res.append(generateDepthString(depth) + "null\n");
            return;
        }
        res.append(generateDepthString(depth) + node.e + "\n");
        generateBSTString(node.left,depth+1,res);
        generateBSTString(node.right,depth+1,res);


    }


    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        generateBSTString(root,0,res);
        return res.toString();
    }




}
