package week1.day1;

public class isPrime {

	public static void main(String[] args) {
		//Home Assignment 2
		int n=20;
		for(int i=2;i<=n-1;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {  
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(i+" "+"is a prime number");
			}else {
				System.out.println(i+" "+"is a non-prime number");
			}
		}
	}

}

