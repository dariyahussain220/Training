package mav_Assignments;

public class Duplicate_Char {
/*	public static void main(String[] args) {
		System.out.println(removing_Duplicate("helloworld"));
	}*/
	public static String removing_Duplicate(String input){
		String output="";
		int count=0;
		int i,j;
		if(input==null)
			return "Null is not allowed";
		for(i=0;i<input.length();i++){
			for(j=i+1;j<input.length();j++){
				count=1;
				if(input.charAt(i)==input.charAt(j))
				{
					count=0;
					break;
				}        	        	       
			}
			if(count==1 || j==input.length())
				output+=input.charAt(i);
		}
		return output;
	}
}
