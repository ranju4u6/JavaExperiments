package test.algos;


//####################***************************************NOT WORKING***************############################
public class QuickSort {

	public static void main(String[] args) {
		//int[] A = new int[] { 44, 75, 43, 55, 12, 64, 77, 33 };
		int[] A = new int[] { 100,10,200,20,50};

		int[] sortedA = quickSort(A, 0, (A.length - 1));
		
		for(int element: sortedA){
			System.out.print(" "+ element);
		}
	}

	private static int[] quickSort(int[] A, int left, int right) {
		int pivotIdx = partition(A, left, right);
		
		System.out.println("Pivot ----------->"+A[pivotIdx]);
//		System.out.println("Before Partition ----------->"+A[pivotIdx]);
		/*for(int i=left; i<=right; i++){
			System.out.print(" "+ A[i]);
		}*/
		System.out.println();
		
		 if (left < pivotIdx - 1)
	            quickSort(A, left, (pivotIdx - 1));
	      if (pivotIdx < right)
	            quickSort(A, pivotIdx, right);

		return A;
	}

	private static int partition(int[] A, int left, int right) {
		
		System.out.println();
		System.out.println("Victim------------------>");
		for(int i=left; i<=right; i++){
			System.out.print(" "+ A[i]);
		}
		System.out.println();
		System.out.println("Left-------->"+left+"Right---------->"+right);

		int i = left;
		int j = right;

		int pivot = A[(left + right) / 2];

		while (i < j) {
		
			while (pivot > A[i])
				i++;

			while (pivot < A[j])
				j--;

			if (i <= j) {
				System.out.println("Swap: ["+A[i]+"] -- ["+A[j]+"]");
				int temp = A[j];
				A[j] = A[i];
				A[i] = temp;

				i++;
				j--;
			}
		}

		return i;

	}

}
