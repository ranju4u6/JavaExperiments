package test.algos;

public class InsertionSort {

	public static void main(String[] args) {
		
//		int[] A = new int[]{5,8,10,45,78,100,2,1,67,77};
		int[] A = new int[]{5,8,10,45,78,100,-2,1,67,-77};
		
		insertionSort(A);
		
		for(int a: A){
			System.out.print(" "+a);
		}

	}
	
	private static void insertionSort(int[] A){
		
		for(int i=1; i<=A.length-1; i++){
			int value = A[i];
			int hole = i;
			System.out.println("Hole: "+ hole+" Value: "+value);
			
			while(hole > 0 && A[hole-1] > A[hole]){

				A[hole] = A[hole-1];
				hole--;
				
				
				A[hole] = value;
				
				if(hole > 0)
				System.out.println("------------------------- Hole: "+ hole+" A[hole-1]: "+A[hole-1]+"   A[hole]"+A[hole]);
			}

			
		}
		
		

		
	}

}
