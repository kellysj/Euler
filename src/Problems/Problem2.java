package Problems;

public class Problem2 {
	public static void main(String args[]){
		Problem2 p2 = new Problem2();
		p2.solve(4000000);
	}
	public int solve(int end){
		int sum=0;
		int n1=0;
		int n2=1;
		int n3;
		String out_text;
		while(n1 < end){
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			out_text = "" + n3;
			System.out.println(n3);
			if(n3%2==0){
				sum = sum + n3;
				out_text = out_text + ":" + sum;
			}
			//System.out.println(out_text);
		}
		out_text = "Solution is:" + sum;
		System.out.println(out_text);
		return sum;
	}
}
