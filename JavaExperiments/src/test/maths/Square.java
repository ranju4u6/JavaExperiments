package test.maths;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(findSquare(4));

	}
	
	private static long findSquare(long number){
		long square = 0;
		long count = number;
		
		do{
			square+=number;
			count--;
		}while(count > 0);
		
		return square;
	}

}
