package polymorphisim;

public class Main {

	public static void main(String[] args) {
//		EmailLogger logger= new EmailLogger();
//		logger.Log("Email log mesajı");
		
//		BaseLogger[] loggers= new BaseLogger[] {new FileLogger(), new DatabaseLogger(), new ConsoleLogger()};
//		
//		for(BaseLogger logger:loggers) {
//			logger.Log("Log mesajı");
//		}
		CustomerManager customerManager= new CustomerManager(new DatabaseLogger());
		customerManager.add();
		

	}

}
