package Problems;
import java.util.ArrayList;


public class Problem5 {
//2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
	
//make a list of factors,  

int start,stop;
public static void main(String args[]){
	Problem5 run = new Problem5(1,10);
	run.solve();
}
Problem5(int new_start, int new_stop){
	start = new_start;
	if(start==1){
		start = start+1;
	}
	stop = new_stop;
}
public int solve(){
	ArrayList<Integer> factors = new ArrayList<Integer>();
	factors.add(start);
	int smallest_even = 1;
	int i;
	for(i=start;i<=stop;i++){
		if(smallest_even%i!=0){
			int n;
			int int_check = i;
			System.out.println(i);
			for(n=0;n<factors.size();n++){
				System.out.println("factor loop n=" + factors.get(n));
				if(int_check == 1){
					System.out.println("break n=1");
					break;
				}
				else if(int_check%factors.get(n)==0){
					System.out.println("division stuff, before int_check=" + int_check);
					int_check=int_check/factors.get(n);
					System.out.println("division stuff, after int_check=" + int_check);
				}
			} 
		}
	}
	return smallest_even;
}
}
