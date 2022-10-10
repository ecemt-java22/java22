package overriding;

public class Main {

	public static void main(String[] args) {
//		OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
//		System.out.println(ogretmenKrediManager.hesapla(5000));
		BaseKrediManager[] krediManagers = new BaseKrediManager[]
				{new OgretmenKrediManager(), new TarimKrediManager(), new OgrenciKrediManager()};
		
		for(BaseKrediManager krediManager: krediManagers) {
			System.out.println(krediManager.hesapla(2000));
			//hem ogretmen hem de tarım icin hesaplar
		}
		
	}

}
