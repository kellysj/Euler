package Problems;

public class Problem8 {
	//Find largest product in a series
	static String my_series = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
	String series;
	int frame;
	public static void main(String args[]){
		Problem8 p8 = new Problem8(my_series, 17);
		p8.solve();
	}
	Problem8(String series, int frame){
		this.series = series;
		this.frame = frame-1;
	}
	public double solve(){
		double greatest_product = 0;
		int i;
		String save_string = "";
		String out_string = "";
		//setting up the frame and iterations
		for(i=0;i<(series.length()-frame);i++){
			double checked_product=1;
			int n;
			out_string = "";
			//makes the sequence product
			for(n=i;n<=i+frame;n++){
				out_string = out_string + series.charAt(n);
				checked_product = checked_product*(double)Character.getNumericValue(series.charAt(n));
			}
			//checks if the sequence product is larger than the current greatest
			if(checked_product>greatest_product){
				greatest_product = checked_product;
				save_string = "start index: " + i + "\nsequence: " + out_string;
			}
			out_string = out_string + "=" + checked_product;
			//System.out.println(out_string);
		}
		System.out.println("Answer:\n" + save_string + "\nproduct: " + greatest_product);
		System.out.printf("Regular Format: %.0f\n", greatest_product);
		return greatest_product;
	}
}

//Questions:
//on line 39, what does the %f do?
//Character type

