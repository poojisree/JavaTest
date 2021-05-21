package testGit;

public class ReversesString {
	
	static String reverse ="APPLE";
	
	static void revStr() {
		
		char[] chararray = reverse.toCharArray();
		
		int len = chararray.length;
		
		for(int i = len-1; i>=0; i--)
			{
			System.out.print(chararray[i]);
			
		}
		
	}
	
	public static void main(String[] args) {
		
		revStr();
		
	
	}

}
