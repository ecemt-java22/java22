package KatmanlıMimari.business;

import java.util.List;

import KatmanlıMimari.core.logging.Logger;
import KatmanlıMimari.dataAccess.HibernateKursDao;
import KatmanlıMimari.dataAccess.JdbsKursDao;
import KatmanlıMimari.dataAccess.KursDao;
import KatmanlıMimari.entities.Kurs;

public class KursManager {
	
	private KursDao kursDao;
	private Logger[] loggers;
	
	
	
	
	public KursManager(KursDao kursDao, Logger[] loggers) {
		this.kursDao = kursDao;
		this.loggers=loggers;
	}


	public void add(Kurs kurs) throws Exception {
		//is kuralları
		if(kurs.getUnitPrice()<0) {
			throw new Exception("Ürün fiyatı 0'dan küçük olamaz");
		}		
		
		kursDao.addToDatabase(kurs);
		
		for (Logger logger : loggers) { //[db,file]
			logger.log(kurs.getName());
			
		}
	}

}
