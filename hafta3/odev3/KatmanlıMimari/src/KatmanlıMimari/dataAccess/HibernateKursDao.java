package KatmanlıMimari.dataAccess;

import KatmanlıMimari.entities.Kurs;

public class HibernateKursDao implements KursDao {
	public void addToDatabase(Kurs kurs) {
		System.out.println("Hibernate ile veritabanına eklendi");
	}
	

}
