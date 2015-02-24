package Problems;
import java.lang.Math;

public class Problem7 {
	//By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
	//What is the 10001st prime number?
	public static void main(String args[]){
		Problem7 p7 = new Problem7(1000000);
		//p7.slow_check_if_prime(7919);
		p7.solve();
	}
	int stop;
	Problem7(int stop){
		this.stop = stop;
	}
	public int solve(){
		int n_to_check = 3;
		int prime = 2;
		int prime_count = 1;
		while(prime_count<stop){
			if(check_if_prime(n_to_check)){
				System.out.println(prime_count + ":" + prime);
				prime_count++;
				prime = n_to_check;
			}
			n_to_check+=2;
		}
		System.out.println(prime_count + ":" + prime);
		return prime;
	}
	
	// fast check N=a*b where (a && b) <= Math.sqrt(N) if a or b was larger, product is larger than N
	public boolean check_if_prime(int checked_n){
		int i;
		for(i=2;i<=Math.sqrt(checked_n);i++){
			if(checked_n%i==0){
				//System.out.println(checked_n + "%" + i + "==0");
				return false;
			}
		}
		//System.out.println(checked_n + " is prime");
		return true;
	}
	// slow check checks all numbers not just those lower than sqrt(N)
	public boolean slow_check_if_prime(int checked_n){
		int i;
		if(checked_n == 2){
			return true;
		}
		for(i=2;i<checked_n;i++){
			if(checked_n%i==0){
				//System.out.println(checked_n + "%" + i + "==0");
				return false;
			}
		}
		//System.out.println(checked_n + " is prime");
		return true;
	}

}
