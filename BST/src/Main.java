import java.util.ArrayList;
import java.util.Random;

public class Main {


    public static void test_remove(){

        BST<Integer> bst = new BST<>();
        Random random = new Random();
        for (int i = 0;i < 1000;++i){


            bst.add(random.nextInt(10000) );
        }

        ArrayList<Integer> nums = new ArrayList<>();
        while(!bst.isEmpty())
            nums.add(bst.removeMin());
        //System.out.println(nums);
        for (int i = 1;i < nums.size();++i){

            if(nums.get(i-1) > nums.get(i))
                System.out.println("failed removeMin()");
        }


        for (int i = 0;i < 1000;++i){


            bst.add(random.nextInt(10000) );
        }

        nums = new ArrayList<>();
        while(!bst.isEmpty())
            nums.add(bst.removeMax());
        System.out.println(nums);
        for (int i = 1;i < nums.size();++i){

            if(nums.get(i-1) < nums.get(i))
                System.out.println("failed removeMax()");
        }


    }


    public static void test_print(){
        BST<Integer> bst = new BST<Integer>();
        int[] nums = new int[]{5, 3, 6, 8, 4, 2};
        for(int num : nums){
            bst.add(num);
        }
        System.out.println();
        System.out.println(bst);


    }


    public static void test_order(){
        BST<Integer> bst = new BST<Integer>();
        int[] nums = new int[]{5, 3, 6, 8, 4, 2};
        for(int num : nums){
            bst.add(num);
        }


        System.out.println();
        bst.preOrderNR();
        System.out.println();
        bst.preOrder();
        System.out.println();
        bst.inOrder();
        System.out.println();
        bst.postOrder();
        System.out.println();
        bst.levelOrder();


    }

    public static void main(String[] args) {

        test_remove();



    }
}
