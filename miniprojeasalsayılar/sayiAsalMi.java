
public class sayiAsalMi {

	public static void main(String[] args) {
		int number = 25;
		int remainder = number %2;
		System.out.println(remainder);
		boolean isPrime = true;
		if(number==1) {
			System.out.println("Asal sayı değildir");
		}
		
		
		if(number<2) {
			System.out.println("Geçersiz Sayı");
		}
		
		for(int i=2; i<number;i++) {
			if(number%i ==0) {
				isPrime = false;
			}
		}
		if(isPrime) {
			System.out.println("Sayı asal sayı");
		}else {
			System.out.println("Sayı asal sayı değildir");
		}


	}

}
