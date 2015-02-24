package Problems;

public class Problem6 {

	//The sum of the squares of the first ten natural numbers is,
	//1^2 + 2^2 + ... + 10^2 = 385
	//
	//The square of the sum of the first ten natural numbers is,
	//(1 + 2 + ... + 10)^2 = 55^2 = 3025
	//
	//Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
	//
	//Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

int start, stop;

public static void main(String args[]){
	Problem6 p6 = new Problem6(1,100);
	p6.solve();
}
Problem6(int start, int stop){
	this.start = start;
	this.stop = stop;
}
public int solve(){
	int reg_sum = 0;
	int sqr_sum = 0;
	int i;
	//pretty straight forward, just run through the numbers and store them as variables
	for(i=start;i<=stop;i++){
		sqr_sum = sqr_sum + i*i;
		reg_sum = reg_sum + i;
		System.out.println(i + ":" + sqr_sum + "," + reg_sum);
	}
	reg_sum = reg_sum*reg_sum;
	System.out.println(sqr_sum + "," + reg_sum);
	System.out.println("answer: " + (reg_sum-sqr_sum));
	
	return reg_sum-sqr_sum;
}
}
