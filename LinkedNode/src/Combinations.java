import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combinations {

	public void combinations(List<Integer> data,int n,List<Integer>selected){

		if(data.isEmpty()){


			return;
		}


		if(0 == n) {

			//output selected list + empty list
			for(Integer i : selected) {
				System.out.print(i);
				System.out.print(" ");
			}
			System.out.println();
			return;
		}


		selected.add(data.get(0));
		combinations(data.subList(1,data.size()),n-1,selected);

		selected.remove(selected.size()-1);
		combinations(data.subList(1,data.size()),n,selected);

	}

	public static void main(String[] args) {
		Combinations ins = new Combinations();
		//ins.combinations(Arrays.asList(1,2,3,4,5),2,new ArrayList<Integer>());


		System.out.println("#----------");
		ins.combinations(new ArrayList<Integer>(),2,new ArrayList<Integer>());

		System.out.println("#----------");
		ins.combinations(new ArrayList<Integer>(),0,new ArrayList<Integer>());

		System.out.println("#----------");
		ins.combinations(Arrays.asList(1,2,3,4,5),0,new ArrayList<Integer>());
		System.out.println("#----------");
		ins.combinations(Arrays.asList(1,2,3,4,5),1,new ArrayList<Integer>());


	}


}
