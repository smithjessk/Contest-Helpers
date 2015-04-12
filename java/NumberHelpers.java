public class NumberHelpers {
	// TODO: Optimize dynamically
	public static int calcFactorial(int n) {
		if (n == 1 || n == 0) {
			return 1;
		}
		return n * calcFactorial(n - 1);
	}

	// This assumes that the Fib numbers (1, 1, 2, ...) are indexed starting with one
	// TODO: Optimize dynamically 
	public static int calcFibonacci(int n) {
		if (n == 2 || n == 1) {
			return 1;
		}
		return calcFibonacci(n - 1) + calcFibonacci(n - 2);
	}

	public static int tri(int m) {
		return m * (m + 1) / 2;
	}


	//=======Checking for specific number conditions========//

	//Is it a prime number?
	public static boolean isPrime(int a){
		if(a%2 == 0 || a < 2){
			return false;
		}
		for(int i = 3; i <= Math.ceil(Math.sqrt(a)); i++){
			if(a % i == 0){
				return false;
			}
		}
		return true;
	}

	//Is it a Fibonacci number?
	public static boolean isFib(int a){
		return (isPerfectSquare((5*a*a) + 4) || isPerfectSquare( (5*a*a) - 4 ));
	}

	/*
	* Needed this for the Fibonacci one, and just added it if useful elsewhere
	*/
	public static boolean isPerfectSquare(int a){
		int root = (int) Math.sqrt(a);
		return (a == root*root);
	}

	//Is it a perfect number? (sum of divisors == number)
	public static boolean isPerfectNum(int a){
		int sumDivs = 0;
		for(int i = 1; i < a; i++){
			if(a%i == 0)
				sumDivs += i;
		}
		return (sumDivs == a);
	}


	//Idk if you want these in this file, or a separate one

	/*
	* I'm not 100% sure on this one, I may have missed a +1 somewhere or something.
	*/
	public static String caesarShift(String str, int shiftValue){
		Str out = "";
		for(int i = 0; i < str.length(); i++){
			out += ((((str.toLowerCase().charAt(i) - 'a') + shiftValue) % 26) + 'a');
		}
		return out;
	}

	/*
	*  I took a look at the stuff for changing bases and there's a way in the
	*  Java API, using the Integer class:
	*
	*  To convert to another base:
	*  Integer.toString(int num, int base);
	*
	*  To convert from a base to normal number:
	*  Integer.parseInt(String number_representation, int base);
	*  
	*  So for example, to change from binary to hex:
	*  int binary = 10;
	*  String hexValue = Integer.toString(Integer.parseInt(binary, 2), 16);/
	*/
}
