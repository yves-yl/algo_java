import java.awt.print.Printable;

public class Main {

    public static void main(String[] args) {


        BinarySearch bs = new BinarySearch();
        System.out.println(bs.binarySearch(new int[]{1,2,10,15,100},15));

        System.out.println(bs.binarySearch(new int[]{1,2,10,15,100},-2));

        System.out.println(bs.binarySearch(new int[]{1,2,10,15,100},101));

        System.out.println(bs.binarySearch(new int[]{1,2,10,15,100},13));
        System.out.println("==============");
        System.out.println(bs.binarySearch(new int[]{},13));
        System.out.println(bs.binarySearch(new int[]{12},13));
        System.out.println(bs.binarySearch(new int[]{13},12));
        System.out.println("==============");
        System.out.println(bs.binarySearch(new int[]{12,13},12));
        System.out.println(bs.binarySearch(new int[]{12,13},13));


    }
}
