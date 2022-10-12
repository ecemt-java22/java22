import KatmanlıMimari.business.KursManager;
import KatmanlıMimari.core.logging.DatabaseLogger;
import KatmanlıMimari.core.logging.FileLogger;
import KatmanlıMimari.core.logging.Logger;
import KatmanlıMimari.core.logging.MailLogger;
import KatmanlıMimari.dataAccess.HibernateKursDao;
import KatmanlıMimari.entities.Kurs;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Kurs kurs1 = new Kurs(1, "Java", "Backend", 1500, "Engin Demirog");
		Kurs kurs2 = new Kurs(2, "Javascript", "Frontend", 1000, "Ecem T");
		Kurs kurs3 = new Kurs(3,"React", "Frontend", 750, "Engin Demiroğ");
		
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(),new MailLogger()};
		
		
		KursManager kursManager= new KursManager(new HibernateKursDao(),loggers);
		kursManager.add(kurs1);
		kursManager.add(kurs2);
		kursManager.add(kurs3);  //throw
		
		
		
		


	}

}
