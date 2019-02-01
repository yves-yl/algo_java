import util.FileOperation;

import java.util.ArrayList;

public class Main {

    public static void testSet( String filename,Set<String> set){
        long startTime = System.nanoTime();

        ArrayList<String> words1 = new ArrayList<>();
        FileOperation.readFile(filename,words1);
        System.out.println("words size:"+words1.size());

        BSTSet<String> set1 =  new BSTSet<>();
        for (String str : words1)
            set1.add(str);
        System.out.println("set size :"+set1.getSize());


        long endTime = System.nanoTime();


    }

    public static void main(String[] args) {

    }
}
