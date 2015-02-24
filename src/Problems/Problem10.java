package Problems;
//import java.math.*;
//The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
//Find the sum of all the primes below two million.

public class Problem10 {
	int end;
	Problem10(int end){
		this.end = end;
	}
	public static void main(String args[]){
		Problem10 p10 = new Problem10(2000000);
		p10.solve();
	}
	public double solve(){
		double sum = 2;
		int i;
		for(i=3;i<=end;i+=2){
			if(prime_check(i)){
				sum = sum + i;
				System.out.println("ENDED:" + i + ":" + sum);
			}
		}
		System.out.printf("Regular Format: %.0f\n", sum);
		return sum;
	}
	public boolean prime_check(int checked){
		int i;
		for(i=2;i<=Math.sqrt(checked);i++){
			if(checked%i==0){
				return false;
			}
		}	
		return true;
	}
}
//1179908154