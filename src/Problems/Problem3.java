package Problems;

import java.lang.Math;

public class Problem3 {
	public static void main(String[] args){
		Problem3 run = new Problem3(1D,600851475143D,600851475143D);
		run.solve();

	}
	double start, end, factored_n;
	
	public Problem3(double new_start, double new_end, double new_factored_n){
		 start = new_start;
		 end = new_end;
		 factored_n = new_factored_n;
	}
	
	public double solve(){
		double check_n;
		double factor_n = 0;
		for(check_n=start; check_n <= Math.sqrt(end) ;check_n+=2){
			String to_print = String.valueOf(check_n);
			if(prime_check(check_n)){
				to_print = to_print + ",prime";
				if(factored_n%check_n==0){
					factor_n = check_n;
					to_print = to_print + ",factor";
				}
			}	
			System.out.println(to_print);
		}
		return factor_n;
	}
	public boolean prime_check(double n){
		double i;
		boolean is_prime = false;
		for(i=2;i<n;i++){
			if(n%i==0){
				is_prime = false;
				return is_prime;
			}
			else{
				is_prime = true;
			}
		}
		return is_prime;
	}
}
