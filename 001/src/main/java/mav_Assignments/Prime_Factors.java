package mav_Assignments;

public class Prime_Factors {
	/*public static void main(String[] args) {
		System.out.println(finding_Primefactors(69));
	}*/

	public String finding_Primefactors(int num){
		if(num==0 || num==1){
			return "Do not enter 0 or 1";
		}
		String numbers="";
		while(num%2==0){
			numbers+="2";
			num/=2;
		}
		int sqrt_n=sqrt_num(num);
		for(int i=3;i<=sqrt_n;i+=2){
			while(num%i==0){
				numbers+=i+" ";
				num/=i;
			}
		}
		if(num>=2){
			numbers+=num;
		}
		return numbers;
	}

	private int sqrt_num(int num) {
		int start=1;
		while(start*start<num)
			start++;
		return start;
	}
}
