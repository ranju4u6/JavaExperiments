package test.string;

public class StringTestMain {

	public static void main(String[] args) {
		String s="0123456789";
		int start = 0;
		int endIndex = 3;
		
		StringBuilder sb = new StringBuilder();
		int count = (s.length()/endIndex);
		
		for(int i=start; i<=count; i++){
			int remLength = s.length();
			if(remLength >endIndex){
				sb.append(s.substring(start, endIndex));
				s = s.substring(endIndex, s.length());
				if(s.length() > endIndex){
					sb.append(".");
				}
			}
		}
		
		System.out.println(sb);

	}

}
