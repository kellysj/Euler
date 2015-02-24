package Problems;

public class Problem1 {
	
	public static void main(String args[]){
		System.out.println("start main");
		Problem1 p1 = new Problem1();
		p1.solve(3,5,0,1000);
	}
	public int solve(int multiple1, int multiple2, int start, int stop){
		System.out.println("start solve");
		int sum = 0;
		int n = 0;
		String out_text;
		for(n = start;n < stop;n++){
			if(n%multiple1 == 0 && n%multiple2 == 0){
				sum = sum+n;
				out_text = "" + n + ":" + sum + "\t" + multiple1 + "," + multiple2;
			}
			else if(n%multiple1 == 0){
				sum = sum+n;
				out_text = "" + n + ":" + sum + "\t" + multiple1;
			}
			else if(n%multiple2 == 0){
				sum = sum+n;
				out_text = "" + n + ":" + sum + "\t" + multiple2;
			}
			else {
				out_text = "" + n + ":" + sum;
			}
			System.out.println(out_text);
		}
		out_text = "Solution is:" + sum;
		System.out.println(out_text);
		return sum;
	}

}
