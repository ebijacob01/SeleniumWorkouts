package week2.day2;

public class CharacterOccurance {
	public static void main(String[] args) {
		String input="Welcome to chennai";
	
		//String input="Welcome";
		//String newString=input.replace("e", "");
		//System.out.println(input.length()-newString.length());
        int count=0;
		for(int i=0;i<input.length();i++) {
		
			if(input.charAt(i)=='e') {
				count++;
			}
		}
		System.out.println(count);
	}

}
