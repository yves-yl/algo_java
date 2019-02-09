public class BinarySearch {


	public int binarySearch(int arr[],int k){
		int a= 0;
		int b = arr.length;

		while (a < b){

			int m = a + (b-a)/2;
			//int m = (b+a)/2;
			if (k < arr[m]){

				b = m;
			}else if (k > arr[m]){


				a = m+1;
			}else
				return m;



		}



		return  -1;


	}

}
