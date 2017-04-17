package mav_Assignments;

public class Find_Missing_Number {

	public static void main(String[] args) {
		int [] input={10,14,11,12};
		System.out.println(findMissing(input));
	}
	public static int findMissing(int[] input){
		int n=input.length+1;
		int sum=0,element,expecSum=0;
		expecSum=n*(n+1)/2;
		for(int i=0;i<input.length;i++){
			sum+=input[i];
		}
		element=expecSum-sum;
		return element;
	}
	
}
