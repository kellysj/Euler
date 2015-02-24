package Problems;

public class Problem9 {
//Special pathagorean triplet
//a^2+b^2=c^2
//a<b<c
//a+b+c = 1000
//try 3 nested loops, c(){b(){a(){}}}
	
int a;
int b;
int c;
int trip;

	Problem9(int trip){
		this.trip = trip;

	}
	public static void main(String args[]){
		Problem9 p9 = new Problem9(1000);
		p9.solve();
	}
	public int solve(){
		for(c=0;c<trip;c++){
			for(b=0;b<c;b++){
				for(a=0;a<b;a++){
					if(a*a+b*b == c*c){
						System.out.println("Triple\na:" + a + "\nb:" + b + "\nc:" + c + "\n" + (a+b+c));
						if(a+b+c == trip){
							System.out.println("SOLVED:" + a*b*c);
							return a*b*c;
						}
					}

				}
			}
			System.out.println("none in " + c);
		}
		System.out.println("no solution");
		return -1;
	}
}
