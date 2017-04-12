package home_Work;

public class FindPrime {
	
	/*public static void main(String[] args) {
		System.out.println(isPrime(25));
	}*/
	public  boolean isPrime(Integer num){
		boolean flag=true;
		int n=Integer.valueOf(num);
		if(num==null ||n==0){
			try{
				throw new MyException("Null and 0 are not allowed");
			}catch(Exception e){
				System.out.println("inside catch block :"+e.getMessage());
			}
		}
		else{
			for(int i=2;i<=Math.sqrt(n);i++){
				
				if((n%i)==0){
					flag=false;
					break;
				}else{
					continue;
				}
			}
		} return flag;
	}
}
