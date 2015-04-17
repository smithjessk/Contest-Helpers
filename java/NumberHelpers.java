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
	public int[] name_of_array=new int[100000000];
	name_of_array[0]=0;name_of_array[1]=1;
	public static int calcFibonacci_dp(int n) {
		if(name_of_array[n]!=0){
			return name_of_array[n];
		}
		else{
			name_of_array[n]=calcFibonacci_dp(n-1)+calcFibonacci_dp(n-2);
		}
		return name_of_array[n];
	}
	public static int calcTriangle(int n) {
		return n * (n + 1) / 2;
	}

	public static boolean isPrime(int n) {
		if (n == 2) {
			return true; 
		}
		for (int div = 2; div <= Math.sqrt(n); div++) {
			if (n % div == 0) { 
				return false; 
			}
		}
		return true;
	}

	public static boolean isFib(int a) {
		return (isPerfectSquare((5*a*a) + 4) || isPerfectSquare( (5*a*a) - 4 ));
	}

	public static boolean isPerfectSquare(int n) {
		int root = (int) Math.sqrt(n);
		return (n == root * root);
	}

	// TODO: Confirm that this works
	public static boolean isPerfectSquare(int n) {
		return (Math.sqrt(n) % 1 == 0);
	}

	// For perfect numbers, Sum(divisors) = n
	public static boolean isPerfectNum(int n) {
		int sumDivs = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) { 
				sumDivs += i; 
			}
		}
		return (sumDivs == n);
	}
}
