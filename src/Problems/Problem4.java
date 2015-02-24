package Problems;

public class Problem4 {
	//A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
	//Find the largest palindrome made from the product of two 3-digit numbers.
	public static void main(String args[]){
		Problem4 run = new Problem4(100,999);
		run.solve();
	}
	int start, stop;
	Problem4(int a_nu_start, int a_nu_stop){
		start = a_nu_start;
		stop = a_nu_stop;		
	}
	
	public int solve(){
		int biggest_pal = 0;
		int i;
		for(i=start;i<=stop;i++){
			int n;
			for(n=start;n<=stop;n++){
				int check = i*n;
				if(is_palindrome(check)){
					if(biggest_pal<=check){
						biggest_pal = check;
						System.out.println(i + "*" + n + "=" + check);
						System.out.println(biggest_pal + "<=" + check);
					}
				}
			}
		}
		return biggest_pal;
	}
	
	public boolean is_palindrome(int n){
		String n_string = String.valueOf(n);
		int i;
		for(i=0;i<n_string.length()/2;i++){
			char c1 = n_string.charAt(i);
			char c2 = n_string.charAt((n_string.length()-1)-i);
			if(c1!=c2){
				return false;
			}
		}
		return true;
	}
}
