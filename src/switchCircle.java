
public class switchCircle {

	public static void main(String[] args) {
		char grade = 'A';
		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':
			System.out.println("Çok Güzel : Geçtiniz");
			break;
		case 'C':
			System.out.println("Ehh : Geçtiniz");
			break;
		case 'D':
			System.out.println("Çok Şükür : Geçtiniz");
			break;
		case 'F':
			System.out.println("Malesef : Game Over");
			break;
		default:
			System.out.println("Geçersiz Bir Not Girildi");

		}

	}

}
