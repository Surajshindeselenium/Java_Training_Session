package corJavaExercisesProgrammes;

public class PrimeNumber {
	
	//prime numbers means, the numbers which can be divided by 1 or itself.
	//2 is lowest prime number
	public static boolean isPrimeNumber(int num){
		
		if(num<=1){
			return false;
		}
		for(int i=2;i<num;i++){
			if(num % i == 0){
				return false;
			}
		}
	
		return true;
	}
	//to check find out how many numbers are prime till given number\
		public static void getPrimeNumber(int num){
			for(int i=2;i<=num;i++){
				if(isPrimeNumber(i)){
					System.out.print(i+" ");
				}
			}
		}
		
	public static void main(String[] args) {
		System.out.println("2 is prime number:"+isPrimeNumber(2));
		System.out.println("7 is prime number:"+isPrimeNumber(7));
		System.out.println("7 is prime number:"+isPrimeNumber(10));

		getPrimeNumber(40);
	}

}
