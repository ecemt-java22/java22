
public class sayiBulmaProjesi {

	public static void main(String[] args) {
		int[] sayilar=new int[] {1,2,3,4,5};
		int aranacak=5;
		boolean varMi=false;
		
		for(int sayi : sayilar) {
			if(sayi==aranacak) {
				varMi =true;
				break;
			}
		}
		
		if(varMi) {
			System.out.println("Sayı mevcut");
		}else {
			System.out.println("Sayı mevcut değil");
		}

	}

}
