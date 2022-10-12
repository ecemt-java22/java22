package KatmanlıMimari.dataAccess;

import KatmanlıMimari.entities.Kurs;

public class JdbsKursDao implements KursDao{
	public void addToDatabase(Kurs kurs) {
		System.out.println("JDBC ile veritabanına eklendi");
	}

}
