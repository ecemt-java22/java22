
public class Main {
	
	
	//METHODS

	public static void main(String[] args) {
		sayiBulmaca();
	}
	
	public static void sayiBulmaca() {
		int [] sayilar =new int[] {1,2,3,4,5,9,0};
		int aranacak= 7;
		boolean varMi=false;
		
		for(int sayi:sayilar) {
			if(sayi==aranacak) {
				varMi=true;
				break;
			}
		}
		String mesaj="";
		if(varMi) {
			mesaj="Sayı mevcut: "+aranacak;
			mesajVer(mesaj);
		}else {
			mesajVer("Sayı mevcut değil: "+aranacak);
		}
	}
		
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
	

}


