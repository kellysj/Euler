package Problems;
import java.util.ArrayList;
import java.math.*;
public class Problem14 {
	/*

The following iterative sequence is defined for the set of positive integers:

n → n/2 (n is even)
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:
13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1

It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.
*/
	public int Collatz_gen(int num_in,int i){
		
	}

	public static void main(String args[]){
		Problem14 test = new Problem14();
		test.recur_sum(10);

		
	}
	public int recur_sum(int num){
		if(num==0){
			return 0;
		}
		num = num + recur_sum(num-1);
		System.out.println("value is:" + num);
		return num;
	}
	public boolean check_prime(int num_in){
		boolean check_out = true;
			for(int n = 2;n<=Math.sqrt(num_in);n++){
				System.out.println("checking:" + n + ":" + Math.sqrt(num_in));
				if(num_in%n==0){
					check_out = false;
					return check_out;
				}
			}
		return check_out;
	}
}
